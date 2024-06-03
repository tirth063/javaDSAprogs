package Patterns;

public class k_pattern {
    public static void main(String[] args) {
        int n=5;
        for (int i = n; i > 1 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
