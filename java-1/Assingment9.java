import java.util.Scanner;

/**
 * Assingment9
 */
public class Assingment9 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the value of A : ");
        int a = input.nextInt();
        System.out.print("Enter the value of B : ");
        int b = input.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("Swapping Done....");
        System.out.println("The value of A is " + a);
        System.out.println("The value of B is " + b);
    }
}