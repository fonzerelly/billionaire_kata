package kata.billionaire.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import kata.billionaire.OfWorth;
import kata.billionaire.WorthComparator;

public class WorthComparatorTest {

	class OfWorthInstance implements OfWorth {
		public double Worth;
		@Override
		public double getWorth() {
			return this.Worth;
		}
	}
	
	private OfWorthInstance rich;
	private OfWorthInstance poor;
	@Before
	public void setUp() throws Exception {
		rich = new OfWorthInstance();
		rich.Worth = 9876543.21;
		
		poor = new OfWorthInstance();
		poor.Worth = 1234567.89;
	}

	@Test
	public void itShouldBePositiveWhenComparingRichWithPoor() {
		assertTrue(new WorthComparator().compare(rich, poor) < 0);
	}
	
	@Test
	public void itShouldBeNegativeWhenComparingPoorWithRich() {
		assertTrue(new WorthComparator().compare(poor, rich) > 0);
	}
	
	@Test 
	public void itShouldBeZeroWhenComparingOfWorthInstanceWhithItself() {
		assertEquals(new WorthComparator().compare(rich, rich), 0);
	}
	
	@Test
	public void itShouldAlsoDifferenciateTinyDifferences() {
		OfWorthInstance slightlyRicher = new OfWorthInstance();
		slightlyRicher.Worth = rich.Worth + 0.001;
		assertTrue(new WorthComparator().compare(slightlyRicher, rich) < 0);
		
	}

}
