package Patterns;

public class Zero_One_Triangle {
    public static void main(String[] args) {

        /*for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=i ; j++) {
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }*/

                int n = 5;

        for (int i = 0; i < n; i++) {
            int value = i % 2 == 0 ? 1 : 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = 1 - value; // Toggle between 0 and 1
            }
            System.out.println();
        }


    }
}
