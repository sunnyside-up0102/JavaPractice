
public class GenericEx {

	public static void main(String[] args) {
		NoGeneric nogen = new NoGeneric();
		String[] ss = {"È«±æµ¿","ÀÌ¼ø½Å","±èÀ¯½Å"};
		
		nogen.set(ss);
		nogen.print();

		Object[] objs = nogen.get();
		for(Object o : objs) {
			String s = (String)o;
			System.out.println(o);
		}
		
		//////////////////////////////////
		
		Integer[] ii = {1,2,3};
		nogen.set(ii);
		nogen.print();
		
		objs = nogen.get();
		
		for(Object o : objs) {
			Integer s  =(Integer) o;
			System.out.println(o);
			
		}
	}

}

class NoGeneric{
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
		System.out.print();
	}
}
