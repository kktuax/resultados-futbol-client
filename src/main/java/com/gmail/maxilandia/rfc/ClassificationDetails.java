package com.gmail.maxilandia.rfc;

public interface ClassificationDetails {

	public Team getTeam();
	
	/**
	 * @return Total de puntos
	 */
	public Integer getPoints();
	
	/**
	 * @return Total de partidos ganados
	 */
	public Integer getWins();
	
	/**
	 * @return Total de partidos empatados
	 */
	public Integer getDraws();
	
	/**
	 * @return Total de partidos perdidos
	 */
	public Integer getLosses();
	
	/**
	 * @return Total de goles a favor
	 */
	public Integer getGf();
	
	/**
	 * @return Total de goles en contra
	 */
	public Integer getGa();
	
}

