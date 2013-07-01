
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;

public class ExtractPawnListener extends SPOTBaseListener {

    SPOTParser parser;

    protected String enumOfClass(String className) {
        return "SPClass_"+className;
    }

    public ExtractPawnListener(SPOTParser parser) {
        this.parser = parser;
    }

    /** Listen to matches of spclass */
    @Override
    public void enterSpClass(SPOTParser.SpClassContext ctx){
        System.out.println(
            "enum " + enumOfClass(ctx.Identifier().toString()) + " {"
        );
    }

    @Override
    public void exitSpClass(SPOTParser.SpClassContext ctx) {
        System.out.println("};");
    }

    /** Listen to matches of member */
    @Override
    public void enterVariableBase(SPOTParser.VariableBaseContext ctx)
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
}
