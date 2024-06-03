package Array_shorting;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] a = {48,51,56,16,1651,651,65,165,156,65,165,1,5651,0,165,156,5154,51,65165,16};
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            int mi = i;
            for (int j = i+1; j < n; j++) {
                if(a[j]<a[mi]){
                    mi = j;
                }
            }
            if(mi!=i){
                int temp = a[i];
                a[i] = a[mi];
                a[mi] =  temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
