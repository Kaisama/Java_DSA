package dsa.twoDarray;

public class OneDArrayToTwoDArray {
	
	public static void convert(int[]arr, int n, int m)
	{
		int row=0;
		int col=0;
		int result[][] = new int[n][m];
		for(int i =0; i< arr.length; i++) {
			result[row][col] = arr[i];
			col++;
			if(col == 2) {
				col=0;
				row++;
			}
		}
		
		for(int i[]: result) {
			for(int e : i) {
				System.out.print(e+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4};
		convert(arr, 2,2);
	}

}
