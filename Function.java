import java.util.*;

public class Function extends LangConstruct {
    public Tag tag;
    public Map<String, Variable> variables;
    
    public Function(String _identifier, Tag _tag, Map<String, Variable> _variables) {
        super(_identifier);
        tag = _tag;
        variables = _variables;
    }
}
