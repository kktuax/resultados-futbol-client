package com.gmail.maxilandia.rfc.service;

import java.io.InputStream;

import junit.framework.Assert;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gmail.maxilandia.rfc.service.Table.TableEl;

public class TableParserTest {

	@Test
	public void parseTableTest() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		InputStream input = getClass().getResourceAsStream("/ejemplo-clasificacion.json");
		Table table = mapper.readValue(input, Table.class);
		Assert.assertFalse(table.getTable().isEmpty());
		Table.TableEl tableEl = table.getTable().get(0);
		Assert.assertNotNull(tableEl.getId());
		Assert.assertNotNull(tableEl.getPoints());
	}

}
