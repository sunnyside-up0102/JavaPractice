import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("test3.txt");
			fw.write('A');
			char[] buf = {'b','c','d'};
			
			fw.write(buf);
			fw.write(buf,1,2);
			fw.write("저는 홍길동입니다");
			
			fw.flush();
			fw.close();
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
	}

}
