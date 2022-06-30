/**
 * Given 2 strings, a and b, return a new string made of the first char of a
 * and the last char of b, so "yo" and "java" yields "ya". If either string is
 * length 0, use '@' for its missing char.
 * 
 * <ul>
 *  <li>lastChars("last", "chars") → "ls"
 *  <li>lastChars("yo", "java") → "ya"
 *  <li>lastChars("hi", "") → "h@"
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p138183
 * @since 17.0.1
 * @version 0.0.1
 */
public class LastChars {
    public static void main(String[] args) {
        System.out.println("lastChars(\"last\", \"chars\") -> "
                             + lastChars("last", "chars"));
        System.out.println("lastChars(\"yo\", \"java\") -> "
                             + lastChars("yo", "java"));
        System.out.println("lastChars(\"hi\", \"\") -> "
                             + lastChars("hi", ""));
    }

    /**
     * Given 2 strings, a and b, return a new string made of the first char of
     * a and the last char of b, so "yo" and "java" yields "ya". If either
     * string is length 0, use '@' for its missing char.
     * 
     * @param a First string.
     * @param b Second string.
     * @return The first char of a and the second char of b; if any strings
     * are empty, it will be replaced with "@".
     * @since 0.0.1
     */
    public static String lastChars(String a, String b) {
        if (a.length() == 0) {
            a = "@";
        }
        if (b.length() == 0) {
            b = "@";
        }
        return a.substring(0, 1) + b.substring(b.length()-1);
    }
}
