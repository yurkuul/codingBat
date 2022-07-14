import java.util.Arrays;

/**
 * Given an array of ints length 3, figure out which is larger, the first or
 * last element in the array, and set all the other elements to be that value.
 * Return the changed array.
 * 
 * <ul>
 *  <li>maxEnd3([1, 2, 3]) → [3, 3, 3]
 *  <li>maxEnd3([11, 5, 9]) → [11, 11, 11]
 *  <li>maxEnd3([2, 11, 3]) → [3, 3, 3]
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p146256
 * @since 17.0.1
 * @version 0.0.1
 */
public class MaxEnd3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {11, 5, 9};
        int[] array3 = {2, 11, 3};
        System.out.println("MaxEnd3(" + Arrays.toString(array1) + ") -> "
                             + Arrays.toString(maxEnd3(array1)));
        System.out.println("MaxEnd3(" + Arrays.toString(array2) + ") -> "
                             + Arrays.toString(maxEnd3(array2)));
        System.out.println("MaxEnd3(" + Arrays.toString(array3) + ") -> "
                             + Arrays.toString(maxEnd3(array3)));
    }

    /**
     * Given an array of ints length 3, figure out which is larger, the first
     * or last element in the array, and set all the other elements to be that
     * value. Return the changed array.
     * 
     * @param nums Array of integers.
     * @return An array with all indices set to the highest value in nums. 
     * @since 0.0.1
     */
    public static int[] maxEnd3(int[] nums) {
        if (nums[0] > nums[2]) {
            nums[1] = nums[0];
            nums[2] = nums[0];
        } else {
            nums[0] = nums[2];
            nums[1] = nums[2];
        }
        return nums;
    }    
}
