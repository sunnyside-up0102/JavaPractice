import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericEx4 {

	public static void main(String[] args) {
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		Map<String , Object> hm = new HashMap<String,Object>();
		hm.put("name","ȫ�浿");
		hm.put("id","hong");
		hm.put("age",30);
		list.add(hm);
		
		hm = new HashMap<String,Object>();
		hm.put("name","�̼���");
		hm.put("id","Lee");
		hm.put("age",40);
		list.add(hm);
		
		hm = new HashMap<String,Object>();
		hm.put("name","������");
		hm.put("id","kim");
		hm.put("age",50);
		list.add(hm);
		
		for(int i = 0; i<list.size();i++){
		System.out.println("�ε��� : " + i
		+ " �̸� " + list.get(i).get("name")
		+ " ���� " + list.get(i).get("age")
		+ " ���̵� " + list.get(i).get("id")
		
		);
		}
	}

}
