{-# LANGUAGE RankNTypes #-}
module Language.SPO.Parser.PrimaryParser 
    ( runPrimaryParser
    ) where

import Control.Monad
import Data.Functor.Identity
import qualified Data.Map.Strict as M
import qualified Data.Text as T
import Text.Parsec
import Text.Parsec.Text
import Text.Parsec.Expr
import Text.Parsec.Language
import qualified Text.Parsec.Token as Token

import Language.SPO.Parser.Types

envKeyGlobal = "_global"

runPrimaryParser :: SourceName -> T.Text -> Either ParseError Statement
runPrimaryParser = 
    runParser programParser (M.singleton envKeyGlobal M.empty, envKeyGlobal)

type PEnvEntry = (SourcePos, Type)
type PEnv = M.Map T.Text PEnvEntry
type PEnvMap = M.Map T.Text PEnv

type PParserState = (PEnvMap,T.Text)
type PParser = GenParser PParserState
type POperatorTable a = OperatorTable T.Text PParserState Identity a

fromTagAr :: Maybe (T.Text) -> Maybe (Maybe Int) -> VarType
fromTagAr t               (Just s) = VTArray (fromTag t) s
fromTagAr (Just "_")      _        = VT_
fromTagAr (Just "Float")  _        = VTFloat
fromTagAr (Just "bool")   _        = VTBool
fromTagAr (Just "String") _        = VTString
fromTagAr (Just u)        _        = VTUser u
fromTagAr _               _        = VTInt

fromTag :: Maybe (T.Text) -> VarType
fromTag = flip fromTagAr Nothing

eePos :: PEnvEntry -> SourcePos
eePos = fst

eeType :: PEnvEntry -> Type
eeType = snd

makeEe :: SourcePos -> Type -> PEnvEntry
makeEe = (,)

getAllEnvs :: PParser PEnvMap
getAllEnvs = getState >>= return . fst

getCurrentEnvKey :: PParser T.Text
getCurrentEnvKey = getState >>= return . snd

isGlobalEnv :: PParser Bool
isGlobalEnv = getCurrentEnvKey >>= return . (==) envKeyGlobal

getCurrentEnv :: PParser PEnv
getCurrentEnv = do
    st <- getState
    case M.lookup (snd st) (fst st) of
        Just ce -> return ce
        _ -> fail "Fatal: There is no state."

modifyCurrentEnv :: (PEnv -> PEnv) -> PParser ()
modifyCurrentEnv f = modifyState (\(em,cs) -> (M.adjust f cs em, cs))

createNewEnv :: T.Text -> PParser ()
createNewEnv ek = modifyState (\(em,cs) -> (M.insert ek M.empty em, cs))

switchEnv :: T.Text -> PParser a -> PParser a
switchEnv ek p = do
    (pem, pek) <- getState
    case M.lookup ek pem of
        Just _ -> do
            modifyState (\(em,_) -> (em, ek))
            r <- p
            modifyState (\(em,_) -> (em, pek))
            return r
        _ -> fail "Fatal: switching to unknown environment"

-- Many thanks to Daniel Fischer for this workaround.
-- http://haskell.1045720.n5.nabble.com/Parsec-Custom-Fail-tp3131949p3131952.html
setPosAndFail :: SourcePos -> String -> PParser ()
setPosAndFail pos msg = do 
    setPosition pos 
    inp <- getInput 
    setInput (T.cons 'a' inp) 
    _ <- tokenPrim (const "") (\p _ _ -> p) Just 
    fail msg 

forceValidateOrSetIdentifier :: T.Text -> SourcePos -> Type -> PParser ()
forceValidateOrSetIdentifier var pos t = do
    cenv <- getCurrentEnv
    case M.lookup var cenv of
        Just e -> setPosAndFail pos $ "E: redefining variable found at " ++ show (eePos e)
        -- putStrLn $ "W: shadowing variable at " ++ show (eePos v)
        _ -> modifyCurrentEnv (M.insert var (makeEe pos t))

forceGlobalEnv :: SourcePos -> String -> PParser ()
forceGlobalEnv pos msg = isGlobalEnv >>= \ige -> when (not ige) (setPosAndFail pos msg)

langDef :: forall u. GenLanguageDef T.Text u Identity
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

lexer :: forall u. Token.GenTokenParser T.Text u Identity
lexer = Token.makeTokenParser langDef

identifier :: PParser T.Text
identifier = Token.identifier lexer >>= return . T.pack

reserved   :: String -> PParser ()
reserved   = Token.reserved   lexer

reservedOp :: String -> PParser ()
reservedOp = Token.reservedOp lexer

charLiteral   :: PParser Char
charLiteral   = Token.charLiteral lexer

stringLiteral :: PParser T.Text
stringLiteral = Token.stringLiteral lexer >>= return . T.pack

symbol     :: String -> PParser String
symbol     = Token.symbol     lexer

integer    :: PParser Integer
integer    = Token.integer    lexer

semicolon  :: PParser ()
semicolon  = Token.semi       lexer >> return ()

whiteSpace :: PParser ()
whiteSpace = Token.whiteSpace lexer

commaSep   :: PParser a -> PParser [a]
commaSep   = Token.commaSep   lexer

parens, braces ,{- angles,  -} brackets :: forall a. PParser a -> PParser a
parens     = Token.parens     lexer -- ()
braces     = Token.braces     lexer -- {}
--angles     = Token.angles     lexer -- <>
brackets   = Token.brackets   lexer -- []


programParser :: PParser Statement
programParser = do
    whiteSpace
    stmt <- statement
    eof
    return stmt

statement :: PParser Statement
statement = parens statement
        <|> statements

statements :: PParser Statement
statements = do
    list <- sepBy1 statement' whiteSpace
    return $ if length list == 1 then head list else StmtSeq list

statement' :: PParser Statement
statement' = try ifElseStmt
         <|> try funcStmt
         <|> forStmt
         <|> funcCallStmt
         <|> returnStmt
         <|> ifStmt
         <|> whileStmt
         <|> doWhileStmt
         <|> declStmt
         <|> newStmt
         <|> assignStmt

bracedStmt :: PParser Statement
bracedStmt = (try $ statement') 
         <|> braces statement

ifStmt' :: PParser (ExprBoolean, Statement)
ifStmt' = do 
    reserved "if"
    cond  <- parens exprBoolean
    stmt <- bracedStmt
    return (cond,stmt)

ifStmt :: PParser Statement
ifStmt = do 
    (cond, stmt) <- ifStmt'
    return $ StmtIf cond stmt

ifElseStmt :: PParser Statement
ifElseStmt = do 
    (cond, stmt1) <- ifStmt'
    reserved "else"
    stmt2 <- bracedStmt
    return $ StmtIfElse cond stmt1 stmt2
    
whileStmt :: PParser Statement
whileStmt = do 
    reserved "while"
    cond <- parens exprBoolean
    stmt <- bracedStmt
    return $ StmtWhile cond stmt
    
doWhileStmt :: PParser Statement
doWhileStmt = do 
    reserved "do"
    stmt <- bracedStmt
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
    stmt <- bracedStmt
    return $ StmtFor ini cond it stmt

assignStmt :: PParser Statement
assignStmt = do 
    var <- identifier
    marr <- arrayDeclaration
    reservedOp "="
    expr <- exprAssignment
    _ <- semicolon
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
    marr <- arrayDeclarationResolved
    semicolon
    
    let varType = fromTagAr mtag marr
    forceValidateOrSetIdentifier var pos (TVar varType ms)
    return $ StmtDecl ms varType var

newStmt :: PParser Statement
newStmt = do 
    reserved "new"
    ms <- varModifiers
    mtag <- tagDeclaration
    pos <- getPosition
    var <- identifier
    marr <- arrayDeclarationResolved
    mexpr <- optionMaybe (try (reservedOp "=" >> exprAssignment))
    semicolon
    
    let varType = fromTagAr mtag marr
    forceValidateOrSetIdentifier var pos (TVar varType ms)
    return $ StmtNew ms varType var mexpr

funcStmt :: PParser Statement
funcStmt = do
    ms <- funcModifiers
    mtag <- tagDeclaration
    pos <- getPosition
    var <- identifier    
    args <- parens $ commaSep $ do
        ams <- funcArgModifiers
        matag <- tagDeclaration
        arg <- identifier
        marr <- optionMaybe $ symbol "[" >> symbol "]" >> return Nothing
        expr <- optionMaybe $ do
            reservedOp "="
            exprAssignment
        return $ (ams, fromTagAr matag marr, arg, expr)
    
    createNewEnv var
    stmt <- switchEnv var $ do
        braces statement
    
    forceGlobalEnv pos "E: defining function outside of global scope"
    
    let varType = fromTag mtag
    forceValidateOrSetIdentifier var pos (TFunc varType ms)    
    return $ StmtFunc ms varType var args stmt

funcCallStmt :: PParser Statement
funcCallStmt = do 
    (var,expr) <- funcCallInternal
    semicolon
    return $ StmtFuncCall var expr

funcCallInternal :: PParser (T.Text, [ExprArithmetic])
funcCallInternal = do
    var <- identifier
    expr <- parens $ commaSep exprArithmetic
    return $ (var, expr)

funcModifiers :: PParser FuncModifiers
funcModifiers = do
    ms <- many $ (reserved "native" >> return OpFNative)
             <|> (reserved "public" >> return OpFPublic)
             <|> (reserved "static" >> return OpFStatic)
             <|> (reserved "stock"  >> return OpFStock)
             <|> (reserved "forward" >> return OpFForward)
    if null ms 
        then return [OpFNormal]
        else return ms

funcArgModifiers :: PParser FuncArgModifiers
funcArgModifiers = many $ (reserved "const" >> return OpFAConst)
--                      <|> (reserved "in"    >> return OpFAIn)
--                      <|> (reserved "out"   >> return OpFAOut)

tagDeclaration :: PParser (Maybe T.Text)
tagDeclaration = optionMaybe $ try $ do
    tag <- identifier <|> liftM T.pack (count 1 (char '_'))
    reservedOp ":"
    return tag

arrayDeclaration :: PParser (Maybe (Maybe ExprArithmetic))
arrayDeclaration = optionMaybe $ try $ do 
    reservedOp "["
    expr <- optionMaybe (try exprArithmetic)
    reservedOp "]"
    return expr

arrayDeclarationResolved :: PParser (Maybe (Maybe Int))
arrayDeclarationResolved = do
    mmexpr <- arrayDeclaration
    return $ fmap (fmap (const 999)) mmexpr -- TODO resolve expr to a constant

exprAssignment :: PParser ExprAssignment
exprAssignment = try (liftM ExprAssBool exprBoolean)
             <|> liftM ExprAssAr exprArithmetic
             <|> liftM ExprAssArrayInit (braces (commaSep exprArithmetic))

varModifiers :: PParser VarModifiers
varModifiers = many $ (reserved "const"  >> return OpConst)
                       <|> (reserved "static" >> return OpStatic)
    

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
    , [Infix   (reservedOp "*"  >> return (ExprBinAr OpMul))     AssocLeft]
    , [Infix   (reservedOp "/"  >> return (ExprBinAr OpDiv))     AssocLeft]
    , [Infix   (reservedOp "+"  >> return (ExprBinAr OpAdd))     AssocLeft]
    , [Infix   (reservedOp "-"  >> return (ExprBinAr OpSub))     AssocLeft]
    , [Infix   (reservedOp "&"  >> return (ExprBinAr OpBAnd))    AssocLeft]
    , [Infix   (reservedOp "|"  >> return (ExprBinAr OpBOr))     AssocLeft]
    , [Infix   (reservedOp "^"  >> return (ExprBinAr OpBXor))    AssocLeft]
    , [Infix   (reservedOp "<<" >> return (ExprBinAr OpBLShift)) AssocLeft]
    , [Infix   (reservedOp ">>" >> return (ExprBinAr OpBRShift)) AssocLeft]
    ]

termArithmetic :: PParser ExprArithmetic
termArithmetic = parens exprArithmetic
             <|> try (do var <- identifier
                         expr <- brackets exprArithmetic
                         return $ ExprIndex var expr)
             <|> try (do (var,expr) <- funcCallInternal
                         return $ ExprFuncCall var expr)
             <|> liftM ExprVar identifier
             <|> liftM ExprInt integer
             <|> liftM ExprChar charLiteral
             <|> liftM ExprString stringLiteral

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
