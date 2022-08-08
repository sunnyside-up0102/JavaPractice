import java.util.function.Function;

 class LambdaEx8 {
	static Student[] list= {
			new Student("홍길동",90,80,"컴공"),
			new Student("이순신",95,70,"통계")
			
	};
	public static void main(String[] args) {
		System.out.print("학생명 : ");
		printString(t ->t.getName());
		System.out.println("전공 : ");
		printInt(t->t.getEng());
		
	}

	static void printString(Function<Student,String> f) {
		for(Student s : list)
			System.out.print(f.apply(s) + " ");
	}
	
	static void printInt(Function<Student,Integer>f) {
		for(Student s : list) {
			System.out.print(f.apply(s)+" ");
		}
		System.out.println();
	}
	static void printString(Function<Student,String>f) {
		for(Student s : list) {
			System.out.print(f.apply(s)+" ");
		}
		System.out.println();
	}
	
}
class Student{
	private String name,major;
	private int eng,math;
	
	public Student(String name, int eng, int math,String major) {
		this.name = name;
		this.eng = eng;
		this.math = math;
		this.major = major;
	}
	public String getName() {
		return name;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public String getMajor() {
		return major;
	}
}