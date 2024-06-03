package Array_shorting;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] a = {48,51,56,16,1651,651,65,165,156,65,165,1,5651,56,165,156,5154,51,65165,16};
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
