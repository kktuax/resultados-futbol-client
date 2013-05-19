package com.gmail.maxilandia.rfc.service;

import com.gmail.maxilandia.rfc.MatchEvent;
import com.gmail.maxilandia.rfc.MatchEventType;
import com.gmail.maxilandia.rfc.Player;

class MatchEventImpl implements MatchEvent {

	private final CompleteDetailsJson.Events.Event event;
	
	public MatchEventImpl(CompleteDetailsJson.Events.Event event){
		this.event = event;
	}
	
	@Override
	public Player getPlayer() {
		return new PlayerImpl(event);
	}
	
	@Override
	public Integer getMinute() {
		return event.minute;
	}
	
	@Override
	public MatchEventType getEvent() {
		try{
			return MatchEventType.getMatchEventType(event.action_type);
		}catch (Exception e) {
			return null;
		}
	}
	
}
