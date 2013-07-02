
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import java.lang.StringBuilder;
import java.util.*;

public class ExtractPawnListener extends SPOTBaseListener {
    final String CURRENT_SYMBOL = "__CURRENT_SYMBOL";
    final String CURRENT_UNRESOLVED_CLASS = "__CURRENT_UNRESOLVED_CLASS";
    final String CURRENT_CLASS = "__CURRENT_CLASS";
    final String CURRENT_THIS = "__CURRENT_THIS";
    StringBuilder sb;
    SPOTParser parser;
    Stack<String> tags;
    boolean isClass, isExitingClass;
    boolean isFunc, isParameter, isDeclaration, isPostfixArgs, isFunctionDeclarator;
    StringBuilder csb; // the current class's functions sb. 
    //  When enter/exit'ing a function sb and csb will switch places to prevent 
    //      writing functions inside the enum.
    Stack<HashMap<String, Symbol>> environments;

    protected String enumOfClass(String className) {
        return "SPClass_"+className;
    }

    protected String functionOfMember(String className, String memberName) {
        return className + "_" + memberName;
    }

    protected String variableOfMember(String className, String memberName) {
        return className + ":" + memberName;
    }

    protected String asis(ParserRuleContext ctx) {
        TokenStream tokens = parser.getTokenStream();
        String tmp = tokens.getText(ctx);
        sb.append(tmp);
        sb.append(' ');
        return tmp;
    }

    protected HashMap<String, Symbol> getCurrentEnv() {
        return environments.peek();
    }
    
    protected HashMap<String, Symbol> createNewEnv() {
        HashMap<String, Symbol> cur = getCurrentEnv();
        HashMap<String, Symbol> newEnv = new HashMap<String, Symbol>();
        newEnv.putAll(cur);
        environments.push(newEnv);

//System.out.println("newenv post");
//for (String name: getCurrentEnv().keySet()){
//            String value = getCurrentEnv().get(name).toString();  
//            System.out.println(name + "::" + value);  
//} 
        return newEnv;
    }

    protected void restoreEnv() {
        environments.pop();
    }

    public ExtractPawnListener(SPOTParser parser) {
        this.parser = parser;
        this.sb = new StringBuilder();
        this.csb = new StringBuilder();
        this.tags = new Stack<String>();
        this.tags.push("");
        this.environments = new Stack<HashMap<String, Symbol>>();
        this.environments.push(new HashMap<String, Symbol>());
    }

    public String getOutput() {
        return sb.toString();
    }

	@Override 
    public void exitExpressionStatement(SPOTParser.ExpressionStatementContext ctx) {
        sb.append(";\n");
    }

	@Override 
    public void enterDeclaration(SPOTParser.DeclarationContext ctx) {
        isDeclaration = true;
        //createNewEnv();
    }

	@Override 
    public void exitDeclaration(SPOTParser.DeclarationContext ctx) {
        if (isExitingClass) {
            isExitingClass = false;
        } else {
            sb.append(";");
        }

        sb.append("\n");
        //restoreEnv();
        isDeclaration = false;
    }

	@Override 
    public void exitDeclarator(SPOTParser.DeclaratorContext ctx) {
        TokenStream tokens = parser.getTokenStream();
        if (isDeclaration && !isClass 
            && getCurrentEnv().containsKey(CURRENT_UNRESOLVED_CLASS)) {
            sb.append('[');
            String className = getCurrentEnv().get(CURRENT_UNRESOLVED_CLASS).symbol;
            sb.append(className);
            sb.append(']');

            getCurrentEnv().put(
                tokens.getText(ctx.directDeclarator()), 
                new Symbol(className, SymbolType.Variable));
            getCurrentEnv().remove(CURRENT_UNRESOLVED_CLASS);
        }
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
    public void enterTagSpecifier(SPOTParser.TagSpecifierContext ctx) {
        getCurrentEnv().put(
            CURRENT_UNRESOLVED_CLASS, 
            new Symbol(enumOfClass(ctx.Identifier().toString()), SymbolType.Variable));
    }

	@Override 
    public void enterStorageClassSpecifier(SPOTParser.StorageClassSpecifierContext ctx) {
        asis(ctx);
    }

	@Override 
    public void enterClassSpecifier(SPOTParser.ClassSpecifierContext ctx) {
        isClass = true;
        sb.append("enum ");
        String className = enumOfClass(ctx.Identifier().toString());
        sb.append(className);
        sb.append(" {\n");

        getCurrentEnv().put(
            CURRENT_CLASS,
            new Symbol(className, SymbolType.Variable));
    }

	@Override
    public void exitClassSpecifier(SPOTParser.ClassSpecifierContext ctx) {
        sb.append("};\n");
        sb.append(csb);
        csb.delete(0, csb.length());
        getCurrentEnv().remove(CURRENT_CLASS);
        isClass = false;
        isExitingClass = true;
    }

	@Override
    public void enterClassDeclaration(SPOTParser.ClassDeclarationContext ctx) {
        TokenStream tokens = parser.getTokenStream();
        tags.push((ctx.tagSpecifier() != null)
            ? tokens.getText(ctx.tagSpecifier())
            : "");
    }

	@Override
    public void exitClassDeclaration(SPOTParser.ClassDeclarationContext ctx) {
        
        tags.pop();
        sb.append('\n');
    }

	@Override 
    public void enterIdentifierList(SPOTParser.IdentifierListContext ctx) {
        sb.append(tags.peek());
        sb.append(ctx.Identifier());
        sb.append(',');
    }
	@Override 
    public void exitIdentifierList(SPOTParser.IdentifierListContext ctx) {
        if (ctx.identifierList() != null) {
        }
    }

	@Override 
    public void enterFunctionDefinition(SPOTParser.FunctionDefinitionContext ctx) {
        isFunc = true;
        //createNewEnv();
        StringBuilder tmp;
        if (isClass) {
            tmp = sb;
            sb = csb;
            csb = tmp;
        }
    }

	@Override 
    public void exitFunctionDefinition(SPOTParser.FunctionDefinitionContext ctx) {
        StringBuilder tmp;
        if (isClass) {
            tmp = sb;
            sb = csb;
            csb = tmp;
        }
        //restoreEnv();
        isFunc = false;
    }
    
    @Override 
    public void enterParameterDeclaration(SPOTParser.ParameterDeclarationContext ctx) {
        isParameter = true;
    }
    
    @Override 
    public void exitParameterDeclaration(SPOTParser.ParameterDeclarationContext ctx) {
        TokenStream tokens = parser.getTokenStream();
        if (ctx.declarationSpecifiers() != null) {
            sb.append('[');
            String className = getCurrentEnv().get(CURRENT_UNRESOLVED_CLASS).symbol;
            sb.append(className);
            sb.append(']');

            getCurrentEnv().put(
                tokens.getText(ctx.declarator()), 
                new Symbol(className, SymbolType.Variable));
            getCurrentEnv().remove(CURRENT_UNRESOLVED_CLASS);
        }
        isParameter = false;
    }

	@Override
    public void enterTypeAccessQualifier(SPOTParser.TypeAccessQualifierContext ctx) {
        asis(ctx);
    }

	@Override 
    public void enterDirectDeclarator(SPOTParser.DirectDeclaratorContext ctx) {
        if (ctx.Identifier() != null) {
            TokenStream tokens = parser.getTokenStream();
            String id = tokens.getText(ctx);
            if (isClass && isFunctionDeclarator) {
                Symbol env = getCurrentEnv().get(CURRENT_CLASS);
                String className = env.symbol;
                String funcName = functionOfMember(className, id);
                getCurrentEnv().put(
                    id,
                    new Symbol(funcName, SymbolType.Function));
                if (!isParameter) {
                    sb.append(funcName);
                } else {
                    sb.append(id);
                }
            } else {
                sb.append(id);
            }
        }
    }

	@Override 
    public void exitDirectDeclarator(SPOTParser.DirectDeclaratorContext ctx) {
        if (ctx.parameterTypeList() == null && ctx.directDeclarator() != null) {
            sb.append("()");
        }
    }

	@Override 
    public void enterParameterTypeList(SPOTParser.ParameterTypeListContext ctx) {
        sb.append('(');
    }

	@Override 
    public void exitParameterTypeList(SPOTParser.ParameterTypeListContext ctx) {
        sb.append(')');
    }

	@Override 
    public void enterCompoundStatement(SPOTParser.CompoundStatementContext ctx) {
        sb.append("{\n");
    }
	@Override public void exitCompoundStatement(SPOTParser.CompoundStatementContext ctx) {
        sb.append("}\n");
    }
    
	@Override 
    public void enterJumpStatement(SPOTParser.JumpStatementContext ctx) {
        if (ctx.Goto() != null) {
            sb.append("goto ");
            sb.append(ctx.Identifier());
        } else if (ctx.Continue() != null) {
            sb.append("continue ");
        } else if (ctx.Break() != null) {
            sb.append("break ");
        } else if (ctx.Return() != null) {
            sb.append("return ");
        }
    }

	@Override 
    public void exitJumpStatement(SPOTParser.JumpStatementContext ctx) {
        sb.append(";\n");
    }    

	@Override 
    public void enterPrimaryExpression(SPOTParser.PrimaryExpressionContext ctx) {
        TokenStream tokens = parser.getTokenStream();
        String symbol = tokens.getText(ctx);
        if (isPostfixArgs) {
            getCurrentEnv().put(
                CURRENT_THIS,
                new Symbol(symbol, SymbolType.Variable));
        } else {
            sb.append(symbol);
            sb.append(' ');
        }
        if (getCurrentEnv().containsKey(symbol)) {
            getCurrentEnv().put(
                CURRENT_SYMBOL,
                new Symbol(symbol, SymbolType.Variable));
        }
    }

	@Override 
    public void enterPostfixExpressionDot(SPOTParser.PostfixExpressionDotContext ctx) {
        String id = ctx.Identifier().toString();
        Symbol env = getCurrentEnv().get(id);

        if (env == null) {
            sb.append('[');
            sb.append(getCurrentEnv().get(
                getCurrentEnv().get(CURRENT_SYMBOL).symbol
                ).symbol);
            sb.append(':');
            sb.append(id);
            sb.append(']');
        } else if (env.type == SymbolType.Function) {
            sb.append(env.symbol);
        }
    }

	@Override 
    public void enterPostfixExpression(SPOTParser.PostfixExpressionContext ctx) {
        if (ctx.postfixExpressionArgs() != null) {
            isPostfixArgs = true;
        }
    }

	@Override 
    public void exitPostfixExpression(SPOTParser.PostfixExpressionContext ctx) {
        if (ctx.postfixExpressionArgs() != null) {
            isPostfixArgs = false;
        }
    }

    @Override 
    public void enterPostfixExpressionArgs(SPOTParser.PostfixExpressionArgsContext ctx) {
        sb.append('(');
        isPostfixArgs = false;
        if (getCurrentEnv().containsKey(CURRENT_THIS)) {
            Symbol thiss = getCurrentEnv().get(CURRENT_THIS);
            sb.append(thiss.symbol);
            if (ctx.argumentExpressionList() != null) {
                sb.append(',');
            }
        }
    }

	@Override 
    public void exitPostfixExpressionArgs(SPOTParser.PostfixExpressionArgsContext ctx) {
        
        sb.append(')');
    }

    // pseudo terminals
    @Override public void enterLpar(SPOTParser.LparContext ctx) { asis(ctx); }
    @Override public void enterRpar(SPOTParser.RparContext ctx) { asis(ctx); }
    @Override public void enterStar(SPOTParser.StarContext ctx) { asis(ctx); }
    @Override public void enterDiv(SPOTParser.DivContext ctx) { asis(ctx); }
    @Override public void enterMod(SPOTParser.ModContext ctx) { asis(ctx); }
    @Override public void enterPlus(SPOTParser.PlusContext ctx) { asis(ctx); }
    @Override public void enterMinus(SPOTParser.MinusContext ctx) { asis(ctx); }
    @Override public void enterShiftr(SPOTParser.ShiftrContext ctx) { asis(ctx); }
    @Override public void enterShiftl(SPOTParser.ShiftlContext ctx) { asis(ctx); }
    @Override public void enterLess(SPOTParser.LessContext ctx) { asis(ctx); }
    @Override public void enterMore(SPOTParser.MoreContext ctx) { asis(ctx); }
    @Override public void enterLeeq(SPOTParser.LeeqContext ctx) { asis(ctx); }
    @Override public void enterMoeq(SPOTParser.MoeqContext ctx) { asis(ctx); }
    @Override public void enterEqeq(SPOTParser.EqeqContext ctx) { asis(ctx); }
    @Override public void enterNoteq(SPOTParser.NoteqContext ctx) { asis(ctx); }
    @Override public void enterAnd(SPOTParser.AndContext ctx) { asis(ctx); }
    @Override public void enterCaret(SPOTParser.CaretContext ctx) { asis(ctx); }
    @Override public void enterOr(SPOTParser.OrContext ctx) { asis(ctx); }
    @Override public void enterAndand(SPOTParser.AndandContext ctx) { asis(ctx); }
    @Override public void enterOror(SPOTParser.OrorContext ctx) { asis(ctx); }
    @Override public void enterQuestion(SPOTParser.QuestionContext ctx) { asis(ctx); }
    @Override public void enterSemi(SPOTParser.SemiContext ctx) { asis(ctx); }
    @Override public void enterEq(SPOTParser.EqContext ctx) { asis(ctx); }
    @Override public void enterComa(SPOTParser.ComaContext ctx) { asis(ctx); }
	@Override public void enterAssignmentOperator(SPOTParser.AssignmentOperatorContext ctx) { asis(ctx); }
}
