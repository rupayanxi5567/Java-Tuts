import java.util.Scanner;

/**
 * Array_utility_class
 */
public class Array_utility_class {

    public static int[] inputArray(){
        Scanner inputs = new Scanner(System.in);
        System.out.println("Please enter the numbers of elements: ");
        int size = inputs.nextInt();
        int [] nums = new int[size]; 
        int i = 0;
        while (i<size) {
            System.out.print("Please enter the element number " + (i+1) + ": ");
            nums[i] = inputs.nextInt();
            i++;
        }
        return nums;
    }
}