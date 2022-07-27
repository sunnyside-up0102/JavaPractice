package Page269_InnerClass;

public class LoclaInnerEx {
	int i = 10;
	void outerMethod() {
		class Inner {		//local class
			int x = 20;
			int i = 30;
			void innerMethod() {
				System.out.println(x);
				System.out.println(i);
				System.out.println(this.i);
				System.out.println(LoclaInnerEx.this.i);
			}
			
		}
		Inner inn = new Inner();
		inn.innerMethod();
	}
	public static void main(String[] args) {
		LoclaInnerEx lie = new LoclaInnerEx();
		lie.outerMethod();

	}

}
