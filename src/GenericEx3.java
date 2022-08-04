
public class GenericEx3 {

	public static void main(String[] args) {
		Generic2<String,Integer> gen1 = new Generic2<String,Integer>();
		gen1.set(("ȫ�浿",1111);
		
		System.out.println();
	}
}

class Generic2<k,v> {
	K name;
	V id;
	void set(K name, V id) {
		this.name = name;
		this.id = id;
	}
	K getName() {
		return name;
	}
	V getAge() {
		return age;
	}
}