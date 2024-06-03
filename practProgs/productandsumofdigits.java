package practProgs;
import java.util.Scanner;
public class productandsumofdigits {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();
                int product = 1;
                int sum = 0;

                while (number > 0) {
                    int digit = number % 10;
                    product *= digit;
                    sum += digit;
                    number /= 10;
                }

                int difference = product - sum;
                System.out.println("The difference between the product and sum of digits is: " + difference);
            }
}

