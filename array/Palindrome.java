package dsa.recursion.assignment1;

public class Palindrome {
	
	private static String isPalindrome(String name) {
		
		// base case
		if(name.length() == 1) {
			return name;
		}
		
		// small problem
		String smallResult = isPalindrome(name.substring(1));
		char firstChar = name.charAt(0);
		
		// buisness logic
		return smallResult + firstChar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "naman";
		System.out.println(isPalindrome(name));
		boolean result = (isPalindrome(name).equals(name)) ? true : false;
		System.out.println(result);
	}
}