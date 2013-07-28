package lang.state;

import lang.TagClass;
import lang.Variable;
import parser.SPOTParser;
import parser.SPOTParser.SemiContext;
import util.state.IStateful;

public class SSClassSpecifier_SSHIdentifierList extends ScopeStateBase {
	protected TagClass currentClass;
	
	public SSClassSpecifier_SSHIdentifierList(IStateful _source, ScopeStateBase _previousState, TagClass _currentClass) {
		super(_source, _previousState);
		currentClass = _currentClass;
	}

	@Override
	public void enterIdentifierList(SPOTParser.IdentifierListContext ctx) {
		// Put the found member in the current class
		Variable v = new Variable(ctx.Identifier().toString());
		currentClass.variables.put(v.identifier, v);
		
		// And define it in the builder
		pawnDefine(currentClass.identifier + v.identifier, Integer.toString(currentClass.variables.size()));
	}
	
	@Override
	public void enterSemi(SemiContext ctx) {
		ret();
	}
}
