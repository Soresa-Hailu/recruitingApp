package msnpro;

import java.util.Scanner;

//Constructor => is a member method.
//               It has the same name as class name.
//               It will never has return type.
//               It used to alocated memory.

//class Calc{
//	double num1;
//	double num2;
//	double result;
//	
//
//	
//	public Calc() {
//		num1=10;
//		num2=2;
//		System.out.println("we are in the first constructor");
//	}
//	public Calc(double num) {
//		this.num1=num;
//		this.num2=num;
//		System.out.println("we are in the second constructor");
//	}
//	public Calc(double num1, double num2) {
//		this.num1=num1;
//		this.num2=num2;
//		System.out.println("we are also in the threed constructor");
//	}
//	
//	public double doPerform(){
//		result = num1+num2;
//		return result;
//		
//	}
//	
//}


 class Casio{
	 
	 int val1;
	 int val2;
	 String operation;
	 
	 public Casio() {
		 val1=0;
		 val2=2;
		 operation="nothing";
		 
	 }
	 public Casio(int i) {
		 val1=i;
		 val2=0;
		 operation="nothing";
	 }
	 public Casio(int i, int j) {
		 val1=i;
		 val2=j;
		 operation="nothing";
	 }
	 public Casio(int i, int j, String op) {
		 val1=i;
		 val2=j;
		 operation=op;
	 }
	 
	 
	public void add(int i, int j) {
		System.out.println("Sum one "+ (i+j));
	}
	public void add(int i, int j, int k) {
		System.out.println("Sum two "+ (i+j+k));
	}
	public void add(double i, double j) {
		double sum = (double) i+j ;
		System.out.println("Sum three "+ sum);
	}
}

public class OperatorDemo {
		
public static void main(String args[]) {
	
	Scanner in= new Scanner(System.in);
	
	Casio obj= new Casio();
	obj.add(6, 7);
	obj.add(8, 8, 8);
	obj.add(3, 3);
	
//	Calc obj = new Calc(3); //obj know something and does something
//	System.out.println("Pls Enter your first value:");
//	obj.num1=in.nextInt();
//	System.out.println("Pls Enter your second value:");
//	obj.num2=in.nextInt();
//	double values=obj.doPerform();
//	System.out.println("The sum of the value is "+ values);
	
}	
		
	
	
//	Scanner in= new Scanner(System.in);
//	int m;
//	System.out.println("Pls enter the number you want");
//	m= in.nextInt();
//	class => is a blueprint or template or bulding structure.
//	
//for(int i=1;i<=10;i++)
//	{
//	 if(i==5) {
//		 continue;
//	 }
//
//			System.out.println(i);
//	} 
	
// switch(m) {
// case 1:
//	 System.out.println("hello one");
//	 break;
// case 2:
//	 System.out.println("hello two");
//	 break;
// case 3:
//	 System.out.println("hello three");
//	 break;
// case 4:
//	 System.out.println("hello four");
//	 break;
// case 5:
//	 System.out.println("hello five");
//	 break;
// default:
//	 System.out.println("hello no match");
// 
// }
	
	
	
//	long n = m>6?1:2;
//	System.out.println(n);
//	
	
//	int n=0;
//	if(m%2!=0)
//	{
//		System.out.println("hello");	
//	}
//	else if(m==0) {
//		System.out.println("The number you intered is zero");
//	}
//	else {
//		System.out.println("bye");
//	}
	
	
	
	
//	int m=6, n=4;
//	int r6 = ++m;//pre inc
//	int r7 = --n;//pre decrment
//	
//	int r1 = m+n;
//	int r2  =m-n;
//	int r3 = m*n;
//	double r4 =(double)m/n;
//	int r5 =m%n;
//	
//	System.out.println(r1);
//	System.out.println(r2);
//	System.out.println(r3);
//	System.out.println(r4);
//	System.out.println(r5);
//	System.out.println(r6);
//	System.out.println(r7);


}
