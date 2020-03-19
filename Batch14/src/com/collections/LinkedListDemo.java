package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> al= new LinkedList<String>();
		
		al.add("messi");
		al.add("ronaldo");
		al.add("rooney");
		al.add("neymar");
		
		
		Iterator<String> itr=al.iterator();
		
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
	}

}
