package dsa.array.assignment2;

public class DNFProblem012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2, 0, 1, 0, 1, 2};
		
		int high = a.length - 1;
        int low = 0;
        int i = 0;
        while(i<=high){
            if(a[i]==1){
                i++;
            }
            else if(a[i]==0){
                int temp = a[i];
                a[i]= a[low];
                a[low] = temp;
                low++;
                i++;
            }
            else{
                int temp = a[i];
                a[i]= a[high];
                a[high] = temp;
                high--;
            }
        }
        
        for(int m: a) {
        	System.out.print(m+" ");
        }

	}

}
