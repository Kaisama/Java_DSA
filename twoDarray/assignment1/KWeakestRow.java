package dsa.twoDarray.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KWeakestRow {
	public static int[] kWeakestRows(int[][] mat, int k) {
        int row = mat.length;
        int col = mat[0].length;
        int[] soldiersCount = new int[row];
        int[] result = new int[k];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                soldiersCount[i] += mat[i][j];
            }
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < row; i++) {
            map.put(i, soldiersCount[i]);
        }
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, Map.Entry.comparingByValue());
        
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }
        
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = 
				{{1,1,0,0,0},
				 {1,1,1,1,0},
				 {1,0,0,0,0},
				 {1,1,0,0,0},
				 {1,1,1,1,1}};
		
				int k = 3;
				int [] arr = kWeakestRows(mat,k);
				
				for(int i : arr) {
			System.out.print(i + " ");	
				}
	}

}
