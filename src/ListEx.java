import java.util.ArrayList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		System.out.println(list);
		
		for(Object o : list) {
			System.out.print(o + " ");
		}
	}

}
