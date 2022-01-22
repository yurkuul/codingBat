/**
 * Given a string, consider the prefix string made of the first N chars
 * of the string. Does that prefix string appear somewhere else in the
 * string? Assume that the string is not empty and that N is in the range
 * 1..str.length().
 * <ul>
 *  <li>prefixAgain("abXYabc", 1) → true
 *  <li>prefixAgain("abXYabc", 2) → true
 *  <li>prefixAgain("abXYabc", 3) → false
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p136417
 * @since 17.0.1
 * @version 0.0.1
 */
public class PrefixAgain {
    public static void main(String[] args) {
        System.out.println("prefixAgain(\"abXYabc\", 1) -> " + prefixAgain("abXYabc", 1));
        System.out.println("prefixAgain(\"abXYabc\", 2) -> " + prefixAgain("abXYabc", 2));
        System.out.println("prefixAgain(\"abXYabc\", 3) -> " + prefixAgain("abXYabc", 3));
    }

    /**
     * Given a string, consider the prefix string made of the first N chars
     * of the string. Does that prefix string appear somewhere else in the
     * string? Assume that the string is not empty and that N is in the range
     * 1..str.length().
     * 
     * @param str used to determine if the first n characters within this String
     * are repeated elsewhere in itself.
     * @param n the first number of characters in String to see if that substring
     * is repeated elsewhere in str.
     * @return True if str contains its first n characters elsewhere in the String.
     * @since 0.0.1
     */
    public static boolean prefixAgain(String str, int n) {
        return str.substring(n).contains(str.substring(0, n));
    }    
}
