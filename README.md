[DEV BRANCH:states] SourcePawn Object Translator 
====

Quick info
----------
SPOT statically adds object oriented features to the SourcePawn scripting language. 
It aims to be backward compatible with traditionnal SourcePawn scripts and does not rely on native calls. 
This means once compiled, an SPO (SourcePawn Object) script has very little overhead and can be run with nothing more than a SourceMod installation. No additionnal plugins required.

It is in a very early state. Expect some bugs.

Here is an exemple of the new syntax:
<table>
<tr>
<th>SourcePawn Object</th>
</tr>
<tr>
<td>
<pre>
class Demo {
    __public myValue;
    __public Bool:truth1, truth2;

    __public public getMyValue(Demo:this) { 
        return this.myValue; 
    }
    
    // Since public is already used by pawn, __public, __private and __protected 
    //  are used to indicated the members visibility
    // The following function will then be a public member and public function 
    //  of the script. It could also be __public stock, __protected native, etc.
    __public public setTruth1(Demo:this, _truth1) { 
        return this.truth1 = _truth1; 
    }
};

testObject() {
    // Instanciation of class Demo
    new Demo:myDemo = Demo();
    
    // Writing to a member
    myDemo.myValue = 123;
    
    // Reading from a member 
    new aValue = myDemo.myValue;
    
    // Calling a member and retrieving its return value
    new shouldBeTrue = aValue == myDemo.getMyValue();
    
    // Calling with parameters
    myDemo.setTruth1(shouldBeTrue);
    
    // Releasing the instance's resources (very important!)
    myDemo.dtor();
    // When instanciating a class, a block of memory is allocated to 
    //  hold its data and a "pointer" is returned to indicate where to find it.
    //  The pointer's data has to be freed.
}
</pre>
</td>
</tr>
</table>

More info
---------
In its current state, SPOT is a parser/translator, has no concept of closure or scope and will only read an input an modify it on the fly to what it thinks should be the output. 

It is possible that some characters ( ``` ,;:.()[]{} ``` etc. ), or entire expressions, will disappear during the translation. If this happens to you or if you find any other bug please file an issue.

It relies heavily on the ANTLR4 parser generator and on a modified version of the C.g4 grammar from Sam Harwell. The orginal version can be found at https://github.com/antlr/grammars-v4/blob/master/c/C.g4

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
* Classes as class variables ** ***

Other features which could be fun to implement
----------------------------------------------
* Templates
* Lambdas

Notes
-----
** There is a working prototype written in pawn for this feature, but it must be added to the translator.

*** With the new memory allocation manager this feature is now implicit since a pointer takes a single cell.
