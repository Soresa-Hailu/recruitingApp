package msnpro;

 class AX
{
	 final public void show() {
		System.out.println("in A show");
	}
	
}

class BX extends AX
{
	
//	public void show() {
//		super.show();
//		System.out.print("in B show");
//	}
}


public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AX obj = new BX();
		obj.show();
		System.out.println();

	}

}
