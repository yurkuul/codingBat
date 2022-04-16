import java.util.Arrays;

/**
 * Return the sum of the numbers in the array, returning 0 for an empty array.
 * Except the number 13 is very unlucky, so it does not count and numbers that
 * come immediately after a 13 also do not count.
 * <ul>
 *  <li>sum13([1, 2, 2, 1]) → 6
 *  <li>sum13([1, 1]) → 2
 *  <li>sum13([1, 2, 2, 1, 13]) → 6
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p127384
 * @since 17.0.1
 * @version 0.0.1
 */
public class Sum13 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 2, 1};
        int[] array2 = {1, 1};
        int[] array3 = {1, 2, 2, 1, 13};
        System.out.println("sum13(" + Arrays.toString(array1) + ") -> "
                            + sum13(array1));
        System.out.println("sum13(" + Arrays.toString(array2) + ") -> "
                            + sum13(array2));
        System.out.println("sum13(" + Arrays.toString(array3) + ") -> "
                            + sum13(array3));
    }

    /**
     * Return the sum of the numbers in the array, returning 0 for an empty
     * array. Except the number 13 is very unlucky, so it does not count and
     * numbers that come immediately after a 13 also do not count.
     * 
     * @param nums Array of numbers.
     * @return The sum of the numbers in nums, excluding values after 13 if
     * present in the array.
     * @since 0.0.1
     */
    public static int sum13(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
            } else {
                total += nums[i];
            }
        }
        return total;
    }
}
