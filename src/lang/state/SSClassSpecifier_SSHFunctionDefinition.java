package lang.state;

import lang.EVisibility;
import lang.TagClass;
import lang.Variable;
import main.IStatefulExtractor;
import parser.SPOTParser;
import parser.SPOTParser.SemiContext;
import util.state.IStateful;

public class SSClassSpecifier_SSHFunctionDefinition extends ScopeStateBase {
	protected TagClass currentClass;
	protected EVisibility currentVis;
	
	public SSClassSpecifier_SSHFunctionDefinition(IStatefulExtractor _source, ScopeStateBase _previousState, TagClass _currentClass, EVisibility _currentVis) {
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
		pawnDefine(currentClass.identifier + v.identifier, Integer.toString(currentClass.variables.size()));
	}
	
	@Override
	public void enterSemi(SemiContext ctx) {
		ret();
	}
}
