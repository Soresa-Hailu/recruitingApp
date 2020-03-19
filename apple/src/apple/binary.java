package apple;

public class binary {
	public void binarySearch(int arr[], int first, int last, int key) {
		int mid = (first + last)/2;
		
		while(first<=last) {
			
			if(arr[mid]<key) {
				first = mid + 1;
			}
			
			else if(arr[mid]==key){
				System.out.println("your number you are looking for is in the index :"+ mid);
				break;
			}
			
			else {
				last = mid-1;
			}
			
	       mid = (first + last)/2;
		}
		
		if(first>last) {
			System.out.println("The number you are looking for not found");
		}
		
				
		
	}

}
