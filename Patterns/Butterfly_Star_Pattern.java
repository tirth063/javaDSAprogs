package Patterns;

public class Butterfly_Star_Pattern {
    public static void main(String[] args) {
        int n =7;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <=i  ; j++) {
                if ((i+j)%2==0) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }

            }
            for (int j = 1; j <= n-i ; j++) {
                System.out.print("    ");
            }

            for (int j = 1; j <= i ; j++) {
                if (j % 2 == 0 ) {
                    System.out.print("  ");  // Add two spaces for j equals 2 or 4
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("    ");
            }
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("  ");  // Add two spaces for j equals 2 or 4
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
}
