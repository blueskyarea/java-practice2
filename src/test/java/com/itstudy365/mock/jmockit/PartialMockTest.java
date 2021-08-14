package com.itstudy365.mock.jmockit;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import mockit.Expectations;
import mockit.integration.junit4.JMockit;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.itstudy365.mock.jmockit.PartialMock;

@RunWith(JMockit.class)
public class PartialMockTest {

	@Test
	public void testMethodA_WithoutPartialMock() {
		PartialMock partialMock = new PartialMock();
		assertThat(partialMock.methodA(5), is(10));
	}

	@Test
	public void testMethodA_WithPartialMock() {
		final PartialMock partialMock = new PartialMock();
		
		// changed behavior of methodB
		new Expectations(partialMock) {{
			partialMock.methodB(); result = 10;
		}};
		
		assertThat(partialMock.methodA(5), is(15));
	}
}
