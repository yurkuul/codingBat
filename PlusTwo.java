import java.util.Arrays;

/**
 * Given 2 int arrays, each length 2, return a new array length 4 containing
 * all their elements.
 * 
 * <ul>
 *  <li>plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
 *  <li>plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
 *  <li>plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p180840
 * @since 17.0.1
 * @version 0.0.1
 */
public class PlusTwo {
    public static void main(String[] args) {
        int[] array1 = {1, 2};
        int[] array2 = {3, 4};
        int[] array3 = {4, 4};
        int[] array4 = {2, 2};
        int[] array5 = {9, 2};
        int[] array6 = {3, 4};
        System.out.println("plusTwo(" + Arrays.toString(array1) + ", "
                + Arrays.toString(array2) + ") -> "
                + Arrays.toString(plusTwo(array1, array2)));
        System.out.println("plusTwo(" + Arrays.toString(array3) + ", "
                + Arrays.toString(array4) + ") -> "
                + Arrays.toString(plusTwo(array4, array4)));
        System.out.println("plusTwo(" + Arrays.toString(array5) + ", "
                + Arrays.toString(array6) + ") -> "
                + Arrays.toString(plusTwo(array5, array6)));
    }

    /**
     * Given 2 int arrays, each length 2, return a new array length 4
     * containing all their elements.
     * 
     * @param a First integer array of length 2.
     * @param b Second integer array of length 2.
     * @return An array with all elements of 'a' and 'b'.
     * @since 0.0.1
     */
    public static int[] plusTwo(int[] a, int[] b) {
        int[] array = new int[4];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            array[index] = a[i];
            index++;
        }
        for (int i = 0; i < b.length; i++) {
            array[index] = b[i];
            index++;
        }
        return array;
    }
}
