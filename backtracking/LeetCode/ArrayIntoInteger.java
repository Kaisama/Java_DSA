

public class Solution3 {
	
	public static int arrayToInt(int[] arr)
    {
        StringBuilder s = new StringBuilder(); 
        for (int i : arr)
        {
            s.append(i); 
        }
        return Integer.parseInt(s.toString()); 
    }

    public static int superPow(int a, int[] b) {
        int power = arrayToInt(b);

        double result = Math.pow(a,power);

        int finalResult = (int)result % 1337;

        return finalResult;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b = {1,0};
		System.out.println(superPow(10, b));
	}

}
