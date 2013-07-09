package lang;
public class Variable extends LangConstruct {
    public Tag tag;
    
    public Variable(String _identifier) {
        this(_identifier, Tag._);
    }

    public Variable(String _identifier, Tag _tag) {
        super(_identifier);
        tag = _tag;
    }

    public String toPawn() {
        return tag.toPawn() + identifier;
    }

}
