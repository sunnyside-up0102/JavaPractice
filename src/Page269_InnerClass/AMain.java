package Page269_InnerClass;

public class AMain {
	public static void main(String[] args) {
		A a = new A();
		
		A.B b = new A.B();
		b.var1 = 3;
		b.method1();
		A.B.var2 = 3;
		A.B.method2();
		
		A.C c = a.new C();
		c.var1 = 3;
		c.method1();
		a.method();
		
	}
}
