package kata.billionaire.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import kata.billionaire.Person;
import kata.billionaire.PersonWorthComparator;

public class PersonWorthComparatorTest {

	private Person rich;
	private Person poor;
	@Before
	public void setUp() throws Exception {
		rich = new Person();
		rich.Worth = 9876543.21;
		
		poor = new Person();
		poor.Worth = 1234567.89;
	}

	@Test
	public void itShouldBePositiveWhenComparingRichWithPoor() {
		assertTrue(new PersonWorthComparator().compare(rich, poor) < 0);
	}
	
	@Test
	public void itShouldBeNegativeWhenComparingPoorWithRich() {
		assertTrue(new PersonWorthComparator().compare(poor, rich) > 0);
	}
	
	@Test 
	public void itShouldBeZeroWhenComparingPersonWhithItself() {
		assertEquals(new PersonWorthComparator().compare(rich, rich), 0);
	}
	
	@Test
	public void itShouldAlsoDifferenciateTinyDifferences() {
		Person slightlyRicher = new Person();
		slightlyRicher.Worth = rich.Worth + 0.001;
		assertTrue(new PersonWorthComparator().compare(slightlyRicher, rich) < 0);
		
	}

}
