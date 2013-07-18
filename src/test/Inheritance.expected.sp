/* BEGIN SPO CORE */
// Classes cannot have more than 4294967295 (2^32 - 1, (max value) - (size of meta slot)) variables!
#define _SPO_Const_Meta         0
#define _SPO_Const_iNotRelated	0xffffffff

#define _SPO_iGet_Base(%0,%1,%2)      (%0)[(%1)][(%2)]

_SPO_iGet_Safe(from, this, iTable[][]) {
	new offset = _SPO_iGet_Base(iTable, from, this);
	assert offset >= _SPO_Const_iNotRelated;
	return offset;
}

_SPO_InitClass(this[], id) {
	this[_SPO_Const_Meta] = id;
}
/* END SPO CORE */

#define _SPO_Conf_Safe              // May or may not be defined
#define _SPO_Data_iTableSize	    3

// This grows at n^2 rate. Where n is the # of classes
static _SPO_iTable[_SPO_Data_iTableSize][_SPO_Data_iTableSize] = { // const too?
	{0, _SPO_Const_iNotRelated, 0},
	{_SPO_Const_iNotRelated, 0, 1},
	{_SPO_Const_iNotRelated, _SPO_Const_iNotRelated, 0}
};

// Should theoraticaly be part of SPO Core but practicaly cannot since it would use an undefined symbol. Same goes for iTable if it were before the core.
#if defined _SPO_Conf_Safe
#define _SPO_iGet(%0,%1)   _SPO_iGet_Safe((%0), (%1), _SPO_iTable)
#else   // _SPO_Conf_Safe
#define _SPO_iGet(%0,%1)   _SPO_iGet_Base((%0), (%1), _SPO_iTable)
#endif  // _SPO_Conf_Safe

// Scrapping the enums for the new version since they cause way, way too many tag mismatches...
#define Class_A__SPO_Id     0       // Id of the class
#define Class_A__SPO_Size   2       // Size of the class
#define Class_A_a           1       // Position of this member in the class, NB index 0 is always occupied by the meta field.

Class_A_f(this[], x) {
    return this[Class_A_a + _SPO_iGet(Class_A__SPO_Id, this[_SPO_Const_Meta])] + x;
}

#define Class_B__SPO_Id     1
#define Class_B__SPO_Size   2
#define Class_B_b           1

Class_B_f(this[], x) {
    return this[Class_B_b + _SPO_iGet(Class_B__SPO_Id, this[_SPO_Const_Meta])] * x;
}

#define Class_AB__SPO_Id    2
#define Class_AB__SPO_Size  4
#define Class_AB_a          1
#define Class_AB_b          2
#define Class_AB_c          3

Class_AB_ctor(this[]) {
	this[Class_AB_c + _SPO_iGet(Class_AB__SPO_Id, this[_SPO_Const_Meta])] = 3;
}

Class_AB_dtor(this[]) {
	this[Class_AB_c + _SPO_iGet(Class_AB__SPO_Id, this[_SPO_Const_Meta])] = 0;
}

Class_AB_g(this[], x) {
    return this[Class_AB_c + _SPO_iGet(Class_AB__SPO_Id, this[_SPO_Const_Meta])] % (
    	Class_A_f(this, x) +
    	Class_B_f(this, x)
    );
}

public OnPluginStart() {
    new myA[Class_A__SPO_Size];
    _SPO_InitClass(myA, Class_A__SPO_Id);
    myA[Class_A_a + _SPO_iGet(Class_A__SPO_Id, myA[_SPO_Const_Meta])] = 10;
    new Bool:shouldBe12 = Class_A_f(myA, 2) == 12;
    PrintToServer("myA.f(2) == 12 => %b", shouldBe12);
    
    new myB[Class_B__SPO_Size];
    _SPO_InitClass(myB, Class_B__SPO_Id);
    myB[Class_B_b + _SPO_iGet(Class_B__SPO_Id, myB[_SPO_Const_Meta])] = 5;
    new Bool:shouldBe10 = Class_B_f(myB, 2) == 10;
    PrintToServer("myB.f(2) == 10 => %b", shouldBe10);
    
    new myAB[Class_AB__SPO_Size];
    _SPO_InitClass(myAB, Class_AB__SPO_Id);
    Class_AB_ctor(myAB);
    new Bool:shouldBe1 = Class_AB_g(myAB, 2) == 1;
    PrintToServer("myAB.g(2) == 1 => %b", shouldBe1);
    Class_AB_dtor(myAB);
}