package spot.lang.state;

import spot.lang.EVisibility;
import spot.lang.Scope;
import spot.lang.TagClass;
import spot.lang.Variable;
import spot.main.IStatefulExtractor;
import spot.parser.SPOTParser;
import spot.parser.SPOTParser.SemiContext;

public class SSClassSpecifier_VariableDeclarationList extends ScopeStateBase {
    protected TagClass currentClass;
    protected EVisibility currentVis;

    public SSClassSpecifier_VariableDeclarationList(IStatefulExtractor _source,
            Scope previousScope,
            ScopeStateBase _previousState,
            TagClass _currentClass,
            EVisibility _currentVis) {
        super(_source, previousScope, _previousState);
        currentClass = _currentClass;
        currentVis = _currentVis;
    }

    @Override
    public void enterIdentifierList(SPOTParser.IdentifierListContext ctx) {
        // Put the found member in the current class
        String vid = TagClass.getPawnFuncId(ctx.Identifier().toString(),
                currentClass.identifier, false);
        Variable v = new Variable(vid, currentVis);
        currentClass.variables.put(v.identifier, v);

        // And define it in the builder
        pawnDefine(v.identifier,
                Integer.toString(currentClass.variables.size()));
    }

    @Override
    public void enterSemi(SemiContext ctx) {
        ret();
    }
}
