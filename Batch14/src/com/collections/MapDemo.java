package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> m = new HashMap<>();
		  
		m.put("1", "Soresa");
		m.put("2", "John");
		
		Set<String> keys  = m.keySet();
		
		for(String key : keys) {
			System.out.println(key);
		}
		
	}

}
