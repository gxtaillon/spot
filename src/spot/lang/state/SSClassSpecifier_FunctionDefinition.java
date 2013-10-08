package spot.lang.state;

import org.antlr.v4.runtime.TokenStream;

import spot.lang.API;
import spot.lang.EFunction;
import spot.lang.EVisibility;
import spot.lang.Function;
import spot.lang.Scope;
import spot.lang.TagClass;
import spot.lang.Variable;
import spot.main.IStatefulExtractor;
import spot.parser.SPOTParser;
import spot.parser.SPOTParser.AtContext;
import spot.parser.SPOTParser.DirectDeclaratorContext;
import spot.parser.SPOTParser.ParameterDeclarationContext;
import spot.parser.SPOTParser.PostfixExpressionContext;
import spot.parser.SPOTParser.PostfixExpressionDotContext;
import spot.parser.SPOTParser.PrimaryExpressionContext;
import spot.parser.SPOTParser.TagSpecifierContext;

public class SSClassSpecifier_FunctionDefinition extends ScopeStateBase {
    protected TagClass currentClass;
    protected EVisibility currentVis;
    protected boolean isFunctionDeclarator;
    protected boolean isParameter;
    protected EFunction currentFunctionCategory;
    protected Function currentFunction;
    protected Variable currentParameter;
    protected boolean isVerbatim;
    protected int depthPostfixExpr;
    protected boolean wasPrimaryExpr;
    protected StringBuilder postfixExprBuilder;
    protected StringBuilder primaryExprBuilder;

    public SSClassSpecifier_FunctionDefinition(IStatefulExtractor _source,
            Scope previousScope,
            ScopeStateBase _previousState,
            TagClass _currentClass,
            EVisibility _currentVis) {
        super(_source, previousScope, _previousState);
        currentClass = _currentClass;
        currentVis = _currentVis;
        currentFunctionCategory = EFunction.Classic;

        postfixExprBuilder = new StringBuilder();
        primaryExprBuilder = new StringBuilder();
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

                        currentFunction = new Function(
                                currentClass.cleanIdentifier);
                        currentBuilder.append(currentClass.cleanIdentifier);
                        currentClass.functions.put(
                                currentClass.cleanIdentifier, currentFunction);
                    } else {
                        if (id.equals(SSClassSpecifier.DEFAULT_DTOR_ID)) {
                            currentFunctionCategory = EFunction.Destructor;
                        }
                        String funcName = TagClass.getPawnFuncId(id,
                                currentClass.identifier, isVerbatim);
                        currentBuilder.append(funcName);
                        currentClass.functions.put(funcName, currentFunction);
                    }
                }
            } else {
                currentBuilder.append(id);
            }
        }
    }

    @Override
    public void enterPrimaryExpression(PrimaryExpressionContext ctx) {
        if (ctx.Identifier() != null) {
            primaryExprBuilder.append(ctx.Identifier().toString());
        }
        
        wasPrimaryExpr = true;
    }

    /*
    @Override
    public void enterParameterDeclaration(ParameterDeclarationContext ctx) {
        isParameter = true;

        TokenStream tokens = getSourceExtractor().getParser().getTokenStream();
        String parameter = tokens.getText(ctx);

        currentBuilder.append(parameter);
    }

    @Override
    public void exitParameterDeclaration(SPOTParser.ParameterDeclarationContext ctx) {
        isParameter = false;
    }
    //*/
    
    @Override
    public void enterPostfixExpressionDot(PostfixExpressionDotContext ctx) {
        String vid = TagClass.getPawnFuncId(ctx.Identifier().toString(), currentClass.identifier, false);
        if (!currentClass.variables.containsKey(vid)) {
            // TODO: LOG 
        }
        
        StringBuilder tmp = new StringBuilder();
        pawnFunctionCall(tmp, API.iGet, currentClass.pId + ", " + API.vHeap + "[" + SSClassSpecifier.DEFAULT_THIS_ID + "]");
        pawnFunctionCall(postfixExprBuilder, API.DerefC, SSClassSpecifier.DEFAULT_THIS_ID + " + " + vid + " + " + tmp.toString());
    }

    @Override
    public void enterPostfixExpression(PostfixExpressionContext ctx) {
        ++depthPostfixExpr;
    }
    
    @Override
    public void exitPostfixExpression(PostfixExpressionContext ctx) {
        --depthPostfixExpr;
        
        if (depthPostfixExpr == 0) {
            if (wasPrimaryExpr) {
                currentBuilder.append(primaryExprBuilder);
            } else {
                currentBuilder.append(postfixExprBuilder);
            }
        }
        
        wasPrimaryExpr = false;
        postfixExprBuilder = new StringBuilder();
        primaryExprBuilder = new StringBuilder();
    }

    @Override
    public void enterCompoundStatement(SPOTParser.CompoundStatementContext ctx) {
        // createNewScope();
        currentBuilder.append("\n{\n");

        // Append special statements for special functions
        switch (currentFunctionCategory) {
            case Constructor:
                SSClassSpecifier.pawnUpperCtor(currentBuilder,
                        currentClass.pSize, currentClass.pId);
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
                SSClassSpecifier.pawnLowerDtor(currentBuilder,
                        currentClass.pSize);
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
