import java.util.Arrays;

/**
 * Given an int array length 2, return true if it does not contain a 2 or 3.
 * 
 * <ul>
 *  <li>no23([4, 5]) → true
 *  <li>no23([4, 2]) → false
 *  <li>no23([3, 5]) → false
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p175689
 * @since 17.0.1
 * @version 0.0.1
 */
public class No23 {
    public static void main(String[] args) {
        int[] array1 = {4, 5};
        int[] array2 = {4, 2};
        int[] array3 = {3, 5};
        System.out.println("no23(" + Arrays.toString(array1) + ") -> "
                             + no23(array1));
        System.out.println("no23(" + Arrays.toString(array2) + ") -> "
                             + no23(array2));
        System.out.println("no23(" + Arrays.toString(array3) + ") -> "
                             + no23(array3));
    }

    /**
     * Given an int array length 2, return true if it does not contain a 2 or 
     * 3.
     * 
     * @param nums An integer array of length 2.
     * @return true if 'nums' doesn't contain a 2 or 3.
     * @since 0.0.1
     */
    public static boolean no23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    }
}
