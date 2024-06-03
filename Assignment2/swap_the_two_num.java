package Assignment2;

public class swap_the_two_num {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("a is "+a+"b is"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a is "+a+"b is"+b);
    }
}
