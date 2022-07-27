package Page259_Defalt_Static;

public interface MyInterface1 {
	String Myinterface = null;

	default void defaltMethod() {
		System.out.println("Myinterface ÀÇ default method");
	}
}