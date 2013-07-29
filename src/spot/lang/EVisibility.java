package spot.lang;

import java.lang.String;

public enum EVisibility {
	// The tokens are hardcoded here and in the grammar, be careful when editing.
	Public("__public"),
	Private("__private"),
	Protected("__protected");
	
	private String token;
	
	private EVisibility(String _token) {
		token = _token;
	}
	
	public String getToken() {
		return token;
	}
	
	public static EVisibility getVisFromToken(String token) {
		for (EVisibility vis : EVisibility.values()) {
			if (vis.getToken().equals(token)) {
				return vis;
			}
		}
		
		//throw new IllegalArgumentException("Unknown visibility : " + EVisibility.class.getName() + "." + token);
		return null;
	}
}
