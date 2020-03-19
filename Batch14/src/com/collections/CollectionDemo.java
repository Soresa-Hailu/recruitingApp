package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;




public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Collection values  =  new ArrayList();
//		List<String> values  =  new ArrayList<String>();
		List values  =  new ArrayList();
		
		 values.add(4);
		 values.add(6.0);
		 values.add(9);
		 values.add(9);
		 values.add("Soresa");
		 values.add(2);
		 values.add(1,8);
		 
		 
		 //An Iterator iterate over a collection.
		 Iterator it  = values.iterator();   
	 



		 while(it.hasNext()) 
		 {
			 System.out.println(it.next());
						 
		 }
		 
//		 for(int i=0; i<values.size(); i++){
//			 System.out.println(values.get(i));
//		 }

		 
//		 for(Integer o : values) {
//			 System.out.println(o);
//		 }
		
	}

}
