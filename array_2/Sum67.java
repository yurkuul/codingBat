import java.util.Arrays;

/**
 * Return the sum of the numbers in the array, except ignore sections of
 * numbers starting with a 6 and extending to the next 7 (every 6 will be
 * followed by at least one 7). Return 0 for no numbers.
 * <ul>
 *  <li>sum67([1, 2, 2]) → 5
 *  <li>sum67([1, 2, 2, 6, 99, 99, 7]) → 5
 *  <li>sum67([1, 1, 6, 7, 2]) → 4
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p111327
 * @since 17.0.1
 * @version 0.0.1
 */
public class Sum67 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 2};
        int[] array2 = {1, 2, 2, 6, 99, 99, 7};
        int[] array3 = {1, 1, 6, 7, 2};
        System.out.println("sum67(" + Arrays.toString(array1) + ") -> "
                            + sum67(array1));
        System.out.println("sum67(" + Arrays.toString(array2) + ") -> "
                            + sum67(array2));
        System.out.println("sum67(" + Arrays.toString(array3) + ") -> "
                            + sum67(array3));
    }

    /**
     * Return the sum of the numbers in the array, except ignore sections of
     * numbers starting with a 6 and extending to the next 7 (every 6 will be
     * followed by at least one 7). Return 0 for no numbers.
     * 
     * @param nums Array of numbers.
     * @return Sum of the ints in nums except for numbers in between 6 and 7.
     * @since 0.0.1
     */
    public static int sum67(int[] nums) {
        int total = 0;
        boolean between67 = false;
        for (int num : nums) {
            if (num == 6 && !between67) {
                between67 = true;
            } else if (num == 7 && between67) {
                between67 = false;
            } else if (!between67) {
                total += num;
            }
        }
        return total;
    }
}
