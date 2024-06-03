package Assignment2;

public class FindAverage {
    public static void main(String[] args) {
        int add=0 , n=8972,r=1 ,c=0,copy;
        while (n>0){
            r = n%10;
            add = add+r;
            c++;
            n/=10;
        }

        copy = add/c;
        System.out.println("Number of digits is:"+copy);
    }
}
