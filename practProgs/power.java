package practProgs;

public class power {
    public static void main(String[] args) {
        int base=2,exponent=3,i,result=1;
        for(i=1;i<=exponent;i++){
            result= result*base;
        }
        System.out.println("Power of "+base+"times"+exponent+"is : "+result);
    }
}
