package Page259_Defalt_Static;

public class Child extends Parent implements MyInterface1 {

	@Override
	public void defaltMethod() {
	System.out.println("Child Ŭ������ default �޼���");
	MyInterface1.super.defaltMethod();
	}
	
}
