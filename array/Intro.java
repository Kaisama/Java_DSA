package dsa.array;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 20, 30, 40, 50};
		System.out.println(arr.length);
		
		System.out.println(arr); // arr.toString()  (Object Class)
		// toString - className@Hashcode
		
		int mul[][] = {{10, 20}, {30, 40, 50}, {60, 70}};
		System.out.println(mul.length);
		System.out.println(mul);
		System.out.println();
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		// enhanced loop
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("2-D Array");
		for(int i = 0; i<mul.length; i++) {
			System.out.print("Array at index "+i+" is ");
			for(int j =0; j<mul[i].length; j++) {
				System.out.print(mul[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		// enhanced loop
		
		for(int e[] : mul) {
			for(int e1 : e) {
				System.out.print(e1+" ");
			}
			System.out.println();
		}
		
	}

}
