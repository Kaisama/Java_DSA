package dsa.recursion.assignment2.numbersystem;

public class BinaryToDecimal {
	public static int binaryToDecimal(String binary) {
        if (binary.isEmpty()) {
            return 0;
        } else {
            char lastDigit = binary.charAt(binary.length() - 1);
            String remainingBinary = binary.substring(0, binary.length() - 1);
            return 2 * binaryToDecimal(remainingBinary) + Character.getNumericValue(lastDigit);
        }
    }

    public static void main(String[] args) {
        String binary = "11001";
        int decimal = binaryToDecimal(binary);
        System.out.println("Binary: " + binary);
        System.out.println("Decimal: " + decimal);
    }
}
