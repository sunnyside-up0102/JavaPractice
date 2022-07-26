package Page250_익명구현개체의_다중구현;

public class ComplexerMain3 {

	public static void main(String[] args) {
		ComplexerInterface ci = new ComplexerInterface() {
			
			@Override
			public void send(String tel) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void receive(String tel) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void scan() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				
			}
		};
		
		ci.send("1234");
		ci.receive("5678");
		ci.print();
		ci.scan();

	}

}
