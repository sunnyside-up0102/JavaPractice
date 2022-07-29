import java.util.Arrays;

public class CloneEx {

	public static void main(String[] args) {
		String[] arr = {"홍길동","이순신","김유신","안중근"};
		String[] arr2 = arr.clone();
		
		System.out.println(arr==arr2);	//주소 비교
		for(String v : arr2)
			System.out.println(v);
		
		String[] arr3 = new String[arr.length];
		System.arraycopy(arr, 0, arr3, 0, arr.length);
		System.out.println(arr==arr3);	//주소 비교
		for(String v : arr3)
			System.out.println(v);
		
		String[] arr4 = Arrays.copyOf(arr,arr.length);
		System.out.println(arr==arr4);	//주소 비교
		for(String v : arr3)
			System.out.println(v);

		
		//추가하기
		arr4[3] = "유관순";
		for(String v : arr)
			System.out.println(v);

	}

}
