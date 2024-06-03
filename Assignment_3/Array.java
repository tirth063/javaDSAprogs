package Assignment_3;

import java.util.Arrays;

public class Array {
    public static void q1() {
        System.out.println();
        int[] arr = {1,12,6,31,7,9,3,5,0};
        int d=3;
        //int count=0;
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%d==0) System.out.print(arr[i] + " ");
        }
        System.out.print("]");
        System.out.println();
        System.out.println();
    }
    public static void q2() {
        System.out.println();
        int[] a = {1,12,6,31,7,9,3,5,0};
        int n=a.length;
        boolean isPrime;
        System.out.print("[");
        for (int i = 0; i < n; i++) {
                isPrime = true;
            if (a[i] != 0 && a[i]!=1) {
                for (int j = 2; j*j < a[i]; j++) {
                    if(a[i] % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    System.out.print(a[i]+" ");
                }
            }
        }
        System.out.print("]");
        System.out.println();
        System.out.println();
    }
    public static void q3() {
        System.out.println();
        int[]  arr = {1,2,3,4,5,6};
        int len = arr.length/2;
        int[] b = new int[len];
        int[] c = new int[len];
        System.out.print("[");
        for (int i = 0; i < len; i++) {
            b[i]=arr[i];
        }
        int index = 0;
        for (int i = len; i < arr.length; i++) {
            c[index]=arr[i];
            index++;
        }
        System.out.println();
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.print("]");
        System.out.println();
        System.out.println();
    }

    public static void q4() {
        System.out.println();
        int[] b = {1, 2, 3};
        int[] c = {4, 5, 6};
        int len = b.length+c.length;
        int[]  ar = new int[len];

        for (int i = 0; i < b.length; i++) {
            ar[i]=b[i];
        }
        int index = b.length;
        for (int i = 0; i < c.length; i++) {
            ar[index]=c[i];
            index++;
        }
        System.out.println();
        System.out.println(Arrays.toString(ar));
        System.out.println();
        System.out.println();
    }

    public static void q5() {
        System.out.println();
        int[]  arr = {11451541,541,1,1,4,4414,15454,4,5,5};
        int val = 4,count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==val){
                count++;
            }
        }
        System.out.println("Count i :"+count);
        System.out.println();
    }

    public static void q6() {
        System.out.println();
        int[]  arr = {1,5,7,8,7};
        boolean isIncreasing = true;
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] > arr[i+1]   ){
                isIncreasing = false;
                System.out.println("All elements are not in increasing order. "+arr[i]+" is coming before "+arr[i+1]);
                break;
            }
        }
        System.out.println("Output is :"+isIncreasing);
        System.out.println();
    }
    public static void q7() {
        System.out.println();
        int[] a = {1,12,6,31,7,9,3,5,0};
        int n= a.length*2;
        int[] b = new int[n];
        int index2 = a.length;
        for (int i = 0; i < a.length; i++) {
            b[i]= a[i];
            b[index2] = b[i];
            index2++;
        }
        System.out.println("Array is :"+ Arrays.toString(b));
        System.out.println();
    }

    public static void q8() {
        System.out.println();
        int[] b = {1, 2, 3};
        int[] c = {4, 5, 6};
        int n = b.length;
        int len1 = b.length+ c.length;
        int counter = n/2,index1=0;
        int[]  a = new int[len1];

        for (int i = 0; i < n ; i+=2) {
            a[index1] = b[i];
            index1++;
            if(n%2==0){
                a[counter] = c[i];
                counter++;
            }else {
                counter++;
                a[counter] = c[i];

            }

        }
        for (int i = 1; i < n; i+=2) {
            a[index1] = b[i];
            index1++;
            if(n%2==0){
                counter++;
                a[counter] = c[i];

            }else {
                counter++;
                a[counter] = c[i];

            }
        }


        System.out.println("Array is :"+ Arrays.toString(a));
        System.out.println();

        System.out.println();
        System.out.println();

            int[] arr1 = {1, 2, 3};
            int[] arr2 = {4, 5, 6};
            int len = arr1.length + arr2.length;
            int[] result = new int[len];

            for (int i = 0, j = 0, k = 0; i < len; i++) {
                if (i % 2 == 0) {
                    result[i] = arr1[j++];
                } else {
                    result[i] = arr2[k++];
                }
            }

            System.out.println("Array is: " + Arrays.toString(result));

    }

    public static void q9() {
        System.out.println();
        System.out.println();
        int[] a={1,202,1,210,1,12,102,20,21,51,20,202};
        
        /*int start = 0,end = a.length-1,temp;
        System.out.println(Arrays.toString(a));
        while (start < end){
            temp = a[start];
            a[start] = a[end];
            a[end]=temp;

            start++;
            end--;
        }*/
        System.out.println(Arrays.toString(a));
        System.out.println();
    }

    public static void main(String[] args) {
    q1();q2();q3();q4();q5();q6();q7();q8();q9();
    }
}
