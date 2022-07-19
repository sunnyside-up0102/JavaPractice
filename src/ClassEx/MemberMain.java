package ClassEx;

public class MemberMain {

	public static void main(String[] args) {
		Member m = new Member();
		//Member m2 = new Member();
		Member m2 = m;
		if(m == m2) //이때 ==는 주소가 같은지
			System.out.println("m과m2는 동일한 객체이다");
		else
			System.out.println("m과m2는 서로 다른 객체이다");
	}

}
