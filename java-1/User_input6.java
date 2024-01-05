import java.util.Scanner;

/**
 * User_input5
 */
public class User_input6 {

    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        System.out.print("Enter your age fontyy: ");
        String aging = age.nextLine();
        System.out.println("You are " + aging + " years old. Now tell me your name also");
        String names = age.nextLine();
        System.out.println("Your name is: " + names);
    }
}