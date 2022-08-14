import java.util.Arrays;

/**
 * Given an int array length 2, return true if it contains a 2 or a 3.
 * 
 * <ul>
 *  <li>has23([2, 5]) → true
 *  <li>has23([4, 3]) → true
 *  <li>has23([4, 5]) → false
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p171022
 * @since 17.0.1
 * @version 0.0.1
 */
public class Has23 {
    public static void main(String[] args) {
        int[] array1 = {2, 5};
        int[] array2 = {4, 3};
        int[] array3 = {4, 5};
        System.out.println("has23(" + Arrays.toString(array1) + ") -> "
                             + has23(array1));
        System.out.println("has23(" + Arrays.toString(array2) + ") -> "
                             + has23(array2));
        System.out.println("has23(" + Arrays.toString(array3) + ") -> "
                             + has23(array3));
    }

    /**
     * Given an int array length 2, return true if it contains a 2 or a 3.
     * 
     * @param nums Array of integers with a length of 2.
     * @return true if 'nums' has a 2 or a 3.
     * @since 0.0.1
     */
    public static boolean has23(int[] nums) {
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == 2 || nums[i] == 3) {
                return true;
            }
        }
        return false;
    }
}
