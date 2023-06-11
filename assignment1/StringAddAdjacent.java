package dsa.recursion.assignment1;
//Given a String find the adjacent element if it is same as the previous element so add the star in between
// e.g "aabbcc"
// output a*ab*bc*c
public class StringAddAdjacent {

	private static String addAdjacent(String input) {
        if (input.length() <= 1) {
            return input;
        }
        
        if (input.charAt(0) == input.charAt(1)) {
            StringBuffer buffer = new StringBuffer();
            buffer.append(input.charAt(0));
            buffer.append("*");
            buffer.append(input.charAt(1));
            return buffer.append(addAdjacent(input.substring(2))).toString();
        } 
        else {
            StringBuffer buffer = new StringBuffer();
            buffer.append(input.charAt(0));
            return buffer.append(addAdjacent(input.substring(1))).toString();
        }
    }
	
	public static void main(String[] args) {
        String input = "aabbcc";
        String output = addAdjacent(input);
        System.out.println(output);
    }

}
