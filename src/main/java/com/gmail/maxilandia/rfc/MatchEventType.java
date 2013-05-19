package com.gmail.maxilandia.rfc;

public enum MatchEventType {

	playerOut(18), playerIn(19), goal(1), penaltyGoal(2), yellowCard(5), secondYellowCard(4), redCard(3);
	
	private final Integer code;
	
	private MatchEventType(Integer code){
		this.code = code;
	}
	
	public static MatchEventType getMatchEventType(Integer code){
		for(MatchEventType met : MatchEventType.values()){
			if(met.code.equals(code)){
				return met;
			}
		}
		throw new IllegalArgumentException();
	}
	
}
