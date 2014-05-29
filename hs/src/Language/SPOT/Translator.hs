{-# LANGUAGE OverloadedStrings #-}
{-|
Module      : Language.SPOT.Translator
Description : 
Copyright   : (c) Momemtum Mori, 2014
License     : GPL-3
Maintainer  : admin@momemtummori.info
Stability   : experiemental
Portability : ghc

0 > 1
-}

module Language.SPOT.Translator
    ( fromFile
    , mainTranslator
    ) where
    
import Control.Monad
import Data.Maybe
import Data.Version (showVersion)
import Language.SPOT
import Paths_language_spot (version)
import System.Console.GetOpt
import System.Environment
import System.Exit

data TranslatorOptions = TranslatorOptions
    { optFileIn         :: Maybe FilePath
    , optFileOut        :: Maybe FilePath
    , optLibPaths       :: [FilePath]
    , optShowVersion    :: Bool
    } deriving (Show)
    
defaultTranslatorOptions :: TranslatorOptions
defaultTranslatorOptions = TranslatorOptions
    { optFileIn         = Nothing
    , optFileOut        = Nothing
    , optLibPaths       = []
    , optShowVersion    = False
    }

translatorOptions :: [OptDescr (TranslatorOptions -> TranslatorOptions)]
translatorOptions =
    [ Option ['V','?'] ["version"]
        (NoArg (\opts -> opts { optShowVersion = True }))
        "show version number"
    , Option ['o']     ["output"]
        (ReqArg (\ f opts -> opts { optFileOut = Just f }) "FILE")
        "output FILE"
    , Option ['i']     []
        (ReqArg (\ f opts -> opts { optFileIn = Just f }) "FILE")
        "input FILE"
    , Option ['L']     ["libdir"]
        (ReqArg (\ d opts -> opts { optLibPaths = optLibPaths opts ++ [d] }) "DIR")
        "library directories"
    ]

translatorOpts :: [String] -> IO (TranslatorOptions, [String])
translatorOpts argv =
    case getOpt Permute translatorOptions argv of
        (o,n,[]  ) -> return (foldl (flip id) defaultTranslatorOptions o, n)
        (_,_,errs) -> ioError (userError error)
            where error = concat errs ++ usageInfo header translatorOptions
  where header = "Usage: [OPTION...] file"
     
mainTranslator = do
    args <- getArgs
    (opts, _) <- translatorOpts args
    putStrLn $ show opts
    when (optShowVersion opts) $ do
        putStrLn $ showVersion version
        exitWith ExitSuccess
    when (optFileIn opts == Nothing) $ do
        putStrLn "Input is missing"
        exitWith ExitSuccess
    when (optFileOut opts == Nothing) $ do
        putStrLn "Output is missing"
        exitWith ExitSuccess
    fromFile (fromJust $ optFileIn opts) (fromJust $ optFileOut opts)

fromFile :: FilePath -> FilePath -> IO ()
fromFile fIn fOut = readFile fIn >>= writeFile fOut
