package apple;

public class multiArray {

	public void display(int x[][]) {
	
		for(int row=0; row<x.length; row++) {
			for(int column=0; column<x[row].length; column++) {
				System.out.print(x[row][column] +"\t");
				
			}
			System.out.println();
		}
	}
	
	
}
