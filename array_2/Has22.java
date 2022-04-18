import java.util.Arrays;

/**
 * Given an array of ints, return true if the array contains a 2 next to a 2
 * somewhere.
 * <ul>
 *  <li>has22([1, 2, 2]) → true
 *  <li>has22([1, 2, 1, 2]) → false
 *  <li>has22([2, 1, 2]) → false
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p121853
 * @since 17.0.1
 * @version 0.0.2
 */
public class Has22 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 2};
        int[] array2 = {1, 2, 1, 2};
        int[] array3 = {2, 1, 2};
        System.out.println("has22(" + Arrays.toString(array1) + ") -> "
                            + has22(array1));
        System.out.println("has22(" + Arrays.toString(array2) + ") -> "
                            + has22(array2));
        System.out.println("has22(" + Arrays.toString(array3) + ") -> "
                            + has22(array3));
    }

    /**
     * Given an array of ints, return true if the array contains a 2 next to a
     * 2 somewhere.
     * 
     * @param nums Array of numbers.
     * @return true if nums has 2 next to another 2.
     * @since 0.0.1
     */
    public static boolean has22(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 2 && nums[i+1] == 2) {
                return true;
            }
        }
        return false;
    }    
}
