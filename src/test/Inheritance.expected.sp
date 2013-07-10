enum Class_A {
    a,
};

Class_A_f(this[Class_A], x) {
    return this[Class_A:a] + x;
}

enum Class_B {
    a,
    b,
};

// Not too much of an overhead. Will be fixed with polymorphism.
Class_B_f(this[Class_B], x) {
    return this[Class_B:a] + x;
}

Class_B_g(this[Class_B], x) {
    return this[Class_B:b] + Class_B_f(this, x);
}

public OnPluginStart() {
    new myA[Class_A];
    myA[Class_A:a] = 10;
    new Bool:shouldBe13 = Class_A_f(myA, 3) == 13;
    PrintToServer("myA.f(3) == 13 => %b", shouldBe13);
    
    new myB[Class_B];
    myB[Class_B:a] = 20;
    myB[Class_B:b] = 5;
    new Bool:shouldBe110 = Class_B_g(myB, 2) == 110;
    PrintToServer("myB.g(2) == 110 => %b", shouldBe110);
}