
public class ��_5��_��������_2�� {

	public static void main(String[] args) {
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				evenSum += i;
			}
			if(i%2==1) {
				oddSum+=i;
			}
		}
		System.out.println("¦�� ��:" + evenSum);
		System.out.println("Ȧ�� ��:" + oddSum);
	}

}
