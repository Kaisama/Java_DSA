package dsa.recursion.assignment2.patterns;

/*
 
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *

 */

public class Pattern11 {
	
	private static int printStar(int col, int star, int n) {
		
		// base case
		if(col == n)
			return -1;
		
		// buisness logic
		if(star == col || star+col == n-1) {
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}
		
		
		return printStar(col+1, star, n);
		
	}

	private static void printLine(int row, int star) {
		// base case
		if(row == star)
			return ;
		
		// buisness logic
		printStar(0, star, row);
		System.out.println();
		
		
		// small problem
		printLine(row, star+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row = 7;
		int star = 0;
		
		printLine(row, star);
	}
}
