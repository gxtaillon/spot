package lang.state;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.*;

import parser.*;
import util.state.IState;
import util.state.IStateful;
import lang.*;
import main.Config;
import main.ExtractPawnListener;

public abstract class ScopeStateBase implements IState {
	protected StringBuilder currentBuilder;
	protected Scope currentScope;
	protected ScopeStateBase previousState;
	private IStateful source;

	public ScopeStateBase(IStateful _source, ScopeStateBase _previousState) {
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
		getSource().setState(previousState);
	}

	public StringBuilder getCurrentBuilder() {
		return currentBuilder;
	}

	public IStateful getSource() {
		return source;
	}

	public ExtractPawnListener getSourceListener() {
		return (ExtractPawnListener) source;
	}
	
	public Config getSourceConfig() {
		return getSourceListener().config;
	}

	/**
	 * Appends the current rule "as is" to the current builder along with a
	 * trailing space.
	 * 
	 * @param ctx
	 * @return the current rule.
	 */
	protected String asis(ParserRuleContext ctx) {
		TokenStream tokens = getSourceListener().parser.getTokenStream();
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
	}
	
	// LISTENER METHODS
	
	public void visitTerminal(TerminalNode node) {
		// Print line directive asis when they are encountered
		if (node.getText().startsWith("#")) {
			asis(node, "\n");
		}		
	}

	public void exitCompilationUnit(SPOTParser.CompilationUnitContext ctx) {
		
	}

	public void exitExpressionStatement(
			SPOTParser.ExpressionStatementContext ctx) {
	}

	public void enterDeclaration(SPOTParser.DeclarationContext ctx) {

	}

	public void exitDeclaration(SPOTParser.DeclarationContext ctx) {

	}

	public void exitDeclarator(SPOTParser.DeclaratorContext ctx) {

	}

	public void enterFunctionDeclarator(SPOTParser.FunctionDeclaratorContext ctx) {

	}

	public void exitFunctionDeclarator(SPOTParser.FunctionDeclaratorContext ctx) {

	}

	public void enterTagSpecifier(SPOTParser.TagSpecifierContext ctx) {
	}

	public void enterStorageClassSpecifier(
			SPOTParser.StorageClassSpecifierContext ctx) {
	}

	public void enterClassSpecifier(SPOTParser.ClassSpecifierContext ctx) {
	}

	public void exitClassSpecifier(SPOTParser.ClassSpecifierContext ctx) {
	}

	public void enterClassDeclaration(SPOTParser.ClassDeclarationContext ctx) {
	}

	public void exitClassDeclaration(SPOTParser.ClassDeclarationContext ctx) {
	}

	public void enterIdentifierList(SPOTParser.IdentifierListContext ctx) {
	}

	public void enterFunctionDefinition(SPOTParser.FunctionDefinitionContext ctx) {
	}

	public void exitFunctionDefinition(SPOTParser.FunctionDefinitionContext ctx) {
	}

	public void enterParameterDeclaration(
			SPOTParser.ParameterDeclarationContext ctx) {
	}

	public void exitParameterDeclaration(
			SPOTParser.ParameterDeclarationContext ctx) {
	}

	public void enterDirectDeclarator(SPOTParser.DirectDeclaratorContext ctx) {
	}

	public void enterCompoundStatement(SPOTParser.CompoundStatementContext ctx) {
	}

	public void exitCompoundStatement(SPOTParser.CompoundStatementContext ctx) {
	}

	public void enterJumpStatement(SPOTParser.JumpStatementContext ctx) {
	}

	public void exitJumpStatement(SPOTParser.JumpStatementContext ctx) {
	}

	public void enterPrimaryExpression(SPOTParser.PrimaryExpressionContext ctx) {
	}

	public void enterPostfixExpressionDot(
			SPOTParser.PostfixExpressionDotContext ctx) {
	}

	public void enterPostfixExpression(SPOTParser.PostfixExpressionContext ctx) {
	}

	public void exitPostfixExpression(SPOTParser.PostfixExpressionContext ctx) {
	}

	public void enterPostfixExpressionArgs(
			SPOTParser.PostfixExpressionArgsContext ctx) {
	}

	// pseudo terminals

	public void enterTypeAccessQualifier(
			SPOTParser.TypeAccessQualifierContext ctx) {
		asis(ctx);
	}

	public void enterLpar(SPOTParser.LparContext ctx) {
		asis(ctx);
	}

	public void enterRpar(SPOTParser.RparContext ctx) {
		asis(ctx);
	}

	public void enterStar(SPOTParser.StarContext ctx) {
		asis(ctx);
	}

	public void enterDiv(SPOTParser.DivContext ctx) {
		asis(ctx);
	}

	public void enterMod(SPOTParser.ModContext ctx) {
		asis(ctx);
	}

	public void enterPlus(SPOTParser.PlusContext ctx) {
		asis(ctx);
	}

	public void enterMinus(SPOTParser.MinusContext ctx) {
		asis(ctx);
	}

	public void enterShiftr(SPOTParser.ShiftrContext ctx) {
		asis(ctx);
	}

	public void enterShiftl(SPOTParser.ShiftlContext ctx) {
		asis(ctx);
	}

	public void enterLess(SPOTParser.LessContext ctx) {
		asis(ctx);
	}

	public void enterMore(SPOTParser.MoreContext ctx) {
		asis(ctx);
	}

	public void enterLeeq(SPOTParser.LeeqContext ctx) {
		asis(ctx);
	}

	public void enterMoeq(SPOTParser.MoeqContext ctx) {
		asis(ctx);
	}

	public void enterEqeq(SPOTParser.EqeqContext ctx) {
		asis(ctx);
	}

	public void enterNoteq(SPOTParser.NoteqContext ctx) {
		asis(ctx);
	}

	public void enterAnd(SPOTParser.AndContext ctx) {
		asis(ctx);
	}

	public void enterCaret(SPOTParser.CaretContext ctx) {
		asis(ctx);
	}

	public void enterOr(SPOTParser.OrContext ctx) {
		asis(ctx);
	}

	public void enterAndand(SPOTParser.AndandContext ctx) {
		asis(ctx);
	}

	public void enterOror(SPOTParser.OrorContext ctx) {
		asis(ctx);
	}

	public void enterQuestion(SPOTParser.QuestionContext ctx) {
		asis(ctx);
	}

	public void enterSemi(SPOTParser.SemiContext ctx) {
		asis(ctx);
	}

	public void enterEq(SPOTParser.EqContext ctx) {
		asis(ctx);
	}

	public void enterComa(SPOTParser.ComaContext ctx) {
		asis(ctx);
	}

	public void enterAssignmentOperator(SPOTParser.AssignmentOperatorContext ctx) {
		asis(ctx);
	}
}
