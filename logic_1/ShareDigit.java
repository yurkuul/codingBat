/**
 * Given two ints, each in the range 10..99, return true if there is a digit
 * that appears in both numbers, such as the 2 in 12 and 23. (Note: division,
 * e.g. n/10, gives the left digit while the % "mod" n%10 gives the right
 * digit.)
 * 
 * <ul>
 *  <li>shareDigit(12, 23) → true
 *  <li>shareDigit(12, 43) → false
 *  <li>shareDigit(12, 44) → false
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p153748
 * @since 17.0.1
 * @version 0.0.1
 */
public class ShareDigit {
    public static void main(String[] args) {
        System.out.println("shareDigit(12, 23) -> " + shareDigit(12, 23));
        System.out.println("shareDigit(12, 43) -> " + shareDigit(12, 43));
        System.out.println("shareDigit(12, 44) -> " + shareDigit(12, 44));
    }

    /**
     * Given two ints, each in the range 10..99, return true if there is a
     * digit that appears in both numbers, such as the 2 in 12 and 23. (Note:
     * division, e.g. n/10, gives the left digit while the % "mod" n%10 gives
     * the right digit.)
     * 
     * @param a First integer in the range of 10 to 99.
     * @param b Second integer in the range of 10 to 99.
     * @return true if one of the digits of a is equal to one of the digits
     * of b.
     * @since 0.0.1
     */
    public static boolean shareDigit(int a, int b) {
        int aLeft = a/10;
        int aRight = a%10;
        int bLeft = b/10;
        int bRight = b%10;
        return aLeft == bLeft || aLeft == bRight || aRight == bLeft ||
                aRight == bRight;
    }
}
