
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;

public class ExtractEnumListener extends SPOTBaseListener {
    SPOTParser parser;
    public ExtractEnumListener(SPOTParser parser) {this.parser = parser;}
    /** Listen to matches of spclass */
    @Override
    public void enterSpclass(SPOTParser.SpclassContext ctx){
        System.out.println("enum SPClass_"+ctx.Identifier()+" {");
    }
    @Override
    public void exitSpclass(SPOTParser.SpclassContext ctx) {
        System.out.println("};");
    }

    /** Listen to matches of member */
    @Override
    public void enterMember(SPOTParser.MemberContext ctx)
    {
        // need parser to get tokens
        TokenStream tokens = parser.getTokenStream();
        String tag = null;
        if ( ctx.tag()!=null ) {
            tag = tokens.getText(ctx.tag());
        }
        System.out.println("\t"+(tag==null ? "" : tag+":")+ctx.Identifier()+";");
    }
}
