import java.util.Arrays;

/**
 * Given two arrays, A and B, of non-negative int scores. A "special" score is
 * one which is a multiple of 10, such as 40 or 90. Return the sum of largest
 * special score in A and the largest special score in B. To practice
 * decomposition, write a separate helper method which finds the largest
 * special score in an array. Write your helper method after your
 * scoresSpecial() method in the JavaBat text area.
 * <ul>
 *  <li>scoresSpecial([12, 10, 4], [2, 20, 30]) → 40
 *  <li>scoresSpecial([20, 10, 4], [2, 20, 10]) → 40
 *  <li>scoresSpecial([12, 11, 4], [2, 20, 31]) → 20
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p140485
 * @since 17.0.1
 * @version 0.0.2
 */
public class ScoresSpecial {
    public static void main(String[] args) {
        int[] array1 = {12, 10, 4};
        int[] array2 = {2, 20, 30};
        int[] array3 = {20, 10, 4};
        int[] array4 = {2, 20, 10};
        int[] array5 = {12, 11, 4};
        int[] array6 = {2, 20, 31};
        System.out.println("scoresSpecial(" + Arrays.toString(array1) + ", "
                            + Arrays.toString(array2) + ") -> "
                            + scoresSpecial(array1, array2));
        System.out.println("scoresSpecial(" + Arrays.toString(array3) + ", "
                            + Arrays.toString(array4) + ") -> "
                            + scoresSpecial(array3, array4));
        System.out.println("scoresSpecial(" + Arrays.toString(array5) + ", "
                            + Arrays.toString(array6) + ") -> "
                            + scoresSpecial(array5, array6));
    }

    /**
     * Given two arrays, A and B, of non-negative int scores. A "special" score
     * is one which is a multiple of 10, such as 40 or 90. Return the sum of
     * largest special score in A and the largest special score in B. To
     * practice decomposition, write a separate helper method which finds the
     * largest special score in an array. Write your helper method after your
     * scoresSpecial() method in the JavaBat text area.
     * 
     * @param a Array of scores.
     * @param b Array of scores.
     * @return The sum of the special scores in a and b.
     * @since 0.0.2
     */
    public static int scoresSpecial(int[] a, int[] b) {
        return findSpecialScore(a) + findSpecialScore(b);
    }

    /**
     * Helper method that finds the largest special score (one that is a
     * multiple of 10 and is the largest value of the multiples of 10 in the
     * array).
     * 
     * @param scores The array used to find the special score.
     * @return The special score from scores.
     * @since 0.0.1
     */
    public static int findSpecialScore(int[] scores) {
        int specialScore = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] % 10 == 0 && scores[i] > specialScore) {
                specialScore = scores[i];
            }
        }
        return specialScore;
    }
}
