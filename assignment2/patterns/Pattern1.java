package dsa.recursion.assignment2.patterns;

/*
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 */

public class Pattern1 {
	
	private static void printStar(int star) {
		// base case
		if(star == 0) {
			return ;
		}
		
		// logic
		System.out.print("*");
		
		// small problem
		printStar(star-1);
	}
	
	private static void print(int row, int star) {
		// base case
		if(row == 0) {
			return ;
		}
		
		// buisness logic
		printStar(star);
		System.out.println("");
		
		
		// smaller problem 
		print(row-1, star);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row = 5;
		int star = 5;
		print(row, star);
	}

}
