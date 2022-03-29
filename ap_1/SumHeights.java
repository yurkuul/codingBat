import java.util.Arrays;

/**
 * We have an array of heights, representing the altitude along a walking
 * trail. Given start/end indexes into the array, return the sum of the changes
 * for a walk beginning at the start index and ending at the end index. For
 * example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum
 * of 1 + 5 = 6. The start end end index will both be valid indexes into the
 * array with start <= end.
 * <ul>
 *  <li>sumHeights([5, 3, 6, 7, 2], 2, 4) → 6
 *  <li>sumHeights([5, 3, 6, 7, 2], 0, 1) → 2
 *  <li>sumHeights([5, 3, 6, 7, 2], 0, 4) → 11
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p148138
 * @since 17.0.1
 * @version 0.0.1
 */

public class SumHeights {
    public static void main(String[] args) {
        int[] array = {5, 3, 6, 7, 2};
        System.out.println("sumHeights(" + Arrays.toString(array) + ") -> " + sumHeights(array, 2, 4));
        System.out.println("sumHeights(" + Arrays.toString(array) + ") -> " + sumHeights(array, 0, 1));
        System.out.println("sumHeights(" + Arrays.toString(array) + ") -> " + sumHeights(array, 0, 4));
    }

    /**
     * We have an array of heights, representing the altitude along a walking
     * trail. Given start/end indexes into the array, return the sum of the changes
     * for a walk beginning at the start index and ending at the end index. For
     * example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum
     * of 1 + 5 = 6. The start end end index will both be valid indexes into the
     * array with start <= end.
     * 
     * @param heights The array that is used to find the changes in values.
     * @param start The starting index for adding in the array.
     * @param end The ending index for adding in the array.
     * @return The changes in values in the array from the start to end indicies.
     * @since 0.0.1
     */
    public static int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += Math.abs(heights[i+1] - heights[i]);
        }
        return sum;
    }    
}
