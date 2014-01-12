package spot.main;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import spot.lang.state.SSGlobal;
import spot.lang.state.ScopeStateBase;
import spot.parser.*;
import spot.parser.SPOTParser.AbstractDeclaratorContext;
import spot.parser.SPOTParser.AdditiveExpressionContext;
import spot.parser.SPOTParser.AlignmentSpecifierContext;
import spot.parser.SPOTParser.AndContext;
import spot.parser.SPOTParser.AndExpressionContext;
import spot.parser.SPOTParser.AndandContext;
import spot.parser.SPOTParser.ArgumentExpressionListContext;
import spot.parser.SPOTParser.AssignmentExpressionContext;
import spot.parser.SPOTParser.AssignmentOperatorContext;
import spot.parser.SPOTParser.AtContext;
import spot.parser.SPOTParser.AtomicTypeSpecifierContext;
import spot.parser.SPOTParser.BbreakContext;
import spot.parser.SPOTParser.BlockItemContext;
import spot.parser.SPOTParser.BlockItemListContext;
import spot.parser.SPOTParser.CaretContext;
import spot.parser.SPOTParser.CastExpressionContext;
import spot.parser.SPOTParser.CcontinueContext;
import spot.parser.SPOTParser.ClassDeclarationContext;
import spot.parser.SPOTParser.ClassDeclarationListContext;
import spot.parser.SPOTParser.ClassInheritanceSpecifierContext;
import spot.parser.SPOTParser.ClassSpecifierContext;
import spot.parser.SPOTParser.ClassVisibilityContext;
import spot.parser.SPOTParser.ColonContext;
import spot.parser.SPOTParser.ComaContext;
import spot.parser.SPOTParser.CompilationUnitContext;
import spot.parser.SPOTParser.CompoundStatementContext;
import spot.parser.SPOTParser.ConditionalExpressionContext;
import spot.parser.SPOTParser.ConstantExpressionContext;
import spot.parser.SPOTParser.DeclarationContext;
import spot.parser.SPOTParser.DeclarationListContext;
import spot.parser.SPOTParser.DeclarationSpecifierContext;
import spot.parser.SPOTParser.DeclarationSpecifiers2Context;
import spot.parser.SPOTParser.DeclarationSpecifiersContext;
import spot.parser.SPOTParser.DeclaratorContext;
import spot.parser.SPOTParser.DesignationContext;
import spot.parser.SPOTParser.DesignatorContext;
import spot.parser.SPOTParser.DesignatorListContext;
import spot.parser.SPOTParser.DirectAbstractDeclaratorContext;
import spot.parser.SPOTParser.DirectDeclaratorContext;
import spot.parser.SPOTParser.DivContext;
import spot.parser.SPOTParser.EnumSpecifierContext;
import spot.parser.SPOTParser.EnumerationConstantContext;
import spot.parser.SPOTParser.EnumeratorContext;
import spot.parser.SPOTParser.EnumeratorListContext;
import spot.parser.SPOTParser.EqContext;
import spot.parser.SPOTParser.EqeqContext;
import spot.parser.SPOTParser.EqualityExpressionContext;
import spot.parser.SPOTParser.ExclusiveOrExpressionContext;
import spot.parser.SPOTParser.ExpressionContext;
import spot.parser.SPOTParser.ExpressionStatementContext;
import spot.parser.SPOTParser.ExternalDeclarationContext;
import spot.parser.SPOTParser.FunctionDeclaratorContext;
import spot.parser.SPOTParser.FunctionDefinitionContext;
import spot.parser.SPOTParser.FunctionSpecifierContext;
import spot.parser.SPOTParser.GccAttributeContext;
import spot.parser.SPOTParser.GccAttributeListContext;
import spot.parser.SPOTParser.GccAttributeSpecifierContext;
import spot.parser.SPOTParser.GccDeclaratorExtensionContext;
import spot.parser.SPOTParser.GenericAssocListContext;
import spot.parser.SPOTParser.GenericAssociationContext;
import spot.parser.SPOTParser.GenericSelectionContext;
import spot.parser.SPOTParser.GgotoContext;
import spot.parser.SPOTParser.IdentifierListContext;
import spot.parser.SPOTParser.InclusiveOrExpressionContext;
import spot.parser.SPOTParser.InitDeclaratorContext;
import spot.parser.SPOTParser.InitDeclaratorListContext;
import spot.parser.SPOTParser.InitializerContext;
import spot.parser.SPOTParser.InitializerListContext;
import spot.parser.SPOTParser.IterationStatementContext;
import spot.parser.SPOTParser.JumpStatementContext;
import spot.parser.SPOTParser.LabeledStatementContext;
import spot.parser.SPOTParser.LeeqContext;
import spot.parser.SPOTParser.LessContext;
import spot.parser.SPOTParser.LogicalAndExpressionContext;
import spot.parser.SPOTParser.LogicalOrExpressionContext;
import spot.parser.SPOTParser.LparContext;
import spot.parser.SPOTParser.MinusContext;
import spot.parser.SPOTParser.ModContext;
import spot.parser.SPOTParser.MoeqContext;
import spot.parser.SPOTParser.MoreContext;
import spot.parser.SPOTParser.MultiplicativeExpressionContext;
import spot.parser.SPOTParser.NestedParenthesesBlockContext;
import spot.parser.SPOTParser.NoteqContext;
import spot.parser.SPOTParser.NtconstantContext;
import spot.parser.SPOTParser.OrContext;
import spot.parser.SPOTParser.OrorContext;
import spot.parser.SPOTParser.ParameterDeclarationContext;
import spot.parser.SPOTParser.ParameterListContext;
import spot.parser.SPOTParser.ParameterTypeListContext;
import spot.parser.SPOTParser.PlusContext;
import spot.parser.SPOTParser.PointerContext;
import spot.parser.SPOTParser.PostfixExpressionArgsContext;
import spot.parser.SPOTParser.PostfixExpressionContext;
import spot.parser.SPOTParser.PostfixExpressionDotContext;
import spot.parser.SPOTParser.PrimaryExpressionContext;
import spot.parser.SPOTParser.QuestionContext;
import spot.parser.SPOTParser.RelationalExpressionContext;
import spot.parser.SPOTParser.RparContext;
import spot.parser.SPOTParser.RreturnContext;
import spot.parser.SPOTParser.SelectionStatementContext;
import spot.parser.SPOTParser.SemiContext;
import spot.parser.SPOTParser.ShiftExpressionContext;
import spot.parser.SPOTParser.ShiftlContext;
import spot.parser.SPOTParser.ShiftrContext;
import spot.parser.SPOTParser.SpecifierQualifierListContext;
import spot.parser.SPOTParser.Spo_privateContext;
import spot.parser.SPOTParser.Spo_protectedContext;
import spot.parser.SPOTParser.Spo_publicContext;
import spot.parser.SPOTParser.StarContext;
import spot.parser.SPOTParser.StatementContext;
import spot.parser.SPOTParser.StaticAssertDeclarationContext;
import spot.parser.SPOTParser.StorageClassSpecifierContext;
import spot.parser.SPOTParser.TagSpecifierContext;
import spot.parser.SPOTParser.TranslationUnitContext;
import spot.parser.SPOTParser.TypeAccessQualifierContext;
import spot.parser.SPOTParser.TypeNameContext;
import spot.parser.SPOTParser.TypeQualifierContext;
import spot.parser.SPOTParser.TypeQualifierListContext;
import spot.parser.SPOTParser.TypeSpecifierContext;
import spot.parser.SPOTParser.TypedefNameContext;
import spot.parser.SPOTParser.UnaryExpressionContext;
import spot.parser.SPOTParser.UnaryOperatorContext;
import spot.util.state.IState;

public class StatefulPawnExtractor extends SPOTBaseListener implements
        IStatefulExtractor {
    private SPOTParser parser;
    private ExtractorConfig config;
    private ScopeStateBase currentState;

    public StatefulPawnExtractor(SPOTParser _parser, ExtractorConfig _config) {
        parser = _parser;
        config = _config;
        setState(new SSGlobal(this));
    }

    @Override
    public void setState(IState state) {
        currentState = (ScopeStateBase) state;
    }

    @Override
    public SPOTParser getParser() {
        return parser;
    }

    @Override
    public ExtractorConfig getConfig() {
        return config;
    }

    @Override
    public ScopeStateBase getCurrentState() {
        return currentState;
    }

    // When adding/removing the grammar rules, just remove everything between
    // BEGIN/END GRAMMAR RULES and go to Source>Override/Implement, select all
    // but the 2 visit functions then use a find/replace with the following
    // regexes.
    // Find: (((enter|exit).*?)\(((\s*\r?\n)*.*?)\{)((\s*\r?\n)*.*?)*\}
    // Rep: $1\r\ncurrentState.$2(ctx);\r\n}
    // You should format the document afterwards.

    // BEGIN GRAMMAR RULES

    @Override
    public String getTranslation() {
        return currentState.getCurrentBuilder().toString();
    }

    @Override
    public void enterDeclarator(DeclaratorContext ctx) {
        currentState.enterDeclarator(ctx);
    }

    @Override
    public void exitDeclarator(DeclaratorContext ctx) {
        currentState.exitDeclarator(ctx);
    }

    @Override
    public void enterNoteq(NoteqContext ctx) {
        currentState.enterNoteq(ctx);
    }

    @Override
    public void exitNoteq(NoteqContext ctx) {
        currentState.exitNoteq(ctx);
    }

    @Override
    public void enterExpressionStatement(ExpressionStatementContext ctx) {
        currentState.enterExpressionStatement(ctx);
    }

    @Override
    public void exitExpressionStatement(ExpressionStatementContext ctx) {
        currentState.exitExpressionStatement(ctx);
    }

    @Override
    public void enterDesignation(DesignationContext ctx) {
        currentState.enterDesignation(ctx);
    }

    @Override
    public void exitDesignation(DesignationContext ctx) {
        currentState.exitDesignation(ctx);
    }

    @Override
    public void enterClassVisibility(ClassVisibilityContext ctx) {
        currentState.enterClassVisibility(ctx);
    }

    @Override
    public void exitClassVisibility(ClassVisibilityContext ctx) {
        currentState.exitClassVisibility(ctx);
    }

    @Override
    public void enterNestedParenthesesBlock(NestedParenthesesBlockContext ctx) {
        currentState.enterNestedParenthesesBlock(ctx);
    }

    @Override
    public void exitNestedParenthesesBlock(NestedParenthesesBlockContext ctx) {
        currentState.exitNestedParenthesesBlock(ctx);
    }

    @Override
    public void enterDesignator(DesignatorContext ctx) {
        currentState.enterDesignator(ctx);
    }

    @Override
    public void exitDesignator(DesignatorContext ctx) {
        currentState.exitDesignator(ctx);
    }

    @Override
    public void enterInitDeclarator(InitDeclaratorContext ctx) {
        currentState.enterInitDeclarator(ctx);
    }

    @Override
    public void exitInitDeclarator(InitDeclaratorContext ctx) {
        currentState.exitInitDeclarator(ctx);
    }

    @Override
    public void enterTypeQualifierList(TypeQualifierListContext ctx) {
        currentState.enterTypeQualifierList(ctx);
    }

    @Override
    public void exitTypeQualifierList(TypeQualifierListContext ctx) {
        currentState.exitTypeQualifierList(ctx);
    }

    @Override
    public void enterRreturn(RreturnContext ctx) {
        currentState.enterRreturn(ctx);
    }

    @Override
    public void exitRreturn(RreturnContext ctx) {
        currentState.exitRreturn(ctx);
    }

    @Override
    public void enterParameterList(ParameterListContext ctx) {
        currentState.enterParameterList(ctx);
    }

    @Override
    public void exitParameterList(ParameterListContext ctx) {
        currentState.exitParameterList(ctx);
    }

    @Override
    public void enterDeclarationList(DeclarationListContext ctx) {
        currentState.enterDeclarationList(ctx);
    }

    @Override
    public void exitDeclarationList(DeclarationListContext ctx) {
        currentState.exitDeclarationList(ctx);
    }

    @Override
    public void enterPostfixExpressionArgs(PostfixExpressionArgsContext ctx) {
        currentState.enterPostfixExpressionArgs(ctx);
    }

    @Override
    public void exitPostfixExpressionArgs(PostfixExpressionArgsContext ctx) {
        currentState.exitPostfixExpressionArgs(ctx);
    }

    @Override
    public void enterPlus(PlusContext ctx) {
        currentState.enterPlus(ctx);
    }

    @Override
    public void exitPlus(PlusContext ctx) {
        currentState.exitPlus(ctx);
    }

    @Override
    public void enterMoeq(MoeqContext ctx) {
        currentState.enterMoeq(ctx);
    }

    @Override
    public void exitMoeq(MoeqContext ctx) {
        currentState.exitMoeq(ctx);
    }

    @Override
    public void enterAssignmentExpression(AssignmentExpressionContext ctx) {
        currentState.enterAssignmentExpression(ctx);
    }

    @Override
    public void exitAssignmentExpression(AssignmentExpressionContext ctx) {
        currentState.exitAssignmentExpression(ctx);
    }

    @Override
    public void enterOr(OrContext ctx) {
        currentState.enterOr(ctx);
    }

    @Override
    public void exitOr(OrContext ctx) {
        currentState.exitOr(ctx);
    }

    @Override
    public void enterGenericSelection(GenericSelectionContext ctx) {
        currentState.enterGenericSelection(ctx);
    }

    @Override
    public void exitGenericSelection(GenericSelectionContext ctx) {
        currentState.exitGenericSelection(ctx);
    }

    @Override
    public void enterMod(ModContext ctx) {
        currentState.enterMod(ctx);
    }

    @Override
    public void exitMod(ModContext ctx) {
        currentState.exitMod(ctx);
    }

    @Override
    public void enterSelectionStatement(SelectionStatementContext ctx) {
        currentState.enterSelectionStatement(ctx);
    }

    @Override
    public void exitSelectionStatement(SelectionStatementContext ctx) {
        currentState.exitSelectionStatement(ctx);
    }

    @Override
    public void enterArgumentExpressionList(ArgumentExpressionListContext ctx) {
        currentState.enterArgumentExpressionList(ctx);
    }

    @Override
    public void exitArgumentExpressionList(ArgumentExpressionListContext ctx) {
        currentState.exitArgumentExpressionList(ctx);
    }

    @Override
    public void enterDeclarationSpecifier(DeclarationSpecifierContext ctx) {
        currentState.enterDeclarationSpecifier(ctx);
    }

    @Override
    public void exitDeclarationSpecifier(DeclarationSpecifierContext ctx) {
        currentState.exitDeclarationSpecifier(ctx);
    }

    @Override
    public void enterAlignmentSpecifier(AlignmentSpecifierContext ctx) {
        currentState.enterAlignmentSpecifier(ctx);
    }

    @Override
    public void exitAlignmentSpecifier(AlignmentSpecifierContext ctx) {
        currentState.exitAlignmentSpecifier(ctx);
    }

    @Override
    public void enterSpo_private(Spo_privateContext ctx) {
        currentState.enterSpo_private(ctx);
    }

    @Override
    public void exitSpo_private(Spo_privateContext ctx) {
        currentState.exitSpo_private(ctx);
    }

    @Override
    public void enterExclusiveOrExpression(ExclusiveOrExpressionContext ctx) {
        currentState.enterExclusiveOrExpression(ctx);
    }

    @Override
    public void exitExclusiveOrExpression(ExclusiveOrExpressionContext ctx) {
        currentState.exitExclusiveOrExpression(ctx);
    }

    @Override
    public void enterUnaryOperator(UnaryOperatorContext ctx) {
        currentState.enterUnaryOperator(ctx);
    }

    @Override
    public void exitUnaryOperator(UnaryOperatorContext ctx) {
        currentState.exitUnaryOperator(ctx);
    }

    @Override
    public void enterFunctionDefinition(FunctionDefinitionContext ctx) {
        currentState.enterFunctionDefinition(ctx);
    }

    @Override
    public void exitFunctionDefinition(FunctionDefinitionContext ctx) {
        currentState.exitFunctionDefinition(ctx);
    }

    @Override
    public void enterFunctionDeclarator(FunctionDeclaratorContext ctx) {
        currentState.enterFunctionDeclarator(ctx);
    }

    @Override
    public void exitFunctionDeclarator(FunctionDeclaratorContext ctx) {
        currentState.exitFunctionDeclarator(ctx);
    }

    @Override
    public void enterConstantExpression(ConstantExpressionContext ctx) {
        currentState.enterConstantExpression(ctx);
    }

    @Override
    public void exitConstantExpression(ConstantExpressionContext ctx) {
        currentState.exitConstantExpression(ctx);
    }

    @Override
    public void enterInitializerList(InitializerListContext ctx) {
        currentState.enterInitializerList(ctx);
    }

    @Override
    public void exitInitializerList(InitializerListContext ctx) {
        currentState.exitInitializerList(ctx);
    }

    @Override
    public void enterDeclarationSpecifiers(DeclarationSpecifiersContext ctx) {
        currentState.enterDeclarationSpecifiers(ctx);
    }

    @Override
    public void exitDeclarationSpecifiers(DeclarationSpecifiersContext ctx) {
        currentState.exitDeclarationSpecifiers(ctx);
    }

    @Override
    public void enterPointer(PointerContext ctx) {
        currentState.enterPointer(ctx);
    }

    @Override
    public void exitPointer(PointerContext ctx) {
        currentState.exitPointer(ctx);
    }

    @Override
    public void enterLeeq(LeeqContext ctx) {
        currentState.enterLeeq(ctx);
    }

    @Override
    public void exitLeeq(LeeqContext ctx) {
        currentState.exitLeeq(ctx);
    }

    @Override
    public void enterStaticAssertDeclaration(StaticAssertDeclarationContext ctx) {
        currentState.enterStaticAssertDeclaration(ctx);
    }

    @Override
    public void exitStaticAssertDeclaration(StaticAssertDeclarationContext ctx) {
        currentState.exitStaticAssertDeclaration(ctx);
    }

    @Override
    public void enterGgoto(GgotoContext ctx) {
        currentState.enterGgoto(ctx);
    }

    @Override
    public void exitGgoto(GgotoContext ctx) {
        currentState.exitGgoto(ctx);
    }

    @Override
    public void enterDirectDeclarator(DirectDeclaratorContext ctx) {
        currentState.enterDirectDeclarator(ctx);
    }

    @Override
    public void exitDirectDeclarator(DirectDeclaratorContext ctx) {
        currentState.exitDirectDeclarator(ctx);
    }

    @Override
    public void enterGccAttributeSpecifier(GccAttributeSpecifierContext ctx) {
        currentState.enterGccAttributeSpecifier(ctx);
    }

    @Override
    public void exitGccAttributeSpecifier(GccAttributeSpecifierContext ctx) {
        currentState.exitGccAttributeSpecifier(ctx);
    }

    @Override
    public void enterConditionalExpression(ConditionalExpressionContext ctx) {
        currentState.enterConditionalExpression(ctx);
    }

    @Override
    public void exitConditionalExpression(ConditionalExpressionContext ctx) {
        currentState.exitConditionalExpression(ctx);
    }

    @Override
    public void enterAndExpression(AndExpressionContext ctx) {
        currentState.enterAndExpression(ctx);
    }

    @Override
    public void exitAndExpression(AndExpressionContext ctx) {
        currentState.exitAndExpression(ctx);
    }

    @Override
    public void enterEqeq(EqeqContext ctx) {
        currentState.enterEqeq(ctx);
    }

    @Override
    public void exitEqeq(EqeqContext ctx) {
        currentState.exitEqeq(ctx);
    }

    @Override
    public void enterCcontinue(CcontinueContext ctx) {
        currentState.enterCcontinue(ctx);
    }

    @Override
    public void exitCcontinue(CcontinueContext ctx) {
        currentState.exitCcontinue(ctx);
    }

    @Override
    public void enterGccDeclaratorExtension(GccDeclaratorExtensionContext ctx) {
        currentState.enterGccDeclaratorExtension(ctx);
    }

    @Override
    public void exitGccDeclaratorExtension(GccDeclaratorExtensionContext ctx) {
        currentState.exitGccDeclaratorExtension(ctx);
    }

    @Override
    public void enterIterationStatement(IterationStatementContext ctx) {
        currentState.enterIterationStatement(ctx);
    }

    @Override
    public void exitIterationStatement(IterationStatementContext ctx) {
        currentState.exitIterationStatement(ctx);
    }

    @Override
    public void enterGccAttributeList(GccAttributeListContext ctx) {
        currentState.enterGccAttributeList(ctx);
    }

    @Override
    public void exitGccAttributeList(GccAttributeListContext ctx) {
        currentState.exitGccAttributeList(ctx);
    }

    @Override
    public void enterEnumeratorList(EnumeratorListContext ctx) {
        currentState.enterEnumeratorList(ctx);
    }

    @Override
    public void exitEnumeratorList(EnumeratorListContext ctx) {
        currentState.exitEnumeratorList(ctx);
    }

    @Override
    public void enterBbreak(BbreakContext ctx) {
        currentState.enterBbreak(ctx);
    }

    @Override
    public void exitBbreak(BbreakContext ctx) {
        currentState.exitBbreak(ctx);
    }

    @Override
    public void enterCompoundStatement(CompoundStatementContext ctx) {
        currentState.enterCompoundStatement(ctx);
    }

    @Override
    public void exitCompoundStatement(CompoundStatementContext ctx) {
        currentState.exitCompoundStatement(ctx);
    }

    @Override
    public void enterStar(StarContext ctx) {
        currentState.enterStar(ctx);
    }

    @Override
    public void exitStar(StarContext ctx) {
        currentState.exitStar(ctx);
    }

    @Override
    public void enterClassDeclaration(ClassDeclarationContext ctx) {
        currentState.enterClassDeclaration(ctx);
    }

    @Override
    public void exitClassDeclaration(ClassDeclarationContext ctx) {
        currentState.exitClassDeclaration(ctx);
    }

    @Override
    public void enterBlockItem(BlockItemContext ctx) {
        currentState.enterBlockItem(ctx);
    }

    @Override
    public void exitBlockItem(BlockItemContext ctx) {
        currentState.exitBlockItem(ctx);
    }

    @Override
    public void enterLogicalAndExpression(LogicalAndExpressionContext ctx) {
        currentState.enterLogicalAndExpression(ctx);
    }

    @Override
    public void exitLogicalAndExpression(LogicalAndExpressionContext ctx) {
        currentState.exitLogicalAndExpression(ctx);
    }

    @Override
    public void enterSemi(SemiContext ctx) {
        currentState.enterSemi(ctx);
    }

    @Override
    public void exitSemi(SemiContext ctx) {
        currentState.exitSemi(ctx);
    }

    @Override
    public void enterComa(ComaContext ctx) {
        currentState.enterComa(ctx);
    }

    @Override
    public void exitComa(ComaContext ctx) {
        currentState.exitComa(ctx);
    }

    @Override
    public void enterLogicalOrExpression(LogicalOrExpressionContext ctx) {
        currentState.enterLogicalOrExpression(ctx);
    }

    @Override
    public void exitLogicalOrExpression(LogicalOrExpressionContext ctx) {
        currentState.exitLogicalOrExpression(ctx);
    }

    @Override
    public void enterInclusiveOrExpression(InclusiveOrExpressionContext ctx) {
        currentState.enterInclusiveOrExpression(ctx);
    }

    @Override
    public void exitInclusiveOrExpression(InclusiveOrExpressionContext ctx) {
        currentState.exitInclusiveOrExpression(ctx);
    }

    @Override
    public void enterGenericAssocList(GenericAssocListContext ctx) {
        currentState.enterGenericAssocList(ctx);
    }

    @Override
    public void exitGenericAssocList(GenericAssocListContext ctx) {
        currentState.exitGenericAssocList(ctx);
    }

    @Override
    public void enterTypeName(TypeNameContext ctx) {
        currentState.enterTypeName(ctx);
    }

    @Override
    public void exitTypeName(TypeNameContext ctx) {
        currentState.exitTypeName(ctx);
    }

    @Override
    public void enterCaret(CaretContext ctx) {
        currentState.enterCaret(ctx);
    }

    @Override
    public void exitCaret(CaretContext ctx) {
        currentState.exitCaret(ctx);
    }

    @Override
    public void enterEqualityExpression(EqualityExpressionContext ctx) {
        currentState.enterEqualityExpression(ctx);
    }

    @Override
    public void exitEqualityExpression(EqualityExpressionContext ctx) {
        currentState.exitEqualityExpression(ctx);
    }

    @Override
    public void enterPostfixExpressionDot(PostfixExpressionDotContext ctx) {
        currentState.enterPostfixExpressionDot(ctx);
    }

    @Override
    public void exitPostfixExpressionDot(PostfixExpressionDotContext ctx) {
        currentState.exitPostfixExpressionDot(ctx);
    }

    @Override
    public void enterCastExpression(CastExpressionContext ctx) {
        currentState.enterCastExpression(ctx);
    }

    @Override
    public void exitCastExpression(CastExpressionContext ctx) {
        currentState.exitCastExpression(ctx);
    }

    @Override
    public void enterSpecifierQualifierList(SpecifierQualifierListContext ctx) {
        currentState.enterSpecifierQualifierList(ctx);
    }

    @Override
    public void exitSpecifierQualifierList(SpecifierQualifierListContext ctx) {
        currentState.exitSpecifierQualifierList(ctx);
    }

    @Override
    public void enterExternalDeclaration(ExternalDeclarationContext ctx) {
        currentState.enterExternalDeclaration(ctx);
    }

    @Override
    public void exitExternalDeclaration(ExternalDeclarationContext ctx) {
        currentState.exitExternalDeclaration(ctx);
    }

    @Override
    public void enterInitializer(InitializerContext ctx) {
        currentState.enterInitializer(ctx);
    }

    @Override
    public void exitInitializer(InitializerContext ctx) {
        currentState.exitInitializer(ctx);
    }

    @Override
    public void enterInitDeclaratorList(InitDeclaratorListContext ctx) {
        currentState.enterInitDeclaratorList(ctx);
    }

    @Override
    public void exitInitDeclaratorList(InitDeclaratorListContext ctx) {
        currentState.exitInitDeclaratorList(ctx);
    }

    @Override
    public void enterEq(EqContext ctx) {
        currentState.enterEq(ctx);
    }

    @Override
    public void exitEq(EqContext ctx) {
        currentState.exitEq(ctx);
    }

    @Override
    public void enterExpression(ExpressionContext ctx) {
        currentState.enterExpression(ctx);
    }

    @Override
    public void exitExpression(ExpressionContext ctx) {
        currentState.exitExpression(ctx);
    }

    @Override
    public void enterClassInheritanceSpecifier(ClassInheritanceSpecifierContext ctx) {
        currentState.enterClassInheritanceSpecifier(ctx);
    }

    @Override
    public void exitClassInheritanceSpecifier(ClassInheritanceSpecifierContext ctx) {
        currentState.exitClassInheritanceSpecifier(ctx);
    }

    @Override
    public void enterUnaryExpression(UnaryExpressionContext ctx) {
        currentState.enterUnaryExpression(ctx);
    }

    @Override
    public void exitUnaryExpression(UnaryExpressionContext ctx) {
        currentState.exitUnaryExpression(ctx);
    }

    @Override
    public void enterParameterDeclaration(ParameterDeclarationContext ctx) {
        currentState.enterParameterDeclaration(ctx);
    }

    @Override
    public void exitParameterDeclaration(ParameterDeclarationContext ctx) {
        currentState.exitParameterDeclaration(ctx);
    }

    @Override
    public void enterParameterTypeList(ParameterTypeListContext ctx) {
        currentState.enterParameterTypeList(ctx);
    }

    @Override
    public void exitParameterTypeList(ParameterTypeListContext ctx) {
        currentState.exitParameterTypeList(ctx);
    }

    @Override
    public void enterPrimaryExpression(PrimaryExpressionContext ctx) {
        currentState.enterPrimaryExpression(ctx);
    }

    @Override
    public void exitPrimaryExpression(PrimaryExpressionContext ctx) {
        currentState.exitPrimaryExpression(ctx);
    }

    @Override
    public void enterStorageClassSpecifier(StorageClassSpecifierContext ctx) {
        currentState.enterStorageClassSpecifier(ctx);
    }

    @Override
    public void exitStorageClassSpecifier(StorageClassSpecifierContext ctx) {
        currentState.exitStorageClassSpecifier(ctx);
    }

    @Override
    public void enterMore(MoreContext ctx) {
        currentState.enterMore(ctx);
    }

    @Override
    public void exitMore(MoreContext ctx) {
        currentState.exitMore(ctx);
    }

    @Override
    public void enterEnumerator(EnumeratorContext ctx) {
        currentState.enterEnumerator(ctx);
    }

    @Override
    public void exitEnumerator(EnumeratorContext ctx) {
        currentState.exitEnumerator(ctx);
    }

    @Override
    public void enterShiftExpression(ShiftExpressionContext ctx) {
        currentState.enterShiftExpression(ctx);
    }

    @Override
    public void exitShiftExpression(ShiftExpressionContext ctx) {
        currentState.exitShiftExpression(ctx);
    }

    @Override
    public void enterBlockItemList(BlockItemListContext ctx) {
        currentState.enterBlockItemList(ctx);
    }

    @Override
    public void exitBlockItemList(BlockItemListContext ctx) {
        currentState.exitBlockItemList(ctx);
    }

    @Override
    public void enterSpo_protected(Spo_protectedContext ctx) {
        currentState.enterSpo_protected(ctx);
    }

    @Override
    public void exitSpo_protected(Spo_protectedContext ctx) {
        currentState.exitSpo_protected(ctx);
    }

    @Override
    public void enterTypedefName(TypedefNameContext ctx) {
        currentState.enterTypedefName(ctx);
    }

    @Override
    public void exitTypedefName(TypedefNameContext ctx) {
        currentState.exitTypedefName(ctx);
    }

    @Override
    public void enterClassDeclarationList(ClassDeclarationListContext ctx) {
        currentState.enterClassDeclarationList(ctx);
    }

    @Override
    public void exitClassDeclarationList(ClassDeclarationListContext ctx) {
        currentState.exitClassDeclarationList(ctx);
    }

    @Override
    public void enterMinus(MinusContext ctx) {
        currentState.enterMinus(ctx);
    }

    @Override
    public void exitMinus(MinusContext ctx) {
        currentState.exitMinus(ctx);
    }

    @Override
    public void enterDeclaration(DeclarationContext ctx) {
        currentState.enterDeclaration(ctx);
    }

    @Override
    public void exitDeclaration(DeclarationContext ctx) {
        currentState.exitDeclaration(ctx);
    }

    @Override
    public void enterDesignatorList(DesignatorListContext ctx) {
        currentState.enterDesignatorList(ctx);
    }

    @Override
    public void exitDesignatorList(DesignatorListContext ctx) {
        currentState.exitDesignatorList(ctx);
    }

    @Override
    public void enterClassSpecifier(ClassSpecifierContext ctx) {
        currentState.enterClassSpecifier(ctx);
    }

    @Override
    public void exitClassSpecifier(ClassSpecifierContext ctx) {
        currentState.exitClassSpecifier(ctx);
    }

    @Override
    public void enterShiftr(ShiftrContext ctx) {
        currentState.enterShiftr(ctx);
    }

    @Override
    public void exitShiftr(ShiftrContext ctx) {
        currentState.exitShiftr(ctx);
    }

    @Override
    public void enterNtconstant(NtconstantContext ctx) {
        currentState.enterNtconstant(ctx);
    }

    @Override
    public void exitNtconstant(NtconstantContext ctx) {
        currentState.exitNtconstant(ctx);
    }

    @Override
    public void enterAdditiveExpression(AdditiveExpressionContext ctx) {
        currentState.enterAdditiveExpression(ctx);
    }

    @Override
    public void exitAdditiveExpression(AdditiveExpressionContext ctx) {
        currentState.exitAdditiveExpression(ctx);
    }

    @Override
    public void enterRpar(RparContext ctx) {
        currentState.enterRpar(ctx);
    }

    @Override
    public void exitRpar(RparContext ctx) {
        currentState.exitRpar(ctx);
    }

    @Override
    public void enterPostfixExpression(PostfixExpressionContext ctx) {
        currentState.enterPostfixExpression(ctx);
    }

    @Override
    public void exitPostfixExpression(PostfixExpressionContext ctx) {
        currentState.exitPostfixExpression(ctx);
    }

    @Override
    public void enterAnd(AndContext ctx) {
        currentState.enterAnd(ctx);
    }

    @Override
    public void exitAnd(AndContext ctx) {
        currentState.exitAnd(ctx);
    }

    @Override
    public void enterStatement(StatementContext ctx) {
        currentState.enterStatement(ctx);
    }

    @Override
    public void exitStatement(StatementContext ctx) {
        currentState.exitStatement(ctx);
    }

    @Override
    public void enterGenericAssociation(GenericAssociationContext ctx) {
        currentState.enterGenericAssociation(ctx);
    }

    @Override
    public void exitGenericAssociation(GenericAssociationContext ctx) {
        currentState.exitGenericAssociation(ctx);
    }

    @Override
    public void enterLpar(LparContext ctx) {
        currentState.enterLpar(ctx);
    }

    @Override
    public void exitLpar(LparContext ctx) {
        currentState.exitLpar(ctx);
    }

    @Override
    public void enterTypeAccessQualifier(TypeAccessQualifierContext ctx) {
        currentState.enterTypeAccessQualifier(ctx);
    }

    @Override
    public void exitTypeAccessQualifier(TypeAccessQualifierContext ctx) {
        currentState.exitTypeAccessQualifier(ctx);
    }

    @Override
    public void enterShiftl(ShiftlContext ctx) {
        currentState.enterShiftl(ctx);
    }

    @Override
    public void exitShiftl(ShiftlContext ctx) {
        currentState.exitShiftl(ctx);
    }

    @Override
    public void enterEnumSpecifier(EnumSpecifierContext ctx) {
        currentState.enterEnumSpecifier(ctx);
    }

    @Override
    public void exitEnumSpecifier(EnumSpecifierContext ctx) {
        currentState.exitEnumSpecifier(ctx);
    }

    @Override
    public void enterMultiplicativeExpression(MultiplicativeExpressionContext ctx) {
        currentState.enterMultiplicativeExpression(ctx);
    }

    @Override
    public void exitMultiplicativeExpression(MultiplicativeExpressionContext ctx) {
        currentState.exitMultiplicativeExpression(ctx);
    }

    @Override
    public void enterAssignmentOperator(AssignmentOperatorContext ctx) {
        currentState.enterAssignmentOperator(ctx);
    }

    @Override
    public void exitAssignmentOperator(AssignmentOperatorContext ctx) {
        currentState.exitAssignmentOperator(ctx);
    }

    @Override
    public void enterSpo_public(Spo_publicContext ctx) {
        currentState.enterSpo_public(ctx);
    }

    @Override
    public void exitSpo_public(Spo_publicContext ctx) {
        currentState.exitSpo_public(ctx);
    }

    @Override
    public void enterDeclarationSpecifiers2(DeclarationSpecifiers2Context ctx) {
        currentState.enterDeclarationSpecifiers2(ctx);
    }

    @Override
    public void exitDeclarationSpecifiers2(DeclarationSpecifiers2Context ctx) {
        currentState.exitDeclarationSpecifiers2(ctx);
    }

    @Override
    public void enterAtomicTypeSpecifier(AtomicTypeSpecifierContext ctx) {
        currentState.enterAtomicTypeSpecifier(ctx);
    }

    @Override
    public void exitAtomicTypeSpecifier(AtomicTypeSpecifierContext ctx) {
        currentState.exitAtomicTypeSpecifier(ctx);
    }

    @Override
    public void enterCompilationUnit(CompilationUnitContext ctx) {
        currentState.enterCompilationUnit(ctx);
    }

    @Override
    public void exitCompilationUnit(CompilationUnitContext ctx) {
        currentState.exitCompilationUnit(ctx);
    }

    @Override
    public void enterDiv(DivContext ctx) {
        currentState.enterDiv(ctx);
    }

    @Override
    public void exitDiv(DivContext ctx) {
        currentState.exitDiv(ctx);
    }

    @Override
    public void enterColon(ColonContext ctx) {
        currentState.enterColon(ctx);
    }

    @Override
    public void exitColon(ColonContext ctx) {
        currentState.exitColon(ctx);
    }

    @Override
    public void enterTypeSpecifier(TypeSpecifierContext ctx) {
        currentState.enterTypeSpecifier(ctx);
    }

    @Override
    public void exitTypeSpecifier(TypeSpecifierContext ctx) {
        currentState.exitTypeSpecifier(ctx);
    }

    @Override
    public void enterIdentifierList(IdentifierListContext ctx) {
        currentState.enterIdentifierList(ctx);
    }

    @Override
    public void exitIdentifierList(IdentifierListContext ctx) {
        currentState.exitIdentifierList(ctx);
    }

    @Override
    public void enterDirectAbstractDeclarator(DirectAbstractDeclaratorContext ctx) {
        currentState.enterDirectAbstractDeclarator(ctx);
    }

    @Override
    public void exitDirectAbstractDeclarator(DirectAbstractDeclaratorContext ctx) {
        currentState.exitDirectAbstractDeclarator(ctx);
    }

    @Override
    public void enterTranslationUnit(TranslationUnitContext ctx) {
        currentState.enterTranslationUnit(ctx);
    }

    @Override
    public void exitTranslationUnit(TranslationUnitContext ctx) {
        currentState.exitTranslationUnit(ctx);
    }

    @Override
    public void enterLabeledStatement(LabeledStatementContext ctx) {
        currentState.enterLabeledStatement(ctx);
    }

    @Override
    public void exitLabeledStatement(LabeledStatementContext ctx) {
        currentState.exitLabeledStatement(ctx);
    }

    @Override
    public void enterRelationalExpression(RelationalExpressionContext ctx) {
        currentState.enterRelationalExpression(ctx);
    }

    @Override
    public void exitRelationalExpression(RelationalExpressionContext ctx) {
        currentState.exitRelationalExpression(ctx);
    }

    @Override
    public void enterEnumerationConstant(EnumerationConstantContext ctx) {
        currentState.enterEnumerationConstant(ctx);
    }

    @Override
    public void exitEnumerationConstant(EnumerationConstantContext ctx) {
        currentState.exitEnumerationConstant(ctx);
    }

    @Override
    public void enterGccAttribute(GccAttributeContext ctx) {
        currentState.enterGccAttribute(ctx);
    }

    @Override
    public void exitGccAttribute(GccAttributeContext ctx) {
        currentState.exitGccAttribute(ctx);
    }

    @Override
    public void enterQuestion(QuestionContext ctx) {
        currentState.enterQuestion(ctx);
    }

    @Override
    public void exitQuestion(QuestionContext ctx) {
        currentState.exitQuestion(ctx);
    }

    @Override
    public void enterOror(OrorContext ctx) {
        currentState.enterOror(ctx);
    }

    @Override
    public void exitOror(OrorContext ctx) {
        currentState.exitOror(ctx);
    }

    @Override
    public void enterAndand(AndandContext ctx) {
        currentState.enterAndand(ctx);
    }

    @Override
    public void exitAndand(AndandContext ctx) {
        currentState.exitAndand(ctx);
    }

    @Override
    public void enterTypeQualifier(TypeQualifierContext ctx) {
        currentState.enterTypeQualifier(ctx);
    }

    @Override
    public void exitTypeQualifier(TypeQualifierContext ctx) {
        currentState.exitTypeQualifier(ctx);
    }

    @Override
    public void enterLess(LessContext ctx) {
        currentState.enterLess(ctx);
    }

    @Override
    public void exitLess(LessContext ctx) {
        currentState.exitLess(ctx);
    }

    @Override
    public void enterTagSpecifier(TagSpecifierContext ctx) {
        currentState.enterTagSpecifier(ctx);
    }

    @Override
    public void exitTagSpecifier(TagSpecifierContext ctx) {
        currentState.exitTagSpecifier(ctx);
    }

    @Override
    public void enterJumpStatement(JumpStatementContext ctx) {
        currentState.enterJumpStatement(ctx);
    }

    @Override
    public void exitJumpStatement(JumpStatementContext ctx) {
        currentState.exitJumpStatement(ctx);
    }

    @Override
    public void enterAt(AtContext ctx) {
        currentState.enterAt(ctx);
    }

    @Override
    public void exitAt(AtContext ctx) {
        currentState.exitAt(ctx);
    }

    @Override
    public void enterAbstractDeclarator(AbstractDeclaratorContext ctx) {
        currentState.enterAbstractDeclarator(ctx);
    }

    @Override
    public void exitAbstractDeclarator(AbstractDeclaratorContext ctx) {
        currentState.exitAbstractDeclarator(ctx);
    }

    @Override
    public void enterFunctionSpecifier(FunctionSpecifierContext ctx) {
        currentState.enterFunctionSpecifier(ctx);
    }

    @Override
    public void exitFunctionSpecifier(FunctionSpecifierContext ctx) {
        currentState.exitFunctionSpecifier(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        currentState.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        currentState.exitEveryRule(ctx);
    }

    // END GRAMMAR RULES
}
