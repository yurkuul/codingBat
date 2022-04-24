import java.util.Arrays;

/**
 * Given an array of ints, return true if it contains no 1's or it contains no
 * 4's.
 * <ul>
 *  <li>no14([1, 2, 3]) → true
 *  <li>no14([1, 2, 3, 4]) → false
 *  <li>no14([2, 3, 4]) → true
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p136648
 * @since 17.0.1
 * @version 0.0.1
 */
public class No14 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {2, 3, 4};
        System.out.println("no14(" + Arrays.toString(array1) +") -> " + no14(array1));
        System.out.println("no14(" + Arrays.toString(array2) +") -> " + no14(array2));
        System.out.println("no14(" + Arrays.toString(array3) +") -> " + no14(array3));
    }

    /**
     * Given an array of ints, return true if it contains no 1's or it contains
     * no 4's.
     * 
     * @param nums Array of integers.
     * @return true if nums contains no 1's or no 4's.
     * @since 0.0.1
     */
    public static boolean no14(int[] nums) {
        boolean has1 = false;
        boolean has4 = false;
        if (nums.length < 2) {
            return true;
        }
        for (int num : nums) {
            if (num == 1) {
                has1 = true;
            }
            if (num == 4) {
                has4 = true;
            }
        }
        return has1 != has4;
    }
}
