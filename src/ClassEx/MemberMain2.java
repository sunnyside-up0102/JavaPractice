package ClassEx;

public class MemberMain2 {
	MemberMain2(){
		;
	}
	public static void main(String[] args) {
		MemberMain2 m = new MemberMain2();
		MemberMain2 m2 = new MemberMain2();
		
		if(m == m2) //이때 ==는 주소가 같은지
			System.out.println("m과m2는 동일한 객체이다");
		else
			System.out.println("m과m2는 서로 다른 객체이다");
	}

}
