
public class CloneEx_2�����迭 {

	public static void main(String[] args) {
		//	.clone() : 2������ ���� ����(deep copy)
		String[][] table1 = new String[][] {
			{"ȫ�浿","25��","187.3cm"},
			{"�̼���","35��","177.7cm"}
		};
		String[][] table2 = new String[table1.length][table1[0].clone().length];
		
		table2 = table1.clone();
		for(String[] t1 : table2)
			for(String t2 : t1)
				System.out.println(t2);
		
		System.exit(0);
	}
	
}
