package dsa.array.assignment4;

public class LeetCodeQues136SingleNumber {
	
	public static int singleNumber(int[] nums) {
        int ans = 0;
        for(int i =0; i< nums.length; i++){
            ans = ans^nums[i];
        }

        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,2,1};
		int ans = singleNumber(arr);
		
		System.out.println("Single occuring element is: "+ans);
	}

}
