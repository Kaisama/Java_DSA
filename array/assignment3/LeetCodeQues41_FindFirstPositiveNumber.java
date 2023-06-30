package dsa.array.assignment3;

import java.util.Arrays;

public class LeetCodeQues41_FindFirstPositiveNumber {
	public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int b = 1;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i]==b)
               b++;
        }
        return b;
    }
}
