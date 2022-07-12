
public class ScopeEx {
	
	int no;
	static int no2;
	
	public static void main(String[] args) {
		String name;
		
		if(true) {
			name = "KWAK";
			String email = "kwak@test.com";
		}
		//System.out.println(email); 
		
		System.out.println(new ScopeEx().no);
		ScopeEx se = new ScopeEx();
		se.no = 1050;
		System.out.println(se.no); 
		no2 = -2800;
		System.out.println(no2); 
		se.test();
	}
	
	
	public void test() {
		System.out.println("여기는 test() 멤버 함수!"); 
	}
}
