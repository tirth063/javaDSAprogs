package practProgs;

import java.util.Scanner;

public class calc {
    int add(int val1, int val2) {
        return val1 + val2;
    }

    int sub(int val1, int val2) {
        return val1 - val2;
    }

    int mul(int val1, int val2) {
        return val1 * val2;
    }

    float div1(int val1, int val2) {
        if (val2 == 0) {
            System.out.println("Cannot have division by zero\n");
            return 0;
        } else {
            return (float)val1 / val2;
        }
    }

    public static void main(String[] args) {
        calc c = new calc();
        Scanner sc = new Scanner(System.in);
        sc.close();
        for (;;) {
            System.out.println("Enter 1 for ADD 2 numbers\n");
            System.out.println("Enter 2 for SUBTRACT 2 numbers\n");
            System.out.println("Enter 3 for MULTIPLY 2 numbers\n");
            System.out.println("Enter 4 for DIVIDE 2 numbers\n");
            System.out.println("Enter 5 for Exit\n");

            int choice = sc.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Result:\n"+ c.add(10, 20));
                    break;

                case 2:
                    System.out.println("Result: \n"+ c.sub(10, 20));
                    break;

                case 3:
                    System.out.println("Result: \n"+ c.mul(10, 20));
                    break;

                case 4:
                    System.out.println("Result: \n"+ c.div1(10, 20));
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Enter a valid number\n");
                    break;
            }
        }

    }
}
