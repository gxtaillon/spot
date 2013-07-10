SourcePawn Object Translator
====

Quick info
----------
SPOT will take a script looking like this and will translate it into a traditionnal SP script.

It is in a very early state. Expect some bugs.

```
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
    new Demo:myDemo;
    myDemo.myValue = 123;
    new aValue = myDemo.myValue;
    new shouldBeTrue = aValue == myDemo.getMyValue();
    myDemo.setTruth1(shouldBeTrue);
}
```

More info
---------
In its current state SPOT is only a dumb parser/translator, has no concept of closure or scope and will only read an input an modify it on the fly to what it thinks should be the output. 
It relies heavily on the ANTLR4 parser generator and on a modified version of the C.g4 grammar from Sam Harwell. The orginal version can be found at https://github.com/antlr/grammars-v4/blob/master/c/C.g4
It is possible that some characters ( ``` ,;:.()[]{} ``` etc. ), or entire expression, will disappear during the translation (because the grammar hasn't been modified for it). If this happens to you or if you find any other bug please file an issue.

Usage
-----
Start a java instance using the ExtractPawnTool class and give it the path of the source script as first parameter. The translation will be printed to the standard output.

Implemented features
--------------------
* Class definition syntax :: class < ID > { < VAR | FUNC >* };
* Class declaration syntax :: < new | decl > < CLASSID >:< ID >;
* Class variable call syntax :: < ID >.< CLASSMEMBERID >
* Class function call syntax :: < ID >.< CLASSMEMBERID >(< PARAM >*)

Planned features
----------------
* Class inheritance, multiple
* Class up/downcasting
* Class polymorphism
* Interfaces
* Interpretation of scopes
* Classes as class variables

Other features which could be fun to implement
----------------------------------------------
* Templates
* Lambdas


