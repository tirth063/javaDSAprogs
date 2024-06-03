package practProgs;
import java.util.Scanner;
public class DayMonthYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = sc.nextInt();

        int Year = days / 365;
        days = days % 365;

        int Month = days /30;
        days = days%30;

        System.out.println("years is :"+Year);
        System.out.println("Month is:"+Month);
        System.out.println("Days is :"+days);
    }
}
