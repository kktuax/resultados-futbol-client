package com.gmail.maxilandia.rfc.service;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gmail.maxilandia.rfc.League;
import com.gmail.maxilandia.rfc.json.Leagues;

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
        	InputStream input = url.openStream();
        	Leagues leagues = mapper.readValue(input, Leagues.class);
        	leaguesList.addAll(leagues.getLeague());
        	input.close();
		}catch (Exception e) {
			LOGGER.warn(e.getMessage());
		}
		return leaguesList;
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
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ResultadosFutbolServiceTest.class);
	
}