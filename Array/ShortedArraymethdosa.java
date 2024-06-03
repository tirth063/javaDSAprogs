package Array;

import java.util.Arrays;

public class ShortedArraymethdosa {

    static boolean isEmpty(int p){
        if(p==0) {
            return true;
        }
        else {
            return false;
        }
    }

    static int size (int p){
        return p+1;
    }

    static int delete(int[] a,int p,int val){
        int index = find(a,p,val);

        if (index != -1) {
            for (int i = index; i < p; i++) {
                a[i] = a[i + 1];
            }
            p--; // Decrement p after shifting elements
        }

        return p;
    }

    static int update(int a[],int p, int ov, int nv){
       p = delete(a,p,ov);
       p = Sinsert(a,p,nv);
       return p;
    }

    static int Sinsert(int[] a, int p, int val) {
        if (p == 0) {
            a[p] = val;
        } else {
            int i = p - 1;
            while (i >= 0 && a[i] > val) {
                a[i + 1] = a[i];
                i--;
            }
            a[i + 1] = val;
        }
        // Return the updated value of p after insertion
        return p + 1;
    }

    static int find(int[] nums,int p,int target){
        int low = 0, high =p;

        // Perform the steps:
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) return mid;
            else if (target > nums[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        int p=0,k;
        System.out.println("is empty "+ isEmpty(p));
        p=Sinsert(a,p,10);
        p=Sinsert(a,p,30);
        p=Sinsert(a,p,20);
        System.out.println("array size is: "+size(p));
        System.out.println(Arrays.toString(a));
        p=Sinsert(a,p,40);
        p=delete(a,p,30);
        System.out.println(Arrays.toString(a));
        p=update(a,p,40,30);
        System.out.println(Arrays.toString(a));
        if ((k=find(a,p,40))==-1) {
            System.out.println("not present");
        }
        else {
            System.out.println(a[k]);
        }
        System.out.println(Arrays.toString(a));
    }
}
