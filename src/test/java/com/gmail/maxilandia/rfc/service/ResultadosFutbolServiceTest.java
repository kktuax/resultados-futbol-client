package com.gmail.maxilandia.rfc.service;

import java.util.List;

import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;

import com.gmail.maxilandia.rfc.ClassificationDetails;
import com.gmail.maxilandia.rfc.League;
import com.gmail.maxilandia.rfc.Match;

public class ResultadosFutbolServiceTest{

	@Ignore
	@Test	
	public void testService(){
		ResultadosFutbolServiceImpl resultadosFutbolServiceImpl = new ResultadosFutbolServiceImpl();
		resultadosFutbolServiceImpl.setKey("key");
		List<League> leagues = resultadosFutbolServiceImpl.getLeagues("es");
		Assert.assertFalse(leagues.isEmpty());
		List<Match> matches = resultadosFutbolServiceImpl.getMatches(leagues.get(0), null, null);
		Assert.assertFalse(matches.isEmpty());
		List<ClassificationDetails> classification = resultadosFutbolServiceImpl.getClassification(leagues.get(0), null, null);
		Assert.assertFalse(classification.isEmpty());
	}
	
}