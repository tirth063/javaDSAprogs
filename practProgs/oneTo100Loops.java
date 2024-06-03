package practProgs;

public class oneTo100Loops {
    public static void main(String[] args) {
        System.out.println("Table of 5");
        for(int i = 1; i<=10; i++){
            System.out.println("5 X "+i+" = "+5*i);
        }

        System.out.println("\n 1 to 100 loop");
        for(int i =1;i<=100;i++){
            System.out.print("\t"+i);
        }

        System.out.println("\n 100 to 1 loop");
        for(int i =100;i>=0;i--){
            System.out.print("\t"+i);
        }

        System.out.println("\n even Number loop");
        for(int i =0;i<=100;i+=2){
            System.out.print("\t"+i);
        }

        System.out.println("\n odd Number loop");
        for(int i =1;i<=100;i+=2){
            System.out.print("\t"+i);
        }


    }
}

