package Arrl;

import java.util.Arrays;

public class AT {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {7, 8, 9},
                {4, 5, 6},
                {12, 26, 9},
                {4, 7, 6}
        };
        int row = matrix.length;
        System.out.println("Roe is:" + row);
        int column = matrix[0].length;
        for (int i = 0; i < column; i++) {

            int rowIndex = 0;

            for (int j = 1; j < row; j++) {

                if (matrix[j][i] > matrix[rowIndex][i]) {
                    rowIndex = j;
                }

            }
            for (int j = rowIndex; j < row - 1; j++) {
                matrix[j][i] = matrix[j + 1][i];
            }


        }
        row--;
        System.out.println(Arrays.deepToString(matrix));
    }
}
