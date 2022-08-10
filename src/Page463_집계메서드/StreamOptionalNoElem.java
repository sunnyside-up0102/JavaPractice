package Page463_집계메서드;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamOptionalNoElem {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		long count  = list.stream().count();
		System.out.println("요소들의 개수" + count);
		
		int sum  =list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("요소들의 합" + sum);
		
		OptionalInt first = list.stream().mapToInt(Integer::intValue).findFirst();
		if(first.isPresent()) {
			System.out.println("요소들 중 첫 번째 값 : " + first.getAsInt());
		}

		int max = list.stream().mapToInt(Integer::intValue).max().orElse(0);
		System.out.println("요소들 중 최대 값 : " + max);
		
		int min = list.stream().mapToInt(Integer::intValue).min().orElse(0);
		System.out.println("요소들 중 최소 값 : " + min);
		
		Double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0);
		System.out.println("요소들 중 평균 값 : " + avg);
	}

}
