import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int num = keyboard.nextInt();
		
		//System.out.println("�Է��� ���ڴ� : " + num);
		
		//���׿�����
		//String result = num % 2 == 1 ? "Ȧ��" : "¦��";
		//System.out.println(result);
		
		//if�Լ�
		
		if(num %2==1) 
			System.out.println("Ȧ��");
		else
			System.out.println("¦��");
	}

}
