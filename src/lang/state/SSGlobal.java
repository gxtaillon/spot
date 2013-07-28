package lang.state;

import parser.SPOTParser;
import parser.SPOTParser.ClassSpecifierContext;
import util.state.IStateful;

public class SSGlobal extends ScopeStateBase {
	StringBuilder headerBuilder;
	
	public SSGlobal(IStateful _source) {
		super(_source, null);
		
		headerBuilder = new StringBuilder();

		String pc = getSourceConfig().getPathCore();
		headerBuilder.append("#include \"" + pc + "memory.sp\"\n");
		headerBuilder.append("#include \"" + pc + "oo.sp\"\n");
		headerBuilder.append("\n");
	}

	@Override 
	public void exitCompilationUnit(SPOTParser.CompilationUnitContext ctx) {
		headerBuilder.append(currentBuilder);
		// dispose currentBuilder?
		currentBuilder = headerBuilder;
	}

	@Override
	public void enterClassSpecifier(ClassSpecifierContext ctx) {
		String classId = ctx.Identifier().toString();
		getSource().setState(new SSClassSpecifier(getSource(), currentScope, this, classId));
	}	
}
