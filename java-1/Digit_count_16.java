import java.util.Scanner;

/**
 * Digit_count_16
 */
public class Digit_count_16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to ultimate digit counter");
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        int sum = digitCount(number);
        System.out.println("The sum of the digits is: " + sum);
    }

    public static int digitCount(int number) {
        int sum = 0;
        while (number>0) {
            sum += number%10;
            number /= 10;

        }
        return sum;

    }
}