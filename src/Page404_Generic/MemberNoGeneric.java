package Page404_Generic;

import java.util.ArrayList;
import java.util.List;

public class MemberNoGeneric {

	public static void main(String[] args) {

		List list = new ArrayList();
		
		Member mem1 = new Member();
		mem1.setName("È«±æµ¿");
		mem1.SetId("hong");
		mem1.setPassword("hong1234");
		mem1.setAge(40);
		list.add(mem1);
		
		Member mem2 = new Member();
		list.add(mem2);
		Member mem2 = new Member();
		mem2.setName("ÀÌ¼ø½Å");
		mem2.SetId("lee");
		mem2.setPassword("lee1234");
		mem2.setAge(50);
		list.add(mem2);
		
		Member mem3 = new Member();
		mem3.setName("±èÀ¯½Å");
		mem3.SetId("kim");
		mem3.setPassword("kim1234");
		mem3.setAge(60);
		list.add(mem3);
		
	
	}

}
