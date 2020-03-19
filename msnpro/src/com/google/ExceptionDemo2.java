package com.google;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo2 {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub

		//checked exceptions
		
		System.out.println("Enter a number:  ");
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		int n  = Integer.parseInt(br.readLine()); 
		
		System.out.println(n);
		 
	}

}
