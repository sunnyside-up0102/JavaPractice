import java.io.FileOutputStream;
import java.io.IOException;

public class FieOutputStreamEx2 {

	public static void main(String[] args) {
	try {
		FileOutputStream fos = new FileOutputStream("test2.txt",true);
		byte[] b = new byte[26];
		byte data = 'A';
		for(int i = 0 ; i<b.length ; i++)
			b[i] = data++;
		fos.write(b);
	}catch(IOException e) {
		e.printStackTrace();
		}
	}

}
