import java.util.Arrays;

/**
 * Given an array of ints, return true if every element is a 1 or a 4.
 * <ul>
 *  <li>only14([1, 4, 1, 4]) → true
 *  <li>only14([1, 4, 2, 4]) → false
 *  <li>only14([1, 1]) → true
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p186672
 * @since 17.0.1
 * @version 0.0.1
 */
public class Only14 {
    public static void main(String[] args) {
        int[] array1 = {1, 4, 1, 4};
        int[] array2 = {1, 4, 2, 4};
        int[] array3 = {1, 1};
        System.out.println("only14(" + Arrays.toString(array1) + ") -> "
                            + only14(array1));
        System.out.println("only14(" + Arrays.toString(array2) + ") -> "
                            + only14(array2));
        System.out.println("only14(" + Arrays.toString(array3) + ") -> "
                            + only14(array3));
    }

    /**
     * Given an array of ints, return true if every element is a 1 or a 4.
     * 
     * @param nums
     * @return
     * @since 0.0.1
     */
    public static boolean only14(int[] nums) {
        for (int num : nums) {
            if (num != 1 && num != 4) {
                return false;
            }
        }
        return true;
    }
}
