package Page208_inheritance;

public class SmartphoneMain {

	public static void main(String[] args) {
		Phone p = new Phone();
		p.name = "전화기";
		p.company = "현대";
		p.color = "white";
		
		
		///////////////////////////////////
		
		SmartPhone sp = new SmartPhone();
		sp.name = "갤럭시";
		sp.company = "삼성";
		sp.color = "black";
		
		

		System.out.println("Smartphone 출력");
		System.out.println(sp.name);
		System.out.println(sp.company);
		System.out.println(sp.color);
		sp.call();
		sp.receive();
		sp.installApp();
	}

}
