package spot.lang.state;

import spot.main.IStatefulExtractor;
import spot.parser.SPOTParser;
import spot.parser.SPOTParser.ClassSpecifierContext;
import spot.util.state.IStateful;

public class SSGlobal extends ScopeStateBase {
	StringBuilder headerBuilder;
	
	public SSGlobal(IStatefulExtractor _source) {
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
		getSourceExtractor().setState(new SSClassSpecifier(getSourceExtractor(), currentScope, this, classId));
	}	
}
