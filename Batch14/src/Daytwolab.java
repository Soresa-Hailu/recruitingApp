
class Emp{
	 
	int eid ;
	String name;
	double salary;
	static String ceo;
	
	static 
	{
		ceo = "james";
		System.out.println("inside static");
	}
	
	
	Emp(int i, String n, double s){		
		System.out.println("inside constructor");
	}
	
	
	public void showmethod() 
	{

		System.out.println(eid +": " +  name + ": " + salary + ": " + ceo);
	}
}



//class Calc{
//	
//	int val1;
//	int val2;
//
//	
//	public Calc(int val1, int val2) 
//	{
//			this.val1 = val1;
//			this.val2 =val2; 
//	}
//	
//	public void sum() {
//		System.out.print(val1+val2);
//	}
//	
//}



public class Daytwolab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//	Calc val = new Calc( 12, 34);
//	           val.sum();   
	 
		
		Emp obj1;
		obj1 = new Emp(13,"nametwo", 2330);
//		obj1.eid =1;
//		obj1.name = "Abebe";
//		obj1.salary =1000;
//		Emp.ceo ="james";
//		
//		Emp obj2 =  new Emp();
//		 obj2.eid = 2;
//		 obj2.name = "kebede";
//		 obj2.salary  = 2000;
//		 Emp.ceo = "james";
		
		 obj1.showmethod();
//		 obj2.showmethod();
		 
	}

}
