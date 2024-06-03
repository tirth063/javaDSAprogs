package practProgs;
import java.util.Scanner;
public class Fibonaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int next ,a=0,b=1;
        int number = scanner.nextInt();
        for(int i=1;i<=number;i++){
            System.out.print(a+" ");
            next = b;
            b = a +b;
            a=next;
        }
    }
}
