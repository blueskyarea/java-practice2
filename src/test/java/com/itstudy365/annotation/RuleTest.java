package com.itstudy365.annotation;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Test for Exception
 */
public class RuleTest {

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	@Test
	public void testThrowException() {
		expectedException.expect(RuntimeException.class);
		expectedException.expectMessage("Rule test");
		throw new RuntimeException("Rule test");
	}
}