package dsa.recursion.assignment2.numbersystem;

public class HexadecimalToBinary {
	public static String hexadecimalToBinary(String hexadecimal) {
        String binary = "";
        for (int i = 0; i < hexadecimal.length(); i++) {
            char hexChar = hexadecimal.charAt(i);
            int decimal = Character.digit(hexChar, 16);
            String binaryDigit = DecimalToBinary.decimalToBinary(decimal);
            binary += binaryDigit;
        }
        return binary;
    }

    public static void main(String[] args) {
        String hexadecimal = "1A";
        String binary = hexadecimalToBinary(hexadecimal);
        System.out.println("Hexadecimal: " + hexadecimal);
        System.out.println("Binary: " + binary);
    }
}
