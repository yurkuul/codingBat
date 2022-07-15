/**
 * Return the sum of two 6-sided dice rolls, each in the range 1..6. However,
 * if noDoubles is true, if the two dice show the same value, increment one
 * die to the next value, wrapping around to 1 if its value was 6.
 * 
 * <ul>
 *  <li>withoutDoubles(2, 3, true) → 5
 *  <li>withoutDoubles(3, 3, true) → 7
 *  <li>withoutDoubles(3, 3, false) → 6
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p115233
 * @since 17.0.1
 * @version 0.0.1
 */
public class WithoutDoubles {
    public static void main(String[] args) {
        System.out.println("withoutDoubles(2, 3, true) -> "
                             + withoutDoubles(2, 3, true));
        System.out.println("withoutDoubles(3, 3, true) -> "
                             + withoutDoubles(3, 3, true));
        System.out.println("withoutDoubles(3, 3, false) -> "
                             + withoutDoubles(3, 3, false));
    }

    /**
     * Return the sum of two 6-sided dice rolls, each in the range 1..6.
     * However, if noDoubles is true, if the two dice show the same value,
     * increment one die to the next value, wrapping around to 1 if its value
     * was 6.
     * 
     * @param die1 First dice value.
     * @param die2 Second dice value.
     * @param noDoubles Holds on to whether or not there can be duplicate dice
     * rolls.
     * @return The sum of the two 6-sided dice rolls.
     * @since 0.0.1
     */
    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles) {
            if (die1 == die2) {
                if (die1 == 6) {
                    die1 = 1;
                } else if (die2 == 6) {
                    die2 = 1;
                } else {
                    die1++;
                }
            }
        }
        return die1 + die2;
    }
}
