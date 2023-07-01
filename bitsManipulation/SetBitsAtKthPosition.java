package dsa.bitsManipulation;

public class SetBitsAtKthPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int k = 1;
		int mask = 1 << k;
		if((n | mask) > 0) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}

}
