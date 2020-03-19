package com.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> values  = new HashSet<Integer>();
		 
		 values.add(5);
		 values.add(4);
		 values.add(9);
		 values.add(4);
		 
		 for(int i : values) {
			 System.out.println(i);
		 }
		
	}

}
