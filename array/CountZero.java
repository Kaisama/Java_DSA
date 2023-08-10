package dsa.recursion.assignment1;

public class CountZero {
	
	private static void counting(int number, int count) {
		
		// base case
		if(number == 0) {
			System.out.println(count);
			return ;
		}
		
		// buisness logic
		if(number % 10 == 0) {
			count ++;
		}
		// small problem
		counting(number/10, count);
	}
	
private static int counting(int number) {
		
		// base case
		if(number == 0) 
			return 0;
		
		// small problem
		int count = counting(number/10);
		
		// buisness logic
		if(number % 10 == 0) {
			return count + 1;
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// two approaches
		
		// stack building
		counting(10204, 0);
		
		// stack falling
		int result = counting(10204);
		System.out.println(result);
	}

}
