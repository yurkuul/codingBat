/**
 * Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1
 * as their first element.
 * <ul>
 *  <li>start1([1, 2, 3], [1, 3]) → 2
 *  <li>start1([7, 2, 3], [1]) → 1
 *  <li>start1([1, 2], []) → 1
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p109660
 * @since 17.0.1
 * @version 0.0.1
 */
public class Start1 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 3};
        int[] array3 = {7, 2, 3};
        int[] array4 = {1};
        int[] array5 = {1, 2};
        int[] array6 = {};
        System.out.println("start1([1, 2, 3], [1, 3]) -> " + start1(array1, array2));
        System.out.println("start1([7, 2, 3], [1]) -> " + start1(array3, array4));
        System.out.println("start1([1, 2], []) -> " + start1(array5, array6));
    }

    /**
     * Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1
     * as their first element.
     *
     * @param a first int array for checking if 1 is the first element
     * @param b second int array for checking if 1 is the first element
     * @return int value of times 1 is the first element of array a and array b
     * @since 0.0.1
     */
    public static int start1(int[] a, int[] b) {
        int total = 0;
        if (a.length > 0 && a[0] == 1) {
            total++;
        }
        if (b.length > 0 && b[0] == 1) {
            total++;
        }
        return total;
    }
}
