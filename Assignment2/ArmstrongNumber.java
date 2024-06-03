package Assignment2;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int result=0,copy=num;
        for (int i = 0; i < num; i++) {
            num = i;
            while(num!=0){
                int r  = num%10;
                result += r*r*r;
                num/=10;
            }
            if(result == copy){
                System.out.println("Number is"+i+" armstrong");
            }else {
                System.out.println("Number is"+i+" not armstrong");
            }
        }


    }
}
