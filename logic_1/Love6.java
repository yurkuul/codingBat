/**
 * The number 6 is a truly great number. Given two int values, a and b, return
 * true if either one is 6. Or if their sum or difference is 6. Note: the
 * function Math.abs(num) computes the absolute value of a number.
 * 
 * <ul>
 *  <li>love6(6, 4) → true
 *  <li>love6(4, 5) → false
 *  <li>love6(1, 5) → true
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p137742
 * @since 17.0.1
 * @version 0.0.1
 */
public class Love6 {
    public static void main(String[] args) {
        System.out.println("love6(6, 4) -> " + love6(6, 4));
        System.out.println("love6(4, 5) -> " + love6(4, 5));
        System.out.println("love6(1, 5) -> " + love6(1, 5));
    }

    /**
     * The number 6 is a truly great number. Given two int values, a and b,
     * return true if either one is 6. Or if their sum or difference is 6.
     * Note: the function Math.abs(num) computes the absolute value of a
     * number.
     * 
     * @param a First integer value.
     * @param b Second integer value.
     * @return true if a or b is 6 or if their sum or difference is 6.
     * @since 0.0.1
     */
    public static boolean love6(int a, int b) {
        return a == 6 || b == 6 || a+b == 6 || Math.abs(a-b) == 6;
    }
}
