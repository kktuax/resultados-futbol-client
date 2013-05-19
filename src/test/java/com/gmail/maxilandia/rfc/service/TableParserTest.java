package com.gmail.maxilandia.rfc.service;

import java.io.InputStream;

import junit.framework.Assert;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TableParserTest {

	@Test
	public void parseTableTest() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		InputStream input = getClass().getResourceAsStream("/ejemplo-clasificacion.json");
		TableJson table = mapper.readValue(input, TableJson.class);
		Assert.assertFalse(table.getTable().isEmpty());
		TableJson.TableEl tableEl = table.getTable().get(0);
		Assert.assertNotNull(tableEl.getTeam());
		Assert.assertNotNull(tableEl.getPoints());
	}

}
