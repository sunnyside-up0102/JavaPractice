package Page463_����޼���;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamOptionalNoElem {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		long count  = list.stream().count();
		System.out.println("��ҵ��� ����" + count);
		
		int sum  =list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("��ҵ��� ��" + sum);
		
		OptionalInt first = list.stream().mapToInt(Integer::intValue).findFirst();
		if(first.isPresent()) {
			System.out.println("��ҵ� �� ù ��° �� : " + first.getAsInt());
		}

		int max = list.stream().mapToInt(Integer::intValue).max().orElse(0);
		System.out.println("��ҵ� �� �ִ� �� : " + max);
		
		int min = list.stream().mapToInt(Integer::intValue).min().orElse(0);
		System.out.println("��ҵ� �� �ּ� �� : " + min);
		
		Double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0);
		System.out.println("��ҵ� �� ��� �� : " + avg);
	}

}
