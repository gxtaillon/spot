{-# LANGUAGE OverloadedStrings #-}
import Control.Monad
import Data.Int
import qualified Data.Text as T
import Text.Parsec
import Text.Parsec.Text
import Text.Parsec.Expr
import Text.Parsec.Language
import qualified Text.Parsec.Token as Token


-- Data structures
data ExprBoolean = 
      ExprBool Bool
    | ExprNot ExprBoolean
    | ExprBinBool OpBinBoolean ExprBoolean ExprBoolean
    | ExprBinRel OpBinRelational ExprArithmetic ExprArithmetic
      deriving (Show)

data OpBinBoolean = 
      OpAnd 
    | OpOr 
      deriving (Show)

data OpBinRelational = 
      OpGT 
    | OpLT 
      deriving (Show)

data ExprArithmetic = 
      ExprVar T.Text
    | ExprInt Integer
    | ExprNeg ExprArithmetic
    | ExprBinAr OpBinArithemic ExprArithmetic ExprArithmetic
      deriving (Show)

data OpBinArithemic = 
      OpAdd 
    | OpSub 
    | OpMul 
    | OpDiv 
      deriving (Show)

data Statement = 
      StmtSeq [Statement]
    | StmtAss T.Text ExprArithmetic
    | StmtIf ExprBoolean Statement Statement
    | StmtWhile ExprBoolean Statement
      deriving (Show)

-- Lexer

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

lexer = Token.makeTokenParser langDef

identifier = Token.identifier lexer >>= return . T.pack
reserved   = Token.reserved   lexer
reservedOp = Token.reservedOp lexer
integer    = Token.integer    lexer
semicolon  = Token.semi       lexer
whiteSpace = Token.whiteSpace lexer

parens     = Token.parens     lexer -- ()
braces     = Token.braces     lexer -- {}
angles     = Token.angles     lexer -- <>
brackets   = Token.brackets   lexer -- []


-- Parser

whileParser :: Parser Statement
whileParser = whiteSpace >> statement

statement :: Parser Statement
statement = parens statement
        <|> sequenceOfStatements

sequenceOfStatements = do
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
    semicolon
    return $ StmtAss var expr

exprBoolean :: Parser ExprBoolean
exprBoolean = buildExpressionParser opBoolean termBoolean

exprArithmetic :: Parser ExprArithmetic
exprArithmetic = buildExpressionParser opArithmetic termArithmetic

opBoolean = [ [Prefix (reservedOp "!"  >> return (ExprNot          ))          ]
            , [Infix  (reservedOp "&&" >> return (ExprBinBool OpAnd)) AssocLeft]
            , [Infix  (reservedOp "||" >> return (ExprBinBool OpOr )) AssocLeft]
            ]

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

-- Writer



-- Utils

parseString :: String -> Statement
parseString str = case parse whileParser "" $ T.pack str of
    Left e  -> error $ show e
    Right r -> r

parseFile :: String -> IO Statement
parseFile file = do
    program <- readFile file
    case parse whileParser "" $ T.pack program of
        Left e  -> print e >> fail "parse error"
        Right r -> return r
        












