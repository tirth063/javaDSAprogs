package Array_assignment2;

import java.util.Arrays;

public class aa2 {
    private static void Question_1(int[] a){
        int n = a.length,sum=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((a[i]+a[j])==sum && i!=j){
                    System.out.println(" present");
                    return;
                }
            }
        }
        System.out.println("not  present");
    }

    private static void Question_2(int[] a,int sum){
        int n = a.length,left=0,right=n-1;
        while (left<=right){
            int csum = a[left]+right;
            if(csum==sum){
                System.out.println("Present");
                return;
            }else if(csum < sum) {
                left += 1;
            }else {
                right += 1;
            }
        }
        System.out.println("not  present");
    }

    private static void Question_3(int[] a,int m){
        int n = a.length;
        for (int i = 0; i < m; i++) {
            int temp=a[0],j;
            for ( j = 0; j < n-1; j++) {
                    a[j] = a[j + 1];
            }
            a[j]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
    private static void Question_5(){
        int[]  a = {5,3,10,9,6,13};
        boolean nng;
        for (int i = 0; i < a.length; i++) {
            nng=true;
            for (int j = i+1; j < a.length; j++) {
                if(a[j]>a[i]){
                    nng=false;
                    System.out.print(a[j]+" ");
                    break;
                }
            }
            if(nng){
                System.out.print("-1 ");
            }
        }
    }
    private static void Question_6(){
        int[] a = {2,7,7,7,4,3,4,8,9,9};
        int n = a.length,k=0;
        for (int i = 0; i < n; i++) {
            if (a[i]==-1){
                continue;
            }
            int c= 0;
            for (int j = 0; j < n; j++) {
                if(i!=j && a[i]==a[j]){
                    a[j]=-1;
                    c++;
                }
            }
            if(c>0){
                System.out.print(a[i]+" ");
                k++;
            }
            if(k==2){
                return;
            }
        }
        System.out.println(" not present");
    }

    private static void Question_7(){
        int[] a = {2,7,7,7,4,3,4,8,9,9};
        int n = a.length,k=0,temp = 0;
        for (int i = 0; i < n; i++) {
            int c= 0;
            for (int j = 0; j < n; j++) {
                if(i!=j && a[i]==a[j]){
                    c++;
                }
            }
            if(c>k){
                k=c;
                temp=a[i];
            }
        }
        System.out.println(": "+temp+" is coming "+(k+1)+" times which is highest among all");
    }
    public static void main(String[] args) {
        int[] a = {4,6,8,10,12,1,2,3};
        int value = 3;
        int n = a.length, left = 0, right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (a[mid] == value) {
                System.out.println("Present");
                return;
            }

            // Check if the left half is sorted
            if (a[left] <= a[mid]) {
                if (a[left] <= value && value < a[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            // Check if the right half is sorted
            else {
                if (a[mid] < value && value <= a[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        System.out.println("Not present");
    }
}
