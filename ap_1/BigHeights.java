import java.util.Arrays;

/**
 * (A variation on the sumHeights problem.) We have an array of heights,
 * representing the altitude along a walking trail. Given start/end indexes
 * into the array, return the number of "big" steps for a walk starting at the
 * start index and ending at the end index. We'll say that step is big if it is
 * 5 or more up or down. The start end end index will both be valid indexes
 * into the array with start <= end.
 * <ul>
 *  <li>bigHeights([5, 3, 6, 7, 2], 2, 4) → 1
 *  <li>bigHeights([5, 3, 6, 7, 2], 0, 1) → 0
 *  <li>bigHeights([5, 3, 6, 7, 2], 0, 4) → 1
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p197710
 * @since 17.0.1
 * @version 0.0.1
 */
public class BigHeights {
    public static void main(String[] args) {
        int[] array = {5, 3, 6, 7, 2};
        System.out.println("bigHeights(" + Arrays.toString(array)
                            + ", 2, 4) -> " + bigHeights(array, 2, 4));
        System.out.println("bigHeights(" + Arrays.toString(array)
                            + ", 0, 1) -> " + bigHeights(array, 0, 1));
        System.out.println("bigHeights(" + Arrays.toString(array)
                            + ", 0, 4) -> " + bigHeights(array, 0, 4));
    }

    /**
     * (A variation on the sumHeights problem.) We have an array of heights,
     * representing the altitude along a walking trail. Given start/end indexes
     * into the array, return the number of "big" steps for a walk starting at
     * the start index and ending at the end index. We'll say that step is big
     * if it is 5 or more up or down. The start end end index will both be
     * valid indexes into the array with start <= end.
     * 
     * @param heights Array of heights.
     * @param start Starting index for finding the big steps.
     * @param end Ending index for finding the big steps.
     * @return The number of big steps found in heights from indexes start
     * to end.
     * @since 0.0.1
     */
    public static int bigHeights(int[] heights, int start, int end) {
        int bigSteps = 0;
        for (int i = start; i < end; i++) {
            if (Math.abs(heights[i+1] - heights[i]) >= 5) {
                bigSteps++;
            }
        }
        return bigSteps;
    }
}
