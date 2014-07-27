module Language.SPO.Translators.SourcePawn 
    ( Translator (..)
    ) where

import Prelude hiding ((++))
import qualified Data.Text as T

import Language.SPO.Translators.Translator
import Language.SPO.Types

data SourcePawnProgram = SPP { program :: T.Text }

instance Translator SourcePawnProgram where
    translate s = SPP 
        { program = stmt s
        }

(++) :: T.Text -> T.Text -> T.Text
(++) t1 t2 = T.concat [t1, t2]

--tabs :: Int -> T.Text
--tabs n = T.concat $ take n $ repeat tab

{-blank, tab, -} 
space, line, semicolon, endAssignment :: T.Text 
--blank           = ""
--tab             = "  "
space           = " "
line            = "\n"
semicolon       = ";"
endAssignment   = space ++ line ++ semicolon

braceOpen, braceClose, parenOpen, parenClose :: T.Text
braceOpen       = "{"
braceClose      = "}"
parenOpen       = "("
parenClose      = ")"

braces, parens :: T.Text -> T.Text
braces s        = braceOpen ++ s ++ braceClose
parens s        = parenOpen ++ s ++ parenClose

_if, _while :: T.Text
_if = "if"
_while = "while"

stmt :: Statement -> T.Text
stmt (StmtSeq [])  = endAssignment
stmt (StmtSeq ss)  = T.concat $ map stmt ss
stmt (StmtAss n e) = n ++ space ++ exprArithmetic e ++ endAssignment
stmt (StmtIfElse c s1 s2) = _if ++ space ++ parens (exprBoolean c) 
                                ++ space ++ braces (line ++ stmt s1)
                                ++ space ++ braces (line ++ stmt s2)
                                ++ line
stmt (StmtWhile c s)  = _while ++ space ++ parens (exprBoolean c) ++ space
                               ++ braces (line ++ stmt s)
                               ++ line

exprArithmetic :: ExprArithmetic -> T.Text
exprArithmetic _ = ""

exprBoolean :: ExprBoolean -> T.Text
exprBoolean _ = ""






































