/**
 * Given 2 int values, return true if one is negative and one is positive.
 * Except if the parameter "negative" is true, then return true only if both
 * are negative.
 * 
 * <ul>
 *  <li>posNeg(1, -1, false) → true
 *  <li>posNeg(-1, 1, false) → true
 *  <li>posNeg(-4, -5, true) → true
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p159227
 * @since 17.0.1
 * @version 0.0.1
 */
public class PosNeg {
    public static void main(String[] args) {
        System.out.println("posNeg(1, -1, false) -> " + posNeg(1, -1, false));
        System.out.println("posNeg(-1, 1, false) -> " + posNeg(-1, 1, false));
        System.out.println("posNeg(-4, -5, true) -> " + posNeg(-4, -5, true));
    }

    /**
     * Given 2 int values, return true if one is negative and one is positive.
     * Except if the parameter "negative" is true, then return true only if
     * both are negative.
     * 
     * @param a First integer.
     * @param b Second integer.
     * @param negative Holds on to if a and b should be both negative or if
     * only one has to be negative.
     * @return true if negative is true and both a and b are negative or if
     * negative is false and either a or b is negative while the other is
     * positive.
     * @since 0.0.1
     */
    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return a < 0 && b < 0;
        }
        return (a < 0 && b > 0) || (a > 0 && b < 0);
    }
}
