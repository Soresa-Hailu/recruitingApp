package com.google;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j;
		i  = 8;
		j  = 9;
		
		try {
			int k  = i/j;
			if(k==0)
				throw new TestException("this is not possible");
			System.out.print(k);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

		

	}

}
