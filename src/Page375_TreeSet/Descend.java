package Page375_TreeSet;
import java.util.Comparator;;
public class Descend implements Comparator{

	@Override
	public int Compare (Object o1, Object o2) {
		Comparable c1 = (Comparable)o1;
		Comparable c2 = (Comparable)o2;
		
//		return c1.compareTo(c2)*-1;
//		c1 > c2 : +
//		c1 == c2 : 0
//		c1 < c2 : -
	}
	
}
