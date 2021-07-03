package com.itstudy365.annotation;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class RunWithTest {
	public static class TestForNumber {
		@Test
        public void additionTest() {
            int actual = 1 + 2;
            assertThat(actual, is(3)); 
        }
		
		@Test
		public void subtractionTest() {
			int actual = 1 - 2;
            assertThat(actual, is(-1)); 
		}
	}
	
	public static class TestForCharacter {
		@Test
        public void additionTest() {
            String actual = "a" + "b";
            assertThat(actual, is("ab")); 
        }
		
		@Test
		public void replaceTest() {
			String actual = "a".replace("a", "b");
            assertThat(actual, is("b")); 
		}
	}
}
