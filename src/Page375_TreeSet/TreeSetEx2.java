package Page375_TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetEx2 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		set.add(new Member2("ȫ�浿",30));
		set.add(new Member2("�̼���",40));
		set.add(new Member2("������",50));
		System.out.println(set);	//�̸� �� ���� - ��������
		
		TreeSet set2 = new TreeSet(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Member2 m1 =(Member2)o1;
				Member2 m2 =(Member2)o2;
				
				return m1.age - m2.age;
			}
		
		});
		set2.add(new Member2("ȫ�浿",30));
		set2.add(new Member2("�̼���",40));
		set2.add(new Member2("������",50));
		System.out.println(set);	//���� �� ���� - ��������
		
		TreeSet set3 = new TreeSet(new NameDesc());
		
		set3.add(new Member2("ȫ�浿",30));
		set3.add(new Member2("�̼���",40));
		set3.add(new Member2("������",50));
		System.out.println(set);	//�̸� �� ���� - ��������
		
		TreeSet set4 = new TreeSet(new Agedesc());
		
		set4.add(new Member2("ȫ�浿",30));
		set4.add(new Member2("�̼���",40));
		set4.add(new Member2("������",50));
		System.out.println(set);	//���� �� ���� - ��������
	}

}
