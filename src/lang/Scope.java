package lang;

import java.util.HashMap;
import java.util.Map;

public class Scope {
    public Map<String, Tag> tags;
    public Map<String, Function> functions;

    public Scope() {
    	this(new HashMap<String, Tag>(), new HashMap<String, Function>());
    }
    
    public Scope(Map<String, Tag> _tags, Map<String, Function> _functions) {
    	tags = _tags;
    	functions = _functions;
    }

    public Scope copyToNew() {
    	return copyTo(new Scope());
    }
    
    public Scope copyTo(Scope target) {
    	target.tags.putAll(tags);
    	target.functions.putAll(functions);
    	
    	return target;
    }
}
