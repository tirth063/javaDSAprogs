package Array;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int[] a = {1,15,4,555,15,48,15,41,51,54,8};
        int sum=0;
        // int length = a.length;
        for (int i = 0; i < a.length - 1; i++) {
            sum += a[i];
        }
        System.out.println(sum);

        for (int i = a.length-1; i > 0 ; i--) {
            System.out.println(a[i]);
        }

        System.out.println("The average is:"+(sum/(a.length -1)));

        int val=69;
        for (int i = 0; i < a.length - 1; i++) {
            if(a[i]==val){
                System.out.println("Element is present");
            }
        }
        int even=0,odd=0;
        for (int i = 0; i < a.length - 1; i++) {
            if(a[i]%2==0){
                even++;
            }else {
                odd++;
            }
        }

        System.out.println("even is:"+even+"odd is:"+odd);

        int n = 5;
        System.out.println("n th element in array is:"+a[n-1]);

        int num = 8;
        System.out.println("n th element in array From last is is:"+(a[a.length-num]) );

    }
}
