import java.util.Arrays;

/**
 * Given an array of scores sorted in increasing order, return true if the
 * array contains 3 adjacent scores that differ from each other by at most 2,
 * such as with {3, 4, 5} or {3, 5, 5}.
 * <ul>
 *  <li>scoresClump([3, 4, 5]) → true
 *  <li>scoresClump([3, 4, 6]) → false
 *  <li>scoresClump([1, 3, 5, 5]) → true
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p194530
 * @since 17.0.1
 * @version 0.0.1
 */
public class ScoresClump {
    public static void main(String[] args) {
        int[] array1 = {3, 4, 5};
        int[] array2 = {3, 4, 6};
        int[] array3 = {1, 3, 5, 5};
        System.out.println("scoresClump(" + Arrays.toString(array1) + ") -> "
                                            + scoresClump(array1));
        System.out.println("scoresClump(" + Arrays.toString(array2) + ") -> "
                                            + scoresClump(array2));
        System.out.println("scoresClump(" + Arrays.toString(array3) + ") -> "
                                            + scoresClump(array3));
        int[] array4 = {3, 3, 6, 7, 9};
        System.out.println("scoresClump([3, 3, 6, 7, 9]) -> " + scoresClump(array4));
    }

    /**
     * Given an array of scores sorted in increasing order, return true if the
     * array contains 3 adjacent scores that differ from each other by at most
     * 2, such as with {3, 4, 5} or {3, 5, 5}.
     * 
     * @param scores Array of scores in increasing order.
     * @return true if three adjacent scores have a total difference of less
     * than or equal to 2
     * @since 0.0.1
     */
    public static boolean scoresClump(int[] scores) {
        for (int i = 0; i < scores.length-2; i++) {
            if (scores[i+2] - scores[i] <= 2 && scores[i+1] - scores[i] <= 2) {
                return true;
            }
        }
        return false;
    }
}
