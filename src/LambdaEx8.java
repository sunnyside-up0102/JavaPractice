import java.util.function.Function;

 class LambdaEx8 {
	static Student[] list= {
			new Student("ȫ�浿",90,80,"�İ�"),
			new Student("�̼���",95,70,"���")
			
	};
	public static void main(String[] args) {
		System.out.print("�л��� : ");
		printString(t ->t.getName());
		System.out.println("���� : ");
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