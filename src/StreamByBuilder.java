import java.util.stream.Stream;

public class StreamByBuilder {

	public static void main(String[] args) {
		Stream<String> stream = Stream.generate(()->"�ֱ���").limit(10);
		stream.forEach(s->System.out.println(s));

	}

}
