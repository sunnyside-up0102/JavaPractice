import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IteratorEx {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(new String[] {"ȫ�浿","������","�̼���","������"});
		System.out.println("for �� �̿�");
		for(int i =0;i<list.size();i++)
			System.out.println(list.get(i));
		
		System.out.println("�ܺ� �ݺ��� �̿�");
		Iterator<String> it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("���� �ݺ��� �̸�");
		list.stream().forEach(s->System.out.println(s));
		
		System.out.printf("%n%n");
		
		Stream<String> stream = list.stream();
		stream = stream.map(s->s + " ");
		Collector<String, ?, List<String>> coll = Collectors.toList();
		List<String> list1 = stream.collect(coll);
		for(String s : list1)
			System.out.print(s);
	}
}
