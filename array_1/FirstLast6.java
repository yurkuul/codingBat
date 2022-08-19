import java.util.Arrays;

/**
 * Given an array of ints, return true if 6 appears as either the first or last
 * element in the array. The array will be length 1 or more.
 * 
 * <ul>
 *  <li>firstLast6([1, 2, 6]) → true
 *  <li>firstLast6([6, 1, 2, 3]) → true
 *  <li>firstLast6([13, 6, 1, 2, 3]) → false
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p185685
 * @since 17.0.1
 * @version 0.0.1
 */
public class FirstLast6 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 6};
        int[] array2 = {6, 1, 2, 3};
        int[] array3 = {13, 6, 1, 2, 3};
        System.out.println("firstLast6(" + Arrays.toString(array1) + ") -> "
                             + firstLast6(array1));
        System.out.println("firstLast6(" + Arrays.toString(array2) + ") -> "
                             + firstLast6(array2));
        System.out.println("firstLast6(" + Arrays.toString(array3) + ") -> "
                             + firstLast6(array3));
    }

    /**
     * Given an array of ints, return true if 6 appears as either the first or
     * last element in the array. The array will be length 1 or more.
     * 
     * @param nums Array of integers that is length 1 or more.
     * @return true if 6 appears in 'nums' at the beginning or end of the array
     * @since 0.0.1
     */
    public static boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length-1] == 6;
    }
}
