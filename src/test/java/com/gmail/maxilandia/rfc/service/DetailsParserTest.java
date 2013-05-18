package com.gmail.maxilandia.rfc.service;

import java.io.InputStream;
import java.util.TimeZone;

import junit.framework.Assert;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DetailsParserTest {

	@Test
	public void parseDetailsTest() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		mapper.setTimeZone(TimeZone.getTimeZone("Europe/Madrid"));
		InputStream input = getClass().getResourceAsStream("/ejemplo-detalles.json");
		Details details = mapper.readValue(input, Details.class);
		Assert.assertNotNull(details.getId());
		Assert.assertNotNull(details.getSchedule());
		Assert.assertFalse(details.getEvents().getCards().isEmpty());
		Assert.assertFalse(details.getEvents().getGoals().isEmpty());
		Assert.assertFalse(details.getLineups().getLocal().isEmpty());
	}

}
