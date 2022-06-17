/**
 * Given 2 int values, return whichever value is nearest to the value 10, or
 * return 0 in the event of a tie. Note that Math.abs(n) returns the absolute
 * value of a number.
 * 
 * <ul>
 *  <li>close10(8, 13) → 8
 *  <li>close10(13, 8) → 8
 *  <li>close10(13, 7) → 0
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p172021
 * @since 17.0.1
 * @version 0.0.1
 */
public class Close10 {
    public static void main(String[] args) {
        System.out.println("close10(8, 13) -> " + close10(8, 13));
        System.out.println("close10(13, 8) -> " + close10(13, 8));
        System.out.println("close10(13, 7) -> " + close10(13, 7));
    }

    /**
     * Given 2 int values, return whichever value is nearest to the value 10,
     * or return 0 in the event of a tie. Note that Math.abs(n) returns the
     * absolute value of a number.
     * 
     * @param a First integer value.
     * @param b Second integer value.
     * @return The value that is closer to 10. If it is a tie, then returns 0.
     * @since 0.0.1
     */
    public static int close10(int a, int b) {
        if (Math.abs(10-a) < Math.abs(10-b)) {
            return a;
        } else if (Math.abs(10-a) > Math.abs(10-b)) {
            return b;
        }
        return 0;
    }
}
