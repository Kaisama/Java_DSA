package dsa.recursion.assignment4;

public class MazePath {
	
	private static void mazePathProblem(int row, int col, int endRow, int endCol, String result) {
	    if (row == endRow && col == endCol) {
	        System.out.println(result);
	        return;
	    }

	    if (row > endRow || col > endCol) {
	        return;
	    }

	    // Move Right
	    mazePathProblem(row, col + 1, endRow, endCol, result + "R");

	    // Move down
	    mazePathProblem(row + 1, col, endRow, endCol, result + "D");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int startRow = 0;
		int startCol = 0;
		int endRow = 2;
		int endCol = 2;
		mazePathProblem(startRow, startCol, endRow, endCol, "");
	}

}
