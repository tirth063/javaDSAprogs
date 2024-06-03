package Array_shorting;

import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] a = {48,51,56,16,1651,651,65,165,156,65,165,1,5651,56,165,156,5154,51,65165,16};
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int temp = a[i],j=i-1;
            while(j>=0 && a[j]>temp){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
