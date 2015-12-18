package kata.billionaire.test;

import static org.junit.Assert.*;

import org.junit.Test;

import kata.billionaire.CountryBalance;

public class CountryBalanceTest {

	@Test
	public void testToString() {
		CountryBalance c = new CountryBalance();
		c.Billionares = 10;
		c.Worth = 42.12345;
		c.Name = "Honduras";
		
		assertEquals("Honduras 10 42,12", c.toString());
	}
	
	@Test
	public void testGetWorth() {
		CountryBalance c = new CountryBalance();
		c.Worth = 42;
		assertEquals(42, c.getWorth(), 0.0);
	}

}
