package Assignment2;
import java.util.Scanner;
public class print1tinwithDiff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int val = 1,add = 1;
        while(n!=0)
        {
            System.out.println(val);
            val = val+add;
            add++;
            n--;
        }
    }
}
