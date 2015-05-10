package com.gmail.maxilandia.rfc.service;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.gmail.maxilandia.rfc.League;
import com.gmail.maxilandia.rfc.MatchDetails;

public class ResultadosFutbolServiceTest{

	@Ignore("necesita key")
	@Test	
	public void testService(){
		ResultadosFutbolServiceImpl rfsi = new ResultadosFutbolServiceImpl();
		rfsi.setKey("key");
		League league = rfsi.getLastLeagueWithName("es", "Segunda División");
		MatchDetails details = rfsi.getLastFinishedMatchDetails(league, "Racing");
		Assert.assertNotNull(details);
	}

}