package kata.billionaire.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import kata.billionaire.Person;

public class PersonTest {

	@Test
	public void itShouldRepresentAllItsDataAsString() {
		Person p = new Person();
		p.Rank = 1;
		p.Name = "Hans Meier";
		p.Citizenship = "german";
		p.Age = 42;
		p.Worth = 1234567.89;
		p.Source = "Forbes Magazine";
		assertEquals(p.toString(), "1 Hans Meier german 42 1234567.89 Forbes Magazine");
	}
	
	@Test
	public void itShouldProvideWorthViaGetter() {
		Person p = new Person();
		p.Worth = 42;
		assertEquals(42, p.getWorth(), 0.0);
	}

}
