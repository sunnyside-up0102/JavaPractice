
public class ClassEx {

	public static void main(String[] args) {

		EnvEx env = new EnvEx();
		
		Class c1 = env.getClass();	//객체를 이용하는 방법
		System.out.println(c1.getName());
		
		try {
			Class c2 = Class.forName("EnvEx"); //문자열 주소를 이용하는 방법
			System.out.println(c2.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
