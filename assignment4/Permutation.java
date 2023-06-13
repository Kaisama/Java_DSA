package dsa.recursion.assignment4;

public class Permutation {
	
	private static void perm(String str, String result) {
	    if (str.length() == 0) {
	        System.out.print(result+", ");
	        return;
	    }

	    for (int i = 0; i < str.length(); i++) {
	        char ch = str.charAt(i);
	        String remaining = str.substring(0, i) + str.substring(i + 1);
	        perm(remaining, result + ch);
	    }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abc";
		perm(input, "");
	}
}
