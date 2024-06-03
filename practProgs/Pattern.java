package practProgs;

public class Pattern {
    void p1(){
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void p2(){
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void p3(){
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    void p4(){
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void p5(){
        int n=5;
        for (int i = n; i > 0 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void p6(){
        int n=5;
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void p7(){
        int n=5;
        for (int i = n; i > 0 ; i--) {
            for (int j = i; j > 0 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void p8(){
        int n=5,count=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count++);
            }
            System.out.println();
        }
    }

    void p9(){
        int n=5 ,count=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                count++;
                if (count % 2 ==0) {
                    System.out.print("0 ");
                }else {
                    System.out.print("1 ");
                }

            }
            System.out.println();
        }
    }
    
    void p10(){
        System.out.println();
        int n=5;
        for (int i = 1; i<=n; i++) {
            for (int j = n; j >0; j--) {
                if (j == i) {
                    System.out.print("*");
                }else {
                    System.out.print(j);
                }

            }
            System.out.println();
        }
    }

    void p11(){
        System.out.println();
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i*j);
            }
            System.out.println();
        }
    }

    void p12(){
        System.out.println();
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j > 0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void p13(){
        System.out.println();

            int n=5;
            for (int i = n; i > 0 ; i--) {
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

    }

    void p14(){
        System.out.println();
        int n=5;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = n-1; i > 0 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void p15(){
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j > 0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void p16(){
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j > 0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern p = new Pattern();
        /*p.p1();
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
        p.p15();*/
    }
}
