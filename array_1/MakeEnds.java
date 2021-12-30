import java.util.Arrays;

/**
 * Given an array of ints, return a new array length 2 containing the first and
 * last elements from the original array.The original array will be length 1 or
 * more.
 * <ul>
 *  <li>makeEnds([1, 2, 3]) → [1, 3]
 *  <li>makeEnds([1, 2, 3, 4]) → [1, 4]
 *  <li>makeEnds([7, 4, 6, 2]) → [7, 2]
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p101230
 * @since 17.0.1
 * @version 0.0.1
 */
public class MakeEnds {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {7, 4, 6, 2};
        System.out.println(Arrays.toString(makeEnds(array1)) + " -> [1, 3]");
        System.out.println(Arrays.toString(makeEnds(array2)) + " -> [1, 4]");
        System.out.println(Arrays.toString(makeEnds(array3)) + " -> [7, 2]");
    }

    /**
     * Given an array of ints, return a new array length 2 containing the first and
     * last elements from the original array.The original array will be length 1 or
     * more.
     * 
     * @param nums an int array passed in for the modification
     * @return int[] modified version
     * @since 0.0.1
     */
    public static int[] makeEnds(int[] nums) {
        int[] newArray = new int[2];
        newArray[0] = nums[0];
        newArray[1] = nums[nums.length-1];
        return newArray;
    }
}
