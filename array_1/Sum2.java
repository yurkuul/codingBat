/**
 * Given an array of ints, return the sum of the first 2 elements in the
 * array. If the array length is less than 2, just sum up the elements that
 * exist, returning 0 if the array is length 0.
 * <ul>
 *  <li>sum2([1, 2, 3]) → 3
 *  <li>sum2([1, 1]) → 2
 *  <li>sum2([1, 1, 1, 1]) → 2
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p190968
 * @since 17.0.1
 * @version 0.0.2
 */
public class Sum2 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 1};
        int[] array3 = {1, 1, 1, 1};
        int[] array4 = {1, 7, 2, 5};
        System.out.println("sum2([1, 2, 3]) -> " + sum2(array1));
        System.out.println("sum2([1, 1]) -> " + sum2(array2));
        System.out.println("sum2([1, 1, 1, 1]) -> " + sum2(array3));
        System.out.println("sum2([1, 7, 2, 5]) -> " + sum2(array4));
    }
    
    /**
     * Given an array of ints, return the sum of the first 2 elements in the
     * array. If the array length is less than 2, just sum up the elements that
     * exist, returning 0 if the array is length 0.
     * 
     * @param nums Used to return the sum of the first 2 elements.
     * @return The sum of the first 2 elements if the length is greater than 2.
     * Returns 0 if the length is 0 or returns index 0 if the length is less
     * than 2.
     * @since 0.0.1
     */
    public static int sum2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length < 2) {
            return nums[0];
        }
        return nums[0] + nums[1];
    }
}
