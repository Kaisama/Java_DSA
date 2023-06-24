package dsa.array;

import java.util.Arrays;

public class SecondLargest {
	
	static void max(int arr[]) {
		int max = arr[0];
		int secondMax = -1;
		for(int i =0; i<arr.length; i++) {
			if(max<arr[i]) {
				secondMax = max;
				max = arr[i];
			}
		}
		System.out.println("Maximum Element in the Array is : "+max);
		System.out.println("Second Maximum Element in the Array is : "+secondMax);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 20, 50, 60, 90, 30, 40};
		Arrays.sort(arr);
		System.out.println("Second Largest element in the array is : "+arr[arr.length - 2]); // Printing second largest element
		int arr1[] = {10, 20, 50, 60, 90, 30, 40};
		max(arr1);
		
		
	}
}