package recue;

public class Recu {

    public static void helloWorld() {
            System.out.println("Hello World!");
            helloWorld();
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sum(n - 1);
        }
    }

    public static void printArryele(int[] arr, int n) {
        if (n == 0) {
            return;
        } else {
            printArryele(arr, n - 1);
            System.out.println(arr[n - 1]);
        }
    }

    public static int countDigits(int n){
        int r = n /10;
        if (r == 0) {
            return 1;
        } else {
            return 1 + countDigits(r);
        }
    }

    public static int reverseAIntergerNumber(int n ){
        if (n == 0) {
            return 0;
        }
        int r = n % 10;
        ans = (ans * 10) + r;
        reverseAIntergerNumber(n / 10);
        return ans;
    }

    public static int sumDigits(int n){
        int r = n /10;
        if (r == 0) {
            return n;
        } else {
            return n % 10 + sumDigits(r);
        }
    }

    public static int findLargest(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int largest = findLargest(arr, index + 1);
        return Math.max(arr[index], largest);
    }


    public static int multiplyNumbers(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a + multiplyNumbers(a, b - 1);
    }

    /*In the isPrime method, the parameter i is used to check divisibility of num.
    Starting with i = 2 is a common practice because all numbers are divisible by 1,
     so checking divisibility starting from 2 is sufficient.
     If num is divisible by any number between 2 and the square root of num, it is not a prime number.
     Therefore, starting with i = 2 and incrementing it until i * i > num efficiently checks for divisibility
    * */
    public static boolean isPrime(int num, int i) {
        if (num < 2) {
            return (num == 2) ? true : false;
        }
        if (num % i == 0) {
            return false;
        }
        if (i * i > num) {
            return true;
        }
        return isPrime(num, i + 1);
    }


    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    static int ans = 0;
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(sum(5));
        int[] arr = {1, 2, 3, 4, 5};
        printArryele(arr, 5);
        System.out.println();
        System.out.println(countDigits(12345));
        System.out.println( "Reverse of 12345 is :" +  reverseAIntergerNumber(112233));
        System.out.println(sumDigits(12345));
        System.out.println(fibonacci(5));
        System.out.println(findLargest(arr, 0));
        System.out.println(multiplyNumbers(5, 5));
        System.out.println(isPrime(4, 2));
    }
}
