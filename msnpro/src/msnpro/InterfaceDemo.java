package msnpro;

import java.util.*;

interface Writer{
 
	int a=10 ;
	 void write();
}

interface Book{
	 

	void reader();

}

class Pen implements Writer, Book
{
	
	public void write() {
		System.out.print("write in a pen class");
	}
	public void reader(){
		System.out.print("reader in a pen class");
	}
}

class Pencil implements Writer
{
	public void write() {
		System.out.print("in a pencil");
	}  
}

class Kit
{
	public void doSomething(Writer p) {
		p.write();
		
	}
	
}


public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner input =  new Scanner(System.in);
		System.out.println("pls enter the name of the user:");
		 String name = input.nextLine();
		 
		Kit k = new Kit();
	    Writer p = new Pen();
	    Writer pc = new Pencil();
		k.doSomething(p);


	}

}
