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
			fw.write("���� ȫ�浿�Դϴ�");
			
			fw.flush();
			fw.close();
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
	}

}
