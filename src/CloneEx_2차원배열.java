
public class CloneEx_2차원배열 {

	public static void main(String[] args) {
		//	.clone() : 2차원도 복제 가능(deep copy)
		String[][] table1 = new String[][] {
			{"홍길동","25세","187.3cm"},
			{"이순신","35세","177.7cm"}
		};
		String[][] table2 = new String[table1.length][table1[0].clone().length];
		
		table2 = table1.clone();
		for(String[] t1 : table2)
			for(String t2 : t1)
				System.out.println(t2);
		
		System.exit(0);
	}
	
}
