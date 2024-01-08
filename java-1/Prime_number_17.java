public class Prime_number_17 {
    public static void main(String[] args) {
        // Replace 17 with the number you want to check for primality
        int numberToCheck = 17;

        if (isPrime(numberToCheck)) {
            System.out.println(numberToCheck + " is a prime number.");
        } else {
            System.out.println(numberToCheck + " is not a prime number.");
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        // Check for divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Not a prime number
            }
        }

        return true; // Prime number
    }
}
