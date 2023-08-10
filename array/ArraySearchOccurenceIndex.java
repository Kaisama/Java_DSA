package dsa.recursion.assignment1;
// code to print index of searched element
public class ArraySearchOccurenceIndex {

	private static void occurence(int arr[], int element, int index, int count) {
		
		// base case
		if(arr.length == index) {
			return ;
		}

		// buisness logic
		if(arr[index] == element) {
			System.out.println("Present at index " +index);
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
		occurence(arr, element, index+1);

		// buisness logic
		if(arr[index] == element) {
			System.out.println("Present at index " +index);
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// satck building
		int arr[] = {10, 20, 30, 10, 40, 50};
		occurence(arr, 10, 0, 0);
		
		// stack falling
		occurence(arr, 10, 0);
	}

}
