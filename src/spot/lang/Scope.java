package spot.lang;

import java.util.HashMap;
import java.util.Map;

import spot.util.collection.tree.SimpleTree;

public class Scope {
    public Map<String, Tag> tags;
    public SimpleTree<TagClass> inheritanceTree;
    public Map<String, Function> functions;
    public Map<String, Variable> variables;

    public Scope() {
        this(new HashMap<String, Tag>(), new HashMap<String, Function>(),
                new HashMap<String, Variable>());
    }

    protected Scope(Map<String, Tag> _tags,
            Map<String, Function> _functions,
            Map<String, Variable> _variables) {
        tags = _tags;
        functions = _functions;
        variables = _variables;
    }    

    public Scope copyToNew() {
        return copyTo(new Scope());
    }

    public Scope copyTo(Scope target) {
        target.tags.putAll(tags);
        target.functions.putAll(functions);
        target.variables.putAll(variables);

        return target;
    }
}
