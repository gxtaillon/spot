module Language.SPO.Cmd.Main where

import Control.Monad
import System.Environment

import Language.SPO (parseFile)

main :: IO ()
main = do
    args <- getArgs
    when (length args /= 2) $ do
        error "filename outputformat"
    let file = args !! 0
    stmt <- parseFile file
    case args !! 1 of
        "Show" -> putStrLn $ show stmt
        _ -> putStrLn "Wrong format"
