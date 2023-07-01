package dsa.bitsManipulation;

public class OneCommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = 0;
		int arr[] = {10, 20, 20, 30, 30};
		
		for(int i =0; i< arr.length; i++) {
			ans = ans ^ arr[i];
		}
		
		System.out.println(ans);
	}

}
