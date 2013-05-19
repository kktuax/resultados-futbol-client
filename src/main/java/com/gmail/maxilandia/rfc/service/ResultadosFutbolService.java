package com.gmail.maxilandia.rfc.service;

import java.util.List;

import com.gmail.maxilandia.rfc.ClassificationDetails;
import com.gmail.maxilandia.rfc.League;
import com.gmail.maxilandia.rfc.Match;
import com.gmail.maxilandia.rfc.MatchDetails;

public interface ResultadosFutbolService {

	public List<League> getLeagues(String country);
	
	public List<Match> getMatches(League league, Integer group, Integer round);
	
	public List<ClassificationDetails> getClassification(League league, Integer group, Integer round);
	
	public MatchDetails getMatchDetails(Match match);
	
}
