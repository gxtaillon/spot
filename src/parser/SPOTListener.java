// Generated from SPOT.g4 by ANTLR 4.1

    package parser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SPOTParser}.
 */
public interface SPOTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SPOTParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(@NotNull SPOTParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(@NotNull SPOTParser.DeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#noteq}.
	 * @param ctx the parse tree
	 */
	void enterNoteq(@NotNull SPOTParser.NoteqContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#noteq}.
	 * @param ctx the parse tree
	 */
	void exitNoteq(@NotNull SPOTParser.NoteqContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(@NotNull SPOTParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(@NotNull SPOTParser.ExpressionStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#designation}.
	 * @param ctx the parse tree
	 */
	void enterDesignation(@NotNull SPOTParser.DesignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#designation}.
	 * @param ctx the parse tree
	 */
	void exitDesignation(@NotNull SPOTParser.DesignationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void enterNestedParenthesesBlock(@NotNull SPOTParser.NestedParenthesesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void exitNestedParenthesesBlock(@NotNull SPOTParser.NestedParenthesesBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(@NotNull SPOTParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(@NotNull SPOTParser.DesignatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(@NotNull SPOTParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(@NotNull SPOTParser.InitDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifierList(@NotNull SPOTParser.TypeQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifierList(@NotNull SPOTParser.TypeQualifierListContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(@NotNull SPOTParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(@NotNull SPOTParser.ParameterListContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(@NotNull SPOTParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(@NotNull SPOTParser.DeclarationListContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#postfixExpressionArgs}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpressionArgs(@NotNull SPOTParser.PostfixExpressionArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#postfixExpressionArgs}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpressionArgs(@NotNull SPOTParser.PostfixExpressionArgsContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#plus}.
	 * @param ctx the parse tree
	 */
	void enterPlus(@NotNull SPOTParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#plus}.
	 * @param ctx the parse tree
	 */
	void exitPlus(@NotNull SPOTParser.PlusContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#moeq}.
	 * @param ctx the parse tree
	 */
	void enterMoeq(@NotNull SPOTParser.MoeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#moeq}.
	 * @param ctx the parse tree
	 */
	void exitMoeq(@NotNull SPOTParser.MoeqContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(@NotNull SPOTParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(@NotNull SPOTParser.AssignmentExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(@NotNull SPOTParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(@NotNull SPOTParser.OrContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void enterGenericSelection(@NotNull SPOTParser.GenericSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void exitGenericSelection(@NotNull SPOTParser.GenericSelectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#mod}.
	 * @param ctx the parse tree
	 */
	void enterMod(@NotNull SPOTParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#mod}.
	 * @param ctx the parse tree
	 */
	void exitMod(@NotNull SPOTParser.ModContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(@NotNull SPOTParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(@NotNull SPOTParser.SelectionStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(@NotNull SPOTParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(@NotNull SPOTParser.ArgumentExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier(@NotNull SPOTParser.DeclarationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier(@NotNull SPOTParser.DeclarationSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentSpecifier(@NotNull SPOTParser.AlignmentSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentSpecifier(@NotNull SPOTParser.AlignmentSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(@NotNull SPOTParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(@NotNull SPOTParser.ExclusiveOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(@NotNull SPOTParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(@NotNull SPOTParser.UnaryOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(@NotNull SPOTParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(@NotNull SPOTParser.FunctionDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#functionDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarator(@NotNull SPOTParser.FunctionDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#functionDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarator(@NotNull SPOTParser.FunctionDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(@NotNull SPOTParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(@NotNull SPOTParser.ConstantExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers(@NotNull SPOTParser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers(@NotNull SPOTParser.DeclarationSpecifiersContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(@NotNull SPOTParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(@NotNull SPOTParser.PointerContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(@NotNull SPOTParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(@NotNull SPOTParser.InitializerListContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#leeq}.
	 * @param ctx the parse tree
	 */
	void enterLeeq(@NotNull SPOTParser.LeeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#leeq}.
	 * @param ctx the parse tree
	 */
	void exitLeeq(@NotNull SPOTParser.LeeqContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssertDeclaration(@NotNull SPOTParser.StaticAssertDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssertDeclaration(@NotNull SPOTParser.StaticAssertDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator(@NotNull SPOTParser.DirectDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator(@NotNull SPOTParser.DirectDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeSpecifier(@NotNull SPOTParser.GccAttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeSpecifier(@NotNull SPOTParser.GccAttributeSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(@NotNull SPOTParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(@NotNull SPOTParser.ConditionalExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(@NotNull SPOTParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(@NotNull SPOTParser.AndExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#eqeq}.
	 * @param ctx the parse tree
	 */
	void enterEqeq(@NotNull SPOTParser.EqeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#eqeq}.
	 * @param ctx the parse tree
	 */
	void exitEqeq(@NotNull SPOTParser.EqeqContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void enterGccDeclaratorExtension(@NotNull SPOTParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void exitGccDeclaratorExtension(@NotNull SPOTParser.GccDeclaratorExtensionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(@NotNull SPOTParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(@NotNull SPOTParser.IterationStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeList(@NotNull SPOTParser.GccAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeList(@NotNull SPOTParser.GccAttributeListContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(@NotNull SPOTParser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(@NotNull SPOTParser.EnumeratorListContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(@NotNull SPOTParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(@NotNull SPOTParser.CompoundStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#star}.
	 * @param ctx the parse tree
	 */
	void enterStar(@NotNull SPOTParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#star}.
	 * @param ctx the parse tree
	 */
	void exitStar(@NotNull SPOTParser.StarContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull SPOTParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull SPOTParser.ClassDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(@NotNull SPOTParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(@NotNull SPOTParser.BlockItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#semi}.
	 * @param ctx the parse tree
	 */
	void enterSemi(@NotNull SPOTParser.SemiContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#semi}.
	 * @param ctx the parse tree
	 */
	void exitSemi(@NotNull SPOTParser.SemiContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(@NotNull SPOTParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(@NotNull SPOTParser.LogicalAndExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#coma}.
	 * @param ctx the parse tree
	 */
	void enterComa(@NotNull SPOTParser.ComaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#coma}.
	 * @param ctx the parse tree
	 */
	void exitComa(@NotNull SPOTParser.ComaContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(@NotNull SPOTParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(@NotNull SPOTParser.LogicalOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(@NotNull SPOTParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(@NotNull SPOTParser.InclusiveOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssocList(@NotNull SPOTParser.GenericAssocListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssocList(@NotNull SPOTParser.GenericAssocListContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(@NotNull SPOTParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(@NotNull SPOTParser.TypeNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#caret}.
	 * @param ctx the parse tree
	 */
	void enterCaret(@NotNull SPOTParser.CaretContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#caret}.
	 * @param ctx the parse tree
	 */
	void exitCaret(@NotNull SPOTParser.CaretContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(@NotNull SPOTParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(@NotNull SPOTParser.EqualityExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#postfixExpressionDot}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpressionDot(@NotNull SPOTParser.PostfixExpressionDotContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#postfixExpressionDot}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpressionDot(@NotNull SPOTParser.PostfixExpressionDotContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(@NotNull SPOTParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(@NotNull SPOTParser.CastExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterSpecifierQualifierList(@NotNull SPOTParser.SpecifierQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitSpecifierQualifierList(@NotNull SPOTParser.SpecifierQualifierListContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalDeclaration(@NotNull SPOTParser.ExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalDeclaration(@NotNull SPOTParser.ExternalDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(@NotNull SPOTParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(@NotNull SPOTParser.InitDeclaratorListContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#eq}.
	 * @param ctx the parse tree
	 */
	void enterEq(@NotNull SPOTParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#eq}.
	 * @param ctx the parse tree
	 */
	void exitEq(@NotNull SPOTParser.EqContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(@NotNull SPOTParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(@NotNull SPOTParser.InitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull SPOTParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull SPOTParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#classInheritanceSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterClassInheritanceSpecifier(@NotNull SPOTParser.ClassInheritanceSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#classInheritanceSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitClassInheritanceSpecifier(@NotNull SPOTParser.ClassInheritanceSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(@NotNull SPOTParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(@NotNull SPOTParser.UnaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(@NotNull SPOTParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(@NotNull SPOTParser.ParameterDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeList(@NotNull SPOTParser.ParameterTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeList(@NotNull SPOTParser.ParameterTypeListContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(@NotNull SPOTParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(@NotNull SPOTParser.PrimaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(@NotNull SPOTParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(@NotNull SPOTParser.StorageClassSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#more}.
	 * @param ctx the parse tree
	 */
	void enterMore(@NotNull SPOTParser.MoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#more}.
	 * @param ctx the parse tree
	 */
	void exitMore(@NotNull SPOTParser.MoreContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(@NotNull SPOTParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(@NotNull SPOTParser.EnumeratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(@NotNull SPOTParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(@NotNull SPOTParser.ShiftExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(@NotNull SPOTParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(@NotNull SPOTParser.BlockItemListContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(@NotNull SPOTParser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(@NotNull SPOTParser.TypedefNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#classDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarationList(@NotNull SPOTParser.ClassDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#classDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarationList(@NotNull SPOTParser.ClassDeclarationListContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#minus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(@NotNull SPOTParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#minus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(@NotNull SPOTParser.MinusContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull SPOTParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull SPOTParser.DeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#classSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterClassSpecifier(@NotNull SPOTParser.ClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#classSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitClassSpecifier(@NotNull SPOTParser.ClassSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorList(@NotNull SPOTParser.DesignatorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorList(@NotNull SPOTParser.DesignatorListContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#shiftr}.
	 * @param ctx the parse tree
	 */
	void enterShiftr(@NotNull SPOTParser.ShiftrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#shiftr}.
	 * @param ctx the parse tree
	 */
	void exitShiftr(@NotNull SPOTParser.ShiftrContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(@NotNull SPOTParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(@NotNull SPOTParser.AdditiveExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#rpar}.
	 * @param ctx the parse tree
	 */
	void enterRpar(@NotNull SPOTParser.RparContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#rpar}.
	 * @param ctx the parse tree
	 */
	void exitRpar(@NotNull SPOTParser.RparContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(@NotNull SPOTParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(@NotNull SPOTParser.PostfixExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(@NotNull SPOTParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(@NotNull SPOTParser.AndContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull SPOTParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull SPOTParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssociation(@NotNull SPOTParser.GenericAssociationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssociation(@NotNull SPOTParser.GenericAssociationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#lpar}.
	 * @param ctx the parse tree
	 */
	void enterLpar(@NotNull SPOTParser.LparContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#lpar}.
	 * @param ctx the parse tree
	 */
	void exitLpar(@NotNull SPOTParser.LparContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#typeAccessQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeAccessQualifier(@NotNull SPOTParser.TypeAccessQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#typeAccessQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeAccessQualifier(@NotNull SPOTParser.TypeAccessQualifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#shiftl}.
	 * @param ctx the parse tree
	 */
	void enterShiftl(@NotNull SPOTParser.ShiftlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#shiftl}.
	 * @param ctx the parse tree
	 */
	void exitShiftl(@NotNull SPOTParser.ShiftlContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(@NotNull SPOTParser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(@NotNull SPOTParser.EnumSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(@NotNull SPOTParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(@NotNull SPOTParser.MultiplicativeExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(@NotNull SPOTParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(@NotNull SPOTParser.AssignmentOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers2(@NotNull SPOTParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers2(@NotNull SPOTParser.DeclarationSpecifiers2Context ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTypeSpecifier(@NotNull SPOTParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTypeSpecifier(@NotNull SPOTParser.AtomicTypeSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull SPOTParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull SPOTParser.CompilationUnitContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(@NotNull SPOTParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(@NotNull SPOTParser.DivContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(@NotNull SPOTParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(@NotNull SPOTParser.TypeSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(@NotNull SPOTParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(@NotNull SPOTParser.IdentifierListContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectAbstractDeclarator(@NotNull SPOTParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectAbstractDeclarator(@NotNull SPOTParser.DirectAbstractDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(@NotNull SPOTParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(@NotNull SPOTParser.TranslationUnitContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(@NotNull SPOTParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(@NotNull SPOTParser.LabeledStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(@NotNull SPOTParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(@NotNull SPOTParser.RelationalExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationConstant(@NotNull SPOTParser.EnumerationConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationConstant(@NotNull SPOTParser.EnumerationConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void enterGccAttribute(@NotNull SPOTParser.GccAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void exitGccAttribute(@NotNull SPOTParser.GccAttributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(@NotNull SPOTParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(@NotNull SPOTParser.QuestionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#oror}.
	 * @param ctx the parse tree
	 */
	void enterOror(@NotNull SPOTParser.OrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#oror}.
	 * @param ctx the parse tree
	 */
	void exitOror(@NotNull SPOTParser.OrorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#andand}.
	 * @param ctx the parse tree
	 */
	void enterAndand(@NotNull SPOTParser.AndandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#andand}.
	 * @param ctx the parse tree
	 */
	void exitAndand(@NotNull SPOTParser.AndandContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(@NotNull SPOTParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(@NotNull SPOTParser.TypeQualifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#less}.
	 * @param ctx the parse tree
	 */
	void enterLess(@NotNull SPOTParser.LessContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#less}.
	 * @param ctx the parse tree
	 */
	void exitLess(@NotNull SPOTParser.LessContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#tagSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTagSpecifier(@NotNull SPOTParser.TagSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#tagSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTagSpecifier(@NotNull SPOTParser.TagSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(@NotNull SPOTParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(@NotNull SPOTParser.JumpStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(@NotNull SPOTParser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(@NotNull SPOTParser.AbstractDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPOTParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecifier(@NotNull SPOTParser.FunctionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPOTParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecifier(@NotNull SPOTParser.FunctionSpecifierContext ctx);
}