import java.util.Arrays;

public class CloneEx {

	public static void main(String[] args) {
		String[] arr = {"ȫ�浿","�̼���","������","���߱�"};
		String[] arr2 = arr.clone();
		
		System.out.println(arr==arr2);	//�ּ� ��
		for(String v : arr2)
			System.out.println(v);
		
		String[] arr3 = new String[arr.length];
		System.arraycopy(arr, 0, arr3, 0, arr.length);
		System.out.println(arr==arr3);	//�ּ� ��
		for(String v : arr3)
			System.out.println(v);
		
		String[] arr4 = Arrays.copyOf(arr,arr.length);
		System.out.println(arr==arr4);	//�ּ� ��
		for(String v : arr3)
			System.out.println(v);

		
		//�߰��ϱ�
		arr4[3] = "������";
		for(String v : arr)
			System.out.println(v);

	}

}
