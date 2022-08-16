import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
public class EncodingDecoding_ch18 {
	public static void main(String[] args) {
		String str = "한글";
		
		byte[] defaults = str.getBytes();
		byte[] ms949 = str.getBytes("ms949");
		byte[] utf_8 = str.getBytes("utf_8");
		byte[] euc_kr = str.getBytes("euc_kr");
		
		System.out.println("기본(스스템) : " + Arrays.toString(defaults));
		System.out.println("ms949 : " + Arrays.toString(ms949));
		System.out.println("utf-8 : " + Arrays.toString(utf_8));
		System.out.println("euc-kr : " + Arrays.toString(euc_kr));
		
		String result = null;
		result = new String(defaults);
		System.out.println("기본(스스템) : " + result);
		
		result = new String(ms949,"ms949");
		System.out.println("기본(스스템) : " + result);
		System.out.println("ms949 : " + Arrays.toString(ms949));
		System.out.println("utf-8 : " + Arrays.toString(utf_8));
		System.out.println("euc-kr : " + Arrays.toString(euc_kr));
	}

}
