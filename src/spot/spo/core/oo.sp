#if defined _SPO_Inc_OO
    #endinput
#endif
#define _SPO_Inc_OO

#pragma semicolon 1

#define _SPO_Const_iNotRelated	    0xffffffff  // Classes cannot have more than 4294967295 (2^32 - 1, (max size) - (size of meta slot)) variables!
#define _SPO_iGet_Base(%0,%1,%2)    (%0)[(%1)][(%2)]

_SPO_iGet_Safe(from, this, iTable[][]) {
	new offset = _SPO_iGet_Base(iTable, from, this);
	assert offset >= _SPO_Const_iNotRelated;
	return offset;
}

#define _SPO_Conf_iGet_Safe         1           // safe:1 unsafe:0

#if !defined _SPO_iTable_Var
    #define _SPO_iTable_Var         _SPO_iTable
#endif

#if _SPO_Conf_iGet_Safe == 1
#define _SPO_iGet(%0,%1)   _SPO_iGet_Safe((%0), (%1), _SPO_iTable_Var)
#else   // _SPO_Conf_iGet_Safe
#define _SPO_iGet(%0,%1)   _SPO_iGet_Base((%0), (%1), _SPO_iTable_Var)
#endif  // _SPO_Conf_iGet_Safe


