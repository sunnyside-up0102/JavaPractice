
public class ReferenceType {

	public static void main(String[] args) {
		String name1 = "ȫ�浿";
		String name2 = "ȫ�浿";
		
		System.out.println(name1 == name2); //equal address
		
		
		 name2 = "��浿";
		System.out.println(name1 == name2); //equal address
		

		 name2 = "ȫ�浿";
		System.out.println(name1 == name2); //equal address
		
		name2 = new String("ȫ�浿"); 
		System.out.println(name1 == name2); //equal address
		System.out.println("���� ������ Ȯ��" + name1.equals(name2)); //equal address
	}

}
