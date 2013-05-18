package com.gmail.maxilandia.rfc.service;

import java.io.InputStream;

import junit.framework.Assert;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class LeaguesParserTest {

	@Test
	public void parseLeaguesTest() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		InputStream input = getClass().getResourceAsStream("/ejemplo-ligas.json");
		Leagues leagues = mapper.readValue(input, Leagues.class);
		Assert.assertFalse(leagues.getLeague().isEmpty());
		Leagues.League league = leagues.getLeague().get(0);
		Assert.assertNotNull(league.getId());
		Assert.assertNotNull(league.getName());
	}

}
