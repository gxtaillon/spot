package lang.state;

import parser.SPOTParser;
import parser.SPOTParser.SemiContext;
import util.state.IStateful;

public class SSHandler_IdentifierList extends ScopeStateBase {
	protected String currentTag;
	
	public SSHandler_IdentifierList(IStateful _source, String _currentTag) {
		super(_source);
		currentTag = _currentTag;
	}

	@Override
	public void enterIdentifierList(SPOTParser.IdentifierListContext ctx) {
		// Get the current tag and append it (to each identifer, this will
		// prevent the loss of tags when using declaration lists)
		currentBuilder.append(currentTag);
		currentBuilder.append(ctx.Identifier());

		if (ctx.identifierList() != null) {
			currentBuilder.append(',');			
		}
	}
	
	@Override
	public void enterSemi(SemiContext ctx) {
		previousState.currentBuilder.append(currentBuilder);
		
		getSource().setState(previousState);
	}
}
