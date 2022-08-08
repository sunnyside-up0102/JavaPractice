import java.util.function.IntBinaryOperator;

 class LambdaREx9 {
	static Student[] list= {
			new Student("ȫ�浿",90,80,"�İ�"),
			new Student("�̼���",95,70,"���"),
			new Student("������",100,60,"������")
	};
	
	public static void main(String[] args) {
		System.out.print("�ִ� ���� ����");
		int max = MaxOrMinMath (a,b)->{
			if(a>=b)
				return a;
			else return b;
		});
		System.out.println(max);
		
		System.out.println("�ּ� ���� ����");
		System.out.println(MaxOrMinMath((a,b)->(a<=b?a:b)));
		
		System.out.println("�ִ� ��� ����");
		System.out.println(MaxOrMinAvg((a,b)->(a>=b?a:b)));
		
		System.out.println("�ּ� ��� ����");
		System.out.println(MaxOrMinMin((a,b)->(a<=b?a:b)));
	}
	private static int MaxOrMinMath(IntBinaryOperator op) {
		int result = list[0].getMath();
		for(Student s : list)
			result = op.applyAsInt(result, s.getMath());
		return result;
	}
}
