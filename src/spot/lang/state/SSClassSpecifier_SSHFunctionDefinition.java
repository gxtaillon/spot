package spot.lang.state;

import org.antlr.v4.runtime.TokenStream;

import spot.lang.EFunction;
import spot.lang.EVisibility;
import spot.lang.Function;
import spot.lang.TagClass;
import spot.lang.Variable;
import spot.main.IStatefulExtractor;
import spot.parser.SPOTParser;
import spot.parser.SPOTParser.AtContext;
import spot.parser.SPOTParser.DirectDeclaratorContext;
import spot.parser.SPOTParser.ParameterDeclarationContext;
import spot.parser.SPOTParser.PrimaryExpressionContext;
import spot.parser.SPOTParser.TagSpecifierContext;

public class SSClassSpecifier_SSHFunctionDefinition extends ScopeStateBase {
    protected TagClass currentClass;
    protected EVisibility currentVis;
    protected boolean isFunctionDeclarator;
    protected boolean isParameter;
    protected EFunction currentFunctionCategory;
    protected Function currentFunction;
    protected Variable currentParameter;
    protected boolean isVerbatim;

    public SSClassSpecifier_SSHFunctionDefinition(IStatefulExtractor _source,
            ScopeStateBase _previousState,
            TagClass _currentClass,
            EVisibility _currentVis) {
        super(_source, _previousState);
        currentClass = _currentClass;
        currentVis = _currentVis;
        currentFunctionCategory = EFunction.Classic;
    }

    @Override
    public void enterFunctionDeclarator(SPOTParser.FunctionDeclaratorContext ctx) {
        isFunctionDeclarator = true;
    }

    @Override
    public void exitFunctionDeclarator(SPOTParser.FunctionDeclaratorContext ctx) {
        isFunctionDeclarator = false;
        isVerbatim = ctx.at() != null;
    }

    @Override
    // Refactor this ugly monster
    public void enterDirectDeclarator(DirectDeclaratorContext ctx) {
        if (ctx.Identifier() != null) {
            String id = ctx.Identifier().getText();

            if (isFunctionDeclarator) {  // always true?
                if (isParameter) {
                    currentBuilder.append(id);
                } else {
                    if (id.equals(SSClassSpecifier.DEFAULT_CTOR_ID)) {
                        currentFunctionCategory = EFunction.Constructor;

                        currentFunction = new Function(currentClass.cleanIdentifier);
                        currentBuilder.append(currentClass.cleanIdentifier);
                        currentClass.functions.put(currentClass.cleanIdentifier,
                                currentFunction);
                    } else {
                        if (id.equals(SSClassSpecifier.DEFAULT_DTOR_ID)) {
                            currentFunctionCategory = EFunction.Destructor;
                        }
                        String funcName = TagClass.getPawnFuncId(id,
                                currentClass.identifier, isVerbatim);
                        currentBuilder.append(funcName);
                        currentClass.functions.put(funcName,
                                currentFunction);
                    }
                }
            }
        }
    }

    @Override
    public void enterParameterDeclaration(ParameterDeclarationContext ctx) {
        isParameter = true;

        TokenStream tokens = getSourceExtractor().getParser()
                .getTokenStream();
        String parameter = tokens.getText(ctx);
        
        currentBuilder.append(parameter);        
    }

    @Override
    public void exitParameterDeclaration(SPOTParser.ParameterDeclarationContext ctx) {
        isParameter = false;
    }

    @Override
    public void enterCompoundStatement(SPOTParser.CompoundStatementContext ctx) {
        // createNewScope();
        currentBuilder.append("\n{\n");
        
        // Append special statements for special functions
        switch (currentFunctionCategory) {
            case Constructor:
                SSClassSpecifier.pawnUpperCtor(currentBuilder, currentClass.pSize, currentClass.pId);
                break;
            case Destructor:
                SSClassSpecifier.pawnUpperDtor(currentBuilder);
                break;

            default:
                break;
        }
    }

    @Override
    public void exitCompoundStatement(SPOTParser.CompoundStatementContext ctx) {
        // Append special statements for special functions
        switch (currentFunctionCategory) {
            case Constructor:
                SSClassSpecifier.pawnLowerCtor(currentBuilder);
                break;
            case Destructor:
                SSClassSpecifier.pawnLowerDtor(currentBuilder, currentClass.pSize);
                break;

            default:
                break;
        }
        
        currentBuilder.append("}\n");
        // restoreScope();
        ret();
    }

    @Override
    public void enterTagSpecifier(TagSpecifierContext ctx) {
        if (isParameter) {
            currentParameter = new Variable("", EVisibility.Parameter,
                    currentScope.tags.get(ctx.Identifier().getText()));
        }
    }
}
