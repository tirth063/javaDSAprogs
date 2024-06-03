package Array;

import java.util.Arrays;

public class arroprations {
     static  boolean isEmpty(int p){
        if(p==0){
            return true;
        }else {
            return false;
        }
    }

    static int insert(int[] a,int p,int val){
         if(p==a.length-1){
             System.out.println("Array is full");
             return p;
         }else {
             a[p] = val;
             p++;
             return p;
         }

    }

    static int delete(int[] arr,int val,int p){
        for (int i=0; i<p; i++){
            if (arr[i] == val){
                for (int j=i; j<p-1; j++){
                    arr[j] = arr[j+1];
                }
                p--;
                i--;
            }
        }
        return p;

    }

    static int update(int[] a,int p,int oldval,int newval){
        for (int i = 0; i <= p; i++) {
            if (a[i]==oldval) {
                a[i] = newval;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        int[] a = new int[5];
        int p=0;
        System.out.println("Array is Emapty:"+isEmpty(p));
        p=insert(a,p,10);
        p=insert(a,p,20);
        p=insert(a,p,30);
        System.out.println(Arrays.toString(a));
        System.out.println("Array is Emapty:"+isEmpty(p));
        p=update(a,p,20,50);
        System.out.println(Arrays.toString(a));
        p=delete(a,50,p);
        System.out.println(Arrays.toString(a));
    }
}
