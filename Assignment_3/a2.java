package Assignment_3;

import java.util.Arrays;


public class a2 {
    public static void p1(int[] args) {
        int n = args.length;
        for (int i = 0; i < n; i++) {
            int count=0;
            for (int j = 0; j < n; j++) {
                if(j!=i && args[i]==args[j]){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(args[i]);
            }
        }

    }
    public static void p2(int[] a) {
        int[] b = new int[a.length];
        int index=0;
        int n = a.length;boolean uc = false;
        for (int i = 0; i < n; i++) {
            if(a[i]==-1){
                continue;
            }
                uc = true;
                for (int j = 0; j < n; j++) {
                    if(j!=i && a[i]==a[j]){
                        uc  = false;
                        a[j] = -1;
                    }
                }
                if(uc==false){
                   b[index]= a[i];
                   index++;
                }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = i+1; j < b.length; j++) {
                if(b[i] > b[j]) {
                    int temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(b));
    }
    public static void main(String[] args) {
        int[] a = {5,5,2,2,1,4,6,5,4};
        p2(a);
    }
}
