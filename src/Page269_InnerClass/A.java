package Page269_InnerClass;

public class A {
	void A(){
		System.out.println("A ��ü ����");
	}
	static class B{
		B(){
			System.out.println("B ��ü ����");
		}
		
		int var1;
		static int var2;
		
		void method1() {
			System.out.println("static ���� Ŭ������ method1()");
		}
		static void method2() {
			System.out.println("static ���� Ŭ������ method2()");
		}
		
	}
	//instance inner class
	public class C{
		C(){
			System.out.println("C ��ü ����");
		}
		
		int var1;
		
		void method1() {
			System.out.println("�ν���Ʈ ���� Ŭ������ method1()");
		}
	}
	
	//member method of outer class
	void method() {
		//local inner class
		class D {
			D(){
				System.out.println("D ��ü ����");
		}
		int val1;
		
		void method1() {
			System.out.println("���� ���� Ŭ������ method1()");
		}
	}
	D d = new D();
	d.method1();
	d.val1 = 3;
	
}

}
