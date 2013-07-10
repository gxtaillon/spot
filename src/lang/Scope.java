package lang;

import java.util.Map;

public class Scope {
    public Map<String, Tag> tags;
    
    public Scope(Map<String, Tag> _tags) {
    	tags = _tags;
    }
}
