import java.util.Arrays;

/**
 * Given an array of ints, return true if the array contains two 7's next to
 * each other, or there are two 7's separated by one element, such as with
 * {7, 1, 7}.
 * 
 * <ul>
 *  <li>has77([1, 7, 7]) → true
 *  <li>has77([1, 7, 1, 7]) → true
 *  <li>has77([1, 7, 1, 1, 7]) → false
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p168357
 * @since 17.0.1
 * @version 0.0.1
 */
public class Has77 {
    public static void main(String[] args) {
        int[] array1 = {1, 7, 7};
        int[] array2 = {1, 7, 1, 7};
        int[] array3 = {1, 7, 1, 1, 7};
        System.out.println("has77(" + Arrays.toString(array1) + ") -> "
                             + has77(array1));
        System.out.println("has77(" + Arrays.toString(array2) + ") -> "
                            + has77(array2));
        System.out.println("has77(" + Arrays.toString(array3) + ") -> "
                             + has77(array3));
    }

    /**
     * Given an array of ints, return true if the array contains two 7's next
     * to each other, or there are two 7's separated by one element, such as
     * with {7, 1, 7}.
     * 
     * @param nums Array of integers.
     * @return true if there are two 7's beside each other or is separated by
     * one element.
     * @since 0.0.1
     */
    public static boolean has77(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 7 && nums[i+1] == 7) {
                return true;
            } else if ((i+2) < nums.length && nums[i] == 7 && nums[i+2] == 7) {
                return true;
            }
        }
        return false;
    }
}
