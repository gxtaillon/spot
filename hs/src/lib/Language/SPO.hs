module Language.SPO 
    ( parseString
    , parseFile
    ) where

import qualified Data.Text as T
import Text.Parsec

import Language.SPO.Parser
import Language.SPO.Types

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
        

