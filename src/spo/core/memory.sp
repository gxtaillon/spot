#if defined _SPO_Inc_Memory
    #endinput
#endif
#define _SPO_Inc_Memory

#pragma semicolon 1

#define _SPO_Conf_Heap_Safe         1           // Alloc and Free
#define _SPO_Conf_Heap_Size         8192        // 2^13 cells
#define _SPO_Conf_Heap_Page_Size    4           // 2^2 cells      
                                                // A page is the smallest allocatable size for a block. (Too big values will cause internal fragmentation)

#assert _SPO_Conf_Heap_Page_Size >= 2           // Memory management requires at least 2 cells per block. See _SPO_Alloc.
#assert _SPO_Conf_Heap_Page_Size <= _SPO_Conf_Heap_Size         // This is a bare minimum.
#assert (_SPO_Conf_Heap_Size % _SPO_Conf_Heap_Page_Size) == 0   // _SPO_Conf_Heap_Size must be a divisor of _SPO_Const_Heap_Size

new _SPO_Heap[_SPO_Conf_Heap_Size] = { 0, _SPO_Conf_Heap_Size / _SPO_Conf_Heap_Page_Size };     // The heap is init'd with a single free block
static _SPO_Heap_Next_Free = 0;                 // Allocatable space is found using the "next-fit" method. This will point towards the next free block to scan.        

// Copies src starting at srcOffset into trg starting at trgOffset
stock _SPO_CopyTo(src[], trg[], trgOffset = 0, srcOffset = 0, srcSize = sizeof src, trgSize = sizeof trg) {
    // Partial code duplication here is more readable than squeezing the #if in the loop.
    #if _SPO_Conf_Heap_Safe == 1
    assert (trgSize - trgOffset) > (srcSize - srcOffset);
    for (new i = 0; i != srcSize; ++i) {
        trg[i+trgOffset] = src[i+srcOffset];
    }
    #else  // _SPO_Conf_Heap_Safe    
    // while unsafe, remaining cells will be ignored.
    for (new i = 0; i != srcSize && i != trgSize); ++i) {
        trg[i+trgOffset] = src[i+srcOffset];
    }
    #endif  // _SPO_Conf_Heap_Safe
}

// Allocates memory on the heap then returns an index pointing to the first usable allocated cell.
stock _SPO_Alloc(size) {
    // The heap is divided into blocks of various sizes, which are divided into pages of fixed sizes.
    // When a block is considered free (ready to be allocated):
    //      Its first cell contains the positions of the next free block and
    //      Its second cell contains its size in pages.
    // When a block has been allocated,
    //      Its first cell contains its size in pages and
    //      The index returned after the allocation points towards its second cell.
    //  Here the |heap| of size 8 and its [pages] of size 2 containing an allocated {block} of size 4 at position 2 and two free blocks of size 2 at positions 0 and 6.
    //  -> |    { [6,1] }
    //          { [2,x] [y,z] } 
    //          { [0,1] }
    //     |
    //  Keep in mind that the heap is an array and that blocks and pages are concepts.
    //  -> | 6 1 2 x y z 0 1 |
    #if _SPO_Conf_Heap_Safe == 1
    assert size > 0;
    assert size < _SPO_Conf_Heap_Size;
    #endif  // _SPO_Conf_Heap_Safe
    // Is the heap full?
    assert _SPO_Heap_Next_Free != -1;         // This also is a bare minimum and is not related to user input
    
    new previousPos = _SPO_Heap_Next_Free;
    new currentPos = _SPO_Heap_Next_Free;
    new currentSizeP = 0;                       // SizeP means Size in Pages
    new requiredSize = size + 1;                // The size of the allocation is kept in the first cell of the allocated block (this means it needs one more cell)
    new allocatedSizeP =                        // The size which must be allocated
          (requiredSize / _SPO_Conf_Heap_Page_Size) 
        + _:((requiredSize % _SPO_Conf_Heap_Page_Size) > 0); 
    
    // First find a block big enough
    while ((currentSizeP = _SPO_Heap[currentPos + 1]) < allocatedSizeP) {
        previousPos = currentPos;
        
        // Get the next block's position
        currentPos = _SPO_Heap[currentPos];     
        
        // If all blocks are too small, there is nothing to do about it
        assert currentPos != _SPO_Heap_Next_Free;
    }
    
    new nextPos = currentPos + (allocatedSizeP * _SPO_Conf_Heap_Page_Size);
    new nextSizeP = currentSizeP - allocatedSizeP;
        
    // Update the previous block
    _SPO_Heap[previousPos] = nextPos;
    
    // "Create" the current allocated block
    _SPO_Heap[currentPos] = allocatedSizeP;
        
    // Has the heap been filled at exactly 100% ?
    if (nextPos == _SPO_Conf_Heap_Size) {
        // Remeber that
        _SPO_Heap_Next_Free = -1;
    } else {
        // "Create" the new free block
        _SPO_Heap[nextPos] = _SPO_Heap[currentPos];
        _SPO_Heap[nextPos + 1] = nextSizeP;
        
        // Update our own data
        _SPO_Heap_Next_Free = nextPos;
    }
    
    // Return the first usable index of the block
    return currentPos + 1;
}

stock _SPO_Free(pos) {

}