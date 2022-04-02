/**
 * Given a positive int n, return true if it contains a 1 digit. Note: use % to
 * get the rightmost digit, and / to discard the rightmost digit.
 * <ul>
 *  <li>hasOne(10) → true
 *  <li>hasOne(22) → false
 *  <li>hasOne(220) → false
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p191212
 * @since 17.0.1
 * @version 0.0.1
 */
public class HasOne {
    public static void main(String[] args) {
        System.out.println("hasOne(10) -> " + hasOne(10));
        System.out.println("hasOne(22) -> " + hasOne(22));
        System.out.println("hasOne(220) -> " + hasOne(220));
    }

    /**
     * Given a positive int n, return true if it contains a 1 digit. Note: use
     * % to get the rightmost digit, and / to discard the rightmost digit.
     * 
     * @param n Number used to figure out if it contains a 1 digit.
     * @return true if n has a 1 digit.
     * @since 0.0.1
     */
    public static boolean hasOne(int n) {
        while (n > 0) {
            if (n % 10 == 1) {
                return true;
            }
            n /= 10;
        }
        return false;
    }
}
