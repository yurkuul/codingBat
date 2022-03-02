/**
 * Given a string, return the string made of its first two chars, so the
 * String "Hello" yields "He". If the string is shorter than length 2, return
 * whatever there is, so "X" yields "X", and the empty string "" yields the
 * empty string "". Note that str.length() returns the length of a string.
 * <ul>
 *  <li>firstTwo("Hello") → "He"
 *  <li>firstTwo("abcdefg") → "ab"
 *  <li>firstTwo("ab") → "ab"
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p163411
 * @since 17.0.1
 * @version 0.0.1
 */
public class FirstTwo {
    public static void main(String[] args) {
        System.out.println("firstTwo(\"Hello\") -> " + firstTwo("Hello"));
        System.out.println("firstTwo(\"abcdefg\") -> " + firstTwo("abcdefg"));
        System.out.println("firstTwo(\"ab\") -> " + firstTwo("ab"));
    }

    /**
     * Given a string, return the string made of its first two chars, so the
     * String "Hello" yields "He". If the string is shorter than length 2, 
     * return whatever there is, so "X" yields "X", and the empty string "" 
     * yields the empty string "". Note that str.length() returns the length
     * of a string.
     * 
     * @param str Used to grab the first two characters or less if exists.
     * @return The first two characters of str, or whatever is part of str
     * if its length is less than 2.
     * @since 0.0.1
     */
    public static String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(0,2);
    }
}
