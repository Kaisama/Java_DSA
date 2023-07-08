package dsa.twoDarray.assignment1;

public class AdditionSquareMatrix {
	
	public static void Addition(int[][] matrixA, int[][] matrixB)
    {
        // code here
        for(int i=0; i<matrixA.length; i++){
           for(int j=0; j<matrixA[i].length;j++){
               matrixA[i][j]= matrixA[i][j] + matrixB[i][j];
           }
       }
        
        for(int i[] : matrixA) {
        	for(int e : i) {
        		System.out.print(e+" ");
        	}
        	System.out.println();
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrixA[][] = {{1, 2}, {3, 4}};
				int matrixB[][] = {{4, 3}, {2, 1}};
				Addition(matrixA, matrixB);
	}
 
}
