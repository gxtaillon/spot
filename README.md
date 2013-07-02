SourcePawn Object Translator
====

Quick info:
SPOT will take a script looking like this and will translate it into a traditionnal SP script.
```
class Demo {
    myValue;
    Bool:truth1, truth2;
    Demo:test;

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
