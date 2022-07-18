
public class ReferenceType {

	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = "홍길동";
		
		System.out.println(name1 == name2); //equal address
		
		
		 name2 = "고길동";
		System.out.println(name1 == name2); //equal address
		

		 name2 = "홍길동";
		System.out.println(name1 == name2); //equal address
		
		name2 = new String("홍길동"); 
		System.out.println(name1 == name2); //equal address
		System.out.println("값이 같은지 확인" + name1.equals(name2)); //equal address
	}

}
