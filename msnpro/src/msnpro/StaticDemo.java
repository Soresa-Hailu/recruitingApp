package msnpro;

class Emp{
	
	int eid;
	double salary;
	static String ceoName;
	
	static 
	{
		ceoName="aldin";
		System.out.println("in static");
	}
	
	
	public Emp() 
	{
		eid=1;
		salary=11000;
		System.out.println("in constructor");
	}
	
	public void showMethod() 
	{
		System.out.println(eid +" :  "+ salary +" :  "+ ceoName);
	}
}

public class StaticDemo {
  
	
	public static void main(String args[]) {
		
		Emp obj1= new Emp();
//		obj1.eid = 3;
//		obj1.salary =10000;
//		Emp.ceo ="Alula";
		
		//Emp obj2=new Emp();
//		obj2.eid=4;
//		obj2.salary =13750;
//		Emp.ceo="Alula";
//		
		obj1.showMethod();
		//obj2.showMethod();
		
	}
	
}
