
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;
import java.lang.StringBuilder;

public class ExtractPawnListener extends SPOTBaseListener {

    SPOTParser parser;

    protected String enumOfClass(String className) {
        return "SPClass_"+className;
    }

    public ExtractPawnListener(SPOTParser parser) {
        this.parser = parser;
    }
}
