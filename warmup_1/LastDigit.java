/**
 * Given two non-negative int values, return true if they have the same last
 * digit, such as with 27 and 57. Note that the % "mod" operator computes
 * remainders, so 17 % 10 is 7.
 * 
 * <ul>
 *  <li>lastDigit(7, 17) → true
 *  <li>lastDigit(6, 17) → false
 *  <li>lastDigit(3, 113) → true
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p125339
 * @since 17.0.1
 * @version 0.0.1
 */
public class LastDigit {
    public static void main(String[] args) {
        System.out.println("lastDigit(7, 17) -> " + lastDigit(7, 17));
        System.out.println("lastDigit(6, 17) -> " + lastDigit(6, 17));
        System.out.println("lastDigit(3, 113) -> " + lastDigit(3, 113));
    }

    /**
     * Given two non-negative int values, return true if they have the same
     * last digit, such as with 27 and 57. Note that the % "mod" operator
     * computes remainders, so 17 % 10 is 7.
     * 
     * @param a First non-negative integer value.
     * @param b Second non-negative integer value.
     * @return true if the last digit of a and b are equal.
     * @since 0.0.1
     */
    public static boolean lastDigit(int a, int b) {
        return a%10 == b%10;
    }
}
