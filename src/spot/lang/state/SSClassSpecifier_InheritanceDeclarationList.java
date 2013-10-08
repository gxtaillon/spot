package spot.lang.state;

import spot.lang.Scope;
import spot.lang.Tag;
import spot.lang.TagClass;
import spot.lang.Variable;
import spot.main.IStatefulExtractor;
import spot.parser.SPOTParser;
import spot.parser.SPOTParser.ClassInheritanceSpecifierContext;

public class SSClassSpecifier_InheritanceDeclarationList extends ScopeStateBase {
    protected TagClass currentClass;

    public SSClassSpecifier_InheritanceDeclarationList(IStatefulExtractor _source,
            Scope previousScope,
            ScopeStateBase _previousState,
            TagClass _currentClass) {
        super(_source, previousScope, _previousState);
        currentClass = _currentClass;
    }

    @Override
    public void enterIdentifierList(SPOTParser.IdentifierListContext ctx) {
        String cleanId = ctx.Identifier().toString();
        String id = getSourceConfig().getUniversalPrefix() + TagClass.getPawnEnumId(cleanId);
        if (!currentScope.tags.containsKey(id)) {
            //TODO Log error
            // Identifier not found, {id}.
        }
       
        Tag t = currentScope.tags.get(id);
        if (!(t instanceof TagClass)) {
            //TODO Log error
            // Cannot inherit from type {type}.
        }
        TagClass c = (TagClass)t;
        
        if (currentClass.parents.size() >= 1) {
            //TODO Log error
            // No support for multiple inheritance as of yet.
            //TODO Amend condition to allow interfaces. 
        }
        currentClass.parents.put(c.identifier, c);
        
        for (Variable v : c.variables.values()) {
            currentClass.variables.put(v.identifier, v);

            // And define it in the builder
            pawnDefine(currentClass.identifier + v.identifier,
                    Integer.toString(currentClass.variables.size()));
        }
    }

    @Override
    public void exitClassInheritanceSpecifier(ClassInheritanceSpecifierContext ctx) {
        ret();
    }
}
