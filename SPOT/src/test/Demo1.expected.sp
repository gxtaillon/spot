enum SPClass_Demo {
    myValue,
    Bool:truth2,Bool:truth1,
};

public SPClass_Demo_getMyValue(this[SPClass_Demo]) {
    return this [SPClass_Demo:myValue];
}

public SPClass_Demo_setTruth1(this[SPClass_Demo], _truth1) {
    return this [SPClass_Demo:truth1] = _truth1;
}

testObject() {
    new myDemo[SPClass_Demo];
    myDemo [SPClass_Demo:myValue] = 123;
    new aValue = myDemo [SPClass_Demo:myValue];
    new shouldBeTrue = aValue == SPClass_Demo_getMyValue(myDemo);
    SPClass_Demo_setTruth1(myDemo, shouldBeTrue);
}

