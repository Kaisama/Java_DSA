package dsa.recursion.assignment2.patterns;

// nested recursion
/*
 
 * 
 **
 ***
 ****
 ***** 
 
 */

public class Pattern3 {
	
	private static void printStar(int star) {
		
		// base case
		if(star == 0)
			return;
		
		// buisness logic
		System.out.print("*");
		
		
		// small problem
		printStar(star-1);
	
	}
	
	private static void printLine(int row, int star) {
		// base case
		if(row == 0)
			return ;
		
		// buisness logic
		printStar(star);
		System.out.println();
		
		
		// small problem
		printLine(row-1, star+1);
	}
	
	private static void printLine(int row) {
		// base case
		if(row == 0)
			return ;
		
		
		// small problem
		printLine(row-1);
		
		
		// buisness logic
		printStar(row);
		System.out.println();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// two approaches
		
		int row = 5;
		int star = 1;
		
		// stack building
		printLine(row, star);
		
		// stack falling
		printLine(row);

	}

}
