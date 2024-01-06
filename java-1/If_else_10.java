import java.util.Scanner;

/**
 * If_else_10
 */
public class If_else_10 {

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        System.out.println("Enter the value of A: ");
        int a = inputs.nextInt();

        System.out.println("Enter the value of B: ");
        int b = inputs.nextInt();

        System.out.println("Enter the value of C: ");
        int c = inputs.nextInt();

        if (a>b && a>c) {
            System.out.println("A is the greatest");
        } else if(b>a && b>c) {
            System.out.println("B is the greatest");
        } else if(c>a && c>b) {
            System.out.println("C is the greatest");
    }
}
}