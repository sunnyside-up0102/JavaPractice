import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {
		Map map = new HashMap();
		
		String[] names = {"ȫ�浿","������","�̼���","������","������"};
		int[] nums = {1234,4567,2350,9870,2345};
		
		for(int i = 0;i<names.length;i++)
			map.put(names[i], nums[i]);
		
		Set <String> keys = map.keySet();
		for(String key : keys)
			System.out.println(key + " = " + map.get(key));
		
		System.out.println("Iterator�� ���");
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String a = (String)it.next();
			System.out.println(a + " = " + map.get(a));
		}
	}

}
