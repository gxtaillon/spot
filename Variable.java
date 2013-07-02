class Variable extends LangConstruct {
    public Tag tag;
    
    public Variable(String _identifier, Tag _tag) {
        super(_identifier);
        tag = _tag;
    }
}
