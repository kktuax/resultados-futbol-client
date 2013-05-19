package com.gmail.maxilandia.rfc.service;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gmail.maxilandia.rfc.League;
import com.gmail.maxilandia.rfc.Match;
import com.gmail.maxilandia.rfc.MatchDetails;

public class ResultadosFutbolServiceTest{

	@Test	
	public void testService(){
		ResultadosFutbolServiceImpl resultadosFutbolServiceImpl = new ResultadosFutbolServiceImpl();
		resultadosFutbolServiceImpl.setKey("c40e8357c67bbfa4733aebed947efec2");
		List<League> leagues = resultadosFutbolServiceImpl.getLeagues("es");
		Assert.assertFalse(leagues.isEmpty());
		List<Match> matches = resultadosFutbolServiceImpl.getMatches(leagues.get(0), null, null);
		Assert.assertFalse(matches.isEmpty());
		for(Match m : matches){
			try{
				MatchDetails md = resultadosFutbolServiceImpl.getMatcheMatchDetails(m);
			}catch (Exception e) {
				LOGGER.warn("Error obteniendo detalles del partido: " + m.getId());
				e.printStackTrace();
			}
			
		}
		
		//List<ClassificationDetails> classification = resultadosFutbolServiceImpl.getClassification(leagues.get(0), null, null);
		//Assert.assertFalse(classification.isEmpty());
	}
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ResultadosFutbolServiceTest.class);
	
}