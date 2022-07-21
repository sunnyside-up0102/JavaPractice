package InitializeBlock;

public class initEx {

	initEx(){
		System.out.println("생성자 호출");
	}
	
	static {
		System.out.println("클래스 초기화 블럭 실행");
	}
	
	{
		System.out.println("인스턴스 초기화 블럭 실행");
	}
	
	public static void main(String[] args) {
		System.out.println("main() 매서드 시작");
		System.out.println("main init1 객체 생성 : ");
		initEx init1 = new initEx();
		System.out.println("main init2 객체 생성 : ");
		initEx init2 = new initEx();
		
	}

}
