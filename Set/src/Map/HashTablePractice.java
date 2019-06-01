package Map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTablePractice {
	public static void main(String[] args) {
		Hashtable<String, String> table=new Hashtable<String, String>();
		table.put("David", "223444332");
		table.put("Mark","40345666");
		table.put("Jason", "694040334");
		
		
		//hashtable is synchronized
		//we can not store null key and values
//		Set<String>nm=table.keySet();
	//	for(String k:nm) {
		//	System.out.println(table.get(k));
		//}
		for(Map.Entry<String, String> i:table.entrySet()) {
			System.out.println(i.getValue()+" "+i.getKey());
		}
	}

}
