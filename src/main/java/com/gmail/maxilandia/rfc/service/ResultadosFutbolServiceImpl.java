package com.gmail.maxilandia.rfc.service;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gmail.maxilandia.rfc.ClassificationDetails;
import com.gmail.maxilandia.rfc.League;
import com.gmail.maxilandia.rfc.Match;
import com.gmail.maxilandia.rfc.MatchDetails;

public class ResultadosFutbolServiceImpl implements ResultadosFutbolService{

	public ResultadosFutbolServiceImpl(){
		this.mapper = new ObjectMapper();
		this.mapper.setTimeZone(TimeZone.getTimeZone("Europe/Madrid"));
	}
	
	@Override
	public List<League> getLeagues(String country){
		List<League> leaguesList = new ArrayList<League>();
		try{
			StringBuilder urlBuilder = getApiUrlBuilder("leagues");
			if(country != null){
				urlBuilder.append("&country=");
				urlBuilder.append(country);
			}
            URL url = new URL(urlBuilder.toString());
            LOGGER.info("Realizando peticion: " + url);
        	InputStream input = url.openStream();
        	LeaguesJson leagues = mapper.readValue(input, LeaguesJson.class);
        	leaguesList.addAll(leagues.getLeague());
        	input.close();
		}catch (Exception e) {
			LOGGER.warn(e.getMessage());
		}
		return leaguesList;
	}

	@Override
	public List<Match> getMatches(League league, Integer group, Integer round) {
		List<Match> matchesList = new ArrayList<Match>();
		try{
			StringBuilder urlBuilder = getApiUrlBuilder("matchs");
			urlBuilder.append("&league=");
			urlBuilder.append(league.getId());
			if(group != null){
				urlBuilder.append("&group=");
				urlBuilder.append(group);
			}
			if(round != null){
				urlBuilder.append("&round=");
				urlBuilder.append(round);
			}
            URL url = new URL(urlBuilder.toString());
            LOGGER.info("Realizando peticion: " + url);
        	InputStream input = url.openStream();
        	MatchesJson matches = mapper.readValue(input, MatchesJson.class);
        	matchesList.addAll(matches.getMatch());
        	input.close();
		}catch (Exception e) {
			LOGGER.warn(e.getMessage());
		}
		return matchesList;
	}
	
	@Override
	public List<ClassificationDetails> getClassification(League league, Integer group, Integer round) {
		List<ClassificationDetails> clasification = new ArrayList<ClassificationDetails>();
		try{
			StringBuilder urlBuilder = getApiUrlBuilder("tables");
			urlBuilder.append("&league=");
			urlBuilder.append(league.getId());
			if(group != null){
				urlBuilder.append("&group=");
				urlBuilder.append(group);
			}
			if(round != null){
				urlBuilder.append("&round=");
				urlBuilder.append(round);
			}
            URL url = new URL(urlBuilder.toString());
            LOGGER.info("Realizando peticion: " + url);
        	InputStream input = url.openStream();
        	TableJson table = mapper.readValue(input, TableJson.class);
        	clasification.addAll(table.getTable());
        	input.close();
		}catch (Exception e) {
			LOGGER.warn(e.getMessage());
		}
		return clasification;
	}
	
	@Override
	public MatchDetails getMatchDetails(Match match) {
		try{
			StringBuilder urlBuilder = getApiUrlBuilder("match");
			urlBuilder.append("&id=");
			urlBuilder.append(match.getId());
            URL url = new URL(urlBuilder.toString());
            LOGGER.info("Realizando peticion: " + url);
            InputStream input = url.openStream();
            DetailsJson details;
            try{
            	details = mapper.readValue(input, CompleteDetailsJson.class);
            }catch (JsonMappingException e) {
            	LOGGER.debug("No se pudieron obtener todos los detalles");
            	input = url.openStream();
            	details = mapper.readValue(input, DetailsJson.class);
			}
            input.close();
        	return new MatchDetailsImpl(details);
		}catch (Exception e) {
			LOGGER.warn(e.getMessage());
			return null;
		}
	}
	
	private StringBuilder getApiUrlBuilder(String requestName){
		StringBuilder urlBuilder = new StringBuilder();
		urlBuilder.append(BASE_URL);
		urlBuilder.append("key=");
		urlBuilder.append(key);
		urlBuilder.append("&format=json");
		urlBuilder.append("&req=");
		urlBuilder.append(requestName);
		return urlBuilder;
	}

	private ObjectMapper mapper;
	
	public void setMapper(ObjectMapper mapper) {
		this.mapper = mapper;
	}
	
	private String key;
	
	public void setKey(String key) {
		this.key = key;
	}

	private static final String BASE_URL = "http://www.resultados-futbol.com/scripts/api/api.php?";
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ResultadosFutbolServiceImpl.class);
	
}