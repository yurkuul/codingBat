/**
 * Given a non-empty string and an int n, return a new string where the char at
 * index n has been removed. The value of n will be a valid index of a char in the
 * original string (i.e. n will be in the range 0..str.length()-1 inclusive).
 * <ul>
 *  <li>missingChar("kitten", 1) → "ktten"
 *  <li>missingChar("kitten", 0) → "itten"
 *  <li>missingChar("kitten", 4) → "kittn"
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p190570
 * @since 17.0.1
 * @version 0.0.1
 */
public class MissingChar {
    public static void main(String[] args) {
        System.out.println("missingChar(\"kitten\", 1) -> " + missingChar("kitten", 1));
        System.out.println("missingChar(\"kitten\", 0) -> " + missingChar("kitten", 0));
        System.out.println("missingChar(\"kitten\", 4) -> " + missingChar("kitten", 4));
    }

    /**
     * Given a non-empty string and an int n, return a new string where the char at
     * index n has been removed. The value of n will be a valid index of a char in the
     * original string (i.e. n will be in the range 0..str.length()-1 inclusive).
     * 
     * @param str String inserted to have the character at index n removed
     * @param n int index value in str to be removed
     * @return String that has index n removed from str
     * @since 0.0.1
     */
    public static String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n+1);
    }
}
