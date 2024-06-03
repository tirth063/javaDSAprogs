package Assignment_Patterns_3;

public class Patterns {

    int p1(){
        System.out.println("\n \t 1 \n");
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }

    int p2(){
        System.out.println("\n \t 2 \n");
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        return 0;
    }

    int p3(){
        System.out.println("\n \t 3 \n");
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        return 0;
    }

    int p4(){
        System.out.println("\n \t 4 \n");
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        return 0;
    }

    int p5(){
        System.out.println("\n \t 5 \n");
        int n=5;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }

    int p6(){
        System.out.println("\n \t 6 \n");
        int n=5;
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        return 0;
    }

    int p7(){
        System.out.println("\n \t 7 \n");
        int n=5;
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        return 0;
    }

    int p8(){
        System.out.println("\n \t 8 \n");
        int n=5,c=0;
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(++c);
            }
            System.out.println();
        }
        return 0;
    }

    int p9(){
        System.out.println("\n \t 9 \n");
        int n=5,count=0;
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i; j++) {
                count++;
                if(count % 2 == 0){
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }

            }
            System.out.println();
        }
        return 0;
    }

    int p10(){
        System.out.println("\n \t 10 \n");
        int n=5;
        for (int i = 1; i <= 5 ; i++) {
            for (int j = n; j > 0; j--) {
                if(j==i){
                    System.out.print("*");
                }else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        return 0;
    }

    int p11(){
        System.out.println("\n \t 11 \n");
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
        return 0;
    }

    int p12(){
        System.out.println("\n \t 12 \n");
        int n=5;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }

    int p13(){
        System.out.println("\n \t 13 \n");
        int n=5;
        for (int i = n; i > 0 ; i--) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }

    int p14(){
        System.out.println("\n \t 14 \n");
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1 ; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        return 0;
    }

    int p15(){
        System.out.println("\n \t 15 \n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return 0;
    }
    
    int p16(){
        System.out.println("\n \t 16 \n");
        int n=5,i,j;
        for (i = 1; i <= n; i++) {

            for (j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for (i = n-1; i >= 1; i--) {

            for (j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return 0;
    }
    
    int p17(){
        System.out.println("\n \t 17 \n");
        int n=5,i,j;
        for ( i = n ; i > 1 ; i--) {
            for (int k = 1; k <= n-i ; k++) {
                System.out.print("  ");
            }
            for (int k = (2 * i) - 1; k > 0  ; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i = 1; i <= n; i++) {

            for (j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        return 0;
    }

    int p18(){
        System.out.println("\n \t 18 \n");
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                if(i==1||j==1||i==n||j==n){
                    System.out.print("*  ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        return 0;
    }

    int p19(){
        System.out.println("\n \t 19 \n");
        int n=5,i,j;
        for (i = 1; i <= n; i++) {

            for (j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (j = 1; j <= 2 * i - 1; j++) {
               if (i==1||i==n||j==1||j==2*i-1){
                   System.out.print("* ");
               }else {
                   System.out.print("  ");
               }
            }
            System.out.println();
        }

        return 0;
    }

    int p20(){
        System.out.println("\n \t 20 \n");
        int n=5,i,j;
        for (i = 1; i <= n; i++) {

            for (j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (j = 1; j <= 2 * i - 1; j++) {
                if (i==1||j==1||j==2*i-1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (i = n-1; i > 0; i--) {

            for (j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (j = 1; j <= 2 * i - 1; j++) {
                if(i==1||j==(2 * i - 1)||j==1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String[] args) {
        Patterns p = new Patterns();
        p.p1();
        p.p2();
        p.p3();
        p.p4();
        p.p5();
        p.p6();
        p.p7();
        p.p8();
        p.p9();
        p.p10();
        p.p11();
        p.p12();
        p.p13();
        p.p14();
        p.p15();
        p.p16();
        p.p17();
        p.p18();
        p.p19();
        p.p20();
    }
}
