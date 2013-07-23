#include "../core/memory.sp"
#include "../core/tests.utils.sp"

public OnPluginStart() {
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
}