package Page259_Defalt_Static;

public class Child extends Parent implements MyInterface1 {

	@Override
	public void defaltMethod() {
	System.out.println("Child 클래스의 default 메서드");
	MyInterface1.super.defaltMethod();
	}
	
}
