package dsa.recursion.assignment2.patterns;

/*

***** 
 ****
  ***
   **
    *
*/

public class Pattern6 {
	
	private static void printSpace(int space) {
		
		// base case
		if(space == 0) {
			return ;
		}
		
		// logic
		System.out.print(" ");
		
		// small problem
		printSpace(space-1);
		
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
	
	private static void printLine(int row, int space) {
		// base case
		if(row == 0)
			return ;
		
		// buisness logic
		printSpace(space);
		printStar(row);
		System.out.println();
		
		
		// small problem
		printLine(row-1, space+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// two approaches
		
		int row = 5;
		int space = 0;
		
		// stack building
		printLine(row, space);
	

	}
}
