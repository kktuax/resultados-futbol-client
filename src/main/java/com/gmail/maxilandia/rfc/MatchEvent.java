package com.gmail.maxilandia.rfc;

public interface MatchEvent {

	public Player getPlayer();
	
	public MatchEvent.Team getTeam();
	
	public Integer getMinute();
	
	public String getEvent();
	
	public String getEventIcon();
	
	public enum Team{
		local, visitor
	}
	
}
