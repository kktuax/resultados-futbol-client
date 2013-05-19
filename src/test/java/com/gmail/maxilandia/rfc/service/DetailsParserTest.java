package com.gmail.maxilandia.rfc.service;

import java.io.InputStream;
import java.util.TimeZone;

import junit.framework.Assert;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gmail.maxilandia.rfc.MatchDetails;

public class DetailsParserTest {

	@Test
	public void parseDetailsTest() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		mapper.setTimeZone(TimeZone.getTimeZone("Europe/Madrid"));
		{
			String ejemplo = "/ejemplo-detalles.json";
			InputStream input = getClass().getResourceAsStream(ejemplo);
			MatchDetails details = new MatchDetailsImpl(mapper.readValue(input, CompleteDetailsJson.class));
			Assert.assertNotNull(details.getId());
			Assert.assertNotNull(details.getSchedule());
			Assert.assertFalse(details.getLocalEvents().isEmpty());
			Assert.assertFalse(details.getLocalLineup().isEmpty());
		}{
			String ejemplo = "/ejemplo-detalles-2.json";
			InputStream input = getClass().getResourceAsStream(ejemplo);
			MatchDetails details = new MatchDetailsImpl(mapper.readValue(input, DetailsJson.class));
			Assert.assertNotNull(details.getId());
			Assert.assertNotNull(details.getSchedule());
			Assert.assertTrue(details.getLocalEvents().isEmpty());
			Assert.assertTrue(details.getLocalLineup().isEmpty());
		}
	}

}
