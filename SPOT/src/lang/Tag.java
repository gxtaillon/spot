package lang;
public class Tag extends LangConstruct {    
    public final static Tag _ = new Tag("_");
    public final static Tag String = new Tag("String");
    public final static Tag Float = new Tag("Float");
    public final static Tag Bool = new Tag("Bool");
    public final static Tag Handle = new Tag("Handle");
    
    public Tag(String _identifier) {
        super(_identifier);
    }

    public String toPawn() {
        return identifier + ":";
    }

}
