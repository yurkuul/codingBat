import java.util.Arrays;

/**
 * Given an array of ints, return true if the number of 1's is greater than the
 * number of 4's
 * <ul>
 *  <li>more14([1, 4, 1]) → true
 *  <li>more14([1, 4, 1, 4]) → false
 *  <li>more14([1, 1]) → true
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p104627
 * @since 17.0.1
 * @version 0.0.1
 */
public class More14 {
    public static void main(String[] args) {
        int[] array1 = {1, 4, 1};
        int[] array2 = {1, 4, 1, 4};
        int[] array3 = {1, 1};
        System.out.println("more14(" + Arrays.toString(array1) + ") -> "
                            + more14(array1));
        System.out.println("more14(" + Arrays.toString(array2) + ") -> "
                            + more14(array2));
        System.out.println("more14(" + Arrays.toString(array3) + ") -> "
                            + more14(array3));
    }

    /**
     * Given an array of ints, return true if the number of 1's is greater than
     * the number of 4's
     * 
     * @param nums Array of integers.
     * @return true if the number of 1's is greater than the number of 4's in
     * nums.
     * @since 0.0.1
     */
    public static boolean more14(int[] nums) {
        int num1 = 0;
        int num4 = 0;
        for (int num : nums) {
            if (num == 1) {
                num1++;
            } else if (num == 4) {
                num4++;
            }
        }
        return num1 > num4;
    }
}
