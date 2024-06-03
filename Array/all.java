package Array;

import java.util.Arrays;

public class all {
    static void sum(int[] a){
        int n = a.length,sum=a[0];
        for (int i = 1; i < n; i++) {
            sum += a[i];
        }
        System.out.println("the sum is "+sum);
    }
    static void reversearray(int[] a){
        int  n = a.length;
        for (int i = 0; i < n/2; i++) {
            int temp = a[i];
            a[i] = a[n-i-1];
            a[n-i-1] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        int[] a ={4,6,8,10,12,1,2,3};
        reversearray(a);
    }
}
