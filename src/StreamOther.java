import java.util.Arrays;

public class StreamOther {

	public static void main(String[] args) {
		int intArr[] = {10,20,30,40,50,60};
		
		Arrays.stream(intArr).asDoubleStream().forEach(d->System.out.println(d));
		System.out.println();					
		
		Arrays.stream(intArr).boxed().forEach(i->System.out.println(i));
	}

}
