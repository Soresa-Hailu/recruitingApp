package msnpro;


class Outer
{
	int a;
	
	public static void show()
	{
		System.out.println("in show method");
	}
	 static class Inner
	 {
		public void dispaly()
		{
			System.out.println("in display");
		}
	}
}


public class InnerDemo {

	//variable
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Outer one = new Outer();
		Outer.show();
		
		
////		Outer.Inner OBJ3= one.new Inner();
//		Outer.Inner obj2 = new Outer.Inner();
//		obj2.dispaly();
		

	}

}
