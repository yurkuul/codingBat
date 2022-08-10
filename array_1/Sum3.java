import java.util.Arrays;

/**
 * Given an array of ints length 3, return the sum of all the elements.
 * 
 * <ul>
 *  <li>sum3([1, 2, 3]) → 6
 *  <li>sum3([5, 11, 2]) → 18
 *  <li>sum3([7, 0, 0]) → 7
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p175763
 * @since 17.0.1
 * @version 0.0.1
 */
public class Sum3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {5, 11, 2};
        int[] array3 = {7, 0, 0};
        System.out.println("sum3(" + Arrays.toString(array1) + ") -> "
                             + sum3(array1));
        System.out.println("sum3(" + Arrays.toString(array2) + ") -> "
                             + sum3(array2));
        System.out.println("sum3(" + Arrays.toString(array3) + ") -> "
                             + sum3(array3));
    }

    /**
     * Given an array of ints length 3, return the sum of all the elements.
     * 
     * @param nums An array of integers.
     * @return The sum of all elements in 'nums'.
     * @since 0.0.1
     */
    public static int sum3(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
