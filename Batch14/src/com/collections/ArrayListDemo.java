package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list=new ArrayList();//Creating arraylist
		
		list.add("messi");//Adding object in arraylist
		list.add(3);
		list.add("ronaldo");
		list.add("rooney");
		list.add("neymar");
		
		//Traversing list through Iterator
		Iterator itr=list.iterator();
		
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
	}

}
