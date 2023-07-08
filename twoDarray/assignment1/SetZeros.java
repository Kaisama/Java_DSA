package dsa.twoDarray.assignment1;

public class SetZeros {
	
	public static void setZeroes(int[][] matrix) {
        boolean fr = false,fc = false;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    if(i == 0) 
                        fr = true;
                    if(j == 0) 
                        fc = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for(int i = 1; i < matrix.length; i++) {
            for(int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
            }   }
        }
        if(fr) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
        if(fc) {
            for(int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
        
        for(int i[] : matrix) {
        	for(int e : i) {
        		System.out.print(e + " ");
        	}
        	System.out.println();
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = {{1,1,1},{1,0,1},{1,1,1}};
		setZeroes(matrix);
		
	}

}
