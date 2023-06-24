package dsa.array;

public class ArrayWithFunction {
	
	static int[] disp() {
		int arr[] = {10, 20, 30};
		return arr;
	}
	
	static void show(int arr[]) {
		arr[0] = 1000;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 20, 30, 40, 50};
		// pass by value
		show(arr);
		
		for(int i : arr) {
			System.out.println(i);
		}
		
		System.out.println();
		// returning an array
		int y[] = disp();
		for(int i : y) {
			System.out.println(i);
		}
		
	}

}
