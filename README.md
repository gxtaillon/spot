[DEV BRANCH:states] SourcePawn Object Translator 
====

Quick info
----------
SPOT statically adds object oriented features to the SourcePawn scripting language. 
It aims to be backward compatible with traditionnal SourcePawn scripts and does not rely on native calls. 
This means once compiled, an SPO (SourcePawn Object) script has very little overhead and can be run with nothing more than a SourceMod installation. No additionnal plugins required.

It is in a very early state. Expect some bugs.

Here is an exemple of a translation:
<table>
<tr>
<th>SourcePawn Object</th>
<th>SourcePawn</th>
</tr>
<tr>
<td>
<pre>
class Demo {
    myValue;
    Bool:truth1, truth2;

    public getMyValue(Demo:this) { 
        return this.myValue; 
    }
    public setTruth1(Demo:this, _truth1) { 
        return this.truth1 = _truth1; 
    }
};

testObject() {
    new Demo:myDemo = Demo();
    myDemo.myValue = 123;
    new aValue = myDemo.myValue;
    new shouldBeTrue = aValue == myDemo.getMyValue();
    myDemo.setTruth1(shouldBeTrue);
    myDemo.dtor();
}
</pre>
</td><td>
<pre>
...

#define _SPO_Class_Demo__SPO_Id 0
#define _SPO_Class_Demo__SPO_Size 4
#define _SPO_Class_Demo_myValue 1
#define _SPO_Class_Demo_truth1 2
#define _SPO_Class_Demo_truth2 3

Class_Demo_ctor() {
    _SPO_NewC(this, _SPO_Class_Demo__SPO_Size);
    _SPO_DerefC(this) = _SPO_Class_Demo__SPO_Id;
    // BEGIN USER
    // END USER
    return this;
}

Class_Demo_dtor(this) {
    // BEGIN USER
    // END USER
    _SPO_FreeC(this, _SPO_Class_Demo__SPO_Size);
}

public Class_Demo_getMyValue(this) { 
    return _SPO_DerefC(this + _SPO_Class_Demo_myValue + _SPO_iGet(_SPO_Class_Demo__SPO_Id, _SPO_DerefC(this)))
}
public Class_Demo_setTruth1(this, _truth1) { 
    return _SPO_DerefC(this + _SPO_Class_Demo_truth1+ _SPO_iGet(_SPO_Class_Demo__SPO_Id, _SPO_DerefC(this))) = _truth1;
}
    
testObject() {
    new myDemo = Class_Demo_ctor();
    _SPO_DerefC(myDemo + _SPO_Class_Demo_myValue + _SPO_iGet(_SPO_Class_Demo__SPO_Id, _SPO_DerefC(this))) = 123;
    new aValue = _SPO_DerefC(myDemo + _SPO_Class_Demo_myValue + _SPO_iGet(_SPO_Class_Demo__SPO_Id, _SPO_DerefC(this)));
    new shouldBeTrue = aValue == Class_Demo_getMyValue(myDemo);
    Class_Demo_setTruth1(myDemo, shouldBeTrue);
}
</pre>
</td>
</tr>
</table>

More info
---------
In its current state, SPOT is a parser/translator, has no concept of closure or scope and will only read an input an modify it on the fly to what it thinks should be the output. 

It relies heavily on the ANTLR4 parser generator and on a modified version of the C.g4 grammar from Sam Harwell. The orginal version can be found at https://github.com/antlr/grammars-v4/blob/master/c/C.g4
It is possible that some characters ( ``` ,;:.()[]{} ``` etc. ), or entire expressions, will disappear during the translation. If this happens to you or if you find any other bug please file an issue.

Usage
-----
Start a java instance using the ExtractPawnTool class and give it the path of the source script as first parameter. The translation will be printed to the standard output.

Implemented features
--------------------
* Class definition syntax :: class < ID > { < VAR | FUNC >* };
* Class declaration syntax :: < new | decl > < CLASSID >:< ID >;
* Class variable call syntax :: < ID >.< CLASSMEMBERID >
* Class function call syntax :: < ID >.< CLASSMEMBERID >(< PARAM >*)
* Non-native dependant dynamic memory allocation (Pointer-like features within the script)

Planned features
----------------
* Class inheritance, multiple **
* Class up/downcasting
* Class polymorphism **
* Interfaces
* Interpretation of scopes
* Classes as class variables ***

Other features which could be fun to implement
----------------------------------------------
* Templates
* Lambdas

Notes
-----
** There is a working prototype written in pawn for this feature, but it must be added to the translator.
*** With the new memory allocation manager this feature is now implicit since a class reference takes a single cell.
