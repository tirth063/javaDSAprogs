package Assignment2;

public class Range_of_primeNumber {
    void Range_of_primeNumber1(int numbers){
        int n;
        n = numbers;
        boolean isPrime=true;
        for(int i =2;i*i<=n;i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime == true){
            System.out.print(numbers+" ");
        }
    }
    public static void main(String[] args) {
        Range_of_primeNumber rpn = new Range_of_primeNumber();
        int left=11, right=55;
        for(int i =left;i != right; i++){
            rpn.Range_of_primeNumber1(i);
        }
    }
}
