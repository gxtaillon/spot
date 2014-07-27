module Language.SPO.Parser 
    ( whileParser
    , module Language.SPO.Parser.Types
    , parseString
    , parseFile
    ) where

import qualified Data.Text as T
import Text.Parsec

import Language.SPO.Parser.PrimaryParser
import Language.SPO.Parser.Types

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
        

