

public class MethodCall {
	
	public static void main(String[] args) {
		
		Method.printName();
		
		
		
		Method m = new Method();
		m.printEmail();
		
	}
	
}
	
	class Method {
		
		static void printName() {
			System.out.println("printName����");
		}
		
		void printEmail() {
			System.out.println("printEmail����");	
			printId();
		}
		void printId() {
			System.out.println("printId����");
		}
	}


