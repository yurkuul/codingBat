/**
 * Given two strings, return true if either of the strings appears at the very
 * end of the other string, ignoring upper/lower case differences (in other
 * words, the computation should not be "case sensitive"). Note:
 * str.toLowerCase() returns the lowercase version of a string.
 * 
 * <ul>
 *  <li>endOther("Hiabc", "abc") → true
 *  <li>endOther("AbC", "HiaBc") → true
 *  <li>endOther("abc", "abXabc") → true
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p126880
 * @since 17.0.1
 * @version 0.0.2
 */
public class EndOther {
    public static void main(String[] args) {
        System.out.println("endOther(\"Hiabc\", \"abc\") -> "
                             + endOther("Hiabc", "abc"));
        System.out.println("endOther(\"AbC\", \"HiaBc\") -> "
                             + endOther("AbC", "HiaBc"));
        System.out.println("endOther(\"abc\", \"abXabc\") -> "
                             + endOther("abc", "abXabc"));
        System.out.println("endOther(\"x x\", \"xxx\") -> "
                             + endOther("x x", "xxx"));
        System.out.println("endOther(\"  \", \"wow  \") -> "
                             + endOther("  ", "wow  "));
    }

    /**
     * Given two strings, return true if either of the strings appears at the
     * very end of the other string, ignoring upper/lower case differences (in
     * other words, the computation should not be "case sensitive"). Note:
     * str.toLowerCase() returns the lowercase version of a string.
     * 
     * @param a The first String.
     * @param b The second String.
     * @return true if 'a' appears at the very end of 'b', or if b appears at
     * the very end of a.
     * @since 0.0.1
     */
    public static boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() > b.length()) {
            return a.substring(a.length()-b.length()).equals(b);
        } else {
            return b.substring(b.length()-a.length()).equals(a);
        }
    }
}
