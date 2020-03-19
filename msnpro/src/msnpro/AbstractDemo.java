package msnpro;



abstract class Human {
 
	 
	public abstract void eat(); 
	public void walk() {
		
		System.out.println("walk method inside human class");
	}
	
	}

class Woman extends Human{

	int a=10;
	int b=29;
	
    @Override
	public  void eat(){
    	System.out.println("Inside Woman class");
 }

	}


public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	
		
//		Human h1 = new Woman(); //upcasting
//		h1.eat();
//		h1.walk();
	}

}
