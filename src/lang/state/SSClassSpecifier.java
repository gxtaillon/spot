package lang.state;

import org.antlr.v4.runtime.TokenStream;

import parser.SPOTParser;
import lang.EVisibility;
import lang.Scope;
import lang.TagClass;
import main.IStatefulExtractor;

public class SSClassSpecifier extends ScopeStateBase {
	protected TagClass currentClass;

	public SSClassSpecifier(IStatefulExtractor _source, Scope previousScope,
			ScopeStateBase _previousState, String classId) {
		super(_source, _previousState);
		previousScope.copyTo(currentScope);
		
		String up = getSourceConfig().getUniversalPrefix();
		currentClass = new TagClass(up + TagClass.getPawnEnumId(classId));
		
		
		pawnDefine(currentClass.identifier + up + "Id", Integer.toString(currentClass.getUId()));		
	}

	@Override
	public void exitClassSpecifier(SPOTParser.ClassSpecifierContext ctx) {
		String up = getSourceConfig().getUniversalPrefix();
		
		// Define the size
		pawnDefine(currentClass.identifier + up + "Size", Integer.toString(currentClass.variables.size()));	

		ret();
	}

	/* Substates */
	@Override
	public void enterClassDeclaration(SPOTParser.ClassDeclarationContext ctx) {
		// Get the visibility
		EVisibility vis = (ctx.classVisibility() != null) 
				? EVisibility.getVisFromToken(ctx.classVisibility().toString())
				: null;
		
		// If we are parsing variables
		if (ctx.identifierList() != null) {
			//TokenStream tokens = getSourceListener().parser.getTokenStream();
			//String currentTag = (ctx.tagSpecifier() != null) ? tokens.getText(ctx.tagSpecifier()) : "";
			
			getSourceExtractor().setState(new SSClassSpecifier_SSHIdentifierList(getSourceExtractor(), this, currentClass, vis));
		} else if (ctx.functionDefinition() != null) {
			
		}		
	}
}
