package Page372_HashSet;
import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Object arr[] = {"홍길동","이순신","홍길동","이순신",1,2,"15","25"};
		
		Set set = new HashSet();
		
		for(int i = 0 ; i<arr.length ; i++)
			set.add(arr[i]);
		
		System.out.println(set);
	}

}
