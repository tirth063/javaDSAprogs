package Patterns;

public class CorrectedPattern {
    public static void main(String[] args) {
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

