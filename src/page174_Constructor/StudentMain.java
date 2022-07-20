package page174_Constructor;

public class StudentMain {

	public static void main(String[] args) {
		Student stu = new Student("홍길동",4,"소프웨어학과");

		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.department);
	}

}
