enum SPClass_Demo {
    myValue,
};

public SPClass_Demo_getMyValue(this[SPClass_Demo]) {
    return this[SPClass_Demo:myValue];
}

Bool:testObject() {
    new myDemo[SPClass_Demo];
    myDemo[SPClass_Demo:myValue] = 123;
    new aValue = myDemo[SPClass_Demo:myValue];
    return aValue == SPClass_Demo_getMyValue(myDemo);
}
