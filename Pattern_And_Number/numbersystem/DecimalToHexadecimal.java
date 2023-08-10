package dsa.recursion.assignment2.numbersystem;

public class DecimalToHexadecimal {
	public static String decimalToHexadecimal(int decimal) {
        if (decimal == 0) {
            return "0";
        } else {
            int remainder = decimal % 16;
            String hexDigit;
            if (remainder < 10) {
                hexDigit = Integer.toString(remainder);
            } else {
                char hexChar = (char) ('A' + (remainder - 10));
                hexDigit = String.valueOf(hexChar);
            }
            return decimalToHexadecimal(decimal / 16) + hexDigit;
        }
    }

    public static void main(String[] args) {
        int decimal = 255;
        String hexadecimal = decimalToHexadecimal(decimal);
        System.out.println("Decimal: " + decimal);
        System.out.println("Hexadecimal: " + hexadecimal);
    }
}
