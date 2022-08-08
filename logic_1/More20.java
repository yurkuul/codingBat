/**
 * Return true if the given non-negative number is 1 or 2 more than a multiple
 * of 20. See also: Introduction to Mod
 * 
 * <ul>
 *  <li>more20(20) → false
 *  <li>more20(21) → true
 *  <li>more20(22) → true
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p118290
 * @since 17.0.1
 * @version 0.0.1
 */
public class More20 {
    public static void main(String[] args) {
        System.out.println("more20(20) -> " + more20(20));
        System.out.println("more20(21) -> " + more20(21));
        System.out.println("more20(22) -> " + more20(22));
    }

    /**
     * Return true if the given non-negative number is 1 or 2 more than a
     * multiple of 20. See also: Introduction to Mod
     * 
     * @param n A non-negative number.
     * @return true if 'n' is 1 or 2 more than a multiple of 20.
     * @since 0.0.1
     */
    public static boolean more20(int n) {
        return n % 20 == 2 || n % 20 == 1;
    }
}
