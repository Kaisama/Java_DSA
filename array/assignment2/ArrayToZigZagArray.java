package dsa.array.assignment2;

/*
 
Convert Array into Zig Zag Array

arr [] ={4,3,7,8,6,2,1}
output : {3,7,4,8,2,6,1}

first<second>third and so on.
 
 */

public class ArrayToZigZagArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {4, 3, 7, 8, 6, 2, 1};
		
		for(int i=0; i<arr.length-2; i+=2) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
			if(arr[i+1] < arr[i+2]) {
				int temp = arr[i+1];
				arr[i+1] = arr[i+2];
				arr[i+2] = temp;
			}
		}
		
		for(int i : arr) {
			System.out.print(i+ " ");
		}
	}

}
