import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class LambdaEx6 {

	public static void main(String[] args) {
		Consumer<String> c1 = name -> System.out.println("�� �̸��� " + name + "�Դϴ�");
		c1.accept("ȫ�浿");
		
		BiConsumer<String, String> c2 = (lastname,firstname) -> System.out.println("�� �̸��� " + lastname + firstname + "�Դϴ�");
		c2.accept("ȫ", "�浿");
		
		DoubleConsumer c3 = score -> System.out.println("�� ������ " + score + "�Դϴ�");
		c3.accept(95.5);
		
		ObjIntConsumer<String> c4 = (lecture,i) -> System.out.println("�� " + lecture + "������" + i +"���̴�");
		c4.accept("����", 100);
		
		
	}

}
