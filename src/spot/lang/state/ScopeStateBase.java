package spot.lang.state;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import spot.lang.Scope;
import spot.main.ExtractorConfig;
import spot.main.IStatefulExtractor;
import spot.parser.SPOTBaseListener;
import spot.parser.SPOTParser;
import spot.parser.SPOTParser.BbreakContext;
import spot.parser.SPOTParser.CcontinueContext;
import spot.parser.SPOTParser.ExpressionStatementContext;
import spot.parser.SPOTParser.GgotoContext;
import spot.parser.SPOTParser.JumpStatementContext;
import spot.parser.SPOTParser.NtconstantContext;
import spot.parser.SPOTParser.RreturnContext;
import spot.util.state.IState;
import spot.util.state.IStateful;

public abstract class ScopeStateBase extends SPOTBaseListener implements IState {
    protected StringBuilder currentBuilder;
    protected Scope currentScope;
    protected ScopeStateBase previousState;
    private IStatefulExtractor source;

    public ScopeStateBase(IStatefulExtractor _source,
            Scope previousScope,
            ScopeStateBase _previousState) {
        source = _source;
        currentBuilder = new StringBuilder();
        currentScope = previousScope;
        previousState = _previousState;
    }

    /**
     * Should be called when the current state is exiting its last node to
     * return control to its previous state.
     */
    protected void ret/* urn */() {
        // Save the builder!
        previousState.currentBuilder.append(currentBuilder);
        currentBuilder.delete(0, currentBuilder.length());

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
        return source;
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

    protected void pawnLine() {
        pawnLine(currentBuilder, 1);
    }

    protected void pawnLine(int qty) {
        pawnLine(currentBuilder, qty);
    }

    protected static void pawnLine(StringBuilder builder, int qty) {
        for (int i = 0; i != qty; ++i) {
            builder.append("\n");
        }
    }

    protected static void pawnLine(StringBuilder builder) {
        pawnLine(builder, 1);
    }

    protected void pawnCommentLine(String text) {
        pawnCommentLine(currentBuilder, text);
    }

    protected static void pawnCommentLine(StringBuilder builder, String text) {
        builder.append("// ");
        builder.append(text);
        pawnLine(builder);
    }

    protected void pawnDefine(String identifier, String value) {
        pawnDefine(currentBuilder, identifier, value);
    }

    protected static void pawnDefine(StringBuilder builder,
            String identifier,
            String value) {
        builder.append("#define ");
        builder.append(identifier);
        builder.append("\t");
        builder.append(value);
        pawnLine(builder);
    }
    
    protected static void pawnFunction(StringBuilder builder, String funcId, String tagId, String params, String body) {
        if (tagId != null) {
            builder.append(tagId);
            builder.append(":");
        }
        builder.append(funcId);
        builder.append("(");
        builder.append(params);
        builder.append(") {\n");
        builder.append(body);
        builder.append("}\n");
    }

    protected void pawnFunctionCall(String funcId, String params)  {
        pawnFunctionCall(currentBuilder, funcId, params);        
    }
    protected static void pawnFunctionCall(StringBuilder builder, String funcId, String params)  {
        builder.append(funcId);
        builder.append("(");
        builder.append(params);
        builder.append(")");
    }

    protected void pawnAssign(String varId, String value)  {
        pawnAssign(currentBuilder, varId, value);        
    }
    protected static void pawnAssign(StringBuilder builder, String varId, String value)  {
        builder.append(varId);
        builder.append(" = ");
        builder.append(value);
    }

    protected void pawnEndStmt()  {
        pawnEndStmt(currentBuilder);        
    }
    protected static void pawnEndStmt(StringBuilder builder)  {
        builder.append(";\n");
    }

    // LISTENER METHODS

    @Override
    public void visitTerminal(TerminalNode node) {
        String t = node.getText(); 
        if (t.startsWith("##")) {
            if (t.startsWith("include", 2)) {
                //t.split("", );
            }
        } else if (t.startsWith("#")) {
            asis(node, "\n");
        }
    }

    // pseudo terminals

    @Override
    public void exitJumpStatement(JumpStatementContext ctx) {
        pawnLine();
    }

    @Override
    public void exitExpressionStatement(ExpressionStatementContext ctx) {
        pawnLine();
    }

    @Override
    public void enterNtconstant(NtconstantContext ctx) {
        asis(ctx);
    }

    @Override
    public void enterTypeAccessQualifier(SPOTParser.TypeAccessQualifierContext ctx) {
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

    @Override
    public void enterRreturn(RreturnContext ctx) {
        asis(ctx);
    }

    @Override
    public void enterGgoto(GgotoContext ctx) {
        asis(ctx);
    }

    @Override
    public void enterCcontinue(CcontinueContext ctx) {
        asis(ctx);
    }

    @Override
    public void enterBbreak(BbreakContext ctx) {
        asis(ctx);
    }
}
