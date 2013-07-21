#include "../core/memory.sp"
#include "../core/tests.utils.sp"

public OnPluginStart() {
    new p1 = _SPO_Alloc(1);
    _SPO_Heap[p1] = 3;
    new p2 = _SPO_Alloc(15);
    new String:s2[] = "My memory manager works";
    _SPO_CopyTo(s2, _SPO_Heap, p2);
    printArray(_SPO_Heap); // Output is gibberish because it's a packed string
}