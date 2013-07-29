package spot.main;

import spot.lang.state.ScopeStateBase;
import spot.parser.SPOTParser;
import spot.util.state.IStateful;

// Too much?
public interface IStatefulExtractor extends IStateful {

	public abstract SPOTParser getParser();

	public abstract ExtractorConfig getConfig();

	public abstract ScopeStateBase getCurrentState();

	public abstract String getTranslation();

}