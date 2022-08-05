/**
 * Given a number n, return true if n is in the range 1..10, inclusive. Unless
 * outsideMode is true, in which case return true if the number is less or
 * equal to 1, or greater or equal to 10.
 * 
 * <ul>
 *  <li>in1To10(5, false) → true
 *  <li>in1To10(11, false) → false
 *  <li>in1To10(11, true) → true
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p137365
 * @since 17.0.1
 * @version 0.0.1
 */
public class In1To10 {
    public static void main(String[] args) {
        System.out.println("in1To10(5, false) -> " + in1To10(5, false));
        System.out.println("in1To10(11, false) -> " + in1To10(11, false));
        System.out.println("in1To10(11, true) -> " + in1To10(11, true));
    }

    /**
     * Given a number n, return true if n is in the range 1..10, inclusive.
     * Unless outsideMode is true, in which case return true if the number is
     * less or equal to 1, or greater or equal to 10.
     * 
     * @param n An integer value.
     * @param outsideMode Holds on to if 'n' is allowed to be outside of the
     * range of 1 to 10 inclusive.
     * @return true if 'n' is inside the range 1 to 10 inclusive, or true if
     * 'n' is outside the range of 1 to 10 inclusive and 'outsideMode' is true.
     * @since 0.0.1
     */
    public static boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {
            return n < 2 || n > 9;
        }
        return n > 0 && n < 11;
    }    
}
