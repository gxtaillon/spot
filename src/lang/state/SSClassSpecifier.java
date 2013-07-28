package lang.state;

import org.antlr.v4.runtime.TokenStream;

import parser.SPOTParser;
import util.state.IStateful;
import lang.Scope;
import lang.TagClass;

public class SSClassSpecifier extends ScopeStateBase {
	protected TagClass currentClass;

	public SSClassSpecifier(IStateful _source, Scope previousScope,
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
		
		// Define our size
		pawnDefine(currentClass.identifier + up + "Size", Integer.toString(currentClass.variables.size()));	
		
		// Append our functions
		// sb.append(csb);

		// Clean the class buffer
		// csb.delete(0, csb.length());


		ret();
	}

	/* Substates */
	@Override
	public void enterClassDeclaration(SPOTParser.ClassDeclarationContext ctx) {
		// If we are parsing variables
		if (ctx.identifierList() != null) {
			//TokenStream tokens = getSourceListener().parser.getTokenStream();
			//String currentTag = (ctx.tagSpecifier() != null) ? tokens.getText(ctx.tagSpecifier()) : "";
			
			getSource().setState(new SSClassSpecifier_SSHIdentifierList(getSource(), this, currentClass));
		}
		// Function definitions will be handled in functionDefinition()
	}
}
