/**
 * Parameters_and_arguments_14
 */
public class Parameters_and_arguments_14 {

    public static void main(String[] args) {
        int the_sum_fnc = summing_three_num(40, 20, 10);
        System.out.println(the_sum_fnc);
    }

    public static int summing_three_num( int a, int b, int c ) {
        int sum = a+b+c;
        return sum;
    }

}