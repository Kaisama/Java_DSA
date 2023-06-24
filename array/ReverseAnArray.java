package dsa.array;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 20, 30, 30, 40, 50};
		
		int start =0;
		int end = arr.length - 1;
		int temp = 0;
		
		while(start< end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp; 
			
			start++;
			end--;
		}
		
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
