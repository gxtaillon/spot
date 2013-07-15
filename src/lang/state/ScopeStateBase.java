package lang.state;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.*;

import parser.*;
import util.state.IState;
import util.state.IStateful;
import lang.*;
import main.ExtractPawnListener;

public abstract class ScopeStateBase implements IState {
	protected StringBuilder currentBuilder;
	protected Scope currentScope;
	protected ScopeStateBase previousState;
	private IStateful source;

	public ScopeStateBase(IStateful _source) {
		source = _source;
		currentBuilder = new StringBuilder();
		currentScope = new Scope();
		previousState = null;
	}

	public IStateful getSource() {
		return source;
	}

	public ExtractPawnListener getSourceListener() {
		return (ExtractPawnListener) source;
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
	
	public void visitTerminal(TerminalNode node) {
		if (node.getText().startsWith("#")) {
			asis(node, "\n");
		}		
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

	}

	public void enterLpar(SPOTParser.LparContext ctx) {

	}

	public void enterRpar(SPOTParser.RparContext ctx) {

	}

	public void enterStar(SPOTParser.StarContext ctx) {

	}

	public void enterDiv(SPOTParser.DivContext ctx) {

	}

	public void enterMod(SPOTParser.ModContext ctx) {

	}

	public void enterPlus(SPOTParser.PlusContext ctx) {

	}

	public void enterMinus(SPOTParser.MinusContext ctx) {

	}

	public void enterShiftr(SPOTParser.ShiftrContext ctx) {

	}

	public void enterShiftl(SPOTParser.ShiftlContext ctx) {

	}

	public void enterLess(SPOTParser.LessContext ctx) {

	}

	public void enterMore(SPOTParser.MoreContext ctx) {

	}

	public void enterLeeq(SPOTParser.LeeqContext ctx) {

	}

	public void enterMoeq(SPOTParser.MoeqContext ctx) {

	}

	public void enterEqeq(SPOTParser.EqeqContext ctx) {

	}

	public void enterNoteq(SPOTParser.NoteqContext ctx) {

	}

	public void enterAnd(SPOTParser.AndContext ctx) {

	}

	public void enterCaret(SPOTParser.CaretContext ctx) {

	}

	public void enterOr(SPOTParser.OrContext ctx) {

	}

	public void enterAndand(SPOTParser.AndandContext ctx) {

	}

	public void enterOror(SPOTParser.OrorContext ctx) {

	}

	public void enterQuestion(SPOTParser.QuestionContext ctx) {

	}

	public void enterSemi(SPOTParser.SemiContext ctx) {

	}

	public void enterEq(SPOTParser.EqContext ctx) {

	}

	public void enterComa(SPOTParser.ComaContext ctx) {

	}

	public void enterAssignmentOperator(SPOTParser.AssignmentOperatorContext ctx) {

	}
}
