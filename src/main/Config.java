package main;

public class Config {
	private String UniversalPrefix = "_SPO_";
	private String PathCore = "../core/";
	
	public String getUniversalPrefix() {
		return UniversalPrefix;
	}
	public void setUniversalPrefix(String universalPrefix) {
		UniversalPrefix = universalPrefix;
	}
	
	public String getPathCore() {
		return PathCore;
	}
	public void setPathCore(String pathCore) {
		PathCore = pathCore;
	}
}
