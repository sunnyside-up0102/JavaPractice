package userMethod;

import java.util.Scanner;

public class UserMethod01 {
	static int num1,num2;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//�ΰ��� ������ Ű����� �Է¹���
		System.out.print("ù��° ���� : ");
		num1 = scan.nextInt();
		System.out.print("�ι�° ���� : ");
		num2 = scan.nextInt();
		
		if(num1>num2)
			swapVal();
		
		//UserMethod01 um = new UserMethod01();
		//um.sumVal(num1,num2);
		int result = sumVal(num1,num2);
		System.out.println(num1 + "����" + num2 +"���� ����" + result);
		
	}
	
	static int sumVal(int num1,int num2) {
		int sum = 0;
		for(int i = num1;i<=num2;i++)
			sum+=i;
		
		return sum;
	}
	
	static void swapVal() {
		int temp;
		
		temp= num1;
		num1=num2;
		num2=temp;
		
	}

}
