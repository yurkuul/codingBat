/**
 * Given a string, we'll say that the front is the first 3 chars of the string.
 * If the string length is less than 3, the front is whatever is there. Return
 * a new string which is 3 copies of the front.
 * 
 * <ul>
 *  <li>front3("Java") → "JavJavJav"
 *  <li>front3("Chocolate") → "ChoChoCho"
 *  <li>front3("abc") → "abcabcabc"
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p136351
 * @since 17.0.1
 * @version 0.0.1
 */
public class Front3 {
    public static void main(String[] args) {
        System.out.println("front3(\"Java\") -> " + front3("Java"));
        System.out.println("front3(\"Chocolate\") -> " + front3("Chocolate"));
        System.out.println("front3(\"abc\") -> " + front3("abc"));
    }

    /**
     * Given a string, we'll say that the front is the first 3 chars of the
     * string. If the string length is less than 3, the front is whatever is
     * there. Return a new string which is 3 copies of the front.
     * 
     * @param str String used for repeating the first three chars three times.
     * @return A String with three repeats of the first three chars of str.
     * @since 0.0.1
     */
    public static String front3(String str) {
        if (str.length() <= 3) {
            return str + str +str;
        }
        return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
    }
}
