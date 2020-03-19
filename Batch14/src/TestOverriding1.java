
 class Vehicle{
	
	 void run() {
		System.out.println("vehicle is running");
	}
}

class Bike extends Vehicle{
	
	@Override
	void run() {
		System.out.println("Bike is running");
	}
}
public class TestOverriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle a = new Bike();
		a.run();
		
	}

}
