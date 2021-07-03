package com.itstudy365.json;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.io.IOException;

import com.itstudy365.json.JsonSetterExample;

import org.junit.Test;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSetterExampleTest {

	@Test
	public void test() throws JsonProcessingException, IOException {
		String json = "{\"key\":10,\"name\":\"my name\"}";
		JsonSetterExample entity = new ObjectMapper().readerFor(JsonSetterExample.class).readValue(json);
		assertThat(entity.getKey(), is(10));
		assertThat(entity.getName(), is("my name"));
		assertTrue(entity.getMemo() == null);
	}
}
