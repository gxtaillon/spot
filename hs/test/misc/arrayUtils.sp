public OnPluginStart() {
  new a1[] = { 1, 2, 3 }
  new a2[] = { 10, 11, 12, 13 }
  copyTo(a1, a2);
  printArray(a1);
  printArray(a2);
}

copyTo(src[], trg[], safe=true, srcSize = sizeof src, trgSize = sizeof trg) {
  if (safe) {
    assert trgSize > srcSize;
  }
  // while unsafe, remaining cells will be ignored.
  for (new i = 0; i != srcSize && (!safe && i != trgSize); ++i) {
    trg[i] = src[i];
  }
}

printArray(src[], srcSize = sizeof src) {
  for (new i = 0; i != srcSize; ++i) {
    PrintToServer("src[%d] = {%d}\n", i, src[i]);
  }
}