package dsa.twoDarray.assignment1;

public class MatrixDiagonalSum {
	public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i =0 ;i < mat.length; i ++){
            for(int j = 0; j < mat[i].length; j++){
                if(i==j){
                    sum += mat[i][j];
                }
                else if(i+j == mat.length-1){
                    sum+= mat[i][j];
                }
            }
        }
        return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = {{1,2,3},
	              {4,5,6},
	              {7,8,9}};
		
		System.out.println(diagonalSum(mat));
	}

}
