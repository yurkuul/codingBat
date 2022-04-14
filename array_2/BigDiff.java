import java.util.Arrays;

/**
 * Given an array length 1 or more of ints, return the difference between the
 * largest and smallest values in the array. Note: the built-in
 * Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger
 * of two values.
 * <ul>
 *  <li>bigDiff([10, 3, 5, 6]) → 7
 *  <li>bigDiff([7, 2, 10, 9]) → 8
 *  <li>bigDiff([2, 10, 7, 2]) → 8
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p196640
 * @since 17.0.1
 * @version 0.0.1
 */
public class BigDiff {
    public static void main(String[] args) {
        int[] array1 = {10, 3, 5, 6};
        int[] array2 = {7, 2, 10, 9};
        int[] array3 = {2, 10, 7, 2};
        System.out.println("bigDiff(" + Arrays.toString(array1) + ") -> " + bigDiff(array1));
        System.out.println("bigDiff(" + Arrays.toString(array2) + ") -> " + bigDiff(array2));
        System.out.println("bigDiff(" + Arrays.toString(array3) + ") -> " + bigDiff(array3));
    }

    /**
     * Given an array length 1 or more of ints, return the difference between
     * the largest and smallest values in the array. Note: the built-in
     * Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or
     * larger of two values.
     * 
     * @param nums Array of numbers.
     * @return The difference between the largest and smallest value in nums.
     * @since 0.0.1
     */
    public static int bigDiff(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int small = nums[0];
        int big = nums[0];
        for (int i = 1; i < nums.length; i++) {
            small = Math.min(small, nums[i]);
            big = Math.max(big, nums[i]);
        }
        return big - small;
    }
}
