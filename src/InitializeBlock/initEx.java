package InitializeBlock;

public class initEx {

	initEx(){
		System.out.println("������ ȣ��");
	}
	
	static {
		System.out.println("Ŭ���� �ʱ�ȭ �� ����");
	}
	
	{
		System.out.println("�ν��Ͻ� �ʱ�ȭ �� ����");
	}
	
	public static void main(String[] args) {
		System.out.println("main() �ż��� ����");
		System.out.println("main init1 ��ü ���� : ");
		initEx init1 = new initEx();
		System.out.println("main init2 ��ü ���� : ");
		initEx init2 = new initEx();
		
	}

}
