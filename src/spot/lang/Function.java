package spot.lang;

import java.util.HashMap;
import java.util.Map;

public class Function extends LangConstruct {
    public Tag tag;
    public Map<String, Variable> variables;

    public Function(String _identifier) {
        this(_identifier, Tag._);
    }

    public Function(String _identifier, Tag _tag) {
        this(_identifier, _tag, new HashMap<String, Variable>());
    }

    public Function(String _identifier,
            Tag _tag,
            Map<String, Variable> _variables) {
        super(_identifier);
        tag = _tag;
        variables = _variables;
    }

}
