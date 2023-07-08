package dsa.twoDarray.assignment1;

public class MultiplyMatrix {
	public static void  Mutliply(int[][] matrixA, int[][] matrixB)
    {
        // code here
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;
    
        int[][] result = new int[rowsA][colsB];
    
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixA[i][j] = result[i][j]; 
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
		int matrixA [][] = {{1, 1, 1}, {1, 1, 1}, 
		           {1, 1, 1}};
		int matrixB [][] = {{1, 1, 1}, {1, 1, 1},
		           {1, 1, 1}};
		Mutliply(matrixA, matrixB);
		
	}

}
