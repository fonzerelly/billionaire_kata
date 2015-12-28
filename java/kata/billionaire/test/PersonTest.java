package kata.billionaire.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import kata.billionaire.Person;

public class PersonTest {
	
	Person p;
	
	@Before
	public void setUp() {
		String[] params = new String[]{"1","Hans Meier", "german", "42", "1234567.8900", "Forbes Magazine"};
		p = new Person(params);
	}

	
	@Test
	public void itShouldRepresentAllItsDataAsString() {
		assertEquals(p.toString(), "1 Hans Meier german 42 1234567.89 Forbes Magazine");
	}
	
	@Test
	public void itShouldProvideWorthViaGetter() {
		assertEquals(1234567.89, p.getWorth(), 0.0);
	}

}
