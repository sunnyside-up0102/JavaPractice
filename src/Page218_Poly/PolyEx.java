package Page218_Poly;

public class PolyEx {

	public static void main(String[] args) {
		Child c =new Child();
		c.run();
		
		////////////////Áß¿ä
		
		Parent p = new Child();	//poly-morphism
		p.run();
		p.walk();
	}

}
