
/* File name : EncapTest.java */
 class EncapTest {
	 
   private String name;
   private String idNum;
   private int age;

   public int getAge() {
      return age;
   }

   public String getName() {
      return name;
   }

   public String getIdNum() {
      return idNum;
   }

   public void setAge( int newAge) {
	   
	   if(newAge>18) 
	   {
		   this.age = newAge; 
	   }
      
   }

   public void setName(String newName) {
      name = newName;
   }

   public void setIdNum( String newId) {
      idNum = newId;
   }
}

public class RunEncapsulationDemo2 {

	   public static void main(String args[]) {
		     
		   EncapTest encap = new EncapTest();
		      encap.setName("James");
//		      encap.age=11;
		      encap.setAge(100);
		      encap.setIdNum("12343ms");

		      System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
		   }

}
