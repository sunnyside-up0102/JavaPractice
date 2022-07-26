package Page232_객체를_배열로;

public class Lion extends Animal {
	Lion(String type,String name){
		super(type,name);
	}
	
	void sleep() {
		System.out.println(this.name + " 산에서 잠을 잔다.");
	}
}
