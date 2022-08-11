package Page468;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollect {

	public static void main(String[] args) {
		Shape s1 = new Rectangle(10,3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20,2);
		Shape s4 = new Circle(11);

		List<Shape> list = Arrays.asList(s1,s2,s3,s4);
		
		List<Shape> rectList = list.stream().filter(
				s->s instanceof Rectangle).collect(Collectors.toList());
		rectList.stream().forEach(System.out::println);
		
		Set<Shape> rectSet = list.stream().filter(
				s->s instanceof Rectangle).collect(Collectors.toSet());
		rectSet.stream().forEach(System.out::println);
	}

}
