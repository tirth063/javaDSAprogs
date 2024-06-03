package Arrl.assign1;

import java.util.Arrays;

public class lc {
    public static void main(String[] args) {
        int[][] img = new int[][]{
                {1,1,0},{1,0,1},{0,0,0}
        } ;
        int n = img.length;
        int[][] b = new int[n][n];
        for(int i=0;i<n;i++){
            int k=0;
            for(int j=n-1;j>=0;j--,k++){
                b[i][k] = img[i][j];
            }
        }
        System.out.println(Arrays.deepToString(b));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(b[i][j] == 1){
                    b[i][j] = 0;
                }else {
                    b[i][j] = 1;
                }
            }
        }
        System.out.println(Arrays.deepToString(b));
    }
}
