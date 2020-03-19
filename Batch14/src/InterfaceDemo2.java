
// A simple Java program to demonstrate multiple 
// inheritance through default methods. 
interface PI1 
{ 
    // default method 
    default void show() 
    { 
        System.out.println("Default PI1"); 
    } 
} 
  
interface PI2 
{ 
    // Default method 
    default void show() 
    { 
        System.out.println("Default PI2"); 
    } 
} 

public class InterfaceDemo2 implements PI1, PI2 {

    // Overriding default show method 
    public void show() 
    { 
        // use super keyword to call the show 
        // method of PI1 interface 
        PI1.super.show(); 
  
        // use super keyword to call the show 
        // method of PI2 interface 
        PI2.super.show(); 
        System.out.println("inside InterfaceDemo2 class");
    } 
  
    public static void main(String args[]) 
    { 
    	InterfaceDemo2 d = new InterfaceDemo2(); 
        d.show(); 
    } 

}
