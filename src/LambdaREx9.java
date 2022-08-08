import java.util.function.IntBinaryOperator;

 class LambdaREx9 {
	static Student[] list= {
			new Student("홍길동",90,80,"컴공"),
			new Student("이순신",95,70,"통계"),
			new Student("김유신",100,60,"빅데이터")
	};
	
	public static void main(String[] args) {
		System.out.print("최대 수학 점수");
		int max = MaxOrMinMath (a,b)->{
			if(a>=b)
				return a;
			else return b;
		});
		System.out.println(max);
		
		System.out.println("최소 수학 점수");
		System.out.println(MaxOrMinMath((a,b)->(a<=b?a:b)));
		
		System.out.println("최대 평균 점수");
		System.out.println(MaxOrMinAvg((a,b)->(a>=b?a:b)));
		
		System.out.println("최소 평균 점수");
		System.out.println(MaxOrMinMin((a,b)->(a<=b?a:b)));
	}
	private static int MaxOrMinMath(IntBinaryOperator op) {
		int result = list[0].getMath();
		for(Student s : list)
			result = op.applyAsInt(result, s.getMath());
		return result;
	}
}
