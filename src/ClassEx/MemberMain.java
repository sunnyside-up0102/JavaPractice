package ClassEx;

public class MemberMain {

	public static void main(String[] args) {
		Member m = new Member();
		//Member m2 = new Member();
		Member m2 = m;
		if(m == m2) //�̶� ==�� �ּҰ� ������
			System.out.println("m��m2�� ������ ��ü�̴�");
		else
			System.out.println("m��m2�� ���� �ٸ� ��ü�̴�");
	}

}
