package dsa.recursion.assignment2.patterns;

/*
 ******
 *    *
 *    *
 *    *
 ******
 */

public class Pattern2 {
	
	private static int printStar(int col, int row,  int n) {
		// base case
		if(col == n) {
			return -1;
		}
		
		// logic
		if(row == 0 || row == n-1 || col ==0 || col == n-1) {
			System.out.print("*");
		}else {
			System.out.print(" ");
		}
		
		// small problem
		return printStar(col +1, row, n);
	}
	
	private static void print(int row, int n) {
		// base case
		if(row == n) {
			return ;
		}
		
		// buisness logic
		
		printStar(0,row, n);
		System.out.println("");
		
		
		// smaller problem 
		print(row+1,n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print(0, 5);
	}

}
