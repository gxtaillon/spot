SourcePawn Object 
====

This is the e current developpement branch.

Quick info
----------
SPOT statically adds object oriented features to the SourcePawn scripting language. 
It aims to be backward compatible with traditionnal SourcePawn scripts and does not rely on native calls. 
This means once compiled, an SPO (SourcePawn Object) script has very little overhead and can be run with nothing more than a SourceMod installation. No plugins required<sup>[[1]](#note1)</sup>.

Implementation (3'ish steps compiler)
--------------
The Parsec based `PrimaryParser` generates a detailed tree of statements and expressions from an input program. This is the syntaxic analysis.
This tree is then given to the compiler (Not implemented yet) which will explore and verify the integrity of the tree. For instance, conflict types, undefined variables, etc. This is the first semantic analysis.
There could be an added optimizer at this stage but it will not be included in the first release.
The final step, translation, will take the compiler or optimizer output tree and translate its nodes into human readable code. It will be possible to have multiple translators. The most important one here will be the one for Source*Pawn* 1.6 and ealier.

Notes
-----
<span name="note1">1.</span> Although SPO programs will be able to be compiled with the provided memory manager, it will be possible to tweak it or implement your own altogether!
