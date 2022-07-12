
public class StringImmutable {
	public static void main(String[] args) {
		String word = "Golf";
		System.out.println(word.charAt(3));
		//word.charAt(3) = 'd'; 이건 오류남
		//instance(객체) : 메모리에 할당된 상태. (string class는 immutable하기 때문)
		//class String은 immutable한 instance를 생성한다.
		
		word = "Gold";//word는 vaiable이므로 당연히 mutable하다.
	}
}
