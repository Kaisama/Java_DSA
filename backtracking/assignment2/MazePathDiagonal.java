

import java.util.ArrayList;

public class MazePathDiagonal {
	
	private static ArrayList<String> getPath(int row, int col, int endRow, int endCol){
		
		// base case
		if(row == endRow && col == endCol) {
			ArrayList<String> result = new ArrayList<>();
			result.add("");
			return result;
		}
		
		if(row > endRow || col> endCol) {
			ArrayList<String> result = new ArrayList<>();
			return result;
		}
		ArrayList<String> finalResult = new ArrayList<>();
		// move to right
		ArrayList <String> rightResult = getPath(row, col +1, endRow, endCol);
		for(String i : rightResult) {
			finalResult.add("R" +i);
		}
		
		// move to right
		ArrayList <String> downResult = getPath(row+1, col, endRow, endCol);
		for(String i : downResult) {
			finalResult.add("D" +i);
		}
		
		// move to right
		ArrayList <String> diagonalResult = getPath(row+1, col+1, endRow, endCol);
		for(String i : diagonalResult) {
			finalResult.add("I" +i);
		}
		
		return finalResult;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = getPath(0,0,2,2);
		System.out.println(list);
	}
}
