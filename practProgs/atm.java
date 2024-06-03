package practProgs;
import java.util.Scanner;

public class atm {
    int deposit(int balance , int amount){
        return balance + amount;
    }

    int widrawal(int balance , int amount){
        if(amount >= balance){
            System.out.println("Insufficient Balance");
        }else{
            return balance - amount;
        }
        return balance;
    }

    void checkbalance(int balance){
        System.out.println(balance);
    }

    public static void main(String[] args) {
        int Balance = 10000;
        Scanner sc = new Scanner(System.in);
        atm a = new atm();
        System.out.println("\t Welcome To bank");
        System.out.println("\n Yout current Account Balance is: \t"+ Balance);

        System.out.print("\t Enter the amount :");
        int amount = sc.nextInt();

        Balance = a.deposit(Balance,amount);
        System.out.println(Balance);
        Balance = a.widrawal(Balance,amount);
        System.out.println(Balance);

        System.out.println("Transaction are closed now\n \t Your Final Balance is :");
        a.checkbalance(Balance);

    }
}
