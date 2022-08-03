package Page336_Mapinterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		Map map = new HashMap();
		
		String[] names = {"홍길동","김유신","이순신","강감찬","김유신"};
		int[] nums = {1234,4567,9870,2345};
		
		for(int i = 0;i<names.length;i++)
			map.put(names[i], nums[i]);
		
		System.out.println(map);
		
		System.out.println("홍길동의 번호 : " + map.get("홍길동"));
		
	}

}
