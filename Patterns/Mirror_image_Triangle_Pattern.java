package Patterns;

public class Mirror_image_Triangle_Pattern {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i = n-2; i > 0 ; i--) {
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
