package Assignment2;

public class addTwo_Num_without_using_plusoperator {
    public static int add(int a ,int b){
        while (b!=0){

          int carry=  a&b;
           a = a^b;
           b = carry <<1;
        }
        return a;
    }

    public static int sum(int a ,int b){
        int carry=b,sum = a;
        while(carry!=0){
            sum = a^b;
            carry = (a&b)<<1;
            a =sum;
            b=carry;

        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(add(5,6));
        System.out.println(sum(50,10));
    }
}
