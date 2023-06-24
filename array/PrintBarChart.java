package dsa.array;

public class PrintBarChart {
	
	static void print(int arr[]) {
		int max = Integer.MIN_VALUE;
	
		for(int i =0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		int min = 1;
		for(int j =max; j>= min; j--) {
			for(int i =0; i< arr.length; i++) {
				if(j > arr[i]) {
					System.out.print("\t");
				}
				else {
					System.out.print("\t*");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 4, 9, 3, 7};
		print(arr);
	}

}
