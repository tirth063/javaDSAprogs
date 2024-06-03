package Array;

import java.util.Arrays;

public class KthpositionNumber {
    public static void main(String[] args) {
        int[]  arr = {1,2,3,4};
        int n = arr.length;
        int low =0, high = n-1, k=2;
        /*while(low<=high){
            int mid = low + (high-low)/2;
            int missing = arr[mid] - mid-1;
            if(missing<k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        System.out.println(low+k);*/
        int count=0;
        int current=1;
        int i=0;
        while(i<n && count<k){
            if(arr[i]==current){
                i++;
            }
            else{
                count++;
            }
            if(count==k){
                System.out.println(current);
                return;
            }
            current++;
        }
        System.out.println(arr[n-1]+(k-count));
    }
}
