{-# LANGUAGE OverloadedStrings #-}
{-|
Module      : Language.SPOT.Data.Ident
Description : 
Copyright   : (c) Momemtum Mori, 2014
License     : GPL-3
Maintainer  : admin@momemtummori.info
Stability   : experiemental
Portability : ghc

0 > 1
-}
module Language.SPOT.Data.Ident
    ( Ident (..)
    , ident
    ) where
    
import Data.Text
import Text.Parsec
import Text.Parsec.Text
    
data Ident = Ident Text
    deriving (Show, Read, Eq, Ord)

ident :: Parser Ident
ident = do
    c1 <- many (char '_')
    c2 <- letter
    c3 <- many (alphaNum <|> char '_')
    return $ Ident $ pack c3
    
