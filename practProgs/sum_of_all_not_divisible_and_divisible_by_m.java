package practProgs;
import java.util.Scanner;
public class sum_of_all_not_divisible_and_divisible_by_m {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for  range [1, n] : ");
        int n = sc.nextInt();
        System.out.print("Enter a number for division : ");
        int m = sc.nextInt();
        int sum_of_not_divisible =0,sum_of_divisible = 0;
        for(int i =0;i<=n;i++){
            if(i%m==0){
              sum_of_divisible +=i;
            }else{
                sum_of_not_divisible +=i;
            }
        }
        System.out.println("sum_of_all_not_divisible_and_divisible_by "+m+" output is : "+ ( sum_of_not_divisible - sum_of_divisible));
    }
}
