package Page365_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(new Circle(3,0));
		list.add(new Rectangle()(3,4));
		list.add(new Circle(5));
		list.add(new Rectangle(5,6);
		
		System.out.println("���� ���� �� :" + sumArea(list));
		System.out.println("���� ���� �� :" + sumlLength(list));
		
		private static double sumLength(List list) {
			double sumLength = 0;
			for(int i =o;i<list.size();i++)
			{
				Shape s = 	(Shape)list.get(i);
				sumLenght += s.length();
			}
		return sumLenght;
		}
		private static double sumArea(List list) {
			double sumArea = 0;
			Shape s = (Shape)list.get(i);
		}
		return sumarea;
	}

}
