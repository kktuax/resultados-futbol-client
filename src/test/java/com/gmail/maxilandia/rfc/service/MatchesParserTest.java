package com.gmail.maxilandia.rfc.service;

import java.io.InputStream;
import java.util.TimeZone;

import junit.framework.Assert;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MatchesParserTest {

	@Test
	public void parseMatchesTest() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		mapper.setTimeZone(TimeZone.getTimeZone("Europe/Madrid"));
		InputStream input = getClass().getResourceAsStream("/ejemplo-resultados.json");
		Matches matches = mapper.readValue(input, Matches.class);
		Assert.assertFalse(matches.getMatch().isEmpty());
		Matches.Match match = matches.getMatch().get(0);
		Assert.assertNotNull(match.getId());
		Assert.assertNotNull(match.getSchedule());
	}

}
