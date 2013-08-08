package spot.lang.state;

import spot.lang.EVisibility;
import spot.lang.TagClass;
import spot.lang.Variable;
import spot.main.IStatefulExtractor;
import spot.parser.SPOTParser;
import spot.parser.SPOTParser.SemiContext;

public class SSClassSpecifier_SSHIdentifierList extends ScopeStateBase {
    protected TagClass currentClass;
    protected EVisibility currentVis;

    public SSClassSpecifier_SSHIdentifierList(IStatefulExtractor _source,
            ScopeStateBase _previousState,
            TagClass _currentClass,
            EVisibility _currentVis) {
        super(_source, _previousState);
        currentClass = _currentClass;
        currentVis = _currentVis;
    }

    @Override
    public void enterIdentifierList(SPOTParser.IdentifierListContext ctx) {
        // Put the found member in the current class
        Variable v = new Variable(ctx.Identifier().toString(), currentVis);
        currentClass.variables.put(v.identifier, v);

        // And define it in the builder
        pawnDefine(currentClass.identifier + v.identifier,
                Integer.toString(currentClass.variables.size()));
    }

    @Override
    public void enterSemi(SemiContext ctx) {
        ret();
    }
}
