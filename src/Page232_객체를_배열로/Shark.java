package Page232_객체를_배열로;

public class Shark extends Animal {
	Shark(String type,String name){
		super(type,name);
	}
	
	void sleep() {
		System.out.println(this.name + " 바다에서 잠을 잔다.");
	}
}
