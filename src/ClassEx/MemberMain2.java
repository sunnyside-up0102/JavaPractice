package ClassEx;

public class MemberMain2 {
	MemberMain2(){
		;
	}
	public static void main(String[] args) {
		MemberMain2 m = new MemberMain2();
		MemberMain2 m2 = new MemberMain2();
		
		if(m == m2) //�̶� ==�� �ּҰ� ������
			System.out.println("m��m2�� ������ ��ü�̴�");
		else
			System.out.println("m��m2�� ���� �ٸ� ��ü�̴�");
	}

}
