Notes
-----
* When adding rules in the grammar, do not forget to call it from the extractor.
* Always make sure that when you want to change the source's state your function is not the child of another method changing the state, in the call stack. Otherwise all but the first call will be "ignored".
