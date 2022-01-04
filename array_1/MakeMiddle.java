import java.util.Arrays;

/**
 * Given an array of ints of even length, return a new array length 2 containing
 * the middle two elements from the original array. The original array will be
 * length 2 or more.
 * <ul>
 *  <li>makeMiddle([1, 2, 3, 4]) → [2, 3]
 *  <li>makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
 *  <li>makeMiddle([1, 2]) → [1, 2]
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p199519
 * @since 17.0.1
 * @version 0.0.1
 */
public class MakeMiddle {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {7, 1, 2, 3, 4, 9};
        int[] array3 = {1, 2};
        System.out.println("makeMiddle([1, 2, 3, 4]) -> " + Arrays.toString(makeMiddle(array1)));
        System.out.println("makeMiddle([7, 1, 2, 3, 4, 9]) -> " + Arrays.toString(makeMiddle(array2)));
        System.out.println("makeMiddle([1, 2]) -> " + Arrays.toString(makeMiddle(array3)));
    }

    /**
     * Given an array of ints of even length, return a new array length 2 containing
     * the middle two elements from the original array. The original array will be
     * length 2 or more.
     * 
     * @param nums the array inputted to find the middle 2 elements
     * @return int[] new array with the middle 2 elements of nums
     * @since 0.0.1
     */
    public static int[] makeMiddle(int[] nums) {
        int middle = nums.length/2;
        int[] newArray = {nums[middle-1], nums[middle]};
        return newArray;
    }
}
