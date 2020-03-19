

class Car {

		
		void run() {
			System.out.println("Car is running");
		}
	
}
 class Splendor extends Car{
	
	 @Override
	 void run() {
			System.out.println("running safely with 60km ");
		}
		
		void show() {
			System.out.println("this show method inside Splendor class");
		}
 }
public class TestOverriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Car b  = new Splendor();
		b.run();
		//b.show();
	}

}