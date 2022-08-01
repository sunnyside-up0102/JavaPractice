
public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("abcd");
		System.out.println("문자열 연결 저 sb1 = " +
		System.identityHashCode(sb1));
		sb1.append("efgh");
		System.out.println("문자열 연결 후 sb1 = "+
		System.identityHashCode(sb1));
		System.out.println(sb1.toString().equals("abcdefgh"));
		
		String st = "홍길동";
		System.out.println(System.identityHashCode(st));
		st = st.replace('홍', '고');
		System.out.println(System.identityHashCode(st));
		
		StringBuffer sb = new StringBuffer("홍길동");
		System.out.println(System.identityHashCode(sb));
		//sb = sb.replace(0,1,"고");
		sb.setCharAt(0, '고');
		System.out.println(System.identityHashCode(sb));
	}

}
