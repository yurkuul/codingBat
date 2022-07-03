/**
 * You have a green lottery ticket, with ints a, b, and c on it. If the numbers
 * are all different from each other, the result is 0. If all of the numbers
 * are the same, the result is 20. If two of the numbers are the same, the
 * result is 10.
 * 
 * <ul>
 *  <li>greenTicket(1, 2, 3) → 0
 *  <li>greenTicket(2, 2, 2) → 20
 *  <li>greenTicket(1, 1, 2) → 10
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p120633
 * @since 17.0.1
 * @version 0.0.1
 */
public class GreenTicket {
    public static void main(String[] args) {
        System.out.println("greenTicket(1, 2, 3) -> " + greenTicket(1, 2, 3));
        System.out.println("greenTicket(2, 2, 2) -> " + greenTicket(2, 2, 2));
        System.out.println("greenTicket(1, 1, 2) -> " + greenTicket(1, 1, 2));
    }

    /**
     * You have a green lottery ticket, with ints a, b, and c on it. If the
     * numbers are all different from each other, the result is 0. If all of
     * the numbers are the same, the result is 20. If two of the numbers are
     * the same, the result is 10.
     * 
     * @param a First lottery number.
     * @param b Second lottery number.
     * @param c Third lottery number.
     * @return 20 if all three lottery numbers are the same, 10 if only 2 are
     * the same, or 0 if they are all different.
     * @since 0.0.1
     */
    public static int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        } else if (a == b || b == c || a == c) {
            return 10;
        } 
        return 0;
    }
}
