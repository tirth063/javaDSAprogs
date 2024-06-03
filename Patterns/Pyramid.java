package Patterns;

public class Pyramid {

    public static void Reverse_Left_Half() {
        int n=5;
        for (int i=n;i>0;i--) {
            for (int j = 0; j < n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Left_Half() {
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Reverse_Right_Half() {
        int n=5;
        for (int i=n; i>0;i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Right_Half() {
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Reverse_Left_Half();
    }
}
