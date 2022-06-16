/**
 * Given three int values, a b c, return the largest.
 * 
 * <ul>
 *  <li>intMax(1, 2, 3) → 3
 *  <li>intMax(1, 3, 2) → 3
 *  <li>intMax(3, 2, 1) → 3
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p101887
 * @since 17.0.1
 * @version 0.0.1
 */
public class IntMax {
    public static void main(String[] args) {
        System.out.println("intMax(1, 2, 3) -> " + intMax(1, 2, 3));
        System.out.println("intMax(1, 3, 2) -> " + intMax(1, 3, 2));
        System.out.println("intMax(3, 2, 1) -> " + intMax(3, 2, 1));
    }

    /**
     * Given three int values, a b c, return the largest.
     * 
     * @param a First integer value.
     * @param b Second integer value.
     * @param c Third integer value.
     * @return The largest value of a, b, and c.
     * @since 0.0.1
     */
    public static int intMax(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }
    }
}
