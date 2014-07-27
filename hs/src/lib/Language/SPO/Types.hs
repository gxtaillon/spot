module Language.SPO.Types 
    ( ExprBoolean (..)
    , OpBinBoolean (..)
    , OpBinRelational (..)
    , ExprArithmetic (..)
    , OpBinArithemic (..)
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

data Statement = 
      StmtSeq [Statement]
    | StmtAss Text ExprArithmetic
    | StmtIf ExprBoolean Statement
    | StmtIfElse ExprBoolean Statement Statement
    | StmtWhile ExprBoolean Statement
      deriving (Show)
