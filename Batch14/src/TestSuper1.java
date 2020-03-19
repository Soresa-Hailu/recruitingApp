
 class Animal
{

	 final String color="white";
	 double phi = 3.41;
	
	
      void eat()
	{
		System.out.println("eating...");
		
	}
}

class Dog extends Animal
{

	String color="black";
	
	void printColor()
	{
		System.out.println(color);//prints color of Dog class
		System.out.println(super.color);//prints color of Animal class
	}
	
	@Override
	void eat()
	{
		System.out.println("eating bread...");
		
	}
	void bark()
	{
		System.out.println("barking...");
	}
	void work()
	{
	super.eat();
	eat();
	bark();
	}
}


class TestSuper1{

	public static void main(String args[]){

		Animal d=new Dog();
//		d.work();
//		d.color ="red";


}
}
