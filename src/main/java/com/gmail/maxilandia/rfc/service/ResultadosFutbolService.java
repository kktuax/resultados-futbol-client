package com.gmail.maxilandia.rfc.service;

import java.util.List;
import java.util.NoSuchElementException;

import com.gmail.maxilandia.rfc.ClassificationDetails;
import com.gmail.maxilandia.rfc.League;
import com.gmail.maxilandia.rfc.Match;
import com.gmail.maxilandia.rfc.MatchDetails;

public interface ResultadosFutbolService {

	public List<League> getLeagues(String country);
	
	public League getLastLeagueWithName(String country, String name) throws NoSuchElementException;
	
	public List<Match> getMatches(League league, Integer group, Integer round);
	
	public MatchDetails getNextMatchDetails(League league, String teamName) throws NoSuchElementException;
	
	public MatchDetails getLastFinishedMatchDetails(League league, String teamName) throws NoSuchElementException;
	
	public List<ClassificationDetails> getClassification(League league, Integer group, Integer round);
	
	public MatchDetails getMatchDetails(Match match);
	
}
