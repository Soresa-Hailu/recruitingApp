package msnpro;



//1 2 3 4 5
//1 2 3 4 5
//1 2 3 4 5
//
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5




public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		 int i = 5;
//		 Integer one = new Integer(i);
//		  
//		 int j  = one.intValue(); //5
//		 
//		 Integer two = i;
//		 
//		 int k = two;
//		 
//		 System.out.println(one);
//		 System.out.println(two);
		
		for(int i=1;i<=6; i++) {
			
			for(int j=1; j<i; j++) 
			{
				System.out.print(j +" ");
			}
			System.out.println();
		
		}
		 
	}

}
