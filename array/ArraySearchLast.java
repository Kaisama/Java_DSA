package dsa.recursion.assignment1;
// code to search elements from last
public class ArraySearchLast {

	private static boolean searchLast(int arr[], int element, int index) {
		
		// base case
		if(index < 0) {
			return false;
		}

		// buisness logic
		if(arr[index] == element) {
			return true;
		}
		
		// small problem
		return searchLast(arr, element, index-1);
		
	}
	
 private static void searchLasts(int arr[], int element, int index) {
		
		// base case
		if(index < 0) {
			return ;
		}
		
		// small problem
		searchLasts(arr, element, index-1);

		// buisness logic
		if(arr[index] == element) {
			System.out.println("Element is Present");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 20, 30, 10, 40, 50};
		int index = arr.length - 1;
		// stack building
		System.out.println(searchLast(arr, 10, index));
		
		// stack falling
		searchLasts(arr, 10, index);
		
	}
}
