import java.util.Arrays;

/**
 * Given an array of ints, return true if the array contains no 1's and no 3's.
 * <ul>
 *  <li>lucky13([0, 2, 4]) → true
 *  <li>lucky13([1, 2, 3]) → false
 *  <li>lucky13([1, 2, 4]) → false
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p194525
 * @since 17.0.1
 * @version 0.0.2
 */
public class Lucky13 {
    public static void main(String[] args) {
        int[] array1 = {0, 2, 4};
        int[] array2 = {1, 2, 3};
        int[] array3 = {1, 2, 4};
        System.out.println("lucky13(" + Arrays.toString(array1) + ") -> "
                            + lucky13(array1));
        System.out.println("lucky13(" + Arrays.toString(array2) + ") -> "
                            + lucky13(array2));
        System.out.println("lucky13(" + Arrays.toString(array3) + ") -> "
                            + lucky13(array3));
    }

    /**
     * Given an array of ints, return true if the array contains no 1's and no
     * 3's.
     * 
     * @param nums Array of integers.
     * @return true if nums does not contain 1's or 3's.
     * @since 0.0.1
     */
    public static boolean lucky13(int[] nums) {
        for (int num : nums) {
            if (num == 1 || num == 3) {
                return false;
            }
        }
        return true;
    }
}
