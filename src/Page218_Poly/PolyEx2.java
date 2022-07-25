package Page218_Poly;

public class PolyEx2 {

	public static void main(String[] args) {
		Child p =new Child();
		p.run();
	
//		Child c = (Child)p;
//		c.eat();
		
		((Child)p).eat();
		
		
	}

}
