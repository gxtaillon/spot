package spot.lang.state;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.*;

import spot.lang.*;
import spot.main.ExtractPawnListener;
import spot.main.ExtractorConfig;
import spot.main.IStatefulExtractor;
import spot.parser.*;
import spot.util.state.IState;
import spot.util.state.IStateful;

public abstract class ScopeStateBase extends SPOTBaseListener implements IState {
	protected StringBuilder currentBuilder;
	protected Scope currentScope;
	protected ScopeStateBase previousState;
	private IStatefulExtractor source;

	public ScopeStateBase(IStatefulExtractor _source, ScopeStateBase _previousState) {
		source = _source;
		currentBuilder = new StringBuilder();
		currentScope = new Scope();
		previousState = _previousState;
	}
	
	/**
	 * Should be called when the current state is exiting its last node to 
	 * return control to its previous state.
	 */
	protected void ret/*urn*/() {
		// Save the builder!
		previousState.currentBuilder.append(currentBuilder);
		
		// Return control
		getSourceExtractor().setState(previousState);
	}

	public StringBuilder getCurrentBuilder() {
		return currentBuilder;
	}

	@Override
	public IStateful getSource() {
		return source;
	}

	public IStatefulExtractor getSourceExtractor() {
		return (IStatefulExtractor) source;
	}
	
	public ExtractorConfig getSourceConfig() {
		return getSourceExtractor().getConfig();
	}

	/**
	 * Appends the current rule "as is" to the current builder along with a
	 * trailing space.
	 * 
	 * @param ctx
	 * @return the current rule.
	 */
	protected String asis(ParserRuleContext ctx) {
		TokenStream tokens = getSourceExtractor().getParser().getTokenStream();
		String tmp = tokens.getText(ctx);
		currentBuilder.append(' ');
		currentBuilder.append(tmp);
		currentBuilder.append(' ');
		return tmp;
	}
	
	protected String asis(TerminalNode node) {
		return asis(node, " ");
	}
	
	protected String asis(TerminalNode node, String postfix) {
		String tmp = node.getText();
		currentBuilder.append(' ');
		currentBuilder.append(tmp);
		currentBuilder.append(postfix);
		return tmp;
	}
	
	protected void pawnDefine(String identifier, String value) {
		currentBuilder.append("#define ");
		currentBuilder.append(identifier);
		currentBuilder.append("\t");
		currentBuilder.append(value);
		currentBuilder.append("\n");
	}
	
	// LISTENER METHODS
	
	@Override
	public void visitTerminal(TerminalNode node) {
		// Print line directive asis when they are encountered
		if (node.getText().startsWith("#")) {
			asis(node, "\n");
		}		
	}

	@Override
	public void exitCompilationUnit(SPOTParser.CompilationUnitContext ctx) {
		
	}

	@Override
	public void exitExpressionStatement(
			SPOTParser.ExpressionStatementContext ctx) {
	}

	@Override
	public void enterDeclaration(SPOTParser.DeclarationContext ctx) {

	}

	@Override
	public void exitDeclaration(SPOTParser.DeclarationContext ctx) {

	}

	@Override
	public void exitDeclarator(SPOTParser.DeclaratorContext ctx) {

	}

	@Override
	public void enterFunctionDeclarator(SPOTParser.FunctionDeclaratorContext ctx) {

	}

	@Override
	public void exitFunctionDeclarator(SPOTParser.FunctionDeclaratorContext ctx) {

	}

	@Override
	public void enterTagSpecifier(SPOTParser.TagSpecifierContext ctx) {
	}

	@Override
	public void enterStorageClassSpecifier(
			SPOTParser.StorageClassSpecifierContext ctx) {
	}

	@Override
	public void enterClassSpecifier(SPOTParser.ClassSpecifierContext ctx) {
	}

	@Override
	public void exitClassSpecifier(SPOTParser.ClassSpecifierContext ctx) {
	}

	@Override
	public void enterClassDeclaration(SPOTParser.ClassDeclarationContext ctx) {
	}

	@Override
	public void exitClassDeclaration(SPOTParser.ClassDeclarationContext ctx) {
	}

	@Override
	public void enterIdentifierList(SPOTParser.IdentifierListContext ctx) {
	}

	@Override
	public void enterFunctionDefinition(SPOTParser.FunctionDefinitionContext ctx) {
	}

	@Override
	public void exitFunctionDefinition(SPOTParser.FunctionDefinitionContext ctx) {
	}

	@Override
	public void enterParameterDeclaration(
			SPOTParser.ParameterDeclarationContext ctx) {
	}

	@Override
	public void exitParameterDeclaration(
			SPOTParser.ParameterDeclarationContext ctx) {
	}

	@Override
	public void enterDirectDeclarator(SPOTParser.DirectDeclaratorContext ctx) {
	}

	@Override
	public void enterCompoundStatement(SPOTParser.CompoundStatementContext ctx) {
	}

	@Override
	public void exitCompoundStatement(SPOTParser.CompoundStatementContext ctx) {
	}

	@Override
	public void enterJumpStatement(SPOTParser.JumpStatementContext ctx) {
	}

	@Override
	public void exitJumpStatement(SPOTParser.JumpStatementContext ctx) {
	}

	@Override
	public void enterPrimaryExpression(SPOTParser.PrimaryExpressionContext ctx) {
	}

	@Override
	public void enterPostfixExpressionDot(
			SPOTParser.PostfixExpressionDotContext ctx) {
	}

	@Override
	public void enterPostfixExpression(SPOTParser.PostfixExpressionContext ctx) {
	}

	@Override
	public void exitPostfixExpression(SPOTParser.PostfixExpressionContext ctx) {
	}

	@Override
	public void enterPostfixExpressionArgs(
			SPOTParser.PostfixExpressionArgsContext ctx) {
	}

	// pseudo terminals

	@Override
	public void enterTypeAccessQualifier(
			SPOTParser.TypeAccessQualifierContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterLpar(SPOTParser.LparContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterRpar(SPOTParser.RparContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterStar(SPOTParser.StarContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterDiv(SPOTParser.DivContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterMod(SPOTParser.ModContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterPlus(SPOTParser.PlusContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterMinus(SPOTParser.MinusContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterShiftr(SPOTParser.ShiftrContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterShiftl(SPOTParser.ShiftlContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterLess(SPOTParser.LessContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterMore(SPOTParser.MoreContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterLeeq(SPOTParser.LeeqContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterMoeq(SPOTParser.MoeqContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterEqeq(SPOTParser.EqeqContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterNoteq(SPOTParser.NoteqContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterAnd(SPOTParser.AndContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterCaret(SPOTParser.CaretContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterOr(SPOTParser.OrContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterAndand(SPOTParser.AndandContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterOror(SPOTParser.OrorContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterQuestion(SPOTParser.QuestionContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterSemi(SPOTParser.SemiContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterEq(SPOTParser.EqContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterComa(SPOTParser.ComaContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterAssignmentOperator(SPOTParser.AssignmentOperatorContext ctx) {
		asis(ctx);
	}
}
