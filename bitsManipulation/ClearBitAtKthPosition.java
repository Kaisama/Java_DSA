package dsa.bitsManipulation;

public class ClearBitAtKthPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12;
		int k = 3;
		int mask = ~(1 << k);
			System.out.println(n & mask);
	}

}
