/**
 * Given a string, return a version without both the first and last char of the 
 * string. The string may be any length, including 0.
 * 
 * <ul>
 *  <li>withouEnd2("Hello") → "ell"
 *  <li>withouEnd2("abc") → "b"
 *  <li>withouEnd2("ab") → ""
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p174254
 * @since 17.0.1
 * @version 0.0.1
 */
public class WithouEnd2 {
    public static void main(String[] args) {
        System.out.println("withouEnd2(\"Hello\") -> " + withouEnd2("Hello"));
        System.out.println("withouEnd2(\"abc\") -> " + withouEnd2("abc"));
        System.out.println("withouEnd2(\"ab\") -> " + withouEnd2("ab"));
    }

    /**
     * Given a string, return a version without both the first and last char of the 
     * string. The string may be any length, including 0.
     * @param str String inputted to be modified by removing the first and last character of the String
     * @return String modified after removing the first and last character of the String
     * @since 0.0.1
     */
    public static String withouEnd2(String str) {
        if (str.length() <= 2) {
            return "";
        }
        return str.substring(1, str.length()-1);
    }
}
