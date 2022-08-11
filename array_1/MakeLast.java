import java.util.Arrays;

/**
 * Given an int array, return a new array with double the length where its last
 * element is the same as the original array, and all the other elements are 0.
 * The original array will be length 1 or more. Note: by default, a new int
 * array contains all 0's.
 * 
 * <ul>
 *  <li>makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
 *  <li>makeLast([1, 2]) → [0, 0, 0, 2]
 *  <li>makeLast([3]) → [0, 3]
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p137188
 * @since 17.0.1
 * @version 0.0.1
 */
public class MakeLast {
    public static void main(String[] args) {
        int[] array1 = {4, 5, 6};
        int[] array2 = {1, 2};
        int[] array3 = {3};
        System.out.println("makeLast(" + Arrays.toString(array1) + ") -> "
                             + Arrays.toString(makeLast(array1)));
        System.out.println("makeLast(" + Arrays.toString(array2) + ") -> "
                             + Arrays.toString(makeLast(array2)));
        System.out.println("makeLast(" + Arrays.toString(array3) + ") -> "
                             + Arrays.toString(makeLast(array3)));
    }

    /**
     * Given an int array, return a new array with double the length where its
     * last element is the same as the original array, and all the other
     * elements are 0. The original array will be length 1 or more. Note: by
     * default, a new int array contains all 0's.
     * 
     * @param nums An array of integers.
     * @return An array of integers of double the length of 'nums' with the
     * last index the same as the last index of 'nums'.
     * @since 0.0.1
     */
    public static int[] makeLast(int[] nums) {
        int[] array = new int[nums.length*2];
        array[array.length-1] = nums[nums.length-1];
        return array;
    }
}
