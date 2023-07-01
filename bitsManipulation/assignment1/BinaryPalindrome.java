package dsa.bitsManipulation.assignment1;

public class BinaryPalindrome {
	public static int findAthBinaryPalindrome(int A) {
        int count = 0;
        int number = 0;

        while (count < A) {
            number++;
            if (isBinaryPalindrome(number)) {
                count++;
            }
        }

        return number;
    }

    public static boolean isBinaryPalindrome(int number) {
        String binaryString = Integer.toBinaryString(number);
        int left = 0;
        int right = binaryString.length() - 1;

        while (left < right) {
            if (binaryString.charAt(left) != binaryString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        int A = 1;
        int result = findAthBinaryPalindrome(A);
        System.out.println("Ath number whose binary representation is a palindrome: " + result);

        A = 9;
        result = findAthBinaryPalindrome(A);
        System.out.println("Ath number whose binary representation is a palindrome: " + result);
    }
}
