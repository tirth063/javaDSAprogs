package practProgs;

public class smallest_positive_integer {
    public static void main(String[] args) {
        int num=9;
        if(num%2==0){
            System.out.println("The smallest multiple of both "+num+" and 2 is"+num);
        }else{
            System.out.println("The smallest multiple of both "+num+" and 2 is: "+(num*2));
        }
    }
}
