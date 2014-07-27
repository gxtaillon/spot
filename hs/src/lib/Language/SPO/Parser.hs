{-# LANGUAGE RankNTypes #-}
module Language.SPO.Parser 
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

import Language.SPO.Types

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

reserved :: String -> Parser ()
reserved   = Token.reserved   lexer

reservedOp :: String -> Parser ()
reservedOp = Token.reservedOp lexer

integer :: Parser Integer
integer    = Token.integer    lexer

semicolon ::  Parser String
semicolon  = Token.semi       lexer

whiteSpace :: Parser ()
whiteSpace = Token.whiteSpace lexer

parens, braces {-, angles, brackets -} :: forall a. Parser a -> Parser a
parens     = Token.parens     lexer -- ()
braces     = Token.braces     lexer -- {}
--angles     = Token.angles     lexer -- <>
--brackets   = Token.brackets   lexer -- []


-- Main Parser

whileParser :: Parser Statement
whileParser = whiteSpace >> statement

statement :: Parser Statement
statement = parens statement
        <|> statements

statements :: Parser Statement
statements = do
    list <- sepBy1 statement' semicolon
    return $ if length list == 1 then head list else StmtSeq list

statement' :: Parser Statement
statement' = ifStmt
         <|> whileStmt
         <|> assignStmt

ifStmt :: Parser Statement
ifStmt = do 
    reserved "if"
    cond  <- parens exprBoolean
    stmt1 <- braces statement
    reserved "else"
    stmt2 <- braces statement
    return $ StmtIf cond stmt1 stmt2

whileStmt :: Parser Statement
whileStmt = do 
    reserved "while"
    cond <- parens exprBoolean
    stmt <- braces statement
    return $ StmtWhile cond stmt

assignStmt :: Parser Statement
assignStmt = do 
    var  <- identifier
    reservedOp "="
    expr <- exprArithmetic
    _ <- semicolon
    return $ StmtAss var expr

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
opArithmetic = [ [Prefix (reservedOp "-" >> return (ExprNeg        ))          ]
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
