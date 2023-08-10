

public class Solution4 {
    int missingNumber(int array[], int n) {
        int i,sum=0;
        sum = n*(n+1)/2;
        for(i=0; i<n-1; i++){
            sum -= array[i];
        }
        return sum;
    }
}
