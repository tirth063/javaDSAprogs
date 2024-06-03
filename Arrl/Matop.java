package Arrl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Matop {
    public static void main(String[] args) {
        int[][] a ={{1,1,1},{2,2,2},{3,3,3}};
        int[][] b ={{1,1,1},{2,2,2},{3,3,3}};
        int row = a.length;
        int col = a[0].length;
        //Product of Matrix
        int[][] c = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j]=0;
                for (int k = 0; k < 3; k++) {
                    c[i][j]+=(a[i][k]*b[k][j]);
                }
            }
        }
        System.out.println(Arrays.deepToString(c));
        //compare two matrix
        boolean NotEqual=false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (a[i][j] != b[i][j]){
                    NotEqual=true;
                    break;
                }
            }
            if (NotEqual) {
                break;
            }
        }
        if (!NotEqual){
            System.out.println("Equal");
        }else {
            System.out.println("Not equal");
        }
        //display lower Trianguler
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i < j) {
                    System.out.print("0 ");
                } else {
                    System.out.println(a[i][j] + " ");
                }
            }
        }
        //Upper Triangle
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i > j) {
                    System.out.print("0 ");
                } else {
                    System.out.println(a[i][j] + " ");
                }
            }
        }

        //even odd
        int evencount=0,oddcount=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(a[i][j]%2==0){
                    evencount++;
                }else {
                    oddcount++;
                }
            }
        }
        System.out.println("even"+evencount+"oddcount"+oddcount);

        //sum of row and column
        List<Integer> arr = new ArrayList<>();
        List<Integer> arrb = new ArrayList<>();
        arrb.add(10);
        arrb.add(20);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        for (int i = 0; i < arr.size(); i++) {

            System.out.println(arr.get(i));
        }
        System.out.println("\n\n\n"+arrb);
        arr.removeAll(arrb);
        System.out.println();
        System.out.println(arr);

        for (int i = 0; i < row; i++) {
            int rowsum=0,colsum=0;
            for (int j = 0; j < col; j++) {
                rowsum += a[i][j];
                colsum+= a[j][i];
            }
            System.out.println("Sum of 1st Row is :"+rowsum+"\n Sum of 1st Col is :"+colsum);
        }

        //identity matrix or not
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(i==j && a[i][j]!=1){
                    System.out.println("Not Identity");
                    break;
                }else if(i!=j && a[i][j]!=0){
                    System.out.println("Not Identity");
                    break;
                }
            }
            
        }
    }

}
