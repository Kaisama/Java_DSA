package dsa.twoDarray.assignment1;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	
	public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
        int row = matrix.length;
        int col = matrix[0].length;

        int total = row * col;
        int count = 0;

        // initialise the indexes;
        int startRow = 0;
        int endCol = col - 1;
        int endRow = row - 1;
        int startCol = 0;

        while(count < total){

            //print startRow
            for(int idx = startCol; count < total && idx <= endCol; idx++){
                ans.add(matrix[startRow][idx]);
                count++;
            }
            startRow++;

            // print lastCol
            for(int idx = startRow; count < total && idx <= endRow; idx++){
                ans.add(matrix[idx][endCol]);
                count++;
            }
            endCol--;

            // print lastRow

            for(int idx = endCol; count < total && idx >= startCol; idx--){
                ans.add(matrix[endRow][idx]);
                count++;
            }
            endRow--;

            // print firstCol

            for(int idx = endRow; count < total && idx >= startRow; idx--){
                ans.add(matrix[idx][startCol]);
                count++;
            }
            startCol++;
        }

        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(spiralOrder(matrix));
	}

}
