module Language.SPO.Parser.Types 
    ( ExprBoolean (..)
    , OpBinBoolean (..)
    , OpBinRelational (..)
    , ExprArithmetic (..)
    , OpBinArithemic (..)
    , ExprAssignment (..)
    , TagDeclaration
    , ArrayDeclaration
    , VariableModifiers
    , OpModifier (..)
    , OpFuncModifier (..)
    , FuncModifier
    , OpFuncArgModifier (..)
    , FuncArgModifiers
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
    | ExprIndex ExprArithmetic ExprArithmetic
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
    | ExprAssArrayInit [ExprArithmetic]
      deriving (Show)

type TagDeclaration = Maybe Text
type ArrayDeclaration = Maybe (Maybe ExprArithmetic) -- Not an array, [], [expr]

data OpModifier = 
      OpConst
    | OpStatic
      deriving (Show)

type VariableModifiers = [OpModifier]

data OpFuncModifier =
      OpFNative
    | OpFPublic
    | OpFNormal
    | OpFStatic
    | OpFStock
    | OpFForward
      deriving (Show)

type FuncModifier = Maybe OpFuncModifier

data OpFuncArgModifier = 
      OpFAConst
--    | OpFAIn
--    | OpFAOut
      deriving (Show)

type FuncArgModifiers = [OpFuncArgModifier]

data Statement = 
      StmtSeq [Statement]
    | StmtNew VariableModifiers TagDeclaration Text ArrayDeclaration (Maybe ExprAssignment)
    | StmtDecl VariableModifiers TagDeclaration Text ArrayDeclaration
    | StmtAss Text ArrayDeclaration ExprAssignment
    | StmtIf ExprBoolean Statement
    | StmtIfElse ExprBoolean Statement Statement
    | StmtWhile ExprBoolean Statement
    | StmtDoWhile ExprBoolean Statement
    | StmtFunc FuncModifier TagDeclaration Text [(FuncArgModifiers,TagDeclaration,Text,Bool)] Statement
      deriving (Show)
