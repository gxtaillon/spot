module Language.SPO.Parser.Types 
    ( ExprBoolean (..)
    , OpBinBoolean (..)
    , OpBinRelational (..)
    , ExprArithmetic (..)
    , OpBinArithemic (..)
    , ExprAssignment (..)
    , Statement (..)
    ) where

import Data.Text

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
      ExprVar Text
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

data ExprAssignment =
      ExprAssAr ExprArithmetic
    | ExprAssBool ExprBoolean
      deriving (Show)

data Statement = 
      StmtSeq [Statement]
    | StmtAss Text ExprAssignment
    | StmtIf ExprBoolean Statement
    | StmtIfElse ExprBoolean Statement Statement
    | StmtWhile ExprBoolean Statement
    | StmtDoWhile ExprBoolean Statement
      deriving (Show)
