import java.util.Arrays;

/**
 * Consider the leftmost and rightmost appearances of some value in an array.
 * We'll say that the "span" is the number of elements between the two
 * inclusive. A single value has a span of 1. Returns the largest span found in
 * the given array. (Efficiency is not a priority.)
 * <ul>
 *  <li>maxSpan([1, 2, 1, 1, 3]) → 4
 *  <li>maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
 *  <li>maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p189576
 * @since 17.0.1
 * @version 0.0.1
 */
public class MaxSpan {
    public static void main(String[] args) {
       int[] array1 = {1, 2, 1, 1, 3};
       int[] array2 = {1, 4, 2, 1, 4, 1, 4};
       int[] array3 = {1, 4, 2, 1, 4, 4, 4};
       System.out.println("maxSpan(" + Arrays.toString(array1) + ") -> " + maxSpan(array1));
       System.out.println("maxSpan(" + Arrays.toString(array2) + ") -> " + maxSpan(array2));
       System.out.println("maxSpan(" + Arrays.toString(array3) + ") -> " + maxSpan(array3));
    } 

    /**
     * Consider the leftmost and rightmost appearances of some value in an
     * array. We'll say that the "span" is the number of elements between the
     * two inclusive. A single value has a span of 1. Returns the largest span
     * found in the given array. (Efficiency is not a priority.)
     * 
     * @param nums Array of integers.
     * @return The biggest number of elements between the same two values in
     * the array, including the starting and ending indices.
     * @since 0.0.1
     */
    public static int maxSpan(int[] nums) {
        int longestSpan = 1;
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length/2+1; i++) {
            for (int j = nums.length-1; j >= nums.length/2; j--) {
                if (nums[i] == nums[j] && (j-i+1) > longestSpan) {
                    longestSpan = j-i+1;
                }
            }
        }
        return longestSpan;
    }
}
