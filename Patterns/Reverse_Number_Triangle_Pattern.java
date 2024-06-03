package Patterns;

public class Reverse_Number_Triangle_Pattern {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
