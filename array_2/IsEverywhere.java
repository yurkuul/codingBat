import java.util.Arrays;

/**
 * We'll say that a value is "everywhere" in an array if for every pair of
 * adjacent elements in the array, at least one of the pair is that value.
 * Return true if the given value is everywhere in the array.
 * 
 * <ul>
 *  <li>isEverywhere([1, 2, 1, 3], 1) → true
 *  <li>isEverywhere([1, 2, 1, 3], 2) → false
 *  <li>isEverywhere([1, 2, 1, 3, 4], 1) → false
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p121853
 * @since 17.0.1
 * @version 0.0.1
 */
public class IsEverywhere {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 1, 3};
        int[] array2 = {1, 2, 1, 3};
        int[] array3 = {1, 2, 1, 3, 4};
        System.out.println("isEverywhere(" + Arrays.toString(array1)
                                         + ") -> " + isEverywhere(array1, 1));
        System.out.println("isEverywhere(" + Arrays.toString(array2)
                                         + ") -> " + isEverywhere(array2, 2));
        System.out.println("isEverywhere(" + Arrays.toString(array3)
                                         + ") -> " + isEverywhere(array3, 1));
    }

    /**
     * We'll say that a value is "everywhere" in an array if for every pair of
     * adjacent elements in the array, at least one of the pair is that value.
     * Return true if the given value is everywhere in the array.
     * 
     * @param nums Array of integers.
     * @param val The value to look for in every pair of integers in nums.
     * @return true if at least of the values in each pair is val.
     * @since 0.0.1
     */
    public static boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != val && nums[i+1] != val) {
                return false;
            }
        }
        return true;
    }
}
