package msnpro;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		int a[]= {1,2,3,4};
//		 for (int k : a)
//		 {			 System.out.print(" " +  k);
//		 }
//		
		
		

		
		
		
		
		
		
		
		
		
//		int nums[]= new int[4];
//		int nums2[]= {3,5,5,6,2,5};
//		nums[0]= 10;
//		nums[1]=200;
//		nums[2]=3000;
//		nums[3]=40000;
//		int[] vals= new int[5];
//		
//		
		int d[][] = {
				
				{1,2,3,4},
				{1,3,4,5},
				{1,3,4,8}
				
		};
		for(int i=0; i<d.length; i++) 
		{
			for(int j=0; j<d[i].length; j++) {
				System.out.print(" " + d[i][j]);
			}
			
			System.out.println();
		}
		
		for(int k[] : d) {
			for(int l : k) {
				System.out.print(" " + l);
			}
			System.out.println();
			
		}
		
		
		
		
//		for(int i=0; i<nums.length; i++) {
//			System.out.println("The value of array at index "+ i +" is " + nums[i]);	
//		}
//		
		
		
	}

}
