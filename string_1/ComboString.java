/**
 * Given 2 strings, a and b, return a string of the form short+long+short, with
 * the shorter string on the outside and the longer string on the inside. The
 * strings will not be the same length, but they may be empty (length 0).
 * 
 * <ul>
 *  <li>comboString("Hello", "hi") → "hiHellohi"
 *  <li>comboString("hi", "Hello") → "hiHellohi"
 *  <li>comboString("aaa", "b") → "baaab"
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p168564
 * @since 17.0.1
 * @version 0.0.1
 */
public class ComboString {
    public static void main(String[] args) {
        System.out.println("comboString(\"Hello\", \"hi\") -> "
                             + comboString("Hello", "hi"));
        System.out.println("comboString(\"hi\", \"Hello\") -> "
                             + comboString("hi", "Hello"));
        System.out.println("comboString(\"aaa\", \"b\") -> "
                             + comboString("aaa", "b"));
    }

    /**
     * Given 2 strings, a and b, return a string of the form short+long+short,
     * with the shorter string on the outside and the longer string on the
     * inside. The strings will not be the same length, but they may be empty
     * (length 0).
     * 
     * @param a The first String.
     * @param b The second String.
     * @return A String in the form of short, long, short, using the shorter
     * String of a or b on the outside of the longer String of a or b.
     * @since 0.0.1
     */
    public static String comboString(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        }
        return b + a + b;
    }    
}
