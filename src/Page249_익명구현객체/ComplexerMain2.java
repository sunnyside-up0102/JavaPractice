package Page249_익명구현객체;

public class ComplexerMain2 {
	public static void main(String[] args) {
		Fax fax=new Fax() {
			@Override
			public void send(String tel) {
				System.out.println("send");
			}
			public void receive(String tel) {
				System.out.println("receive");
			}
		};
		fax.send("1234");
	}
	
}
