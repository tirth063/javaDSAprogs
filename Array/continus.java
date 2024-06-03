package Array;

public class continus {
    public static void main(String[] args) {
        int[] a= {1,2,-4-545-45-455,45,154,15,45,6};
        int cs=0,max=0;
        for (int i = 0; i < a.length; i++) {
            cs = cs + a[i];
            if (cs > max) {
                max = cs;
            }
            if(cs<0){
                cs = 0;
            }
        }
        System.out.println(max);
    }
}
