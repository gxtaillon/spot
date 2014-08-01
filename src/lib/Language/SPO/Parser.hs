module Language.SPO.Parser 
    ( runPrimaryParser
    , module Language.SPO.Parser.Types
    , parseString
    , parseFile
    ) where

import qualified Data.Text as T

import Language.SPO.Parser.PrimaryParser
import Language.SPO.Parser.Types

parseString :: String -> IO Statement
parseString str = do
    result <- runPrimaryParser "" $ T.pack str
    case result of
        Left e  -> error $ show e
        Right r -> return r

parseFile :: String -> IO Statement
parseFile file = do
    program <- readFile file
    result <- runPrimaryParser file $ T.pack program
    case result of
        Left e  -> print e >> fail "parse error"
        Right r -> return r
        

