package lang.state;

import org.antlr.v4.runtime.TokenStream;

import parser.SPOTParser;
import util.state.IStateful;
import lang.Scope;
import lang.TagClass;

public class SSClassSpecifier extends ScopeStateBase {
	protected TagClass currentClass;
	
	public SSClassSpecifier(IStateful _source, Scope previousScope, ScopeStateBase _previousState, String classId) {
		super(_source);
		previousScope.copyTo(currentScope);
		
		previousState = _previousState;
		currentClass = new TagClass(TagClass.getPawnEnumId(classId));

		currentBuilder.append("enum ");
		currentBuilder.append(currentClass.identifier);
		currentBuilder.append(" {\n");		
	}


	@Override
	public void exitClassSpecifier(SPOTParser.ClassSpecifierContext ctx) {
		// Let's close the enum
		currentBuilder.append("};\n");

		// Append our functions
		//sb.append(csb);

		// Clean the class buffer
		//csb.delete(0, csb.length());
		
		// Restore
		getSource().setState(previousState);
	}
	
	/* Substates */
	@Override
	public void enterClassDeclaration(SPOTParser.ClassDeclarationContext ctx) {
		// If we are parsing variables
		if (ctx.identifierList() != null) {
			TokenStream tokens = getSourceListener().parser.getTokenStream();
			String currentTag = (ctx.tagSpecifier() != null) 
					? tokens.getText(ctx.tagSpecifier()) 
					: "";
			getSource().setState(new SSHandler_IdentifierList(getSource(), currentTag));		
		}
		// Function definitions will be handled in functionDefinition()
	}
}
