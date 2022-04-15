import java.util.Arrays;

/**
 * Return the "centered" average of an array of ints, which we'll say is the
 * mean average of the values, except ignoring the largest and smallest values
 * in the array. If there are multiple copies of the smallest value, ignore
 * just one copy, and likewise for the largest value. Use int division to
 * produce the final average. You may assume that the array is length 3 or
 * more.
 * <ul>
 *  <li>centeredAverage([1, 2, 3, 4, 100]) → 3
 *  <li>centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
 *  <li>centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p136585
 * @since 17.0.1
 * @version 0.0.1
 */
public class CenteredAverage {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 100};
        int[] array2 = {1, 1, 5, 5, 10, 8, 7};
        int[] array3 = {-10, -4, -2, -4, -2, 0};
        System.out.println("centeredAverage(" + Arrays.toString(array1)
                            + ") -> " + centeredAverage(array1));
        System.out.println("centeredAverage(" + Arrays.toString(array2)
                            + ") -> " + centeredAverage(array2));
        System.out.println("centeredAverage(" + Arrays.toString(array3)
                            + ") -> " + centeredAverage(array3));
    } 

   /**
    * Return the "centered" average of an array of ints, which we'll say is the
    * mean average of the values, except ignoring the largest and smallest
    * values in the array. If there are multiple copies of the smallest value,
    * ignore just one copy, and likewise for the largest value. Use int 
    * division to produce the final average. You may assume that the array is
    * length 3 or more.
    *
    * @param nums Array of numbers.
    * @return The average of nums excluding the largest and smallest values.
    * @since 0.0.1
    */
    public static int centeredAverage(int[] nums) {
        int largest = nums[0];
        int smallest = nums[0];
        int total = 0;
        for (int num : nums) {
            largest = Math.max(largest, num);
            smallest = Math.min(smallest, num);
        }
        boolean checkLarge = false;
        boolean checkSmall = false;
        for (int i = 0; i < nums.length; i++) {
            if (!checkLarge && nums[i] == largest) {
                nums[i] = 0;
                checkLarge = true;
            } else if (!checkSmall && nums[i] == smallest) {
                nums[i] = 0;
                checkSmall = true;
            }
            total += nums[i];
        }
        return (int)(total/(nums.length-2));
    }
}
