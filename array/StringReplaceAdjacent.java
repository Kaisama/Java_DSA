package dsa.recursion.assignment1;
// Given a String find the adjacent element if it is same as the previous element so replace the element with #.
//e.g "aabbcc" 
// output a#b#c#
public class StringReplaceAdjacent {
	
	private static String replaceAdjacent(String input) {
        if (input.length() <= 1) {
            return input;
        }
        
        if (input.charAt(0) == input.charAt(1)) {
            StringBuffer buffer = new StringBuffer();
            buffer.append(input.charAt(0));
            buffer.append("#");
            return buffer.append(replaceAdjacent(input.substring(2))).toString();
        } 
        else {
            StringBuffer buffer = new StringBuffer();
            buffer.append(input.charAt(0));
            return buffer.append(replaceAdjacent(input.substring(1))).toString();
        }
    }
	
	public static void main(String[] args) {
        String input = "aabbcc";
        String output = replaceAdjacent(input);
        System.out.println(output);
    }

}
