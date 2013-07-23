/* 
    memory.sp
    Implements a memory manager which adds pointer like features to SourcePawn.
    
    Configuration:
        _SPO_Conf_Heap_Size                         Defines the size of the heap. (Preferably a power of 2 and must be divisible by _SPO_Conf_Heap_Page_Size)
        _SPO_Conf_Heap_Page_Size                    Defines the size of each pages/frames in the heap. (A lower value will decrease fragmentation but increase the size of pointers)
    
    Functions (Macros):     Big O       Big Omega       
      M _SPO_AllocationSize O(1)        O(1)        Calculates the required pointer size for a given number of cells
      M _SPO_Decl           -           -           Declares a pointer
        _SPO_Alloc          O(p*h/f)    O(p)        Allocates memory to a pointer*
      M _SPO_New            -           -           Decl and Alloc
      M _SPO_NewC           -           -           Same as New but asks for contigous allocation and returns a memory offset
      M _SPO_Deref          O(1)        O(1)        Access a cell in memory
      M _SPO_DerefC         O(1)        O(1)        Same Deref but uses direct offset to access a cell in memory. (Use with NewC)
        _SPO_CopyTo         O(min{d,a}) O(min{d,a}) Copies an array in memory
        _SPO_CopyFrom       O(min{d,a}) O(min{d,a}) Copies an array from memory
        _SPO_Free           O(p)        O(p)        Frees the memory allocated to a pointer
        _SPO_FreeC          O(p)        O(p)        Same as Free but uses the memory offset provided by NewC
      where:
        h                   Heap size
        f                   Frame size
        p                   Pointer size
        d                   Pointer's data size
        a                   Array size
    Structures:
        Pointer             A pointer is an array containing the translation table (page table) to reach the corresponding frames in the heap. The size of a pointer is defined by _SPO_AllocationSize(d). It is not d!
        Frame               Frames are of fixed size and divide the heap in allocatable chuncks of memory (cells).
        Pages               Pages are exactly the same size as frames. They are fitted in frames using arbitrary calculations. This allows virtual (or logical) addressing of memory (cells) in the heap and reduces greatly the chances that the heap will suffer from external fragmentation. However it introduces some internal fragmentation in the allocated chuncks but, depending on the page size, this is not something to be worried about.
        Heap                A very big static array with many helpers to guide strangers around and inside it.
        
    Exemple:
        SourcePawn                                          C
        --- 
        _SPO_New(myBuffer, 50);                            int* myBuffer = (int*) malloc(50);
        --- or
        _SPO_Decl(myBuffer, 50);                           int* myBuffer;
        _SPO_Alloc(myBuffer);                              myBuffer = (int*) malloc(50);
        ---
        _SPO_Deref(myBuffer, 13) = 1234;                   myBuffer[13] = 1234;
        PrintToServer("%d", _SPO_Deref(myBuffer, 13));     printf("%d", myBuffer[13]);
        _SPO_Free(myBuffer);                               free(myBuffer);
        
    Notes:
      * By default Alloc does not allocate frames contiguously but can de asked to. It is preferable to leave it so for all but very small allocations as it more likely that Alloc will be able to complete the request using isolated frames in the heap.
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
#define _SPO_FreeFrame(%0)          _SPO_BitUnSet(_SPO_Heap_Allocations[(%0) / cellbits], (%0) % cellbits)
#define _SPO_AllocationSize(%0)     ((%0) / _SPO_Conf_Heap_Page_Size) + _:(((%0) % _SPO_Conf_Heap_Page_Size) > 0)

stock bool:_SPO_Alloc(ptr[], requireContigous = false, sizeP = sizeof ptr) {    // ptr is for page translator, it conviently resemble a pointer! :wink:
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
        new lastPosF = currentPosF;
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
        
        
        if (
            // There must be a contiguous block allocated and that one frame was skipped
            requireContigous && (currentPosF - lastPosF) != 1
        ) {
            // Free the allocated frames
            for (;i != 0; --i) {
                _SPO_FreeFrame(ptr[i]);
            }
        
            // Reset the data
            currentSizeF = 0;
            
            // Start over
            continue;
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

stock _SPO_Free(ptr[], sizeP = sizeof ptr) {
    for (new i = 0; i != sizeP; ++i) {
        _SPO_FreeFrame(ptr[i]);
    }
}

stock _SPO_FreeC(pos, size) {
    new startPosF = pos / _SPO_Conf_Heap_Page_Size;
    new endPosF = startPosF + _SPO_AllocationSize(size);
    for (new i = startPosF; i != endPosF; ++i) {
        _SPO_FreeFrame(i);
    }    
}

#define _SPO_DerefPos(%0,%1)        ((%0)[(%1) / _SPO_Conf_Heap_Page_Size] * _SPO_Conf_Heap_Page_Size) + ((%1) % _SPO_Conf_Heap_Page_Size)
#define _SPO_Deref(%0,%1)           _SPO_Heap[_SPO_DerefPos(%0, %1)]            // Gives access to the allocated cell
#define _SPO_Decl(%0,%1)            decl %0[_SPO_AllocationSize(%1)]
#define _SPO_New(%0,%1)             _SPO_Decl(%0, %1); _SPO_Alloc((%0))
#define _SPO_NewC(%0,%1)            _SPO_Decl(%0_ptr, %1); _SPO_Alloc((%0_ptr), true); new %0 = _SPO_DerefPos(%0_ptr, 0)
#define _SPO_DerefC(%0)             _SPO_Heap[(%0)]

/*
#define _SPO_Ref(%0,%1)             _SPO_New(%0_dptr, %1); \
                                    _SPO_Decl(%0_rptr, _SPO_AllocationSize(%1) + 1); \
                                    _SPO_Alloc(%0_rptr, true); \
                                    _SPO_Deref(%0_rptr, 0) = _SPO_AllocationSize(%1) + 1; \
                                    _SPO_CopyTo(%0_dptr, %0_rptr, 1); \
                                    new %0 = _SPO_DerefPos(%0_rptr, 1)
#define _SPO_RefDeref(%0,%1)        
*/

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