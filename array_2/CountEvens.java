import java.util.Arrays;

/**
 * Return the number of even ints in the given array. Note: the % "mod"
 * operator computes the remainder, e.g. 5 % 2 is 1.
 * <ul>
 *  <li>countEvens([2, 1, 2, 3, 4]) → 3
 *  <li>countEvens([2, 2, 0]) → 3
 *  <li>countEvens([1, 3, 5]) → 0
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p162010
 * @since 17.0.1
 * @version 0.0.1
 */
public class CountEvens {
    public static void main(String[] args) {
        int[] array1 = {2, 1, 2, 3, 4};
        int[] array2 = {2, 2, 0};
        int[] array3 = {1, 3, 5};
        System.out.println("countEvens(" + Arrays.toString(array1) + ") -> " + countEvens(array1));
        System.out.println("countEvens(" + Arrays.toString(array2) + ") -> " + countEvens(array2));
        System.out.println("countEvens(" + Arrays.toString(array3) + ") -> " + countEvens(array3));
    }

    /**
     * Return the number of even ints in the given array. Note: the % "mod"
     * operator computes the remainder, e.g. 5 % 2 is 1.
     * 
     * @param nums Array of ints.
     * @return The number of even ints in nums.
     * @since 0.0.1
     */
    public static int countEvens(int[] nums) {
        int evens = 0;
        for (int n : nums) {
            if (n % 2 == 0) {
                evens++;
            }
        }
        return evens;
    }    
}
