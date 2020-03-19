package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set=new HashSet<String>();
		set.add("Rooney");
		set.add("Messi");
		set.add("Ronaldo");
		set.add("Martial");
		//Traversing elements
		
		Iterator<String> itr=set.iterator();
		
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
	}

}
