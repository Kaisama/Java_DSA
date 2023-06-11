package dsa.recursion.assignment2.patterns;

/*
     *
    *
   *
  *
 *
*

 */

public class Pattern10 {

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

	private static void printLine(int row, int star, int rspace) {
		// base case
		if(row == 0)
			return ;
		
		// buisness logic
		printSpace(row -1);
		printStar(star);
		printSpace(rspace);
		System.out.println();
		
		
		// small problem
		printLine(row-1, star, rspace+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row = 7;
		int star = 1;
		int rspace = 0;
		
		printLine(row, star, rspace);
	}

}
