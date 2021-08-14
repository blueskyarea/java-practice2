package com.itstudy365.mock.jmockit;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import mockit.Expectations;
import mockit.Injectable;
import mockit.Tested;
import mockit.integration.junit4.JMockit;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.itstudy365.mock.jmockit.Foo;
import com.itstudy365.mock.jmockit.Hoge;

@RunWith(JMockit.class)
public class HogeTest2 {
	@Tested private Hoge hogeTested;
	@Injectable private Foo foo;
	
	@Test
	public void testHogeFooIsMock() {
		assertThat(hogeTested.foo.methodString("mock"), nullValue());
	}
	
	@Test
	public void testHogeMethodHasIntValue() {
		final String abcString = "abc";
		new Expectations() {{
			foo.methodString(abcString); result = "return from methodString";
		}};
		
		assertThat(hogeTested.methodHoge(abcString), is("return from methodString"));
	}
}
