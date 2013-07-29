package spot.lang;
public class Variable extends LangConstruct {
    public Tag tag;
    public EVisibility vis;
    
    public Variable(String _identifier) {
        this(_identifier, getDefaultVis());
    }

    public Variable(String _identifier, EVisibility _vis) {
        this(_identifier, _vis, Tag._);
    }

    public Variable(String _identifier, EVisibility _vis, Tag _tag) {
        super(_identifier);
        tag = _tag;
        vis = _vis == null ? getDefaultVis() : _vis;
    }

    public String toPawn() {
        return tag.toPawn() + identifier;
    }

    private static EVisibility getDefaultVis() {
    	return EVisibility.Private;
    }
}
