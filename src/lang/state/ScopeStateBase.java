package lang.state;

import org.antlr.v4.runtime.tree.*;

import parser.*;
import lang.*;

public abstract class ScopeStateBase {
	protected StringBuilder currentBuilder;
	protected Scope currentScope;
	protected ScopeStateBase previousState;

	public void visitTerminal(TerminalNode node) {
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
}
