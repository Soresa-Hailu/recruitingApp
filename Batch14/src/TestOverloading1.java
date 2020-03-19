
class Adder
{
	static int add(int num1, int num2) 
	{
		return num1+num2;
	}
	
	static int add(int num1, int num2, int num3) 
	{
		return num1+num2+num3;
		
	}
	
	static double add(double num1, double num2) 
	{
		return num1+num2;
		
	}
	
	static double add(int num1, double num2) 
	{
		return num1+num2;
		
	}
	static double add(int num1, double num2, int num3) 
	{
		return num1+num2+num3;
		
	}
}

public class TestOverloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("The sum of two integer number is : " + Adder.add(10, 10));
		System.out.println("The sum of three integer number is : " + Adder.add(20, 20, 20));
		System.out.println("The sum of two double number is : " + Adder.add(21.5, 30));
		
	}

}
