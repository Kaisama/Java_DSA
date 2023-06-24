package dsa.array;

public class IsArraySortedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {40, 20, 30, 30, 40, 50};
		
		for(int i =0; i< arr.length-1; i++) {
			if(arr[i] >  arr[i+1]) {
				System.out.println("Not Sorted...");
				return ;
			}
		}
		System.out.println("Sorted...");
	}

}
