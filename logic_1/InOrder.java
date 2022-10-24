/**
 * Given three ints, a b c, return true if b is greater than a, and c is greater than b.
 * However, with the exception that if "bOk" is true, b does not need to be greater than a.
 * <ul>
 *  <li>inOrder(1, 2, 4, false) → true
 *  <li>inOrder(1, 2, 1, false) → false
 *  <li>inOrder(1, 1, 2, true) → true
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p154188
 * @since 17.0.1
 * @version 0.0.2
 */
public class InOrder {
    public static void main(String[] args) {
        System.out.println("inOrder(1, 2, 4, false) -> " + inOrder(1, 2, 4, false));
        System.out.println("inOrder(1, 2, 1, false) -> " + inOrder(1, 2, 1, false));
        System.out.println("inOrder(1, 1, 2, true) -> " + inOrder(1, 1, 2, true));
        System.out.println("inOrder(1, 1, 1, true) -> " + inOrder(1, 1, 1, true));
        System.out.println("inOrder(1, 1, 1, false) -> " + inOrder(1, 1, 1, false));
    }

    /**
     * Given three ints, a b c, return true if b is greater than a, and c is greater than b.
     * However, with the exception that if "bOk" is true, b does not need to be greater than a. 
     * 
     * @param a int value to be compared with b if bOk is false
     * @param b int value to be compared with a if bOk is false
     * @param c int value to be compared with b
     * @param bOk boolean that determines whether or not b has to be compared with a
     * @return True if b>a and c>b if bOk is false, False if c>b and bOk is true
     * @since 0.0.1
     */
    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        if (!bOk) {
            return b > a && c > b;
        }
        return c > b;
    }
}
