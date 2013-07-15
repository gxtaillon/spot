package lang.state;

import parser.SPOTParser.ClassSpecifierContext;
import util.state.IStateful;

public class SSGlobal extends ScopeStateBase {
	public SSGlobal(IStateful _source) {
		super(_source);
	}

	@Override
	public void enterClassSpecifier(ClassSpecifierContext ctx) {
		String classId = ctx.Identifier().toString();
		getSource().setState(new SSClassSpecifier(getSource(), currentScope, this, classId));
	}
}
