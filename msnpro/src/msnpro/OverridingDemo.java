package msnpro;

  class A
{
	public void show() {
		System.out.println("in A");
	}
	
	
}
class B extends A
{
	
	//@Override
	public void show () {
		
		System.out.println("in B");
	}
	
	public void config () {
		
		System.out.println("config");
	}
}

class C extends A
{
	public void show () {
		
		System.out.println("in C");
	}
	
}



public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A objb = new B();
		objb.show();
		
	}

}
