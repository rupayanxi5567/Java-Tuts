import java.util.Scanner;

/**
 * User_input_challange6
 */
public class User_input_challange6 {

public static void main(String[] args) {

    // challange - 1

        // Scanner inputs = new Scanner(System.in);
        // System.out.println("Enter your name for greeting: ");
        // String names = inputs.nextLine();
        // System.out.println("You are welcome mr/mrs " + names + " by Rupayan");


    // challange - 2
    
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculator");
        System.out.println("Enter your first number: ");
        int first = input.nextInt();
        System.out.println("Enter your second number: ");
        int sec = input.nextInt();
        int theSum = first + sec;
        System.out.println("The sum is: " + theSum);
}
}