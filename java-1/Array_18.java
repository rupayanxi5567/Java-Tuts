import java.util.Scanner;

/**
 * Array_18
 */
public class Array_18 {

    public static void main(String[] args) {

        // way-1
        // int[] the_arr = new int[3];
        // the_arr[0] = 10;
        // the_arr[1] = 20;
        // the_arr[2] = 30;
        // System.out.println(the_arr[1]);

        // way-2
        // int[] the_arr = new int[3];
        // int[] the_arr = {10, 20, 30};
        // System.out.println(the_arr[1]);


        // way-3 or array traversal
        // int[] the_arr = {10, 20, 30};
        // for (int i = 0; i < the_arr.length; i++) {
        //     System.out.println(the_arr[i]);
        // }


        // searching in an array

            Scanner inputs = new Scanner(System.in);
            int[] search_array = {212,443,2121,4354,3232,544565,765,43534,4324,89675};
            System.out.println("Welcome to the ultimate array searcher.");
            System.out.println("Enter the number you wanna search: ");
            int num = inputs.nextInt();

            boolean is_found = is_found(search_array, num);
            if (is_found) {
                System.out.println("Kudos your number found");
            } else {
                System.out.println("Your number is missing!");
            }
    }

    public static boolean is_found(int [] search_array, int num) {
        
        for (int i = 0; i < search_array.length; i++) {
            if (search_array[i] == num) {
                return true;
            }
        }
    return false;
    }

}