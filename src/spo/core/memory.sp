/* 
    memory.sp
    Implements a memory manager which adds pointer like features to SourcePawn.
    
    Functions (Macros):     Big O       Big Omega       
      M _SPO_AllocationSize O(1)        O(1)        Calculates the required pointer size for a given number of cells
      M _SPO_Decl           -           -           Declares a pointer
        _SPO_Alloc          O(p*h/f)    O(p)        Allocates memory to a pointer
      M _SPO_New            -           -           Decl and Alloc
      M _SPO_Deref          O(1)        O(1)        Access a cell in memory
        _SPO_CopyTo         O(min{d,a}) O(min{d,a}) Copies an array in memory
        _SPO_CopyFrom       O(min{d,a}) O(min{d,a}) Copies an array from memory
        _SPO_Free           O(p)        O(p)        Frees the memory allocated to a pointer
      where:
        h                   Heap size
        f                   Frame size
        p                   Pointer size
        d                   Pointer's data size
        a                   Array size
    Structures:
        Pointer             A pointer is an array containing the translation table (page table) to reach the corresponding frames in the heap.
    
    Usage:
        To declare and allocate a chunk of memory
*/
#if defined _SPO_Inc_Memory
    #endinput
#endif
#define _SPO_Inc_Memory

#pragma semicolon 1

#define _SPO_Conf_Heap_Size         8192        // 2^13 cells
#define _SPO_Conf_Heap_Page_Size    4           // 2^2 cells

#assert _SPO_Conf_Heap_Page_Size <= _SPO_Conf_Heap_Size         // This is a bare minimum.
#assert (_SPO_Conf_Heap_Size % _SPO_Conf_Heap_Page_Size) == 0   // _SPO_Conf_Heap_Size must be a divisor of _SPO_Const_Heap_Size

#define _SPO_Const_Heap_Allocations_Size _SPO_Conf_Heap_Size / _SPO_Conf_Heap_Page_Size / cellbits
#assert _SPO_Const_Heap_Allocations_Size > 0    // If the allocation table is at least of size 1, it greatly simplifies calculations    

new _SPO_Heap[_SPO_Conf_Heap_Size];             // The heap is init'd with a bunch of zeros
static _SPO_Heap_Allocations[_SPO_Const_Heap_Allocations_Size];
static _SPO_Heap_Last_Allocated_Frame = 1;    

// http://stackoverflow.com/a/8920855
// Lookup tables are awsome.
// TODO: Put these in their own file
new const _SPO_Const_Bit_MaskLookup[] = { 1 << 0, 1 << 1, 1 << 2, 1 << 3, 1 << 4, 1 << 5, 1 << 6, 1 << 7, 1 << 8, 1 << 9, 1 << 10, 1 << 11, 1 << 12, 1 << 13, 1 << 14, 1 << 15, 1 << 16, 1 << 17, 1 << 18, 1 << 19, 1 << 20, 1 << 21, 1 << 22, 1 << 23, 1 << 24, 1 << 25, 1 << 26, 1 << 27, 1 << 28, 1 << 29, 1 << 30, 1 << 31, 1 << 32, 1 << 33, 1 << 34, 1 << 35, 1 << 36, 1 << 37, 1 << 38, 1 << 39, 1 << 40, 1 << 41, 1 << 42, 1 << 43, 1 << 44, 1 << 45, 1 << 46, 1 << 47, 1 << 48, 1 << 49, 1 << 50, 1 << 51, 1 << 52, 1 << 53, 1 << 54, 1 << 55, 1 << 56, 1 << 57, 1 << 58, 1 << 59, 1 << 60, 1 << 61, 1 << 62, 1 << 63 };
#define _SPO_BitCheck(%0,%1)        ((%0) & _SPO_Const_Bit_MaskLookup[(%1)])
#define _SPO_BitIsSet(%0,%1)        _SPO_BitCheck(%0, %1) != 0  // Checks if the (%1)th bit is set
#define _SPO_BitIsNotSet(%0,%1)     _SPO_BitCheck(%0, %1) == 0
#define _SPO_BitSet(%0,%1)          (%0) |= _SPO_Const_Bit_MaskLookup[(%1)]        // Sets the (%1)th bit
#define _SPO_BitUnSet(%0,%1)        (%0) &= ~_SPO_Const_Bit_MaskLookup[(%1)]       

#pragma unused _SPO_Const_Bit_MaskLookup        // Removes a (false) warning when the macros aren't used.

static _SPO_FindNextFreeFramePos(startingFrame) {
    new pos = startingFrame;
    new bool:hasLooped = false;
    new indexA, indexC;
    
    do {
        indexA = ++pos / cellbits;
        if (indexA > _SPO_Const_Heap_Allocations_Size && !hasLooped) {
            indexA = 0;
            hasLooped = true;
        }
        
        indexC = pos % cellbits;
    
    } while (_SPO_BitIsSet(_SPO_Heap_Allocations[indexA], indexC) && pos != startingFrame);
    
    return pos;
}

#define _SPO_ReserveFrame(%0)       _SPO_BitSet(_SPO_Heap_Allocations[(%0) / cellbits], (%0) % cellbits)

stock bool:_SPO_Alloc(ptr[], sizeP = sizeof ptr) {    // ptr is for page translator, it conviently resemble a pointer! :wink:
    if (
        // The user is sending crap
        sizeP < 0
    ||  sizeP > _SPO_Conf_Heap_Size
        // The heap is full
    ||  _SPO_Heap_Last_Allocated_Frame == -1
    ) { return false; }
    
    new currentPosF = _SPO_Heap_Last_Allocated_Frame;
    new currentSizeF = 0;
    new i = 0;
    
    while (currentSizeF < sizeP) {
        currentPosF = _SPO_FindNextFreeFramePos(currentPosF);
        if (
            // There are no more frame to allocate
            currentPosF == _SPO_Heap_Last_Allocated_Frame
        ) { 
            // Remember that
            _SPO_Heap_Last_Allocated_Frame = -1;
            
            // Tell the user
            return false;
        }
        
        _SPO_ReserveFrame(currentPosF);
        
        // Set the translation
        ptr[i++] = currentPosF;
        
        ++currentSizeF;
    }
    
    // Remember the last frame
    _SPO_Heap_Last_Allocated_Frame = currentPosF;    
    
    return true;
}

#define _SPO_FreeFrame(%0)          _SPO_BitUnSet(_SPO_Heap_Allocations[(%0) / cellbits], (%0) % cellbits)

stock _SPO_Free(ptr[], sizeP = sizeof ptr) {
    for (new i = 0; i != sizeP; ++i) {
        _SPO_FreeFrame(ptr[i]);
    }
}

#define _SPO_AllocationSize(%0)     ((%0) / _SPO_Conf_Heap_Page_Size) + _:(((%0) % _SPO_Conf_Heap_Page_Size) > 0)
#define _SPO_Deref(%0,%1)           _SPO_Heap[((%0)[(%1) / _SPO_Conf_Heap_Page_Size] * _SPO_Conf_Heap_Page_Size) + ((%1) % _SPO_Conf_Heap_Page_Size)]     // Gives access to the allocated cell
#define _SPO_Decl(%0,%1)            decl %0[_SPO_AllocationSize(%1)]
#define _SPO_New(%0,%1)             _SPO_Decl(%0, %1); _SPO_Alloc((%0))

stock _SPO_CopyTo(src[], ptr[], ptrOffset = 0, srcOffset = 0, srcSize = sizeof src, ptrSize = sizeof ptr) {
    // remaining cells will be ignored.
    for (new i = 0; i != srcSize && i != ptrSize; ++i) {
        _SPO_Deref(ptr, i+ptrOffset) = src[i+srcOffset];
    }
}

stock _SPO_CopyFrom(ptr[], src[], srcOffset = 0, ptrOffset = 0, srcSize = sizeof src, ptrSize = sizeof ptr) {
    // remaining cells will be ignored.
    for (new i = 0; i != srcSize && i != ptrSize; ++i) {
        src[i+srcOffset] = _SPO_Deref(ptr, i+ptrOffset);
    }
}

#undef _SPO_ReserveFrame                        // This macro uses a static variable and thus can't be used outside this file
#undef _SPO_FreeFrame