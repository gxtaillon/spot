{-# LANGUAGE RankNTypes #-}
module Language.SPO.Parser.PrimaryParser 
    ( runPrimaryParser
    ) where

-- TODO Get rid of `IO`, carry warnings and other messages around 
--      before displaying them.

-- NB   Warnings are shown for code that should be modified but will compile
--      Errors, for code that will not compile
--      Fatal errors, for internal cases that can not or have not be made
--       impossible by the type system. For any given input they should never
--       appear to the user. A Fatal indicates that something inside the
--       compiler is not behaving correctly.

import Control.Applicative ((<$>), (<*>))
import Control.Monad
import Control.Monad.IO.Class (liftIO)
import Data.Bits ((.&.), (.|.), xor, complement, shiftL, shiftR)
import Data.List (findIndices)
import qualified Data.Map.Strict as M
import qualified Data.Text as T
import Text.Parsec
import Text.Parsec.Text ()
import Text.Parsec.Expr
import qualified Text.Parsec.Token as Token

import Language.SPO.Parser.Types

scopeKeyGlobal :: T.Text
scopeKeyGlobal = "_global"

runPrimaryParser :: SourceName -> T.Text -> IO (Either ParseError Statement)
runPrimaryParser = runParserT programParser st
    where st = PParserState 
                    { psScopes = M.singleton scopeKeyGlobal M.empty
                    , psCurrent = scopeKeyGlobal
                    }

data PScopeEntry = PScopeEntry 
    { sePos :: SourcePos
    , seType :: Type
    , _seAss :: Maybe ExprAssignment -- underscore to get rid of unused warning
    } deriving (Show)

type PScope = M.Map T.Text PScopeEntry
type PScopeMap = M.Map T.Text PScope

data PParserState = PParserState 
    { psScopes :: PScopeMap
    , psCurrent :: T.Text
    } deriving (Show)

type PParser = ParsecT T.Text PParserState IO
type POperatorTable a = OperatorTable T.Text PParserState IO a
type PTokenParser = Token.GenTokenParser T.Text PParserState IO
type PLanguageDef = Token.GenLanguageDef T.Text PParserState IO


type ArrayDeclarationInternal = (Maybe (Maybe ExprArithmetic))

fromTagAr :: SourcePos -> Maybe (T.Text) -> Maybe (Maybe Int) -> PParser VarType
fromTagAr pos (Just "String") (Just s)  = do
                                            putWarnLn pos $ 
                                              "W: For backwards " ++
                                              "compatibility reasons, String" ++
                                              " arrays are interpreted as " ++
                                              "Char arrays."
                                            return $ VTArray VTChar s
fromTagAr pos (Just "String") (Nothing) = do
                                            putWarnLn pos $ 
                                              "W: For backwards " ++
                                              "compatibility reasons, String" ++
                                              " arrays are interpreted as " ++
                                              "Char arrays."
                                            return $ VTArray VTChar Nothing
fromTagAr pos t               (Just s)  = do 
                                            tag <- fromTag pos t
                                            return $ VTArray tag s
fromTagAr _   (Just "_")      _         = return $ VT_
fromTagAr _   (Just "Int")    _         = return $ VTInt
fromTagAr _   (Just "Float")  _         = return $ VTFloat
fromTagAr _   (Just "Bool")   _         = return $ VTBool
fromTagAr _   (Just "Char")   _         = return $ VTChar
fromTagAr _   (Just u)        _         = return $ VTUser u
fromTagAr pos _               _         = do
                                            putWarnLn pos $ "W: No tags were" ++
                                              " found, defaulting to Int."
                                            return $ VTInt

fromTag :: SourcePos -> Maybe (T.Text) -> PParser VarType
fromTag pos t = fromTagAr pos t Nothing

--getAllScopes :: PParser PScopeMap
--getAllScopes = getState >>= return . fst

getScope :: T.Text -> PParser PScope
getScope sk = do
    st <- getState
    let sm = psScopes st
    case M.lookup sk sm of
        Just se -> return se
        _ -> fail $ "Fatal: unknown `" ++ T.unpack sk ++ "` scope."

getCurrentScopeKey :: PParser T.Text
getCurrentScopeKey = getState >>= return . psCurrent

getCurrentScope :: PParser PScope
getCurrentScope = getCurrentScopeKey >>= getScope

getGlobalScope :: PParser PScope
getGlobalScope = getScope scopeKeyGlobal

isGlobalScope :: PParser Bool
isGlobalScope = getCurrentScopeKey >>= return . (==) scopeKeyGlobal

modifyCurrentScope :: (PScope -> PScope) -> PParser ()
modifyCurrentScope f = modifyState (\(PParserState sm cs) -> 
    PParserState (M.adjust f cs sm) cs)

createNewScope :: T.Text -> PParser ()
createNewScope sk = modifyState (\(PParserState sm cs) -> 
    PParserState (M.insert sk M.empty sm) cs)

switchScope :: T.Text -> PParser a -> PParser a
switchScope sk p = do
    PParserState psm psk <- getState
    case M.lookup sk psm of
        Just _ -> do
            modifyState (\(PParserState sm _) -> PParserState sm sk)
            r <- p
            modifyState (\(PParserState sm _) -> PParserState sm psk)
            return r
        _ -> fail "Fatal: switching to unknown scope"

lookupCurrentAndGlobal :: T.Text -> PParser (Maybe (T.Text, PScopeEntry))
lookupCurrentAndGlobal var = do
    cs <- getCurrentScope
    csk <- getCurrentScopeKey
    case M.lookup var cs of
        Just se -> return $ Just (csk, se)
        _ -> do
            gs <- getGlobalScope
            case M.lookup var gs of
                Just gse -> return $ Just (scopeKeyGlobal, gse)
                _ -> return $ Nothing
    

-- Many thanks to Daniel Fischer for this workaround.
-- http://haskell.1045720.n5.nabble.com/Parsec-Custom-Fail-tp3131949p3131952.html
setPosAndFail :: SourcePos -> String -> PParser ()
setPosAndFail pos msg = do 
    setPosition pos 
    inp <- getInput 
    setInput (T.cons 'a' inp) 
    _ <- tokenPrim (const "") (\p _ _ -> p) Just 
    fail msg

putWarnLn :: SourcePos -> String -> PParser ()
putWarnLn pos msg = liftIO $ putStrLn $ show pos ++ ":\n" ++ msg

forceGlobalScope :: SourcePos -> String -> PParser ()
forceGlobalScope pos msg = do
    igs <- isGlobalScope
    when (not igs) $ do
        setPosAndFail pos msg 

forceValidateOrSetIdentifier 
    :: T.Text -> SourcePos -> Type -> Maybe ExprAssignment -> PParser ()
forceValidateOrSetIdentifier var pos t ass = do
    csk <- getCurrentScopeKey
    mvi <- lookupCurrentAndGlobal var
    case mvi of
        Just (sk, se) | sk == csk -> setPosAndFail pos $ 
            "E: redefining variable found at " ++ show (sePos se)
                      | otherwise -> putWarnLn pos $
            "W: `"++ T.unpack var ++"` is shadowing another identifier from " ++ 
            show (sePos se)
        _ -> modifyCurrentScope (M.insert var (PScopeEntry pos t ass))

forceDefined :: SourcePos -> T.Text -> (Type -> Bool) -> String -> PParser ()
forceDefined pos var f msg = do
    mvi <- lookupCurrentAndGlobal var
    case mvi of
        Just (_, se) -> when (not $ f (seType se)) $ do
            setPosAndFail pos msg 
        _ -> setPosAndFail pos msg

forceSetConstantArrayDeclaration
    :: VarModifiers 
    -> T.Text 
    -> SourcePos 
    -> Maybe T.Text 
    -> Maybe ExprArithmetic 
    -> Maybe ExprAssignment 
    -> PParser ()
forceSetConstantArrayDeclaration ms var pos mtag marr mass = case marr of
    Just mexpr -> case evalIntConstExprArithmetic mexpr of
        Just size -> do
            when (size < 1) $
                setPosAndFail pos "E: array declared size is less than 1"
            varType <- fromTagAr pos mtag (Just $ Just size)
            let typ = TVar varType ms
            case mass of
                Just ass -> do
                    exprSize <- case ass of
                        ExprAssArrayInit exprs -> return $ length exprs
                        ExprAssAr (ExprString str) -> return $ T.length str
                        _ -> setPosAndFail pos "E: expected array initializer" 
                            >> return 0
                    when (exprSize > size) $
                        setPosAndFail pos ("E: array initializer size is " ++
                                           "bigger than declared size")
                    when (exprSize < size) $ 
                        putWarnLn pos ("W: array initializer size is " ++
                                       "smaller than declared size")
                    forceValidateOrSetIdentifier var pos typ mass
                _ -> forceValidateOrSetIdentifier var pos typ Nothing
        _ -> setPosAndFail pos ("E: expected constant expression in " ++
                                "array declaration")
    _ -> case mass of
        Just ass -> do
            exprSize <- case ass of
                ExprAssArrayInit exprs -> return $ length exprs
                ExprAssAr (ExprString str) -> return $ T.length str
                _ -> setPosAndFail pos "E: expected array initializer" 
                    >> return 0
            varType <- fromTagAr pos mtag (Just $ Just $ exprSize)
            forceValidateOrSetIdentifier var pos (TVar varType ms) mass
        _ -> setPosAndFail pos "E: expected array size declaration"

evalIntConstExprArithmetic :: ExprArithmetic -> Maybe Int
evalIntConstExprArithmetic (ExprInt i) = Just (fromIntegral i)
evalIntConstExprArithmetic (ExprUnaAr op expr1) =
        (intFromOpUnaArithmetic op)
    <$> evalIntConstExprArithmetic expr1
evalIntConstExprArithmetic (ExprBinAr op expr1 expr2) = 
        (intFromOpBinArithmetic op) 
    <$> evalIntConstExprArithmetic expr1
    <*> evalIntConstExprArithmetic expr2
evalIntConstExprArithmetic _ = Nothing

intFromOpUnaArithmetic :: OpUnaArithmetic -> (Int -> Int)
intFromOpUnaArithmetic OpNegate  = (-)0
intFromOpUnaArithmetic OpPreInc  = (+)1
intFromOpUnaArithmetic OpPostInc = (+)1
intFromOpUnaArithmetic OpPreDec  = (-)1
intFromOpUnaArithmetic OpPostDec = (-)1
intFromOpUnaArithmetic OpBNot    = complement

intFromOpBinArithmetic :: OpBinArithmetic -> (Int -> Int -> Int)
intFromOpBinArithmetic OpAdd  = (+)
intFromOpBinArithmetic OpSub  = (-)
intFromOpBinArithmetic OpMul  = (*)
intFromOpBinArithmetic OpDiv  = div
intFromOpBinArithmetic OpMod  = mod
intFromOpBinArithmetic OpBAnd = (.&.)
intFromOpBinArithmetic OpBOr  = (.|.)
intFromOpBinArithmetic OpBXor = xor
intFromOpBinArithmetic OpBLS  = shiftL
intFromOpBinArithmetic OpBRS  = shiftR

forceSetVariable 
    :: VarModifiers
    -> T.Text
    -> SourcePos
    -> Maybe T.Text
    -> Maybe (Maybe ExprArithmetic)
    -> Maybe ExprAssignment
    -> PParser VarType
forceSetVariable ms var pos mtag marr mexpr = case marr of
    Just arr -> do
        forceSetConstantArrayDeclaration ms var pos mtag arr mexpr
        (Just (_, se)) <- lookupCurrentAndGlobal var
        let (TVar varType _) = seType se
        return varType
    _ -> do
        varType <- fromTagAr pos mtag Nothing
        forceValidateOrSetIdentifier var pos (TVar varType ms) mexpr
        return varType

forceReturn :: SourcePos -> Statement -> PParser ()
forceReturn pos (StmtSeq ss) = case findIndices isReturnStmt ss of
    [] -> putWarnLn pos "W: no return statement in function"
    [i] | i /= (length ss-1) -> setPosAndFail pos ("E: unreachable code " ++
                                                   "following return statement")
        | otherwise -> return ()
    _ -> setPosAndFail pos "E: multiple return statements in function"
forceReturn _ (StmtReturn _) = return ()
forceReturn pos _ = putWarnLn pos "W: no return statement in function"

langDef :: PLanguageDef
langDef = Token.LanguageDef
    { Token.commentStart    = "/*"
    , Token.commentEnd      = "*/"
    , Token.commentLine     = "//"
    , Token.nestedComments  = True
    , Token.identStart      = letter
    , Token.identLetter     = alphaNum <|> oneOf "_'"
    , Token.opStart         = Token.opLetter langDef
    , Token.opLetter        = oneOf ":!#$%&*+./<=>?@\\^|-~"
    , Token.reservedNames   = [ "if", "else"
                              , "while", "do"
                              , "true", "false"
                              , "native", "public", "normal", "static", "stock"
                              ,     "forward"
                              , "private", "protected"
                              , "new", "decl"
                              , "return"
                              , "class", "interface"
                              ]
    , Token.reservedOpNames = [ "+", "-", "*", "/", "++", "--"
                              , "|", "&", "^", "~", "<<", ">>"
                              , "<", ">", "<=", ">=", "==", "!="
                              , "="
                              , "!", "&&", "||"
                              ]
    , Token.caseSensitive   = True
    }

lexer :: PTokenParser
lexer = Token.makeTokenParser langDef

identifier      :: PParser T.Text
identifier      = Token.identifier lexer >>= return . T.pack

reserved        :: String -> PParser ()
reserved        = Token.reserved lexer

reservedOp      :: String -> PParser ()
reservedOp      = Token.reservedOp lexer

charLiteral     :: PParser Char
charLiteral     = Token.charLiteral lexer

stringLiteral   :: PParser T.Text
stringLiteral   = Token.stringLiteral lexer >>= return . T.pack

symbol          :: String -> PParser String
symbol          = Token.symbol lexer

integer         :: PParser Integer
integer         = Token.integer lexer

semicolon       :: PParser ()
semicolon       = Token.semi lexer >> return ()

whiteSpace      :: PParser ()
whiteSpace      = Token.whiteSpace lexer

commaSep        :: PParser a -> PParser [a]
commaSep        = Token.commaSep lexer

parens, braces ,{- angles,  -} brackets :: forall a. PParser a -> PParser a
parens     = Token.parens lexer -- ()
braces     = Token.braces lexer -- {}
--angles     = Token.angles lexer -- <>
brackets   = Token.brackets lexer -- []


programParser :: PParser Statement
programParser = do
    whiteSpace
    stmt <- stmts globalStatement
    eof
#ifdef DebugEnabled
    st <- getState
    pos <- getPosition
    putWarnLn pos $ "Debug: -> State is below\n---\n" ++ show st ++ "\n---\n"
#endif
    return stmt

stmts :: PParser Statement -> PParser Statement
stmts pstmt = do
    list <- sepBy1 pstmt whiteSpace
    return $ if length list == 1 then head list else StmtSeq list

globalStatement :: PParser Statement
globalStatement = funcStmt
            --  <|> funcCallStmt
              <|> newStmt
              <|> declStmt
              <|> assignStmt

funcStatement :: PParser Statement
funcStatement = funcCallStmt
            <|> returnStmt
            <|> ifElseStmt
            <|> ifStmt
            <|> whileStmt
            <|> doWhileStmt
            <|> forStmt
            <|> assignStmt
            <|> newStmt
            <|> declStmt

bracedStatement :: PParser Statement
bracedStatement = (try funcStatement)
              <|> braces (stmts funcStatement)

ifStmt :: PParser Statement
ifStmt = do 
    (cond, stmt1) <- try $ do
        reserved "if"
        cond  <- parens exprBoolean
        stmt1 <- bracedStatement
        return $ (cond, stmt1)
        
    return $ StmtIf cond stmt1
    
ifElseStmt :: PParser Statement
ifElseStmt = do 
    (cond, stmt1) <- try $ do
        reserved "if"
        cond  <- parens exprBoolean
        stmt1 <- bracedStatement
        reserved "else"
        return $ (cond, stmt1)
    stmt2 <- bracedStatement
    return $ StmtIfElse cond stmt1 stmt2
    
whileStmt :: PParser Statement
whileStmt = do 
    reserved "while"
    cond <- parens exprBoolean
    stmt <- bracedStatement
    return $ StmtWhile cond stmt
    
doWhileStmt :: PParser Statement
doWhileStmt = do 
    reserved "do"
    stmt <- bracedStatement
    reserved "while"
    cond <- parens exprBoolean
    semicolon
    return $ StmtDoWhile cond stmt

forStmt :: PParser Statement
forStmt = do
    reserved "for"
    (ini, cond, it) <- parens $ do
        ini <- newStmt
        cond <- exprBoolean
        semicolon
        it <- exprArithmetic
        return $ (ini, cond, it)
    stmt <- bracedStatement
    return $ StmtFor ini cond it stmt

assignStmt :: PParser Statement
assignStmt = do 
    (pos, var, marr, expr) <- try $ do
        pos <- getPosition
        var <- identifier
        marr <- arrayDeclaration
        reservedOp "="
        expr <- exprAssignment
        _ <- semicolon
        return $ (pos, var, marr, expr)
        
    forceDefined pos var isVariable $ "E: unknown var `" ++ T.unpack var ++ "`"
    case marr of 
        Just arr -> case arr of 
            Just exprIdx -> return $ StmtIndex var exprIdx expr
            _ -> fail "expected index in array assignment"
        _ -> return $ StmtAss var expr

returnStmt :: PParser Statement
returnStmt = do
    reserved "return"
    expr <- exprAssignment
    semicolon
    return $ StmtReturn expr

declStmt :: PParser Statement
declStmt = do 
    reserved "decl"
    ms <- varModifiers
    mtag <- tagDeclaration
    pos <- getPosition
    var <- identifier
    marr <- arrayDeclaration
    semicolon
    
    varType <- forceSetVariable ms var pos mtag marr Nothing
    return $ StmtDecl ms varType var

newStmt :: PParser Statement
newStmt = do 
    reserved "new"
    ms <- varModifiers
    mtag <- tagDeclaration
    pos <- getPosition
    var <- identifier
    marr <- arrayDeclaration
    mexpr <- optionMaybe (try (reservedOp "=" >> exprAssignment))
    semicolon
    
    varType <- forceSetVariable ms var pos mtag marr mexpr
    return $ StmtNew ms varType var mexpr

funcStmt :: PParser Statement
funcStmt = do
    (ms, var, args, stmt, pos, varType) <- try $ do
        ms <- funcModifiers
        mtag <- tagDeclaration
        pos <- getPosition
        var <- identifier
        args <- parens $ commaSep $ do
            ams <- funcArgModifiers
            matag <- tagDeclaration
            argpos <- getPosition
            arg <- identifier
            marr <- optionMaybe $ symbol "[]" >> return Nothing
            expr <- optionMaybe $ do
                reservedOp "="
                exprAssignment
            varargs <- fromTagAr argpos matag marr
            return $ (ams, varargs, arg, expr)
            
        varType <- fromTag pos mtag
        forceValidateOrSetIdentifier var pos (TFunc varType ms) Nothing
        
        createNewScope var
        stmt <- switchScope var $ do
            braces (stmts funcStatement)
        return $ (ms, var, args, stmt, pos, varType)
    
    forceReturn pos stmt
    forceGlobalScope pos "Fatal: defining function outside of global scope"
    
    return $ StmtFunc ms varType var args stmt

funcCallStmt :: PParser Statement
funcCallStmt = do 
    (var,expr) <- funcCallInternal
    semicolon
    return $ StmtFuncCall var expr

funcCallInternal :: PParser (T.Text, [ExprArithmetic])
funcCallInternal = do
    pos <- getPosition
    (var, expr) <- try $ do
        var <- identifier
        expr <- parens $ commaSep exprArithmetic
        return $ (var, expr)
    forceDefined pos var isFunc $ "E: unknown function `" ++ T.unpack var ++ "`"
    return $ (var, expr)

funcModifiers :: PParser FuncModifiers
funcModifiers = do
    ms <- many $ (reserved "native" >> return MFNative)
             <|> (reserved "public" >> return MFPublic)
             <|> (reserved "static" >> return MFStatic)
             <|> (reserved "stock"  >> return MFStock)
             <|> (reserved "forward" >> return MFForward)
    if null ms 
        then return [MFNormal]
        else return ms

funcArgModifiers :: PParser FuncArgModifiers
funcArgModifiers = many $ (reserved "const" >> return MFAConst)
--                      <|> (reserved "in"    >> return OpFAIn)
--                      <|> (reserved "out"   >> return OpFAOut)

tagDeclaration :: PParser (Maybe T.Text)
tagDeclaration = optionMaybe $ try $ do
    tag <- identifier <|> liftM T.pack (count 1 (char '_'))
    reservedOp ":"
    return tag

arrayDeclaration :: PParser ArrayDeclarationInternal
arrayDeclaration = optionMaybe $ try $ do 
    reservedOp "["
    expr <- optionMaybe (try exprArithmetic)
    reservedOp "]"
    return expr

exprAssignment :: PParser ExprAssignment
exprAssignment = try (liftM ExprAssBool exprBoolean)
             <|> liftM ExprAssAr exprArithmetic
             <|> liftM ExprAssArrayInit (braces (commaSep exprArithmetic))

varModifiers :: PParser VarModifiers
varModifiers = many $ (reserved "const"  >> return MVConst)
                       <|> (reserved "static" >> return MVStatic)
    

exprBoolean :: PParser ExprBoolean
exprBoolean = buildExpressionParser opBoolean termBoolean

exprArithmetic :: PParser ExprArithmetic
exprArithmetic = buildExpressionParser opArithmetic termArithmetic

opBoolean :: POperatorTable ExprBoolean
opBoolean = [ [Prefix (reservedOp "!"  >> return (ExprNot          ))          ]
            , [Infix  (reservedOp "&&" >> return (ExprBinBool OpAnd)) AssocLeft]
            , [Infix  (reservedOp "||" >> return (ExprBinBool OpOr )) AssocLeft]
            ]

opArithmetic :: POperatorTable ExprArithmetic
opArithmetic = 
    [ [Prefix  (reservedOp "-"  >> return (ExprUnaAr OpNegate))           ]
    , [Prefix  (reservedOp "~"  >> return (ExprUnaAr OpBNot))             ]
    , [Prefix  (reservedOp "++" >> return (ExprUnaAr OpPreInc))           ]
    , [Postfix (reservedOp "++" >> return (ExprUnaAr OpPostInc))          ]
    , [Prefix  (reservedOp "--" >> return (ExprUnaAr OpPreDec))           ]
    , [Postfix (reservedOp "--" >> return (ExprUnaAr OpPostDec))          ]
    , [Infix   (reservedOp "%"  >> return (ExprBinAr OpMod))     AssocLeft]
    , [Infix   (reservedOp "*"  >> return (ExprBinAr OpMul))     AssocLeft]
    , [Infix   (reservedOp "/"  >> return (ExprBinAr OpDiv))     AssocLeft]
    , [Infix   (reservedOp "+"  >> return (ExprBinAr OpAdd))     AssocLeft]
    , [Infix   (reservedOp "-"  >> return (ExprBinAr OpSub))     AssocLeft]
    , [Infix   (reservedOp "&"  >> return (ExprBinAr OpBAnd))    AssocLeft]
    , [Infix   (reservedOp "|"  >> return (ExprBinAr OpBOr))     AssocLeft]
    , [Infix   (reservedOp "^"  >> return (ExprBinAr OpBXor))    AssocLeft]
    , [Infix   (reservedOp "<<" >> return (ExprBinAr OpBLS)) AssocLeft]
    , [Infix   (reservedOp ">>" >> return (ExprBinAr OpBRS)) AssocLeft]
    ]

termArithmetic :: PParser ExprArithmetic
termArithmetic = parens exprArithmetic
             <|> do pos <- getPosition
                    -- `try` is here to display `forceDefined` errors
                    (var, expr) <- try $ do
                        var <- identifier
                        expr <- brackets exprArithmetic
                        return $ (var, expr)
                    forceDefined pos var isVariable "E: not using a variable"
                    return $ ExprIndex var expr
             <|> do (var, expr) <- funcCallInternal
                    return $ ExprFuncCall var expr
             <|> liftM ExprVar (try identifier)
             <|> liftM ExprInt (try integer)
             <|> liftM ExprChar (try charLiteral)
             <|> liftM ExprString (try stringLiteral)

termBoolean :: PParser ExprBoolean
termBoolean = parens exprBoolean
          <|> (reserved "true"  >> return (ExprBool True ))
          <|> (reserved "false" >> return (ExprBool False))
          <|> exprRelational

exprRelational :: PParser ExprBoolean
exprRelational = do
    a1 <- exprArithmetic
    op <- relation
    a2 <- exprArithmetic
    return $ ExprBinRel op a1 a2

relation :: PParser OpBinRelational
relation = (reservedOp ">"  >> return OpGT)
       <|> (reservedOp ">=" >> return OpGE)
       <|> (reservedOp "<"  >> return OpLT)
       <|> (reservedOp "<=" >> return OpLE)
       <|> (reservedOp "==" >> return OpEq)
       <|> (reservedOp "!=" >> return OpNE)
