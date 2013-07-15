/* BEGIN SPO CORE */
// Classes cannot have more than 4294967294 (Cell size - Meta slot - Sentinel slot) variables!
#define _SPO_Const_iNotRelated	0xffffffff
#define _SPO_Const_iTableSize	3

new _SPO_iTable[_SPO_Const_iTableSize][_SPO_Const_iTableSize] = {
	{0, _SPO_Const_iNotRelated, 0},
	{_SPO_Const_iNotRelated, 0, 1},
	{_SPO_Const_iNotRelated, _SPO_Const_iNotRelated, 0}
};

_SPO_iGet(from, this) {
	new offset = _SPO_iTable[from][this];
	assert offset >= _SPO_Const_iNotRelated;
	return offset;
}

_SPO_InitClass(this[], id) {
	this[0] = id;
}
/* END SPO CORE */

enum Class_A {
	_SPO_Meta = 0,
    a = 1,
};

Class_A_f(this[], x) {
    return this[Class_A:a + _SPO_iGet(Class_A:_SPO_Meta, this[0])] + x;
}

enum Class_B {
	_SPO_Meta = 1,
    b = 1,
};

Class_B_f(this[], x) {
    return this[Class_B:b + _SPO_iGet(Class_B:_SPO_Meta, this[0])] + x;
}

enum Class_AB {
	_SPO_Meta = 2,
	a = 1,
    b = 2,
	c = 3,
}

Class_AB_ctor(this[]) {
	this[Class_AB:c + _SPO_iGet(Class_AB:_SPO_Meta, this[0])] = 3;
}

Class_AB_dtor(this[]) {
	this[Class_AB:c + _SPO_iGet(Class_AB:_SPO_Meta, this[0])] = 0;
}

Class_AB_g(this[], x) {
    return this[Class_AB:c + _SPO_iGet(Class_AB:_SPO_Meta, this[0])] % (
    	Class_A_f(this, x) +
    	Class_B_f(this, x)
    );
}

public OnPluginStart() {
    new myA[Class_A];
    _SPO_InitClass(myA, Class_A:_SPO_Meta);
    myA[Class_A:a + _SPO_iGet(Class_A:_SPO_Meta, myA[0])] = 10;
    new Bool:shouldBe12 = Class_A_f(myA, 2) == 12;
    PrintToServer("myA.f(2) == 12 => %b", shouldBe12);
    
    new myB[Class_B];
    _SPO_InitClass(myB, Class_B:_SPO_Meta);
    myB[Class_B:b + _SPO_iGet(Class_B:_SPO_Meta, myB[0])] = 5;
    new Bool:shouldBe10 = Class_B_f(myB, 2) == 10;
    PrintToServer("myB.f(2) == 10 => %b", shouldBe10);
    
    new myAB[Class_AB];
    _SPO_InitClass(myAB, Class_AB:_SPO_Meta);
    Class_AB_ctor(myAB);
    new Bool:shouldBe8 = Class_AB_g(myAB, 2) == 8;
    PrintToServer("myAB.g(2) == 8 => %b", shouldBe8);
    Class_AB_dtor(myAB);
}