package com.gmail.maxilandia.rfc;

import java.util.List;
import java.util.Map;

public interface MatchDetails extends Match {

	public String getStadium();
	public String getReferee();
	public List<MatchEvent> getLocalEvents();
	public List<MatchEvent> getVisitorEvents();
	public Map<Player, LineUp> getLocalLineup();
	public Map<Player, LineUp> getVisitorLineup();
	
}


