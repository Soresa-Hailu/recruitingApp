package apple;
import java.util.*;

 
public class banana {
 public static void main(String args[]) {
 	int a = 2;
 	int b = 5;
 	//int min = (a<b)?a:b;
 	System.out.println(a+b);
	 


	 
	 
	 
	 /*
	 
	 try {
		 int one = 200/0;
	 }
	 catch(ArithmeticException e) {
		 System.out.println(e);
		 //System.out.println("this is Ethiopia");
	 }
	 
	 
	 
	 
	 int arr[] = {2,14,5,166,7,8,10,29,1};
	 Arrays.sort(arr);
	 int key = 166;
	 int last = arr.length-1;
	 binary bin = new binary();
	 bin.binarySearch(arr,0,last,key);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 Scanner in = new Scanner(System.in);
  System.out.print("Please Enter the row:");
   int row = in.nextInt();
   System.out.print("Please Enter the col:");
   int col = in.nextInt();

   for(int i =1; i<=row; i++) {
	   for(int j=1; j<=i; j++) {
		   System.out.print(" * ");
	   }
	   System.out.println();
   }
   
		
 
   
   
   
   
   
   
   for(int i =1; i<=row; i++) {
			for(int j=1; j<=col; j++) {
				if (i == 1 || i == row ) {
					System.out.print(" $ ");
				}
				else {
					if(j == 1 || j == col) {
						System.out.print(" $ ");
					}
					else {
						System.out.print("   ");
					}
				}
			}	
			System.out.println();
		}
	 
	 
	 for(int i =1; i<=6; i++) {
	for(int j=1; j<=i; j++) {
		System.out.print(j +" ");	
	}	
	System.out.println();
}
	

	for(int k =1; k<=6; k++) {
		for(int j=6; j>=k; j--) {
			System.out.print(" * ");	
		}	
		System.out.println();
	
        }
	 
	 
 	$ $ $ $
 	$     $
 	$     $
 	$     $
 	$ $ $ $ 
	 
  System.out.println(average(1,3,2,4,5,6,7,8,9,10));

* * * *
* * * *
* * * *
* * * *
 
 public static int average (int...numbers) {
	  int total = 0;
	  for(int x: numbers)
		  total = total+x;
	  return total/numbers.length;
 }
	 
	 
	 
	 
	 int firstArray[][] = {{6,5,12,45,56},{35,67,34,33,73}};
	 int secondArray[][] = {{39,40,41,42},{43},{8,9,10}};
	  
	 
	 multiArray one = new multiArray();
	 System.out.println("This is the firsts array");
	 one.display(firstArray);
	 
	 System.out.println("This is the second array");
	 one.display(secondArray);
	
	 
	 
	 int one[] = {4,9,5,6,8};
	 ornage four = new ornage();
	 four.change(one);
	 

	 for(int j=0; j<one.length; j++) {
	 		 System.out.println(one[j]);
	 	 }
	 		
 
 

	 
	 
	 
	 int one[] = {2,4,5,7,6};
	  int total = 0;
	  
	  for(int x: one) {
		  total = total+x;
	  }
	  
	  System.out.println(total);
	 
	 
	 
	 Random rand= new Random();
	 int freq[]= new int[7];
	 
	 
	 for(int roll =1; roll<1000; roll++) {
		 ++freq[1+rand.nextInt(6)];
	 } 
	  
	 
	 System.out.println("Face\tFrequency");
	 
	 for(int face = 1; face<freq.length; face++) {
		 System.out.println(face +"\t"+ freq[face] ); 
	 }
	 
	 
	 
	 
	 
	// System.out.println("Index\tValue");
	 int one[] = { 34,34,5,6,3};
	 int sum = 0;
 
 for (int i=0;i<one.length;i++) {
	 
	 sum +=one[i];
	
 }
 System.out.println("The sum of the Array is:" +sum);
	
	 
	 
	 
	 System.out.println("Index\tValue");
		 int one[] = { 34,34,5,6,3};
	 
	 for (int i=0;i<one.length;i++) {
		 
		 System.out.println(i + "\t" + one[i]);
	 }
	 
	 
	 
	 
	 Random dice = new Random();
	 int number;
	 
	 for(int i = 1; i<=10; i++) {
		 number = 1+dice.nextInt(6);
		 System.out.print(" "+number);
	 }
	 
	 
	 
	 
	 System.out.println(Math.abs(-24));
	 System.out.println(Math.ceil(3.2));
	 System.out.println(Math.floor(3.4));
	 System.out.println(Math.max(3.5,3.4));
	 System.out.println(Math.pow(3, 4));
	 System.out.println(Math.sqrt(4));
	 
	 
	 int counter  = 0;
	 do {
		 
		 System.out.println(counter);
		 counter++;
	 }while(counter<10);
	 
	 
	 
	 double amount;
	double principal = 10000;
	double rate = 0.01;
	
	for(int day =1; day<20; day++) {
		amount = principal*Math.pow(1+rate, day);
		System.out.println(day +" "+amount);
	}
	
	
	 
	 
	 for (int i = 1; i<10; i++) {
		 System.out.println(i);
	 }
	 
	 
	 A=p(1+r)^n;
	 
	 
	 Scanner input = new Scanner(System.in);
	int total = 0;
	int grade;
	double average;
	int counter = 0;
	
	System.out.println("Please Enter the Number:");
	while(counter < 10) {
		grade = input.nextInt();
		total += grade;
		counter++;
	}
	average = total/counter;
	
	System.out.println("The Average the you entered is: " +average);
	
	
	  
	Scanner input = new Scanner(System.in);
	tuna tunaObject = new tuna("This is World");
	tuna tunaObject2 = new tuna("This is Amerca");
	tuna tunaObject3 = new tuna("This is Ethiopia");
	//System.out.println("Please Enter gf Name:");
	//String name = input.nextLine();
	//tunaObject.setName(name);
	tunaObject.saying();
	tunaObject2.saying();
	tunaObject3.saying();
	
	
	
	
	
	
  int age;
  age = 10;
  
  switch(age) {
  case 1:
	  System.out.println("You can crawl");
	  break;
  case 2:
	  System.out.println("You can talk");
	  break;
  case 3:
	  System.out.println("You can in trouble");
	  break;
	  default:
		  System.out.println("I don't know how old you are");  
  }
	 int counter = 0;
	 while(counter < 10 ) {
		 System.out.println(counter);
		 ++counter;
	 }
	*/
	 
	 
	  
 }
}
 