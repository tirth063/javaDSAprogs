package practProgs;
import java.util.Scanner;

public class BigNum {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the number of values you want to compare: ");
                int numValues = scanner.nextInt();
                int[] values = new int[numValues];

                System.out.println("Enter the values:");
                for (int i = 0; i < numValues; i++) {
                    values[i] = scanner.nextInt();
                }
                scanner.close();
                int max = values[0];
                for (int i = 1; i < numValues; i++) {
                    if (values[i] > max) {
                        max = values[i];
                    }
                }
                System.out.println("Biggest is: " + max);
                

    }
}
