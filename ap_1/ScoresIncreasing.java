import java.util.Arrays;

/**
 * Given an array of scores, return true if each score is equal or greater than 
 * the one before. The array will be length 2 or more.
 * <ul>
 *   <li>scoresIncreasing([1, 3, 4]) → true
 *   <li>scoresIncreasing([1, 3, 2]) → false
 *   <li>scoresIncreasing([1, 1, 4]) → true
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p146974
 * @since 17.0.1
 * @version 0.0.1
 */
public class ScoresIncreasing {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 4};
        int[] array2 = {1, 3, 2};
        int[] array3 = {1, 1, 4};
        System.out.println(scoresIncreasing(array1) + " -> true");
        System.out.println(scoresIncreasing(array2) + " -> false");
        System.out.println(scoresIncreasing(array3) + " -> true");
    }

    /**
     * Given an array of scores, return true if each score is equal or greater than 
     * the one before. The array will be length 2 or more.
     * 
     * @param scores int array inputted to be checked for if values are in increasing order
     * @return True if the array of scores is in increasing order, False if the array is not in increasing order
     * @since 0.0.1
     */
    public static boolean scoresIncreasing (int[] scores) {
        boolean checkIncreasing = true;
        for (int i = 1; i < scores.length; i++) {
            if (!(scores[i] >= scores[i-1])) {
                checkIncreasing = false;
                break;
            }
        }
        return checkIncreasing;
    }
}
