{-# LANGUAGE RankNTypes #-}
module Language.SPO.Parser.PrimaryParser 
    ( whileParser
    ) where

import Control.Monad
import Data.Functor.Identity
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
    , Token.reservedOpNames = [ "+", "-", "*", "/", "="
                              , "<", ">"
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

integer    :: Parser Integer
integer    = Token.integer    lexer

semicolon  ::  Parser String
semicolon  = Token.semi       lexer

comma      :: Parser String
comma      = Token.comma      lexer

whiteSpace :: Parser ()
whiteSpace = Token.whiteSpace lexer

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

assignStmt :: Parser Statement
assignStmt = do 
    var <- identifier
    marr <- arrayDeclaration
    reservedOp "="
    expr <- exprAssignment
    _ <- semicolon
    return $ StmtAss var marr expr

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
             <|> (liftM ExprAssAr exprArithmetic)
             <|> (liftM ExprAssArrayInit (braces (sepBy exprArithmetic comma)))

variableModifiers :: Parser VariableModifiers
variableModifiers = many $ choice [
      (reserved "const" >> return OpConst)
    , (reserved "static" >> return OpStatic)
    ]

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
opArithmetic = [ [Postfix (brackets exprArithmetic >>= return . ExprIndex)     ]
               , [Prefix (reservedOp "-" >> return (ExprNeg        ))          ]
               , [Infix  (reservedOp "*" >> return (ExprBinAr OpMul)) AssocLeft]
               , [Infix  (reservedOp "/" >> return (ExprBinAr OpDiv)) AssocLeft]
               , [Infix  (reservedOp "+" >> return (ExprBinAr OpAdd)) AssocLeft]
               , [Infix  (reservedOp "-" >> return (ExprBinAr OpSub)) AssocLeft]
               ]

termArithmetic :: Parser ExprArithmetic
termArithmetic = parens exprArithmetic
             <|> liftM ExprVar identifier
             <|> liftM ExprInt integer

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
relation = (reservedOp ">" >> return OpGT)
       <|> (reservedOp "<" >> return OpLT)
