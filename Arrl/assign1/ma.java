package Arrl.assign1;

public class ma {
    public static boolean isPairPresent(int[][] mat, int sum) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                for (int k = 0; k < mat.length; k++) {
                    for (int l = 0; l < mat[k].length; l++) {
                        if (i != k) {  // Check different rows
                            if (mat[i][j] + mat[k][l] == sum) {
                                return true;
                            }
                        } else if (j != l) {  // Check different columns in the same row
                            if (mat[i][j] + mat[k][l] == sum) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //Q1
        int[][] mat={
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        int col = mat[0].length,row = mat.length;
        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[i][i]);
        }

        System.out.println();
        //Q2
        System.out.println("Q2:");
        int[][] m = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}};
        col = m[0].length;
        row = m.length;
        for (int i = 0; i <row; i++) {
            System.out.println(m[i][col-1-i]);

        }


        System.out.println();
        System.out.println("Q3");
        //Q3
        int sum=0,fd=0,bd=0;
        mat = new int[][]{{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
         col = mat[0].length;
         row = mat.length;
        for (int i = 0; i <row; i++) {
            fd= mat[i][i];
            bd= mat[i][col-1-i];
            if(fd==bd){
                sum+=fd;
            }else {
                sum+=fd+bd;
            }

        }
        System.out.println("sum is :"+sum);


        System.out.println();
        System.out.println();
        //Q4
        System.out.println("Q4:");
        sum = 7;
        int[][] ma = {
                {1, 9, 4},
                {0, 3, 8},
                {11, 5, 9}};

        if (isPairPresent(ma, sum)) {
            System.out.println("Pair with sum " + sum + " is present in the matrix.");
        } else {
            System.out.println("Pair with sum " + sum + " is not present in the matrix.");
        }
        System.out.println();
        System.out.println();

        //Q5
        System.out.println("Q5:");
        mat= new int[][]{{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < mat.length; i++) {
            for (int j = mat[0].length-1; j >=0; j--) {
                System.out.print(mat[j][i]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        //Q6
        System.out.println("Q6:");
        mat=new int[][]{{1,0,0},
                {1,1,1},
                {0,1,1}};
        int count=0,maxRowIndex=0,max=Integer.MIN_VALUE;
        for (int i = 0; i < mat.length; i++) {
            count=0;
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j]==1){
                    count++;
                }
            }
            if (count>max){
                max=count;
                maxRowIndex=i;
            }
        }
        System.out.println(maxRowIndex);
    }
}
