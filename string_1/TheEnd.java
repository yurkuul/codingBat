/**
 * Given a string, return a string length 1 from its front, unless front is
 * false, in which case return a string length 1 from its back. The string will
 * be non-empty.
 * 
 * <ul>
 *  <li>theEnd("Hello", true) → "H"
 *  <li>theEnd("Hello", false) → "o"
 *  <li>theEnd("oh", true) → "o"
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p162477
 * @since 17.0.1
 * @version 0.0.1
 */
public class TheEnd {
    public static void main(String[] args) {
        System.out.println("theEnd(\"Hello\", true) -> "
                             + theEnd("Hello", true));
        System.out.println("theEnd(\"Hello\", false) -> "
                             + theEnd("Hello", false));
        System.out.println("theEnd(\"oh\", true) -> "
                             + theEnd("oh", true));
    }

    /**
     * Given a string, return a string length 1 from its front, unless front is
     * false, in which case return a string length 1 from its back. The string
     * will be non-empty.
     * 
     * @param str A String that's not empty.
     * @param front Holds on to whether you return the first char or last char
     * of str.
     * @return The first char of str if front is true, or the last char of str
     * if front is false.
     */
    public static String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0,1);
        }
        return str.substring(str.length()-1);
    }
}
