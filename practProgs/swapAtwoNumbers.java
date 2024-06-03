package practProgs;

public class swapAtwoNumbers {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("a is: "+a+"\n b is : "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap is : a is : "+a+"\n b is : "+b);
    }
}
