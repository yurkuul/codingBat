/**
 * Given three ints, a b c, return true if they are in strict increasing order,
 * such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the
 * exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or
 * 5 5 5.
 * <ul>
 *  <li>inOrderEqual(2, 5, 11, false) → true
 *  <li>inOrderEqual(5, 7, 6, false) → false
 *  <li>inOrderEqual(5, 5, 7, true) → true
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p140272
 * @since 17.0.1
 * @version 0.0.2
 */
public class InOrderEqual {
    public static void main(String[] args) {
        System.out.println("inOrderEqual(2, 5, 11, false) -> "
                            + inOrderEqual(2, 5, 11, false));
        System.out.println("inOrderEqual(5, 7, 6, false) -> "
                            + inOrderEqual(5, 7, 6, false));
        System.out.println("inOrderEqual(5, 5, 7, true) -> "
                            + inOrderEqual(5, 5, 7, true));
        System.out.println("inOrderEqual(1, 11, 111, true) -> "
                            + inOrderEqual(1, 11, 111, true));
        System.out.println("inOrderEqual(5, 6, 7, false) -> "
                            + inOrderEqual(5, 6, 7, false));
        System.out.println("inOrderEqual(8, 8, 8, true) -> "
                            + inOrderEqual(8, 8, 8, true));
    }

    /**
     * Given three ints, a b c, return true if they are in strict increasing
     * order, such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with
     * the exception that if "equalOk" is true, equality is allowed, such as
     * 5 5 7 or 5 5 5.
     * 
     * @param a An integer.
     * @param b An integer.
     * @param c An integer.
     * @param equalOk Determines if the integers could be equal to each other
     * in increasing order.
     * @return true if the integers are in increasing order.
     * @since 0.0.1
     */
    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk) {
            return a <= b && b <= c;
        }
        return a < b && b < c;
    }
}
