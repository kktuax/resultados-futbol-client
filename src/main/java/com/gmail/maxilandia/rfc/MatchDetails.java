package com.gmail.maxilandia.rfc;

import java.util.List;
import java.util.Map;

public interface MatchDetails extends Match {

	public String getStadium();
	public String getReferee();
	public List<MatchEvent> getEvents();
	public Map<Player, LineUp> getLocalLineup();
	public Map<Player, LineUp> getVisitorLineup();
	
	public interface LineUp{
		public Integer getRole();
	}
	
}

