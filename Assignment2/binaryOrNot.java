package Assignment2;

public class binaryOrNot {
    public static void main(String[] args) {
        int k = 1001,n=k;

        while(n!=0){
            if ((n %10) > 1){
                System.out.println("number is not binary");
                return;
            }
            n/=10;
        }
        System.out.println("number "+k+" is binary");
    }
}
