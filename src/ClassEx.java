
public class ClassEx {

	public static void main(String[] args) {

		EnvEx env = new EnvEx();
		
		Class c1 = env.getClass();	//��ü�� �̿��ϴ� ���
		System.out.println(c1.getName());
		
		try {
			Class c2 = Class.forName("EnvEx"); //���ڿ� �ּҸ� �̿��ϴ� ���
			System.out.println(c2.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
