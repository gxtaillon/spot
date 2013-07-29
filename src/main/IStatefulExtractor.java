package main;

import lang.state.ScopeStateBase;
import parser.SPOTParser;
import util.state.IStateful;

// Too much?
public interface IStatefulExtractor extends IStateful {

	public abstract SPOTParser getParser();

	public abstract ExtractorConfig getConfig();

	public abstract ScopeStateBase getCurrentState();

	public abstract String getTranslation();

}