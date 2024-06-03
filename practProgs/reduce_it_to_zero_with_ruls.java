package practProgs;
import java.util.Scanner;
public class reduce_it_to_zero_with_ruls {
    public static void main(String[] args) {
        int step=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        while (number>0){
            if(number%2==0){
                number/=2;
            }else{
                number--;
            }
            step++;
        }
        System.out.println("Number of steps for steps to reduce it to zero is:"+step);
    }
}
