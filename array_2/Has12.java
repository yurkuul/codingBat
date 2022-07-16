import java.util.Arrays;

/**
 * Given an array of ints, return true if there is a 1 in the array with a 2
 * somewhere later in the array.
 * 
 * <ul>
 *  <li>has12([1, 3, 2]) → true
 *  <li>has12([3, 1, 2]) → true
 *  <li>has12([3, 1, 4, 5, 2]) → true
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p169260
 * @since 17.0.1
 * @version 0.0.1
 */
public class Has12 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 2};
        int[] array2 = {3, 1, 2};
        int[] array3 = {3, 1, 4, 5, 2};
        System.out.println("has12(" + Arrays.toString(array1) + ") -> "
                             + has12(array1));
        System.out.println("has12(" + Arrays.toString(array2) + ") -> "
                             + has12(array2));
        System.out.println("has12(" + Arrays.toString(array3) + ") -> "
                             + has12(array3));
    }

    /**
     * Given an array of ints, return true if there is a 1 in the array with a
     * 2 somewhere later in the array.
     * 
     * @param nums Array of integers.
     * @return true if there is a 1 in nums with a 2 later in the arary.
     * @since 0.0.1
     */
    public static boolean has12(int[] nums) {
        boolean has1 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                has1 = true;
            }
            if (has1 && nums[i] == 2) {
                return true;
            }
        }
        return false;
    }    
}
