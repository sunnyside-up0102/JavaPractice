package Page468;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;

public class StreamGroupingBy {

	public static void main(String[] args) {
		Shape s1 = new Rectangle(10,3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20,2);
		Shape s4 = new Circle(11);

		List<Shape> list = Arrays.asList(s1,s2,s3,s4);
		
		try {
			Map<Object, List<Shape>> map = list.stream()
					.collect(Collector.groupingBy(f -> f.getClass()));
			System.out.println("�簢�� ���");
			map.get(Class.forName().stream()
					.foreach(f->System.out.println(f)));
			
			System.out.println("�� ���");
			map.get(Class.forName().stream()
					.foreach(f->System.out.println(f)));
		}catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
