import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamOrder {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동","김유신","유관순");
		
		System.out.println("기본정렬");
		list.stream().sorted().forEach(System.out::println);
		System.out.println();
		System.out.println("역순정렬");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
