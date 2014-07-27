SourcePawn Object 
====

This is the current developpement branch.

Quick info
----------
The SPO language and its tools statically add object oriented features to the SourcePawn scripting language. 
It aims to be backward compatible with traditionnal SourcePawn scripts and does not rely on native calls. 
This means once compiled, an SPO script has very little overhead<sup>[[1]](#note1)</sup> and can be run with nothing more than a SourceMod installation. No plugins required.

From Object to Pawn
--------------
1. The [Parsec](http://legacy.cs.uu.nl/daan/parsec.html) based `PrimaryParser` generates a detailed tree of statements and expressions from an input program. This is the syntaxic analysis.

2. * This tree is then given to the compiler (Not implemented yet) which will explore and verify the integrity of the tree. For instance, conflicting types, undefined variables, etc. This is the first of two semantic analyses.
  * There might be an added optimizer at this stage but it will not be included in the first release. 

3. The final step, translation, will take the compiler or optimizer output tree and translate its nodes into human readable code. It will be possible to have multiple translators. The first to be implemented will be the one for SourcePawn 1.6 and ealier.

Interpreter
-----------
Using the parser and compiler as a base, a simple interpreter could be created. This would allow scripts to be tested without the burden of running them through a Source server. Calls to native functions would need to be ignored for simplicity's sake but, stubs could be written to show proper execution. 

Main Features (for now)
-----------------------
* Backwards compatible with SourcePawn 1.6 and earlier
* `Class`es & * `Interface`s
* Inheritance & Polyorphism

Notes
-----
1. <span name="note1"></span> SPO programs are bundled and compiled with their own [static memory manager](test/spo/core/memory.sp). This means that their coresponding SMX files will be sensibly larger than one would expect.

