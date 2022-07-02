import java.util.Arrays;

/**
 * Given an array of ints, return true if the array contains a 2 next to a 2 or
 * a 4 next to a 4, but not both.
 * 
 * <ul>
 *  <li>either24([1, 2, 2]) → true
 *  <li>either24([4, 4, 1]) → true
 *  <li>either24([4, 4, 1, 2, 2]) → false
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p191878
 * @since 17.0.1
 * @version 0.0.1
 */
public class Either24 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 2};
        int[] array2 = {4, 4, 1};
        int[] array3 = {4, 4, 1, 2, 2};
        System.out.println("either24(" + Arrays.toString(array1) + ") -> "
                                     + either24(array1));
        System.out.println("either24(" + Arrays.toString(array2) + ") -> "
                                     + either24(array2));
        System.out.println("either24(" + Arrays.toString(array3) + ") -> "
                                     + either24(array3));
    }

    /**
     * Given an array of ints, return true if the array contains a 2 next to a
     * 2 or a 4 next to a 4, but not both.
     * 
     * @param nums Array of integers.
     * @return true if nums contains a 2 next to a 2 or a 4 next to a 4, but
     * not both.
     * @since 0.0.1
     */
    public static boolean either24(int[] nums) {
        boolean check = false;
        for (int i = 0; i < nums.length-1; i++) {
            if (!check) {
                if (nums[i] == 2 && nums[i+1] == 2) {
                    check = true;
                } else if (nums[i] == 4 && nums[i+1] == 4) {
                    check = true;
                }
            } else {
                if (nums[i] == 2 && nums[i+1] == 2) {
                    return false;
                } else if (nums[i] == 4 && nums[i+1] == 4) {
                    return false;
                }
            }
        }
        return check;
    }
}
