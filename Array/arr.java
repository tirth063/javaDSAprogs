package Array;

public class arr {
    public static void copyarr(int[] arr) {
        System.out.println();
        int[] b = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            b[i] = arr[i];
            System.out.print(b[i]+ " ");
        }
        System.out.println();
    }

    public static void arroddeven(int[] arr) {
        System.out.println();
        System.out.println();
        int[] b = new int[arr.length];
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0){
                b[index] = arr[i];
                index++;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                b[index] = arr[i];
                index++;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(b[i]+" ");
        }
        System.out.println();
    }

    public static void copyreversearr(int[] arr) {
        System.out.println();
        int[] b = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            b[i] = arr[arr.length-1-i];
            System.out.print(b[i]+ " ");
        }
        System.out.println();
    }

    public static void arrsvalsmaller(int[] arr) {
        System.out.println();
        int[] b = new int[arr.length];
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            count=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    count++;
                }
            }
            b[i]=count;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(b[i]+" ");
        }
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {9,8,7,6,5,4,3,2,1,0};
        arrsvalsmaller(a);
        copyarr(a);
        copyreversearr(a);
        arroddeven(a);

    }
}
