package dsa.recursion.assignment2.patterns;

/*

    * 
   ***
  *****
 *******
********* 

*/

public class Pattern8 {
	
	private static void printSpace(int row) {
		
		// base case
		if(row == 0) {
			return ;
		}
		
		// logic
		System.out.print(" ");
		
		// small problem
		printSpace(row-1);
		
	}
	
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
		printSpace(row -1);
		printStar(star);
		System.out.println();
		
		
		// small problem
		printLine(row-1, star+2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// two approaches
		
		int row = 5;
		int star = 1;
		
		// stack building
		printLine(row, star);
	

	}
}
