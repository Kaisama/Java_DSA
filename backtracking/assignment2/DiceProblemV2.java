package dsa.recursion.branching.assignment5;

public class DiceProblemV2 {

	private static void dice(int currValue, int endValue, String result){
		
		// termination case
		if(currValue == endValue) {
			System.out.println(result);
			return ;
		}
		
		if(currValue > endValue) {
			return ;
		}
		
		for(int dice = 1; dice<=6; dice++) {
			int newValue = currValue + dice;
			dice(newValue, endValue, result+dice);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dice(0, 10, "");
	}

}
