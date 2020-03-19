package msnpro;



class Calc{
	public int add(int ... n)
	{ 
		int sum=0;
		
		for (int i : n) {
			sum = sum+i;
		}
		return sum;
	}
}




public class VarargsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc obj = new Calc();
		System.out.print(obj.add(3, 4,45,35,23,5,4,6,6,4,3));
		
	}

}
