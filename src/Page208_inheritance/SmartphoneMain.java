package Page208_inheritance;

public class SmartphoneMain {

	public static void main(String[] args) {
		Phone p = new Phone();
		p.name = "��ȭ��";
		p.company = "����";
		p.color = "white";
		
		
		///////////////////////////////////
		
		SmartPhone sp = new SmartPhone();
		sp.name = "������";
		sp.company = "�Ｚ";
		sp.color = "black";
		
		

		System.out.println("Smartphone ���");
		System.out.println(sp.name);
		System.out.println(sp.company);
		System.out.println(sp.color);
		sp.call();
		sp.receive();
		sp.installApp();
	}

}
