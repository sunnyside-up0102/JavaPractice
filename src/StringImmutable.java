
public class StringImmutable {
	public static void main(String[] args) {
		String word = "Golf";
		System.out.println(word.charAt(3));
		//word.charAt(3) = 'd'; �̰� ������
		//instance(��ü) : �޸𸮿� �Ҵ�� ����. (string class�� immutable�ϱ� ����)
		//class String�� immutable�� instance�� �����Ѵ�.
		
		word = "Gold";//word�� vaiable�̹Ƿ� �翬�� mutable�ϴ�.
	}
}
