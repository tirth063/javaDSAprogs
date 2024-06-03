package practProgs;
import java.util.Scanner;
public class HourMinitSec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sec = sc.nextInt();

        int Minit = sec / 60;

        sec = sec % 60;

        int Hour = Minit / 60;

        Minit = Minit % 60 ;

        System.out.println("Hour is :"+ Hour);
        System.out.println("Minit is "+ Minit);
        System.out.println("second is :"+sec);
    }
}
