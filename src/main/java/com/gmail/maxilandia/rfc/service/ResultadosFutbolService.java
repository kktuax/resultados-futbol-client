package com.gmail.maxilandia.rfc.service;

import java.util.List;

import com.gmail.maxilandia.rfc.League;
import com.gmail.maxilandia.rfc.Match;

public interface ResultadosFutbolService {

	public List<League> getLeagues(String country);
	
	public List<Match> getMatches(League league, Integer group, Integer round);
	
}
