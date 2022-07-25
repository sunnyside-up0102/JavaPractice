package Page218_Poly;

public class Child extends Parent {
	String name;
	//overriding 
	void run() {
		System.out.println("자식이 달린다");
	}
	
	//member method append
	void eat() {
		System.out.println("자식이 먹는다");
	}
}
