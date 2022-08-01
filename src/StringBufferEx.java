
public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("abcd");
		System.out.println("���ڿ� ���� �� sb1 = " +
		System.identityHashCode(sb1));
		sb1.append("efgh");
		System.out.println("���ڿ� ���� �� sb1 = "+
		System.identityHashCode(sb1));
		System.out.println(sb1.toString().equals("abcdefgh"));
		
		String st = "ȫ�浿";
		System.out.println(System.identityHashCode(st));
		st = st.replace('ȫ', '��');
		System.out.println(System.identityHashCode(st));
		
		StringBuffer sb = new StringBuffer("ȫ�浿");
		System.out.println(System.identityHashCode(sb));
		//sb = sb.replace(0,1,"��");
		sb.setCharAt(0, '��');
		System.out.println(System.identityHashCode(sb));
	}

}
