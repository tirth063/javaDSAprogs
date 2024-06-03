package Arrl;

public class key {


    public static void main(String[] args) {
       final double pi = 3.14;
        System.out.println(pi);


    }
}

interface A {

    void helloA();
}

interface A1 extends A {

    default void hello(){
        System.out.println("hello");
    }

    void say();
}

interface A2 extends A1,A{

    @Override
    default void hello(){
        System.out.println("hello");
    }

}



abstract class Bank implements A2{
    public abstract void hello();
    final void hellobank(){
        System.out.println("hello");
    }
}
class Sbi extends Bank{
    public void hello(){
        System.out.println("hello");
    }

    @Override
    public void say() {
        System.out.println("hello");
    }

    @Override
    public void helloA() {
        System.out.println("hello");
    }
}