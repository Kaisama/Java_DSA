

import java.util.ArrayList;

public class DiceProblem {
	private static ArrayList<String> dice(int currValue, int endValue){
		
		// termination case
		if(currValue == endValue) {
			ArrayList<String> list = new ArrayList<>();
			list.add("");
			return list;
		}
		
		if(currValue > endValue) {
			ArrayList<String> list = new ArrayList<>();
			return list;
		}
		ArrayList<String> result = new ArrayList<>();
		
		for(int dice = 1; dice<=6; dice++) {
			int newValue = currValue + dice;
			ArrayList<String> list = dice(newValue, endValue);
			
			for(String s : list) {
				result.add(dice + s);
			}
		}
		
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> list = dice(0, 10);
		System.out.println(list);
	}

}
