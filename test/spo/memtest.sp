#include "../core/memory.sp"
#include "../core/tests.utils.sp"

public OnPluginStart() {
    _SPO_Decl(p0,50);
    _SPO_Alloc(p0);
    for (new i = 0; i != 50; ++i) {
        _SPO_Deref(p0, i) = i;
    }
    for (new j = 0; j != 50; ++j) {
        PrintToServer("%d", _SPO_Deref(p0, j));
    }
    _SPO_Free(p0);    
    
    _SPO_New(p1, 1);
    _SPO_Deref(p1, 0) = 3;
    _SPO_Free(p1);
    
    new String:s2[] = "My memory manager works";
    _SPO_New(p2, sizeof s2);
    _SPO_CopyTo(s2, p2);
    decl String:s2b[sizeof s2];
    _SPO_CopyFrom(p2, s2b);
    PrintToServer("%s", s2);
    PrintToServer("%s", s2b);
    _SPO_Free(p2);
    
    _SPO_NewC(p3, 17);
    _SPO_DerefC(p3 + 09) = 1234;
    _SPO_DerefC(p3 + 17) = 4321;
    printArray(p3_ptr);
    PrintToServer("%d", _SPO_DerefC(p3 + 09));
    PrintToServer("%d", _SPO_DerefC(p3 + 17));
    _SPO_FreeC(p3, 17);
}