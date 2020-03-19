package msnpro;

class F{
	
	
	public F() {
		System.out.println("in A");
	}
	
	public F(int i) {
		System.out.println("in A one ");
	}
	
	
	public F(int i, int j) {
		System.out.println("in A int two ");
	}
	
}
class E extends F {
	
	
	public E() {
	System.out.println("in B");
	}
	
	
	public E(int i) {
		super(i,12);
		System.out.println("in B one ");
	}
}



public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		E bobj = new E(10) ;
		
		
		
	}

}
