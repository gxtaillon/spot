
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;
import java.lang.StringBuilder;

public class ExtractPawnListener extends SPOTBaseListener {

    SPOTParser parser;
    StringBuilder postEnum;

    protected String enumOfClass(String className) {
        return "SPClass_"+className;
    }

    public ExtractPawnListener(SPOTParser parser) {
        this.parser = parser;
        this.postEnum = new StringBuilder();
    }

    /** Listen to matches of spClassDeclaration */
    @Override
    public void enterSpClassDeclaration(SPOTParser.SpClassDeclarationContext ctx){
        System.out.println(
            "enum " + enumOfClass(ctx.Identifier().toString()) + " {"
        );
    }

    @Override
    public void exitSpClassDeclaration(SPOTParser.SpClassDeclarationContext ctx) {
        System.out.println("};");
        System.out.println(postEnum);
    }

    /** Listen to matches of variableDeclaration */
    @Override
    public void enterVariableDeclaration(SPOTParser.VariableDeclarationContext ctx)
    {
        // need parser to get tokens
        TokenStream tokens = parser.getTokenStream();
        String tag = null;
        if ( ctx.tag()!=null ) {
            tag = tokens.getText(ctx.tag());
        }
        System.out.println(
            "\t" + (tag == null ? "" : tag + ":") + ctx.Identifier() + ";"
        );
    }

    /** Listen to matches of fonctionDeclarationHead */
	@Override
    public void enterFonctionDeclarationHead(SPOTParser.FonctionDeclarationHeadContext ctx) {
        TokenStream tokens = parser.getTokenStream();
        String accq = "", tag = "", params = "";
        if (ctx.accessQualifier() != null) {
            accq = tokens.getText(ctx.accessQualifier()) + " ";
        }
        if (ctx.tag() != null) {
            tag = tokens.getText(ctx.tag()) + ":";
        }
        if (ctx.variableDeclarationList() != null) {
            params = tokens.getText(ctx.variableDeclarationList());
        }
        postEnum.append(String.format(
            "%s%s%s(%s)\n",
            accq, tag, ctx.Identifier(), params
        ));
    }
	@Override 
    public void exitFonctionDeclaration(SPOTParser.FonctionDeclarationContext ctx) { }


    /** Listen to matches of fonctionDeclarationBody */
	@Override 
    public void enterFonctionDeclarationBody(SPOTParser.FonctionDeclarationBodyContext ctx) {
        TokenStream tokens = parser.getTokenStream();
        postEnum.append(String.format(
            "%s\n",
            tokens.getText(ctx)
        ));
    }

	@Override 
    public void exitFonctionDeclarationBody(SPOTParser.FonctionDeclarationBodyContext ctx) { }
}
