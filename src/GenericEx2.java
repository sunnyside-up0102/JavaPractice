
public class GenericEx2 {

	public static void main(String[] args) {
		Generic<String> gen = new Generic<String>();
		String[] ss = {"È«±æµ¿","ÀÌ¼ø½Å","±èÀ¯½Å"};
		
		gen.set(ss);
		gen.print();

		
		for(Object s : gen.get) {
			System.out.println(s);
		}
		
		//////////////////////////////////
		
		Integer[] ii = {1,2,3};
		Generic<Integer> gen2 = new Generic<Integer>();
		
		gen.set(ii);
		gen.print();
		
		for(Integer o : gen2.get()) {
			System.out.println(o);
		}
	}

}

class Generic{
	Object[] v;

	void set(Object[] n) {
		v = n;
	}
	Object[] get() {
		return v;
	}
	void print() {
		for(Object o : v)
			System.out.print((o + " "));
		System.out.println();
	}
}

class Generic<T> {
	T[] v;
	
	void set(T[] n) {
		v =n;
	}
	T[] get() {
		return v;
	}
	
	void print() {
		for(T o : v) {
			System.out.println(o + " ");
		}
		System.out.println();
	}
}

