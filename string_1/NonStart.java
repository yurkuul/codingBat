/**
 * Given 2 strings, return their concatenation, except omit the first char of
 * each. The strings will be at least length 1.
 * 
 * <ul>
 *  <li>nonStart("Hello", "There") → "ellohere"
 *  <li>nonStart("java", "code") → "avaode"
 *  <li>nonStart("shotl", "java") → "hotlava"
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p143825
 * @since 17.0.1
 * @version 0.0.1
 */
public class NonStart {
    public static void main(String[] args) {
        System.out.println("nonStart(\"Hello\", \"There\") -> "
                             + nonStart("Hello", "There"));
        System.out.println("nonStart(\"java\", \"code\") -> "
                             + nonStart("java", "code") );
        System.out.println("nonStart(\"shotl\", \"java\") -> "
                             + nonStart("shotl", "java"));
    }

    /**
     * Given 2 strings, return their concatenation, except omit the first char
     * of each. The strings will be at least length 1.
     * 
     * @param a First string.
     * @param b Second string.
     * @return The 2 strings concatenated together without the first characters
     * of both strings.
     * @since 0.0.1
     */
    public static String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }
}
