import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesEx {

	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		try {
			Properties pr = new Properties();
			
			FileInputStream reader = new FileInputStream(
			"C:\\Users\\denni\\OneDrive\\���� ȭ��\\AllAboutJava\\JavaPractice\r\n"					
					);
			pr.load(reader);
			System.out.println(pr);
			System.out.println("�̸� : " + pr.getProperty("name"));
			
			pr.put("subject","�ڹ�");
				System.out.println(pr);
				pr.store(new FileOutputStream()
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}

}
