import java.util.function.Predicate;

public class LambdaEx10 {
	static Student[] list= {
			new Student("홍길동",90,80,"컴공"),
			new Student("이순신",95,70,"통계"),
			new Student("김유신",100,60,"빅데이터")
	};
	public static void main(String[] args) {
	double avg = avgEng( t->t.getMajor().equals("컴공"));
	System.out.println("컴공과 평균 영어 점수 : " + avg);
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
