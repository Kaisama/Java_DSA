package dsa.array.assignment3;

public class GFGAddTwoNumbers {
	
	static String calc_Sum(int a[], int n, int b[], int m)
    {
        String s = "";
        // Complete the function
        int i = n-1;
        int j = m-1;
        long carry = 0;
        while(i>=0&&j>=0){
            int val1 = a[i];
            int val2 = b[j];
            long sum  = (long) (val1+val2+carry);
            carry = sum/10;
            sum = sum%10;
            s = String.valueOf(sum)+s;
            i--;
            j--;
        }
        while(i>=0){
            long sum = (long)(a[i]+carry);
            carry = sum/10;
            sum = sum%10;
            s = String.valueOf(sum)+s;
            i--;
        }
        while(j>=0){
            long sum = (long)(b[j]+carry);
            carry = sum/10;
            sum = sum%10;
            s = String.valueOf(sum)+s;
            j--;
        }
        while(carry!=0){
            long sum =carry;
            carry = sum/10;
            sum = sum%10;
            s = String.valueOf(sum)+s;
        }
        while(s.charAt(0)=='0'){
            s = s.substring(1,s.length());
        }
        return s;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1, 2};
		int B[] = {2, 1};
		int n = A.length;
		int m = B.length;
		
		String result = calc_Sum(A, n, B, m);
		System.out.println(result);
	}

}
