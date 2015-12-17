package kata.billionaire.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import kata.billionaire.Person;
import kata.billionaire.Program;

public class ProgramTest {

	@Test
	public void testSortBillionairs() {
		Person rich = new Person();
		rich.Worth = 10000;
		Person middle = new Person();
		middle.Worth = 1000;
		Person poor = new Person();
		poor.Worth = 100;
		
		List<Person> billionaires = new ArrayList<Person>();
		
		billionaires.add(middle);
		billionaires.add(poor);
		billionaires.add(rich);
		
		List<Person> sortedBillionaires = new ArrayList<Person>();
		
		sortedBillionaires.add(rich);
		sortedBillionaires.add(middle);
		sortedBillionaires.add(poor);
		
		List<Person> result = Program.sortBillionairs(billionaires);
		assertArrayEquals(Program.sortBillionairs(billionaires).toArray(), sortedBillionaires.toArray());
	}

}
