package msnpro;

class Calculator 
{
	public int add(int i, int j) 
	{
		return i+j;
	}
	
}

class CalcAdv extends Calculator {

	public int sub(int i, int j) {
		return i-j;
	}
}

class CalcVeryAdv extends CalcAdv{
	
	public int multi(int i, int j) {
		return i*j;
	}
}


public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalcVeryAdv obj = new CalcVeryAdv();
		 int result1 = obj.add(20, 28);
		 int result2 = obj.sub(96,87);
		 int result3  = obj.multi(23, 2);
		 
		 System.out.println(result1);
		 System.out.println(result2);
		 System.out.println(result3);
		 
				

	}

}
