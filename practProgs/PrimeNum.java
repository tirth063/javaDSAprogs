package practProgs;

public class PrimeNum {
    public static void main(String[] args) {
        int n=29;
        boolean isPrime=true;
        for(int i =2;i*i<=n;i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime == true){
            System.out.println("Number is prime");
        }else {
            System.out.println("Number is not prime");
        }
    }
}
