package dsa.recursion.assignment2.numbersystem;

public class DecimalToOctal {
	public static String decimalToOctal(int decimal) {
        if (decimal == 0) {
            return "0";
        } else {
            return decimalToOctal(decimal / 8) + Integer.toString(decimal % 8);
        }
    }

    public static void main(String[] args) {
        int decimal = 58;
        String octal = decimalToOctal(decimal);
        System.out.println("Decimal: " + decimal);
        System.out.println("Octal: " + octal);
    }
}
