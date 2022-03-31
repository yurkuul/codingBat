import java.util.Arrays;

/**
 * Given an array of scores, return true if there are scores of 100 next to
 * each other in the array. The array length will be at least 2.
 * <ul>
 *  <li>scores100([1, 100, 100]) → true
 *  <li>scores100([1, 100, 99, 100]) → false
 *  <li>scores100([100, 1, 100, 100]) → true
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p179487
 * @since 17.0.1
 * @version 0.0.1
 */
public class Scores100 {
    public static void main(String[] args) {
        int[] array1 = {1, 100, 100};
        int[] array2 = {1, 100, 99, 100};
        int[] array3 = {100, 1, 100, 100};
        System.out.println("scores100(" + Arrays.toString(array1) + ") -> "
                            + scores100(array1));
        System.out.println("scores100(" + Arrays.toString(array2) + ") -> "
                            + scores100(array2));
        System.out.println("scores100(" + Arrays.toString(array3) + ") -> "
                            + scores100(array3));
    }

    /**
     * Given an array of scores, return true if there are scores of 100 next to
     * each other in the array. The array length will be at least 2.
     * 
     * @param scores Array of differnet scores.
     * @return true if there are 100s next to one another in scores.
     * @since 0.0.1
     */
    public static boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length-1; i++) {
            if (scores[i] == 100 && scores[i+1] == 100) {
                return true;
            }
        }
        return false;
    }
}
