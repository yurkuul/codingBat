import java.util.Arrays;

/**
 * Given an array of ints, return true if the array is length 1 or more, and
 * the first element and the last element are equal.
 * 
 * <ul>
 *  <li>sameFirstLast([1, 2, 3]) → false
 *  <li>sameFirstLast([1, 2, 3, 1]) → true
 *  <li>sameFirstLast([1, 2, 1]) → true
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p118976
 * @since 17.0.1
 * @version 0.0.1
 */
public class SameFirstLast {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3, 1};
        int[] array3 = {1, 2, 1};
        System.out.println("sameFirstLast(" + Arrays.toString(array1) + ") -> "
                             + sameFirstLast(array1));
        System.out.println("sameFirstLast(" + Arrays.toString(array2) + ") -> "
                             + sameFirstLast(array2));
        System.out.println("sameFirstLast(" + Arrays.toString(array3) + ") -> "
                             + sameFirstLast(array3));
    }

    /**
     * Given an array of ints, return true if the array is length 1 or more,
     * and the first element and the last element are equal.
     * 
     * @param nums Array of integers.
     * @return true if the array length is 1 or more and the first and last
     * elements are the same.
     * @since 0.0.1
     */
    public static boolean sameFirstLast(int[] nums) {
        if (nums.length > 0) {
            return nums[0] == nums[nums.length-1];
        }
        return false;
    }
}
