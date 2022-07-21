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
		System.out.println(stuCnt + " 명의 학생이 입장했습니다");
	}
	
}
