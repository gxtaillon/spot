#if defined _SPO_Inc_Utils
    #endinput
#endif
#define _SPO_Inc_Utils

#pragma semicolon 1

#define _SPO_CDefine\32%0\32%1 \
    #if !defined %0 \
        #define %0 %1 \
    #endif \