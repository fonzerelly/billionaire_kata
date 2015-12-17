package kata.billionaire;

import java.util.Comparator;

public class PersonWorthComparator implements Comparator<Person> {

	@Override
	public int compare(Person first, Person second) {
		if (first.Worth > second.Worth) {
			return -1;
		}
		if (first.Worth < second.Worth) {
			return 1;
		}
		return 0;
	}

}
