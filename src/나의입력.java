import java.util.Scanner;

//���ڳ�, �Ǽ� �Է� �� ����ó��.

class ����{
	private int age;
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}

public class �����Է� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean exceptingState;
		���� inData = new ����();
		
		
		do {
			System.out.print("���� : ");
			exceptingState = false;
			try {
			inData.setAge(scan.nextInt());
			}
			catch(Exception e) {
				System.out.println("���� �߻�");
				exceptingState = true;
			}
			finally {
				scan.nextLine(); //�Է¹��� �ʱ�ȭ
			}
		}while(exceptingState);
		
		System.out.println("����� ���̴� : " + inData.getAge()+ "���̱���");
	}

}
