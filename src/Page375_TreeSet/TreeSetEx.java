package Page375_TreeSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		SortedSet set = new TreeSet();
		String from = "bat";
		String to = "d";
		
		set.add("ant"); set.add("alias"); set.add("batman");
		set.add("aha"); set.add("cola"); set.add("Cola");
		set.add("ddr"); set.add("dance"); set.add("dEEE");
		set.add("deee"); set.add("ever"); set.add("giant");
		set.add("zoo");

		System.out.println(set); //대문자의 아스키코드가 작아서 앞에 온다!
		System.out.println("from : " + from + ", to :" +to);
		System.out.println(set.subSet(from,to));
		System.out.println("from : " + from + ", to :" +to + "zzzz");
		System.out.println(set.subSet(from,to + "zzzz"));
		
		//내림차순 정렬
		set = new TreeSet(new Descend());
		set.add("ant"); set.add("alias"); set.add("batman");
		set.add("aha"); set.add("cola"); set.add("Cola");
		set.add("ddr"); set.add("dance"); set.add("dEEE");
		set.add("deee"); set.add("ever"); set.add("giant");
		set.add("zoo");
		
		System.out.println(set);
		System.out.println("from : " + from + ", to :" +to + "zzzz");
		System.out.println(set.subSet(to,from + "zzzz"));
		
	}

}
