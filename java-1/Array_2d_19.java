/**
 * Array_2d_19
 */
public class Array_2d_19 {

    public static void main(String[] args) {
        int [] [] arr_2d = {{12,34, 55},{33, 45, 44}}; // 2x3 array
        int [] [] arr_3d = {{12,34, 55},{33, 45, 44}, {21,33,466}}; // 3x3 array

        for (int i = 0; i < arr_3d.length; i++) {
            for (int j = 0; j < arr_3d[i].length; j++) {
                System.out.println(arr_3d[i][j]);
            }
        }

    }
}