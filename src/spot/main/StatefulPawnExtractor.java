package spot.main;

import org.antlr.v4.runtime.tree.TerminalNode;

import spot.lang.state.SSGlobal;
import spot.lang.state.ScopeStateBase;
import spot.parser.SPOTBaseListener;
import spot.parser.SPOTParser;
import spot.util.state.IState;

// Regex to implement adapter
// Find: (((enter|exit).*?)\(([\r\n\s]*.*?)\{)([\r\s\n]*.*?\})
// Rep: $1\ncurrentState.$2(ctx);\n$5
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

    @Override
    public String getTranslation() {
        return currentState.getCurrentBuilder().toString();
    }

    // GRAMMAR RULES

    @Override
    public void visitTerminal(TerminalNode node) {}

    @Override
    public void exitCompilationUnit(SPOTParser.CompilationUnitContext ctx) {
        currentState.exitCompilationUnit(ctx);

    }

    @Override
    public void exitExpressionStatement(SPOTParser.ExpressionStatementContext ctx) {
        currentState.exitExpressionStatement(ctx);

    }

    @Override
    public void enterDeclaration(SPOTParser.DeclarationContext ctx) {
        currentState.enterDeclaration(ctx);

    }

    @Override
    public void exitDeclaration(SPOTParser.DeclarationContext ctx) {
        currentState.exitDeclaration(ctx);

    }

    @Override
    public void exitDeclarator(SPOTParser.DeclaratorContext ctx) {
        currentState.exitDeclarator(ctx);

    }

    @Override
    public void enterFunctionDeclarator(SPOTParser.FunctionDeclaratorContext ctx) {
        currentState.enterFunctionDeclarator(ctx);

    }

    @Override
    public void exitFunctionDeclarator(SPOTParser.FunctionDeclaratorContext ctx) {
        currentState.exitFunctionDeclarator(ctx);

    }

    @Override
    public void enterTagSpecifier(SPOTParser.TagSpecifierContext ctx) {
        currentState.enterTagSpecifier(ctx);

    }

    @Override
    public void enterStorageClassSpecifier(SPOTParser.StorageClassSpecifierContext ctx) {
        currentState.enterStorageClassSpecifier(ctx);

    }

    @Override
    public void enterClassSpecifier(SPOTParser.ClassSpecifierContext ctx) {
        currentState.enterClassSpecifier(ctx);

    }

    @Override
    public void exitClassSpecifier(SPOTParser.ClassSpecifierContext ctx) {
        currentState.exitClassSpecifier(ctx);

    }

    @Override
    public void enterClassDeclaration(SPOTParser.ClassDeclarationContext ctx) {
        currentState.enterClassDeclaration(ctx);

    }

    @Override
    public void exitClassDeclaration(SPOTParser.ClassDeclarationContext ctx) {
        currentState.exitClassDeclaration(ctx);

    }

    @Override
    public void enterIdentifierList(SPOTParser.IdentifierListContext ctx) {
        currentState.enterIdentifierList(ctx);

    }

    @Override
    public void enterFunctionDefinition(SPOTParser.FunctionDefinitionContext ctx) {
        currentState.enterFunctionDefinition(ctx);

    }

    @Override
    public void exitFunctionDefinition(SPOTParser.FunctionDefinitionContext ctx) {
        currentState.exitFunctionDefinition(ctx);

    }

    @Override
    public void enterParameterDeclaration(SPOTParser.ParameterDeclarationContext ctx) {
        currentState.enterParameterDeclaration(ctx);

    }

    @Override
    public void exitParameterDeclaration(SPOTParser.ParameterDeclarationContext ctx) {
        currentState.exitParameterDeclaration(ctx);

    }

    @Override
    public void enterDirectDeclarator(SPOTParser.DirectDeclaratorContext ctx) {
        currentState.enterDirectDeclarator(ctx);

    }

    @Override
    public void enterCompoundStatement(SPOTParser.CompoundStatementContext ctx) {
        currentState.enterCompoundStatement(ctx);

    }

    @Override
    public void exitCompoundStatement(SPOTParser.CompoundStatementContext ctx) {
        currentState.exitCompoundStatement(ctx);

    }

    @Override
    public void enterJumpStatement(SPOTParser.JumpStatementContext ctx) {
        currentState.enterJumpStatement(ctx);

    }

    @Override
    public void exitJumpStatement(SPOTParser.JumpStatementContext ctx) {
        currentState.exitJumpStatement(ctx);

    }

    @Override
    public void enterPrimaryExpression(SPOTParser.PrimaryExpressionContext ctx) {
        currentState.enterPrimaryExpression(ctx);

    }

    @Override
    public void enterPostfixExpressionDot(SPOTParser.PostfixExpressionDotContext ctx) {
        currentState.enterPostfixExpressionDot(ctx);

    }

    @Override
    public void enterPostfixExpression(SPOTParser.PostfixExpressionContext ctx) {
        currentState.enterPostfixExpression(ctx);

    }

    @Override
    public void exitPostfixExpression(SPOTParser.PostfixExpressionContext ctx) {
        currentState.exitPostfixExpression(ctx);

    }

    @Override
    public void enterPostfixExpressionArgs(SPOTParser.PostfixExpressionArgsContext ctx) {
        currentState.enterPostfixExpressionArgs(ctx);

    }

    // pseudo terminals

    @Override
    public void enterTypeAccessQualifier(SPOTParser.TypeAccessQualifierContext ctx) {
        currentState.enterTypeAccessQualifier(ctx);

    }

    @Override
    public void enterLpar(SPOTParser.LparContext ctx) {
        currentState.enterLpar(ctx);

    }

    @Override
    public void enterRpar(SPOTParser.RparContext ctx) {
        currentState.enterRpar(ctx);

    }

    @Override
    public void enterStar(SPOTParser.StarContext ctx) {
        currentState.enterStar(ctx);

    }

    @Override
    public void enterDiv(SPOTParser.DivContext ctx) {
        currentState.enterDiv(ctx);

    }

    @Override
    public void enterMod(SPOTParser.ModContext ctx) {
        currentState.enterMod(ctx);

    }

    @Override
    public void enterPlus(SPOTParser.PlusContext ctx) {
        currentState.enterPlus(ctx);

    }

    @Override
    public void enterMinus(SPOTParser.MinusContext ctx) {
        currentState.enterMinus(ctx);

    }

    @Override
    public void enterShiftr(SPOTParser.ShiftrContext ctx) {
        currentState.enterShiftr(ctx);

    }

    @Override
    public void enterShiftl(SPOTParser.ShiftlContext ctx) {
        currentState.enterShiftl(ctx);

    }

    @Override
    public void enterLess(SPOTParser.LessContext ctx) {
        currentState.enterLess(ctx);

    }

    @Override
    public void enterMore(SPOTParser.MoreContext ctx) {
        currentState.enterMore(ctx);

    }

    @Override
    public void enterLeeq(SPOTParser.LeeqContext ctx) {
        currentState.enterLeeq(ctx);

    }

    @Override
    public void enterMoeq(SPOTParser.MoeqContext ctx) {
        currentState.enterMoeq(ctx);

    }

    @Override
    public void enterEqeq(SPOTParser.EqeqContext ctx) {
        currentState.enterEqeq(ctx);

    }

    @Override
    public void enterNoteq(SPOTParser.NoteqContext ctx) {
        currentState.enterNoteq(ctx);

    }

    @Override
    public void enterAnd(SPOTParser.AndContext ctx) {
        currentState.enterAnd(ctx);

    }

    @Override
    public void enterCaret(SPOTParser.CaretContext ctx) {
        currentState.enterCaret(ctx);

    }

    @Override
    public void enterOr(SPOTParser.OrContext ctx) {
        currentState.enterOr(ctx);

    }

    @Override
    public void enterAndand(SPOTParser.AndandContext ctx) {
        currentState.enterAndand(ctx);

    }

    @Override
    public void enterOror(SPOTParser.OrorContext ctx) {
        currentState.enterOror(ctx);

    }

    @Override
    public void enterQuestion(SPOTParser.QuestionContext ctx) {
        currentState.enterQuestion(ctx);

    }

    @Override
    public void enterSemi(SPOTParser.SemiContext ctx) {
        currentState.enterSemi(ctx);

    }

    @Override
    public void enterEq(SPOTParser.EqContext ctx) {
        currentState.enterEq(ctx);

    }

    @Override
    public void enterComa(SPOTParser.ComaContext ctx) {
        currentState.enterComa(ctx);

    }

    @Override
    public void enterAssignmentOperator(SPOTParser.AssignmentOperatorContext ctx) {
        currentState.enterAssignmentOperator(ctx);

    }
}
