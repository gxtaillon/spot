#if defined _SPO_Inc_TestUtils
    #endinput
#endif
#define _SPO_Inc_TestUtils

#pragma semicolon 1

stock printArray(src[], String:f[] = "src[%d] = {%d}", srcSize = sizeof src) {
    for (new i = 0; i != srcSize; ++i) {
        PrintToServer(f, i, src[i]);
    }
}