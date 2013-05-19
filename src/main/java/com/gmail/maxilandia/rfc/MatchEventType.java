package com.gmail.maxilandia.rfc;

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
	
}
