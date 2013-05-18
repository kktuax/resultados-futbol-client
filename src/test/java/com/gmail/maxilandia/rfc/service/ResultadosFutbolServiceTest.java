package com.gmail.maxilandia.rfc.service;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import com.gmail.maxilandia.rfc.League;
import com.gmail.maxilandia.rfc.Match;

public class ResultadosFutbolServiceTest{

	@Test	
	public void testService(){
		ResultadosFutbolServiceImpl resultadosFutbolServiceImpl = new ResultadosFutbolServiceImpl();
		resultadosFutbolServiceImpl.setKey("c40e8357c67bbfa4733aebed947efec2");
		List<League> leagues = resultadosFutbolServiceImpl.getLeagues("es");
		Assert.assertFalse(leagues.isEmpty());
		List<Match> matches = resultadosFutbolServiceImpl.getMatches(leagues.get(0), null, null);
		Assert.assertFalse(matches.isEmpty());
	}
	
}