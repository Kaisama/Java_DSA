package dsa.recursion.assignment1;

import java.util.ArrayList;
import java.util.Arrays;

public class ReturnArraySearchIndex {
	
	public static int[] findIndices(int[] array, int target, int index, int count) {
        if (index == array.length) {
            return new int[count];
        }
        
        if (array[index] == target) {
            int[] indices = findIndices(array, target, index + 1, count + 1);
            indices[count] = index;
            return indices;
        } 
        else {
            return findIndices(array, target, index + 1, count);
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 20, 30, 10, 40, 10};
		int element = 10;
		int index = 0;

		
		int indices[] = findIndices(arr, element, index, 0);
		
		System.out.println("Indices where element " + element + " is found: " + Arrays.toString(indices));
	}

}
