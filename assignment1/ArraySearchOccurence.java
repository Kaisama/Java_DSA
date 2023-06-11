package dsa.recursion.assignment1;

// code to print occurence of elements

public class ArraySearchOccurence {

	private static void occurence(int arr[], int element, int index, int count) {
		
		// base case
		if(arr.length == index) {
			System.out.println(count);
			return ;
		}

		// buisness logic
		if(arr[index] == element) {
			count++;
		}
		
		// small problem
		occurence(arr, element, index+1, count);
		
	}
	
private static int occurence(int arr[], int element, int index) {
		
		// base case
		if(arr.length == index) {
			return 0;
		}
		
		// small problem
		int count = occurence(arr, element, index+1);

		// buisness logic
		if(arr[index] == element) {
			count++;
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 20, 30, 10, 40, 50};
		// stack building
		occurence(arr, 10, 0, 0);
		
		// stack falling
		System.out.println(occurence(arr, 10, 0));
	}

}
