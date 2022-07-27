package Page269_InnerClass;

public class A {
	void A(){
		System.out.println("A 객체 생성");
	}
	static class B{
		B(){
			System.out.println("B 객체 생성");
		}
		
		int var1;
		static int var2;
		
		void method1() {
			System.out.println("static 내부 클래스의 method1()");
		}
		static void method2() {
			System.out.println("static 내부 클래스의 method2()");
		}
		
	}
	//instance inner class
	public class C{
		C(){
			System.out.println("C 객체 생성");
		}
		
		int var1;
		
		void method1() {
			System.out.println("인스턴트 내부 클래스의 method1()");
		}
	}
	
	//member method of outer class
	void method() {
		//local inner class
		class D {
			D(){
				System.out.println("D 객체 생성");
		}
		int val1;
		
		void method1() {
			System.out.println("로컬 내부 클래스의 method1()");
		}
	}
	D d = new D();
	d.method1();
	d.val1 = 3;
	
}

}
