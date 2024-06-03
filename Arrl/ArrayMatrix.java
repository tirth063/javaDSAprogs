package Arrl;

import java.util.Arrays;

public class ArrayMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {7, 8, 9}, {4, 5, 6},{12,26,9},{4,7,6}};
        int row = matrix.length;
        int column = matrix[0].length;

        for (int j = 0; j < column; j++) {
            int max = matrix[0][j];
            int index = 0;

            // Find the index of the maximum element in the current column
            for (int i = 1; i < row; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    index = i;
                }
            }

            // Shift elements up to "delete" the maximum element
            for (int k = index; k < row - 1; k++) {
                matrix[k][j] = matrix[k + 1][j];
            }


        }
        System.out.println(Arrays.deepToString(matrix));
        // Decrement the number of rows after deleting the element
        row--;
        // Print the modified matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
