import java.util.Arrays;

/**
 * (A variation on the sumHeights problem.) We have an array of heights,
 * representing the altitude along a walking trail. Given start/end indexes
 * into the array, return the sum of the changes for a walk beginning at the
 * start index and ending at the end index, however increases in height count
 * double. For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4
 * yields a sum of 1*2 + 5 = 7. The start end end index will both be valid
 * indexes into the array with start <= end.
 * <ul>
 *  <li>sumHeights2([5, 3, 6, 7, 2], 2, 4) → 7
 *  <li>sumHeights2([5, 3, 6, 7, 2], 0, 1) → 2
 *  <li>sumHeights2([5, 3, 6, 7, 2], 0, 4) → 15
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p157900
 * @since 17.0.1
 * @version 0.0.1
 */
public class SumHeights2 {
    public static void main(String[] args) {
        int[] array = {5, 3, 6, 7, 2};
        System.out.println("sumHeights2(" + Arrays.toString(array)
                            + ", 2, 4) -> " + sumHeights2(array, 2, 4));
        System.out.println("sumHeights2(" + Arrays.toString(array)
                            + ", 0, 1) -> " + sumHeights2(array, 0, 1));
        System.out.println("sumHeights2(" + Arrays.toString(array)
                            + ", 0, 4) -> " + sumHeights2(array, 0, 4));
    }

    /**
     * (A variation on the sumHeights problem.) We have an array of heights,
     * representing the altitude along a walking trail. Given start/end indexes
     * into the array, return the sum of the changes for a walk beginning at
     * the start index and ending at the end index, however increases in height
     * count double. For example, with the heights {5, 3, 6, 7, 2} and start=2,
     * end=4 yields a sum of 1*2 + 5 = 7. The start end end index will both be
     * valid indexes into the array with start <= end.
     * 
     * @param heights Array of various heights.
     * @param start Starting index for finding the sums of differences in
     * heights.
     * @param end Ending index for finding the sums of differences in heights.
     * @return The sum of the differences of heights.
     * @since 0.0.1
     */
    public static int sumHeights2(int[] heights, int start, int end) {
        int total = 0;
        for (int i = start; i < end; i++) {
            if (heights[i] > heights[i+1]) {
                total += heights[i] - heights[i+1];
            } else {
                total += (heights[i+1] - heights[i])*2;
            }
        }
        return total;
    }
}
