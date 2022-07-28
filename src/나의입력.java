import java.util.Scanner;

//글자나, 실수 입력 시 예외처리.

class 나이{
	private int age;
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}

public class 나의입력 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean exceptingState;
		나이 inData = new 나이();
		
		
		do {
			System.out.print("나이 : ");
			exceptingState = false;
			try {
			inData.setAge(scan.nextInt());
			}
			catch(Exception e) {
				System.out.println("예외 발생");
				exceptingState = true;
			}
			finally {
				scan.nextLine(); //입력버퍼 초기화
			}
		}while(exceptingState);
		
		System.out.println("당신의 나이는 : " + inData.getAge()+ "살이군요");
	}

}
