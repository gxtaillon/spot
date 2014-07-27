module Language.SPO.Translators.Translator 
    ( Translator (..)
    ) where

import Language.SPO.Types

class Translator t where
    translate :: Statement -> t
