package Array;

public class goodqustion {
    public static void main(String[] args) {
        int[][] mat = {{0, 0},
                {0, 0},
                {1, 0}};
        int count = countSpecial(mat);
        System.out.println(count);
    }

    private static int countSpecial(int[][] mat) {
        int count = 0;
        int rows = mat.length;
        int cols = mat[0].length;
        boolean[] specialRows = new boolean[rows];
        boolean[] specialCols = new boolean[cols];

        // Check each cell in the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 1) {
                    specialRows[i] = true; // Mark row as special
                    specialCols[j] = true; // Mark column as special
                }
            }
        }

        // Count the number of special cells
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 1 && specialRows[i] && specialCols[j]) {
                    count++; // Cell is special if its row and column are special
                }
            }
        }

        return count;
    }
}
