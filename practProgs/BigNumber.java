package practProgs;

public class BigNumber {
    public static void main(String[] args) {
        int a=30,b=30,c=20;

        if(a>c && a>b){
            System.out.println("a is big");
        } else if (b>a && b>c) {
            System.out.println("b is big");
        } else if (c>a && c>b) {
            System.out.println("c is big");
        } else if (a==b && a>c) {
            System.out.println("a and b both are bigger then c");
        } else if (b==c && b>a) {
            System.out.println("b and c both are bigger then a");
        } else if (c==a && c>b) {
            System.out.println("c and a both are bigger then b");
        }else {
            System.out.println("all are same");
        }
    }
}
