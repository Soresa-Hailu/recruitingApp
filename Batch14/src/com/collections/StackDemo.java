package com.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;


//Cr7    //
//james   //
//craft  //
//John   // 
//SORESA //

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> stack = new Stack<String>();
		
		stack.push("Soresa");
		stack.push("john");
		stack.push("Craft");
		stack.push("james");
		stack.push("CR7");
		stack.pop();
		stack.pop();

		
		
		Iterator<String> itr=stack.iterator();
		
	
		
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
	}

}
