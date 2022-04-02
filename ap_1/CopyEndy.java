import java.util.Arrays;

/**
 * We'll say that a positive int n is "endy" if it is in the range 0..10 or
 * 90..100 (inclusive). Given an array of positive ints, return a new array of
 * length "count" containing the first endy numbers from the original array.
 * Decompose out a separate isEndy(int n) method to test if a number is endy.
 * The original array will contain at least "count" endy numbers.
 * <ul>
 *  <li>copyEndy([9, 11, 90, 22, 6], 2) → [9, 90]
 *  <li>copyEndy([9, 11, 90, 22, 6], 3) → [9, 90, 6]
 *  <li>copyEndy([12, 1, 1, 13, 0, 20], 2) → [1, 1]
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p130124
 * @since 17.0.1
 * @version 0.0.1
 */
public class CopyEndy {
    public static void main(String[] args) {
        int[] array1 = {9, 11, 90, 22, 6};
        int[] array2 = {12, 1, 1, 13, 0, 20};
        System.out.println("copyEndy(" + Arrays.toString(array1) + ") -> " + Arrays.toString(copyEndy(array1, 2)));
        System.out.println("copyEndy(" + Arrays.toString(array1) + ") -> " + Arrays.toString(copyEndy(array1, 3)));
        System.out.println("copyEndy(" + Arrays.toString(array2) + ") -> " + Arrays.toString(copyEndy(array2, 2)));
    }

    /**
     * We'll say that a positive int n is "endy" if it is in the range 0..10 or
     * 90..100 (inclusive). Given an array of positive ints, return a new array
     * of length "count" containing the first endy numbers from the original
     * array. Decompose out a separate isEndy(int n) method to test if a number
     * is endy. The original array will contain at least "count" endy numbers.
     * 
     * @param nums Array of numbers.
     * @param count The size of the new array to be returned.
     * @return The count amount of values in nums that are between 0-10 
     * (inclusive) and 90-100 (inclusive) 
     * @since 0.0.1
     */
    public static int[] copyEndy(int[] nums, int count) {
        int[] endyNums = new int[count];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (index == count) {
                break;
            }
            if ((nums[i]>=0 && nums[i]<=10) || (nums[i]>=90 && nums[i]<=100)) {
                endyNums[index] = nums[i];
                index++;
            }
        }
        return endyNums;
    }    
}
