package AAA_Prac;

public class LocalInnerEx {
		int i = 10;
		
		void outerMethod() {
			class Inner{
				int x = 20;
				int i = 30;
				void innerMethod() {
					int x = 40;
					int i = 50;
					System.out.println(x);
					System.out.println(i);
					System.out.println(this.i);
					System.out.println(LocalInnerEx.this.i);
				}
			}
			Inner inn = new Inner();
			inn.innerMethod();
		}
	
	public static void main(String[] args) {
		LocalInnerEx lic = new LocalInnerEx();
		lic.outerMethod();
	}
}
