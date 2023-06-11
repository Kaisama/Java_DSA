package dsa.recursion.assignment1;
// code to check a given number is prime or not using recursion.
public class PrimeNumber {
	
	private static void prime(int n, int i, boolean isPrime)
    {
        // Base case
		if (n <= 2) {
			isPrime = (n == 2) ? true : false; 
			System.out.println(isPrime);
			return ; 
		}
		
		// buisness logic
		if (n % i == 0) {
	        isPrime = false; 
	        System.out.println(isPrime);
	        return;
	    }
		
	    if (i * i > n) {
	    	isPrime =  true;
	    	System.out.println(isPrime);
	    	return ;
	    }
	    
	    // small problem
	    prime(n, i + 1, isPrime);
    }
	
	private static boolean isPrime(int n, int i)
    {
        // Base cases
       if (n <= 2) 
           return (n == 2) ? true : false; 
       
       // buisness logic
       if (n % i == 0) 
           return false; 
       if (i * i > n)
    	   return true;
       
        // small problem
        return isPrime(n, i + 1);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// two approaches
		
		// stack building
	      prime(7, 2, false);
		
		// stack falling 
		System.out.println((isPrime(9, 2)));
	      
	}

}
