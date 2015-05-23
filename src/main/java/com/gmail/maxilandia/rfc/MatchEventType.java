package com.gmail.maxilandia.rfc;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

public enum MatchEventType {

	/** Jugador sale
	 * 
	 */
	playerOut(18), 
	
	/** Jugador entra
	 * 
	 */
	playerIn(19), 
	
	/** Gol
	 * 
	 */
	goal(1), 
	
	/** Gol marcado de penalty
	 * 
	 */
	penaltyGoal(2), 

	/** Gol en propia puerta
	 * 
	 */
	ownGoal(6), 
	
	/** Gol de falta
	 * 
	 */
	foulGoal(13), 
	
	/** Tarjeta amarilla
	 * 
	 */
	yellowCard(5), 
	
	/** Segunda amarilla (y roja)
	 * 
	 */
	secondYellowCard(4), 
	
	/** Tarjeta roja
	 * 
	 */
	redCard(3);
	
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
	
	public Predicate<MatchEvent> matchEventPredicate(){
		final MatchEventType type = this;
		return new Predicate<MatchEvent>() {
			@Override
			public boolean apply(MatchEvent input) {
				return type.equals(input.getEvent());
			}
		};
	}
	
	@SuppressWarnings("unchecked")
	public static final Predicate<MatchEvent> GOAL_PREDICATE = Predicates.or(
		MatchEventType.goal.matchEventPredicate(), 
		MatchEventType.ownGoal.matchEventPredicate(),
		MatchEventType.penaltyGoal.matchEventPredicate(),
		MatchEventType.foulGoal.matchEventPredicate()
	);
	
	@SuppressWarnings("unchecked")
	public static final Predicate<MatchEvent> CARD_PREDICATE = Predicates.or(
		MatchEventType.yellowCard.matchEventPredicate(), 
		MatchEventType.secondYellowCard.matchEventPredicate(),
		MatchEventType.redCard.matchEventPredicate()
	);
	
	public static final Predicate<MatchEvent> CHANGE_PREDICATE = Predicates.or(
		MatchEventType.playerIn.matchEventPredicate(), 
		MatchEventType.playerOut.matchEventPredicate()
	);
	
}
