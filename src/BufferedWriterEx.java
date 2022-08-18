import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("Test4.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write('a');
			char[] buf = {'b','c','d'};
			bw.write(buf);
			bw.write(buf,1,2);
			
			bw.write("저는 홍길동입니다");
			
			bw.flush();
			bw.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
