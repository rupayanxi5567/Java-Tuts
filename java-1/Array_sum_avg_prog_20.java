import java.util.Scanner;

/**
 * Array_sum_avg_prog_20
 */
public class Array_sum_avg_prog_20 {

    public static void main(String[] args) {
        System.out.println("Welcome to the array sum and average program!");
        int [] num_array = Array_utility_class.inputArray();
        long sum = sum(num_array);
        int avg = avg(num_array);
        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The avg of the numbers is: " + avg);
    }
    public static long sum ( int [] num_array  ){
        long sum = 0;
        int i = 0;
        while (i < num_array.length)  {
            sum += num_array[i];
            i++;
        }
        return sum;
    }
    public static int avg ( int [] num_array  ){
        long sum = sum(num_array);
        return (int) (sum/num_array.length);
    }
}