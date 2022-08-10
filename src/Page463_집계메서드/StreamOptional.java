package Page463_����޼���;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamOptional {

	public static void main(String[] args) {
		int[] arr = new int [100];
		for(int i =0;i<arr.length;i++) {
			arr[i] = i+1;
		}
		long count  = Arrays.stream(arr).count();
		System.out.println("��ҵ��� ����" + count);
		
		int sum  = Arrays.stream(arr).sum();
		System.out.println("��ҵ��� ��" + sum);
		
		OptionalInt first = Arrays.stream(arr).findFirst();
		System.out.println("��ҵ� �� ù ��° �� : " + first.getAsInt());
		
		OptionalInt max = Arrays.stream(arr).max();
		System.out.println("��ҵ� �� �ִ� �� : " + max.getAsInt());
		
		OptionalInt min = Arrays.stream(arr).min();
		System.out.println("��ҵ� �� �ּ� �� : " + min.getAsInt());
		

		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println("��ҵ� �� ��� �� : " + avg.getAsDouble());
	}

}
