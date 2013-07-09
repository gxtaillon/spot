package lang;
import java.util.*;

public class Class extends Tag {
    public Map<String, Class> parents;
    public Map<String, Variable> variables;
    public Map<String, Function> functions;
    
    public Class(
            String _identifier, Map<String, Class> _parents, 
            Map<String, Variable> _variables, 
            Map<String, Function> _functions) {
        super(_identifier);
        parents = _parents;
        variables = _variables;
        functions = _functions;
    }

}
