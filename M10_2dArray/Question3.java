package M10_2dArray;

import java.util.Arrays;

// Question: Transpose of a matrix
public class Question3 {
    public static void main(String[] args) {
        int[][] array = { {1,2,3}, {4,5,6} };
        int m = array.length, n = array[0].length;

        int[][] transpose = new int[n][m];

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                transpose[j][i] = array[i][j];
            }
        }

        System.out.println("Original: \n" + Arrays.deepToString(array));
        System.out.println("Transpose: \n" + Arrays.deepToString(transpose));
    }
}
