
public class StringEx {
	public static void main(String[] args) {
		String name;
		name = "홍길동";
		
		String name2 = "홍길동";
		
		System.out.println(name==name2); //equal address?
		
		name2= "고길동";
		System.out.println(name==name2);
		
		name2 = "홍길동";
		System.out.println("주소 같음?: " + (name==name2));
		System.out.println("내용 같음? : " + name.equals(name2)); //equal contents?

		System.out.println("--------------------------------");
		String name5 = new String("홍길동");
		System.out.println("주소 같음? : " + (name==name5));
		System.out.println("내용 같음? : " + name.equals(name5)); //equal contents?

	}
}