package dsa.bitsManipulation.assignment1;

public class CountBitwiseAnd {
	public static int countBitwiseAnd(int n) {
        int count = 0;
        
        // Count the number of set bits in n
        int numBits = Integer.bitCount(n);
        
        // Calculate the number of integers x that satisfy the condition
        count = 1 << numBits;
        
        return count;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = countBitwiseAnd(n);
        System.out.println("Number of integers x: " + result);
    }
}
