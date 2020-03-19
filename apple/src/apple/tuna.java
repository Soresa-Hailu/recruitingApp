package apple;

public class tuna {

	private int hour;
	private int minute;
	private int second;
	
	public void setTime(int h, int m, int s,) {
		hour = ((h>=0 && h<24) ? h:0);
		minute = ((m>=0 && m<60) ? m:0);
		second = ((s>=0 && s<60) ? s:0);
	}
	/*
	public String
	
	
	private String girlName;
	
	public tuna(String name) {
		girlName = name;
	}
	
	public void setName(String name) {
		girlName = name; 
	}
	
	public String getName() {
		return girlName;
	}
	public void saying() {
		System.out.print("Your first girl friend Name is " + getName());
	}
*/
}
