SourcePawn Object 
====

<a href="https://hackage.haskell.org/package/parsec">
 <img src="http://www.cs.uu.nl/~daan/images/parsec.gif"
      alt="Parsec logo" hspace=20 border=0
      style="float: right; border: none; padding-left: 4pt">
</a>

Quick info
----------
The SPO language and its tools statically add object oriented features to the SourcePawn scripting language. 
It aims to be backward compatible with traditionnal SourcePawn scripts and does not rely on native calls. 
This means once compiled, an SPO script has very little overhead<sup>[[1]](#note1)</sup> and can be run with nothing more than a SourceMod installation. No plugins required.

From Object to Pawn
--------------
1. The [Parsec](http://legacy.cs.uu.nl/daan/parsec.html) based `PrimaryParser` generates a detailed tree of statements and expressions from an input program. This is the syntaxic analysis.

2. * This tree is then given to the compiler which will explore and verify the integrity of the tree. For instance, conflicting types, undefined variables, etc. This is the first of two semantic analyses.
  * There might be an added optimizer at this stage but it will not be included in the first release. 

3. The final step, translation, will take the compiler or optimizer output tree and translate its nodes into human readable code. It will be possible to have multiple translators. The first to be implemented will produce SourcePawn 1.6 compatible code. Other translators could be used to create profilable plugins or even standalone programs.

Interpreter
-----------
Using the parser and compiler as a base, a simple interpreter could be created. This would allow scripts to be tested without the burden of running them through a Source server. Calls to native functions would need to be ignored for simplicity's sake but, stubs could be written to allow proper execution and show how they were called. 

Main Features (planned)
-----------------------
* Backward compatibility with SourcePawn 1.6 and earlier
* Advanced error and warning messages.
* Pointers
* True `struct`ures
* Syntaxic sugar
* Polymorphism

Development
-----
* *It is required to have the `haskell-platform` or equivalent packages installed.*
* Clone the repository on your computer
* Everything is packaged with cabal, use your everyday `cabal`esque commands :
```
cabal update
cabal configure
cabal install --only-dependencies
cabal build
cabal run spot -- path/to/file command
```
   The only available command as of `v0.0` is `Show` which runs the parser on the given file and then either displays the `Statement` tree or an error message. For instance, using the input :
```SourcePawn
public OnPluginStart() { new String:myVar[] = "Hello World!"; }
```
we get :
```Haskell
StmtFunc OpFPublic Nothing "OnPluginStart" [] (StmtNew [] (VTArray VTString (Just 12)) (Just (ExprString "Hello World!")))
```


Notes
-----
1. <a name="note1"></a>SPO programs are bundled and compiled with their own [static memory manager](test/spo/core/memory.sp). This means that their coresponding SMX files will be sensibly larger than one would expect.

