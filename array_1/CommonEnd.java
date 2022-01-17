import java.util.Arrays;

/**
 * Given 2 arrays of ints, a and b, return true if they have the same first
 * element or they have the same last element. Both arrays will be length 1
 * or more.
 * <ul>
 *  <li>commonEnd([1, 2, 3], [7, 3]) → true
 *  <li>commonEnd([1, 2, 3], [7, 3, 2]) → false
 *  <li>commonEnd([1, 2, 3], [1, 3]) → true
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p191991
 * @since 17.0.1
 * @version 0.0.1
 */
public class CommonEnd {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {7, 3};
        int[] array3 = {1, 2, 3};
        int[] array4 = {7, 3, 2};
        int[] array5 = {1, 2, 3};
        int[] array6 = {1, 3};
        System.out.println("commonEnd(" + Arrays.toString(array1) + ", " + Arrays.toString(array2) + ") -> " + commonEnd(array1, array2));
        System.out.println("commonEnd(" + Arrays.toString(array3) + ", " + Arrays.toString(array4) + ") -> " + commonEnd(array3, array4));
        System.out.println("commonEnd(" + Arrays.toString(array5) + ", " + Arrays.toString(array6) + ") -> " + commonEnd(array5, array6));
    }

    /**
     * Given 2 arrays of ints, a and b, return true if they have the same first
     * element or they have the same last element. Both arrays will be length 1
     * or more.
     * 
     * @param a an array containing integers to be checked if the first/last
     * elements is the same as b
     * @param b an array containing integers to be checked if the first/last
     * element is the same as a
     * @return True if the first or last element of both arrays are the same
     * @since 0.0.1
     */
    public static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length-1] == b[b.length-1];
    }
}
