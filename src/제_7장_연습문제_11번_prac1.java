
public class 제_7장_연습문제_11번_prac1 {

	public static void main(String[] args) {
		
		int[] arr = {9,5,24,13,3,21};
		
		MathEx m = new Math();
		int max = m.max(arr);
		int min = m.min(arr);
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}

class MathEx{
	public int max(int[] arr) {
		int temp =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > temp) {
				temp = arr[i];
			}
		}
		return temp;
	}
	public int min(int[] arr) {
		int tmp = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<tmp) {
				tmp = arr[i];
			}
		}
		return tmp;
	}
}
