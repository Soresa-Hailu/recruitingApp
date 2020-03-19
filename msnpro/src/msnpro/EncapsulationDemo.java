package msnpro;

//import java.util.*;


// Encapsulation -> Binding data with methods.

class Student
{
	private int rollno;
	private String name;
	
	/**
	 * @return the rollno
	 */
	public int getRollno() {
		return rollno;
	}
	/**
	 * @param rollno the rollno to set
	 */
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}


public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
           s1.setRollno(2);
           s1.setName("Soresa");
		   System.out.println(s1.getRollno());
		   System.out.println(s1.getName());
		   
		
		
	}

}
