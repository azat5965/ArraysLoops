package Collections;

import java.util.HashMap;
import java.util.Map;

public class map {
	public static void main(String[] args) {
		Map<String, Integer>menu=new HashMap<>();
		menu.put("Coffee",2);
		menu.put("Cappucino", 4);
		menu.put("Hot Chocolate", 6);
		menu.put("Hot Chocolate", 7);
		
		System.out.println(menu);
		
		menu.remove("Coffee");
		System.out.println(menu);
		
		menu.replace("Cappucino", 5);
		menu.put("Frapucino", menu.get("Hot Chocolate"));
		System.out.println(menu);
		
		
	}

}
