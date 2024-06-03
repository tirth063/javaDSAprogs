package practProgs;

import java.util.Arrays;

public class leetcode {
    public static void main(String[] args) {

       int[] nums = {10,4,8,3};
       int n = nums.length;
       int[] ans = new int[n];
       int l = nums[0];
       for (int i = 1; i < n; i++) {
           ans[i] = l;
           l = l+nums[i];
       }
        int r  = nums[n-1];
        for (int i = n-2; i >= 0 ; i--) {
            ans[i] = Math.abs(ans[i]-r);
            r = r+nums[i];
        }

        System.out.println(Arrays.toString(ans));

    }
}
