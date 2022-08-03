package Page375_TreeSet;

import java.util.Comparator;

public class Agedesc implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Member2 m1 = (Member2)o1;
		Member2 m2 = (Member2)o2;
		
		return m2.age - m1.age;
		//나이 기준 : 내림차순
		
	}

}
