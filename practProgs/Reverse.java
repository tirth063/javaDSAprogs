package practProgs;

public class Reverse {
    public static void main(String[] args) {
        int rev=0 , n=12321,r=1 ,c=0,copy=n;
        while (n>0){
            r = n%10;
            rev = (rev*10)+r;
            c++;
            n/=10;
        }
        if (rev == copy){
            System.out.println("Number is palindrome");
        }else {
            System.out.println("Number is Not palindrome");
        }
        System.out.println("Reverese is:"+rev);
        System.out.println("Number of digits is:"+c);
    }
}
