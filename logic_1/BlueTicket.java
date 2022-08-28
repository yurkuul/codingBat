/**
 * You have a blue lottery ticket, with ints a, b, and c on it. This makes three
 * pairs, which we'll call ab, bc, and ac. Consider the sum of the numbers in each
 * pair. If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum
 * is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the
 * result is 0.
 * <ul>
 *  <li>blueTicket(9, 1, 0) → 10
 *  <li>blueTicket(9, 2, 0) → 0
 *  <li>blueTicket(6, 1, 4) → 10
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p192267
 * @since 17.0.1
 * @version 0.0.2
 */
public class BlueTicket {
    public static void main(String[] args) {
        System.out.println("blueTicket(9, 1, 0) -> " + blueTicket(9, 1, 0));
        System.out.println("blueTicket(9, 2, 0) -> " + blueTicket(9, 2, 0));
        System.out.println("blueTicket(6, 1, 4) -> " + blueTicket(6, 1, 4));
        System.out.println("blueTicket(10, 0, 0) -> " + blueTicket(10, 0, 0));
        System.out.println("blueTicket(0, 0, 0) -> " + blueTicket(0, 0, 0));
    }

    /**
     * You have a blue lottery ticket, with ints a, b, and c on it. This makes three
     * pairs, which we'll call ab, bc, and ac. Consider the sum of the numbers in each
     * pair. If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum
     * is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the
     * result is 0.
     * @param a integer value of a lottery ticket
     * @param b integer value of a lottery ticket
     * @param c integer value of a lottery ticket
     * @return int value for the scoring of the lottery numbers
     * @since 0.0.1
     */
    public static int blueTicket(int a, int b, int c) {
        if (((a+b) == 10) || ((b+c) == 10) || ((a+c) == 10)) {
            return 10;
        } else if (((a+b) - (b+c) == 10) || ((a+b) - (a+c) == 10)) {
            return 5;
        }
        return 0;
    }
}
