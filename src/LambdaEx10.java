import java.util.function.Predicate;

public class LambdaEx10 {
	static Student[] list= {
			new Student("ȫ�浿",90,80,"�İ�"),
			new Student("�̼���",95,70,"���"),
			new Student("������",100,60,"������")
	};
	public static void main(String[] args) {
	double avg = avgEng( t->t.getMajor().equals("�İ�"));
	System.out.println("�İ��� ��� ���� ���� : " + avg);
	}
	private static double avgEng(Predicate<Student> predicate) {
		int count,sum;
		count = sum = 0;
		for(Student s : list) {
			if(predicate.test(s)) {
				count++;
				sum += s.getEng();
			}
			return (double)sum/count;
		}
	}
}
