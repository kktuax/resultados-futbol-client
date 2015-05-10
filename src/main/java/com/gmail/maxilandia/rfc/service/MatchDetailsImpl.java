package com.gmail.maxilandia.rfc.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.gmail.maxilandia.rfc.LineUp;
import com.gmail.maxilandia.rfc.MatchDetails;
import com.gmail.maxilandia.rfc.MatchEvent;
import com.gmail.maxilandia.rfc.Player;
import com.gmail.maxilandia.rfc.Result;
import com.gmail.maxilandia.rfc.Team;
import com.gmail.maxilandia.rfc.service.CompleteDetailsJson.LineUps;

class MatchDetailsImpl implements MatchDetails{

	private final DetailsJson details;
	
	public MatchDetailsImpl(DetailsJson details){
		this.details = details;
	}
	
	@Override
	public Integer getId() {
		return details.id;
	}
	
	@Override
	public Date getSchedule() {
		return details.schedule;
	}
	
	@Override
	public Team getLocalTeam() {
		return new TeamImpl(details.team1, details.local, details.local_shield);
	}
	
	@Override
	public Team getVisitorTeam() {
		return new TeamImpl(details.team2, details.visitor, details.visitor_shield);
	}
	
	@Override
	public Result getResult() {
		return new ResultImpl(details.status, details.result);
	}
	
	@Override
	public String getStadium() {
		return details.stadium;
	}
	
	@Override
	public String getReferee() {
		return details.referee;
	}
	
	@Override
	public List<MatchEvent> getLocalEvents() {
		return getAllEvents(true);
	}
	
	@Override
	public List<MatchEvent> getVisitorEvents() {
		return getAllEvents(false);
	}
	
	private List<MatchEvent> getAllEvents(boolean local) {
		List<MatchEvent> matchEvents = new ArrayList<MatchEvent>();
		if(getEvents() != null){
			matchEvents.addAll(getFilteredEvents(getEvents().cards, local));
			matchEvents.addAll(getFilteredEvents(getEvents().goals, local));
			matchEvents.addAll(getFilteredEvents(getEvents().changes, local));
		}
		return matchEvents;
	}
	
	private CompleteDetailsJson.Events getEvents(){
		if(details instanceof CompleteDetailsJson){
			return ((CompleteDetailsJson) details).events;
		}
		return null;
	}
	
	private static List<MatchEvent> getFilteredEvents(List<CompleteDetailsJson.Events.Event> events, boolean local){
		List<MatchEvent> fevents = new ArrayList<MatchEvent>();
		if(events != null){
			for(CompleteDetailsJson.Events.Event event: events){
				boolean isLocal  = "local".equalsIgnoreCase(event.team);
				if(isLocal == local){
					fevents.add(new MatchEventImpl(event));
				}
			}
		}
		return fevents;
	}
	
	@Override
	public Map<Player, LineUp> getLocalLineup() {
		if(getLineUps() != null){
			return getLineup(getLineUps().local);
		}else{
			return Collections.emptyMap();
		}
	}
	
	@Override
	public Map<Player, LineUp> getVisitorLineup() {
		if(getLineUps() != null){
			return getLineup(getLineUps().visitor);
		}else{
			return Collections.emptyMap();
		}
	}
	
	private CompleteDetailsJson.LineUps getLineUps(){
		if(details instanceof CompleteDetailsJson){
			return ((CompleteDetailsJson) details).lineups;
		}
		return null;
	}
	
	private static Map<Player, LineUp> getLineup(List<CompleteDetailsJson.LineUps.Player> lineUpPlayers) {
		Map<Player, LineUp> lineUp = new LinkedHashMap<Player, LineUp>();
		if(lineUpPlayers != null){
			for(LineUps.Player p : lineUpPlayers){
				lineUp.put(new PlayerImpl(p), new LineUpImpl(p));
			}
		}	
		return lineUp;
	}

	@Override
	public Integer getGroup() {
		return details.group;
	}

	@Override
	public Integer getRound() {
		return details.round;
	}
	
}