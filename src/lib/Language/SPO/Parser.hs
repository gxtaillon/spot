module Language.SPO.Parser 
    ( runPrimaryParser
    , module Language.SPO.Parser.Types
    , parseString
    , parseFile
    ) where

import qualified Data.Text as T

import Language.SPO.Parser.PrimaryParser
import Language.SPO.Parser.Types

parseString :: String -> Statement
parseString str = case runPrimaryParser "" $ T.pack str of
    Left e  -> error $ show e
    Right r -> r

parseFile :: String -> IO Statement
parseFile file = do
    program <- readFile file
    case runPrimaryParser file $ T.pack program of
        Left e  -> print e >> fail "parse error"
        Right r -> return r
        

