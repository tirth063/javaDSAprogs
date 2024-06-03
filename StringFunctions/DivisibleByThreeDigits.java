package StringFunctions;

public class
DivisibleByThreeDigits {

    public static boolean isDivisible(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number must be a positive integer");
        }

        // Find three potential divisors: a prime less than 10, another prime, and a small composite number
        int divisor1 = 2; // Always start with 2 as a divisor
        int divisor2 = 3;  // Always include 3 as a divisor
        int divisor3;

        // Check if number is even (divisible by 2)
        if (number % 2 == 0) {
            divisor3 = 5; // If even, use 5 as the third divisor
        } else {
            // Find the next odd prime divisor (greater than 3)
            divisor3 = findNextOddPrime(number);
        }

        // Check divisibility using the found divisors
        int sum1 = 0, sum2 = 0, sum3 = 0;
        int digit;
        while (number > 0) {
            digit = number % 10;
            sum1 += digit;
            sum2 += digit;
            sum3 += digit;
            number /= 10;

            // Early exit if not divisible by any digit
            if (sum1 % divisor1 != 0 && sum2 % divisor2 != 0 && sum3 % divisor3 != 0) {
                return false;
            }

            // Modify sum2 and sum3 to account for place values of removed digits
            sum2 = (sum2 / 10) * digit;
            sum3 = (sum3 / 100) * digit;
        }

        return true;
    }

    private static int findNextOddPrime(int number) {
        int potentialPrime = 5;
        while (potentialPrime <= number / 2) {
            if (isPrime(potentialPrime)) {
                return potentialPrime;
            }
            potentialPrime += 2; // Check only odd numbers
        }
        throw new RuntimeException("Could not find three different divisors for " + number);
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 4;

        if (isDivisible(number)) {
            System.out.println(number + " is divisible by three different digits");
        } else {
            System.out.println(number + " is not divisible by three different digits");
        }
    }
}
