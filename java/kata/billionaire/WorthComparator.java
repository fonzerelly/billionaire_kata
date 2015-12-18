package kata.billionaire;

import java.util.Comparator;

public class WorthComparator implements Comparator<OfWorth> {

	@Override
	public int compare(OfWorth first, OfWorth second) {
		if (first.getWorth() > second.getWorth()) {
			return -1;
		}
		if (first.getWorth() < second.getWorth()) {
			return 1;
		}
		return 0;
	}

}
