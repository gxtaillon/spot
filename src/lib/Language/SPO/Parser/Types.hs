module Language.SPO.Parser.Types 
    ( 
    -- Expression
      ExprBoolean (..)
    , OpBinBoolean (..)
    , OpBinRelational (..)
    , ExprArithmetic (..)
    , OpBinArithmetic (..)
    , OpUnaArithmetic (..)
    , ExprAssignment (..)
    
    -- Type
    , VarType (..)
    , Type (..)
    , isFunc
    , isConstVar
    , isVariable
    
    -- Statement
    , VarModifier (..)
    , VarModifiers
    , FuncModifier (..)
    , FuncModifiers
    , FuncArgModifier (..)
    , FuncArgModifiers
    , FuncArg
    , FuncArgs
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
    | OpGE 
    | OpLT 
    | OpLE 
    | OpEq 
    | OpNE 
      deriving (Show)

data ExprArithmetic = 
      ExprVar Text
    | ExprInt Integer
    | ExprChar Char
    | ExprString Text
    | ExprIndex Text ExprArithmetic
    | ExprFuncCall Text [ExprArithmetic]
    | ExprUnaAr OpUnaArithmetic ExprArithmetic
    | ExprBinAr OpBinArithmetic ExprArithmetic ExprArithmetic
      deriving (Show)

data OpUnaArithmetic =
      OpNegate
    | OpPreInc
    | OpPostInc
    | OpPreDec
    | OpPostDec
    | OpBNot
      deriving (Show)

data OpBinArithmetic = 
      OpAdd 
    | OpSub 
    | OpMul 
    | OpDiv 
    | OpBAnd
    | OpBOr
    | OpBXor
    | OpBLShift
    | OpBRShift
      deriving (Show)

data ExprAssignment =
      ExprAssAr ExprArithmetic
    | ExprAssBool ExprBoolean
    | ExprAssArrayInit [ExprArithmetic]
      deriving (Show)

data VarModifier = 
      MVConst
    | MVStatic
      deriving (Show, Eq)

type VarModifiers = [VarModifier]

data FuncModifier =
      MFNative
    | MFPublic
    | MFNormal
    | MFStatic
    | MFStock
    | MFForward
      deriving (Show, Eq)
      
type FuncModifiers = [FuncModifier]

data FuncArgModifier = 
      MFAConst
--    | OpFAIn
--    | OpFAOut
      deriving (Show, Eq)

type FuncArgModifiers = [FuncArgModifier]

type FuncArg = (FuncArgModifiers, VarType,Text,Maybe ExprAssignment)
type FuncArgs = [FuncArg]

data VarType = 
      VT_
    | VTInt
    | VTFloat
    | VTBool
    | VTString
    | VTChar
    | VTArray VarType (Maybe Int)
    | VTUser Text
      deriving (Show)

data Type =
      TVar VarType VarModifiers
    | TFunc VarType FuncModifiers
    | TArg VarType FuncArgModifiers
      deriving (Show)

isFunc :: Type -> Bool
isFunc (TFunc _ _) = True
isFunc _ = False

isConstVar :: Type -> Bool
isConstVar (TVar _ ms) = elem MVConst ms
isConstVar _ = False

isVariable :: Type -> Bool
isVariable (TVar _ _) = True
isVariable (TArg _ _) = True
isVariable _ = False

data Statement = 
      StmtSeq [Statement]
    | StmtNew VarModifiers VarType Text (Maybe ExprAssignment)
    | StmtDecl VarModifiers VarType Text
    | StmtAss Text ExprAssignment
    | StmtIndex Text ExprArithmetic ExprAssignment
    | StmtIf ExprBoolean Statement
    | StmtIfElse ExprBoolean Statement Statement
    | StmtWhile ExprBoolean Statement
    | StmtDoWhile ExprBoolean Statement
    | StmtFor Statement ExprBoolean ExprArithmetic Statement
    | StmtReturn ExprAssignment
    | StmtFunc FuncModifiers VarType Text FuncArgs Statement
    | StmtFuncCall Text [ExprArithmetic]
      deriving (Show)
