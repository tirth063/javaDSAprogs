package practProgs;

import java.util.Scanner;

public class self_diving_number {
    boolean isSelfDivingNumber(int n){
        int r,c;
        c=n;
        while (n>0){
            r = n%10;
            if (r==0 || c% r != 0){
                return false;
            }
            n/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        self_diving_number sdn = new self_diving_number();
        System.out.print("[");
        for(int i=1;i<=number;i++){
            if (sdn.isSelfDivingNumber(i)) {
                System.out.print(i+ " ");
            }
        }
        System.out.println("]");
    }
}
