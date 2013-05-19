package com.gmail.maxilandia.rfc.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.gmail.maxilandia.rfc.MatchDetails;
import com.gmail.maxilandia.rfc.MatchEvent;
import com.gmail.maxilandia.rfc.Player;
import com.gmail.maxilandia.rfc.Result;
import com.gmail.maxilandia.rfc.Team;
import com.gmail.maxilandia.rfc.service.Details.LineUps;

class MatchDetailsImpl implements MatchDetails{

	private final Details details;
	
	public MatchDetailsImpl(Details details){
		this.details = details;
	}
	
	public Integer getId() {
		return details.id;
	}
	public Date getSchedule() {
		return details.schedule;
	}
	public Team getLocalTeam() {
		return new TeamImpl(details.team1, details.local, details.local_shield);
	}
	public Team getVisitorTeam() {
		return new TeamImpl(details.team2, details.visitor, details.visitor_shield);
	}
	public Result getResult() {
		try{
			return new ResultImpl(details.result);
		}catch (Exception e) {
			return null;
		}
	}
	public String getStadium() {
		return details.stadium;
	}
	public String getReferee() {
		return details.referee;
	}
	public List<MatchEvent> getEvents() {
		List<MatchEvent> matchEvents = new ArrayList<MatchEvent>();
		if(details.events != null){
			if(details.events.cards != null) matchEvents.addAll(details.events.cards);
			if(details.events.goals != null) matchEvents.addAll(details.events.goals);
			if(details.events.changes != null) matchEvents.addAll(details.events.changes);
		}
		return matchEvents;
	}
	public Map<Player, LineUp> getLocalLineup() {
		Map<Player, LineUp> lineUp = new LinkedHashMap<Player, MatchDetails.LineUp>();
		if(details.lineups != null){
			if(details.lineups.getLocal() != null){
				for(LineUps.Player p : details.lineups.getLocal()){
					lineUp.put(p, p);
				}
			}
		}
		return lineUp;
	}
	public Map<Player, LineUp> getVisitorLineup() {
		Map<Player, LineUp> lineUp = new LinkedHashMap<Player, MatchDetails.LineUp>();
		if(details.lineups != null){
			if(details.lineups.getVisitor() != null){
				for(LineUps.Player p : details.lineups.getVisitor()){
					lineUp.put(p, p);
				}
			}
		}
		return lineUp;
	}
	
}
