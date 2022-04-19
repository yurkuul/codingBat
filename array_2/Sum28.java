import java.util.Arrays;

/**
 * Given an array of ints, return true if the sum of all the 2's in the array
 * is exactly 8.
 * <ul>
 *  <li>sum28([2, 3, 2, 2, 4, 2]) → true
 *  <li>sum28([2, 3, 2, 2, 4, 2, 2]) → false
 *  <li>sum28([1, 2, 3, 4]) → false
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p199612
 * @since 17.0.1
 * @version 0.0.2
 */
public class Sum28 {
    public static void main(String[] args) {
        int[] array1 = {2, 3, 2, 2, 4, 2};
        int[] array2 = {2, 3, 2, 2, 4, 2, 2};
        int[] array3 = {1, 2, 3, 4};
        System.out.println("sum28(" + Arrays.toString(array1) + ") -> "
                            + sum28(array1));
        System.out.println("sum28(" + Arrays.toString(array2) + ") -> "
                            + sum28(array2));
        System.out.println("sum28(" + Arrays.toString(array3) + ") -> "
                            + sum28(array3));
    }

    /**
     * Given an array of ints, return true if the sum of all the 2's in the
     * array is exactly 8.
     * 
     * @param nums Array of integers.
     * @return true if the sum of all 2's in the array equals 8.
     * @since 0.0.1
     */
    public static boolean sum28(int[] nums) {
        int total2 = 0;
        for (int num : nums) {
            if (num == 2) {
                total2++;
            }
        }
        return total2*2 == 8;
    }
}
