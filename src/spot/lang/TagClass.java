package spot.lang;

import java.util.HashMap;
import java.util.Map;

public class TagClass extends Tag {
    public static final String PAWN_ENUM_PREFIX = "Class_";
    public static final String PAWN_ENUM_POSTFIX = "_";

    private static int UIdCounter = 0;
    private int UId;

    public Map<String, TagClass> parents;
    public Map<String, Variable> variables;
    public Map<String, Function> functions;
    public String cleanIdentifier;

    // Properties
    public String pId;
    public String pSize;

    public static String getPawnEnumId(String classId) {
        return PAWN_ENUM_PREFIX + classId + PAWN_ENUM_POSTFIX;
    }

    public static String getPawnFuncId(String funcId,
            String enumId,
            boolean isVerbatim) {
        return isVerbatim ? funcId : enumId + funcId;
    }

    public TagClass(String _identifier) {
        this(_identifier, new HashMap<String, Variable>());
    }

    public TagClass(String _identifier, Map<String, Variable> _variables) {
        this(_identifier, _variables, new HashMap<String, Function>());
    }

    public TagClass(String _identifier,
            Map<String, Variable> _variables,
            Map<String, Function> _functions) {
        this(_identifier, _variables, _functions,
                new HashMap<String, TagClass>());
    }

    public TagClass(String _identifier,
            Map<String, Variable> _variables,
            Map<String, Function> _functions,
            Map<String, TagClass> _parents) {
        super(_identifier);
        parents = _parents;
        variables = _variables;
        functions = _functions;

        UId = UIdCounter++;
    }

    public int getUId() {
        return UId;
    }

    public int getUIdCounter() {
        return UIdCounter;
    }
}
