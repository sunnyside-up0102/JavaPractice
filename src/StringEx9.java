//string와 stringBuffer 공통점 : thread safe하다.
//stringBuilder : 단일 스레드에서 빠르고 안전하다.
//String : immutable
//StringBuffer , StringBuilder : mutable 
public class StringEx9 {

	public static void main(String[] args) {
		String str1  ="abcd";
		String str2  ="abcd";
		
		System.out.println("str1 = " + System.identityHashCode(str1));
		System.out.println("str2 = " + System.identityHashCode(str2));
		
		str1 = str1 + "efg";
		System.out.println("str1 = " + System.identityHashCode(str1));
	}

}
