package com.gmail.maxilandia.rfc;

public interface League {

	public Integer getId();
	
	public String getName();
	
	public String getCountry();
	
	public Integer getYear();
	
	/**
	 * @return Numero total de grupos
	 */
	public Integer getTotalGroupCount();
	
	/**
	 * @return Numero total de jornadas
	 */
	public Integer getTotalRoundCount();
	
}
