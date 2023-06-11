package dsa.recursion.assignment1;

public class SumOfSeries {
	
	private static void sum(float n, double result) {
		
		// termination case
		if(n == 0) {
			System.out.println(result);
			return ;
		}
		
		// buisness logic
		double power = Math.pow(n, n);
		result =result + (n / power);
		
		// small problem
		sum(n-1, result);
	}
	
	private static double sum(float n) {
		
		// termination case
		if(n == 0) {
			return 0;
		}
		
		// small problem
		double result = sum(n-1);
		
		// buisness logic
		double power = Math.pow(n, n);
		return result + (n / power);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// two approaches
		
		// stack building
		sum(2, 0);
		
		// stack falling
		double result = sum(2);
		System.out.println(result);
		
	}

}
