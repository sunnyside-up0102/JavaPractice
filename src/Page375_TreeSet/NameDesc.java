package Page375_TreeSet;

import java.util.Comparator;

public class NameDesc implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Member2 m1 = (Member2)o1;
		Member2 m2 = (Member2)o2;
		
		return m1.compareTo(m2) * -1;
		//이름 기준 : 내림차순
	}

}
