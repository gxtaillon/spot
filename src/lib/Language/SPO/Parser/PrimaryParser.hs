{-# LANGUAGE RankNTypes #-}
module Language.SPO.Parser.PrimaryParser 
    ( whileParser
    ) where

import Control.Monad
import Data.Functor.Identity
import Data.Maybe
import qualified Data.Text as T
import Text.Parsec
import Text.Parsec.Text
import Text.Parsec.Expr
import Text.Parsec.Language
import qualified Text.Parsec.Token as Token

import Language.SPO.Parser.Types

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

identifier :: Parser T.Text
identifier = Token.identifier lexer >>= return . T.pack

reserved   :: String -> Parser ()
reserved   = Token.reserved   lexer

reservedOp :: String -> Parser ()
reservedOp = Token.reservedOp lexer

charLiteral   :: Parser Char
charLiteral   = Token.charLiteral lexer

stringLiteral :: Parser T.Text
stringLiteral = Token.stringLiteral lexer >>= return . T.pack

symbol     :: String -> Parser String
symbol     = Token.symbol     lexer

integer    :: Parser Integer
integer    = Token.integer    lexer

semicolon  ::  Parser String
semicolon  = Token.semi       lexer

whiteSpace :: Parser ()
whiteSpace = Token.whiteSpace lexer

commaSep   :: Parser a -> Parser [a]
commaSep   = Token.commaSep   lexer

parens, braces ,{- angles,  -} brackets :: forall a. Parser a -> Parser a
parens     = Token.parens     lexer -- ()
braces     = Token.braces     lexer -- {}
--angles     = Token.angles     lexer -- <>
brackets   = Token.brackets   lexer -- []


-- Main Parser

whileParser :: Parser Statement
whileParser = do
    whiteSpace
    stmt <- statement
    eof
    return stmt

statement :: Parser Statement
statement = parens statement
        <|> statements

statements :: Parser Statement
statements = do
    list <- sepBy1 statement' whiteSpace
    return $ if length list == 1 then head list else StmtSeq list

statement' :: Parser Statement
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

bracedStmt :: Parser Statement
bracedStmt = (try $ statement') 
         <|> braces statement

ifStmt' :: Parser (ExprBoolean, Statement)
ifStmt' = do 
    reserved "if"
    cond  <- parens exprBoolean
    stmt <- bracedStmt
    return (cond,stmt)

ifStmt :: Parser Statement
ifStmt = do 
    (cond, stmt) <- ifStmt'
    return $ StmtIf cond stmt

ifElseStmt :: Parser Statement
ifElseStmt = do 
    (cond, stmt1) <- ifStmt'
    reserved "else"
    stmt2 <- bracedStmt
    return $ StmtIfElse cond stmt1 stmt2
    
whileStmt :: Parser Statement
whileStmt = do 
    reserved "while"
    cond <- parens exprBoolean
    stmt <- bracedStmt
    return $ StmtWhile cond stmt
    
doWhileStmt :: Parser Statement
doWhileStmt = do 
    reserved "do"
    stmt <- bracedStmt
    reserved "while"
    cond <- parens exprBoolean
    _ <- semicolon
    return $ StmtDoWhile cond stmt

forStmt :: Parser Statement
forStmt = do
    reserved "for"
    (ini, cond, it) <- parens $ do
        ini <- newStmt
        cond <- exprBoolean
        _ <- semicolon
        it <- exprArithmetic
        return $ (ini, cond, it)
    stmt <- bracedStmt
    return $ StmtFor ini cond it stmt

assignStmt :: Parser Statement
assignStmt = do 
    var <- identifier
    marr <- arrayDeclaration
    reservedOp "="
    expr <- exprAssignment
    _ <- semicolon
    return $ StmtAss var marr expr

returnStmt :: Parser Statement
returnStmt = do
    reserved "return"
    expr <- exprAssignment
    _ <- semicolon
    return $ StmtReturn expr

declStmt :: Parser Statement
declStmt = do 
    reserved "decl"
    ms <- variableModifiers
    mtag <- tagDeclaration
    var <- identifier
    marr <- arrayDeclaration
    _ <- semicolon
    return $ StmtDecl ms mtag var marr
    
newStmt :: Parser Statement
newStmt = do 
    reserved "new"
    ms <- variableModifiers
    mtag <- tagDeclaration
    var <- identifier
    marr <- arrayDeclaration
    mexpr <- optionMaybe (try (reservedOp "=" >> exprAssignment))
    _ <- semicolon
    return $ StmtNew ms mtag var marr mexpr

funcStmt :: Parser Statement
funcStmt = do
    m <- opFuncModifier
    mtag <- tagDeclaration
    var <- identifier    
    args <- parens $ commaSep $ do
        ms <- funcArgModifiers
        matag <- tagDeclaration
        arg <- identifier
        marr <- optionMaybe $ symbol "[" >> symbol "]"
        expr <- optionMaybe $ do
            reservedOp "="
            exprAssignment
        return $ (ms, matag, arg, isJust marr, expr)
    stmt <- braces $ statement 
    return $ StmtFunc m mtag var args stmt

funcCallStmt :: Parser Statement
funcCallStmt = do 
    (var,expr) <- funcCallInternal
    _ <- semicolon
    return $ StmtFuncCall var expr

funcCallInternal :: Parser (T.Text, [ExprArithmetic])
funcCallInternal = do
    var <- identifier
    expr <- parens $ commaSep exprArithmetic
    return $ (var, expr)

opFuncModifier :: Parser OpFuncModifier
opFuncModifier = do
    ms <- many $ (reserved "native" >> return OpFNative)
             <|> (reserved "public" >> return OpFPublic)
             <|> (reserved "static" >> return OpFStatic)
             <|> (reserved "stock" >> return OpFStock)
             <|> (reserved "forward" >> return OpFForward)
    if null ms 
        then return OpFNormal
        else if length ms > 1 
            then fail "unpexpected modifier"
            else return $ head ms

funcArgModifiers :: Parser FuncArgModifiers
funcArgModifiers = many $ (reserved "const" >> return OpFAConst)
--                      <|> (reserved "in"    >> return OpFAIn)
--                      <|> (reserved "out"   >> return OpFAOut)

tagDeclaration :: Parser TagDeclaration
tagDeclaration = optionMaybe $ try $ do
    tag <- identifier <|> liftM T.pack (count 1 (char '_'))
    reservedOp ":"
    return tag

arrayDeclaration :: Parser ArrayDeclaration
arrayDeclaration = optionMaybe $ try $ do 
    reservedOp "["
    expr <- optionMaybe (try exprArithmetic)
    reservedOp "]"
    return expr

exprAssignment :: Parser ExprAssignment
exprAssignment = try (liftM ExprAssBool exprBoolean)
             <|> liftM ExprAssAr exprArithmetic
             <|> liftM ExprAssArrayInit (braces (commaSep exprArithmetic))

variableModifiers :: Parser VariableModifiers
variableModifiers = many $ (reserved "const"  >> return OpConst)
                       <|> (reserved "static" >> return OpStatic)
    

exprBoolean :: Parser ExprBoolean
exprBoolean = buildExpressionParser opBoolean termBoolean

exprArithmetic :: Parser ExprArithmetic
exprArithmetic = buildExpressionParser opArithmetic termArithmetic

opBoolean :: OperatorTable T.Text () Identity ExprBoolean
opBoolean = [ [Prefix (reservedOp "!"  >> return (ExprNot          ))          ]
            , [Infix  (reservedOp "&&" >> return (ExprBinBool OpAnd)) AssocLeft]
            , [Infix  (reservedOp "||" >> return (ExprBinBool OpOr )) AssocLeft]
            ]

opArithmetic :: OperatorTable T.Text () Identity ExprArithmetic
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

termArithmetic :: Parser ExprArithmetic
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

termBoolean :: Parser ExprBoolean
termBoolean = parens exprBoolean
          <|> (reserved "true"  >> return (ExprBool True ))
          <|> (reserved "false" >> return (ExprBool False))
          <|> exprRelational

exprRelational :: Parser ExprBoolean
exprRelational = do
    a1 <- exprArithmetic
    op <- relation
    a2 <- exprArithmetic
    return $ ExprBinRel op a1 a2

relation :: Parser OpBinRelational
relation = (reservedOp ">"  >> return OpGT)
       <|> (reservedOp ">=" >> return OpGE)
       <|> (reservedOp "<"  >> return OpLT)
       <|> (reservedOp "<=" >> return OpLE)
       <|> (reservedOp "==" >> return OpEq)
       <|> (reservedOp "!=" >> return OpNE)
