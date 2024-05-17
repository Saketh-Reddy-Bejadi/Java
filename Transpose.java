

import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
                
            }
        }
        for (int[] is : matrix) {
            
            System.out.println(Arrays.toString(is));
        }
    }
}
