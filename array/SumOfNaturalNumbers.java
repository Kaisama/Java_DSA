package dsa.recursion.assignment1;

public class SumOfNaturalNumbers {
	
	private static void sum(int n, int result) {
		
		// base case
		if(n == 0) {
			System.out.println(result);
			return ;
		}
		// buisness logic
		result = result + n;
		
		// small problem
		sum(n-1, result);
	}
	
private static int sum(int n) {
		
		// base case
		if(n == 0)
			return 0;
		
		// small problem
		int result = sum(n-1);
			
		// buisness logic
		result = result + n;
		
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// two approaches
		
		// stack building
		sum(10, 0);
		// stack falling
		
		int result = sum(10);
		System.out.println(result);
	}

}
