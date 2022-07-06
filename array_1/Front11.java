import java.util.Arrays;

/**
 * Given 2 int arrays, a and b, of any length, return a new array with the
 * first element of each array. If either array is length 0, ignore that array.
 * 
 * <ul>
 *  <li>front11([1, 2, 3], [7, 9, 8]) → [1, 7]
 *  <li>front11([1], [2]) → [1, 2]
 *  <li>front11([1, 7], []) → [1]
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p128270
 * @since 17.0.1
 * @version 0.0.1
 */
public class Front11 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {7, 8, 9};
        int[] array3 = {1};
        int[] array4 = {2};
        int[] array5 = {1, 7};
        int[] array6 = {};
        System.out.println("front11(" + Arrays.toString(array1) + ", "
                             + Arrays.toString(array2) + ") -> "
                             + Arrays.toString(front11(array1, array2)));
        System.out.println("front11(" + Arrays.toString(array3) + ", "
                             + Arrays.toString(array4) + ") -> "
                             + Arrays.toString(front11(array3, array4)));
        System.out.println("front11(" + Arrays.toString(array5) + ", "
                             + Arrays.toString(array6) + ") -> "
                             + Arrays.toString(front11(array5, array6)));
    }

    /**
     * Given 2 int arrays, a and b, of any length, return a new array with the
     * first element of each array. If either array is length 0, ignore that
     * array.
     * 
     * @param a First array of integers.
     * @param b Second array of integers.
     * @return The first element of each array. If one of the arrays is empty,
     * the array is ignored.
     * @since 0.0.1
     */
    public static int[] front11(int[] a, int[] b) {
        int[] array = new int[2];
        if (a.length == 0 && b.length == 0) {
            int[] array2 = {};
            return array2;
        }
        if (a.length > 0) {
            array[0] = a[0];
        } else {
            int[] array1 = {b[0]};
            return array1;
        }
        if (b.length > 0) {
            array[1] = b[0];
        } else {
            int[] array1 = {a[0]};
            return array1;
        }
        return array;
    }
}
