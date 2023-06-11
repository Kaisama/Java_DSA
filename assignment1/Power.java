package dsa.recursion.assignment1;

public class Power {
	
	private static void power(int num, int pow, int result) {
		// base case
		if(pow == 0) {
			System.out.println(result);
			return ;
		}
		
		// buisness logic
		result = result * num;
		
		// small problem
		power(num, pow-1, result);
	}
	
	private static int power(int num, int pow) {
		// base case
		if(pow == 0) 
			return 1;

		// small problem
		int result = power(num, pow-1);
		
		// buisness logic
		result = result * num; 
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// two approaches
		
		// stack building
		power(2, 5, 1);
		
		// stack falling
		int result = power(2, 5);
		System.out.println(result);
	}

}
