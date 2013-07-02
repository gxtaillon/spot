import java.util.*;

public class Class extends LangConstruct {
    public Map<String, Tag> tags;
    public Map<String, Variable> variables;
    public Map<String, Function> functions;
    
    public Class(
            String _identifier, Map<String, Tag> _tags, 
            Map<String, Variable> _variables, 
            Map<String, Function> _functions) {
        super(_identifier);
        tags = _tags;
        variables = _variables;
        functions = _functions;
    }
}
