package InitializeBlock;

public class Student {
	String name;
	static int stuCnt;
	static {
		stuCnt = 0;
	}
	
	Student(String name){
		this.name = name;
		stuCnt++;
		System.out.println(stuCnt + " ���� �л��� �����߽��ϴ�");
	}
	
}
