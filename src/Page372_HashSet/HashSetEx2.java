package Page372_HashSet;
import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add(new String ("abc"));
		set.add(new String ("abc"));
		
		set.add(new Member("ȫ�浿",40));
		set.add(new Member("ȫ�浿",40));
		System.out.println(set);

	}

}
