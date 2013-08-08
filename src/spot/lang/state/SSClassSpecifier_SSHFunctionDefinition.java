package spot.lang.state;

import org.antlr.v4.runtime.TokenStream;

import spot.lang.EVisibility;
import spot.lang.Function;
import spot.lang.TagClass;
import spot.main.IStatefulExtractor;
import spot.parser.SPOTParser;
import spot.parser.SPOTParser.DirectDeclaratorContext;
import spot.parser.SPOTParser.ParameterDeclarationContext;

public class SSClassSpecifier_SSHFunctionDefinition extends ScopeStateBase {
    protected TagClass currentClass;
    protected EVisibility currentVis;
    protected boolean isFunctionDeclarator;
    protected boolean isParameter;
    protected Function currentFunction;

    public SSClassSpecifier_SSHFunctionDefinition(IStatefulExtractor _source,
            ScopeStateBase _previousState,
            TagClass _currentClass,
            EVisibility _currentVis) {
        super(_source, _previousState);
        currentClass = _currentClass;
        currentVis = _currentVis;
    }

    @Override
    public void enterFunctionDeclarator(SPOTParser.FunctionDeclaratorContext ctx) {
        isFunctionDeclarator = true;
    }

    @Override
    public void exitFunctionDeclarator(SPOTParser.FunctionDeclaratorContext ctx) {
        isFunctionDeclarator = false;
    }

    @Override
    public void enterDirectDeclarator(DirectDeclaratorContext ctx) {
        if (ctx.Identifier() != null) {
            TokenStream tokens = getSourceExtractor().getParser()
                    .getTokenStream();
            String id = ctx.Identifier().getText();

            if (isFunctionDeclarator) {  // always true?
                String funcName = TagClass.getPawnFuncId(id,
                        currentClass.identifier);
                currentFunction = new Function(funcName);
                currentClass.functions.put(currentFunction.identifier,
                        currentFunction);

                if (isParameter) {
                    currentBuilder.append(id);
                } else {
                    currentBuilder.append(funcName);
                }
            }
        }
    }

    @Override
    public void enterParameterDeclaration(ParameterDeclarationContext ctx) {
        isParameter = true;
    }

    @Override
    public void exitParameterDeclaration(SPOTParser.ParameterDeclarationContext ctx) {

        isParameter = false;
    }

    @Override
    public void enterCompoundStatement(SPOTParser.CompoundStatementContext ctx) {
        // createNewScope();
        currentBuilder.append("\n{\n");
    }

    @Override
    public void exitCompoundStatement(SPOTParser.CompoundStatementContext ctx) {
        currentBuilder.append("}\n");
        // restoreScope();
        ret();
    }

}
