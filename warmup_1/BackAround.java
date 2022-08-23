/**
 * Given a string, take the last char and return a new string with the last
 * char added at the front and back, so "cat" yields "tcatt". The original
 * string will be length 1 or more.
 * <ul>
 *  <li>backAround("cat") → "tcatt"
 *  <li>backAround("Hello") → "oHelloo"
 *  <li>backAround("a") → "aaa"
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p161642
 * @since 17.0.1
 * @version 0.0.2
 */
public class BackAround {
    public static void main(String[] args) {
        System.out.println("backAround(\"cat\") -> " + backAround("cat"));
        System.out.println("backAround(\"Hello\") -> " + backAround("Hello"));
        System.out.println("backAround(\"a\") -> " + backAround("a"));
        System.out.println("backAround(\"test \") -> " + backAround("test "));
        System.out.println("backAround(\"\") -> " + backAround(""));
    }

    /**
     * Given a string, take the last char and return a new string with the last
     * char added at the front and back, so "cat" yields "tcatt". The original
     * string will be length 1 or more.
     * 
     * @param str used to return a new string with it's ending char at the front
     * and end of itself
     * @return String with str sandwiched between the last character of str
     * @since 0.0.2
     */
    public static String backAround(String str) {
        if (str.length() < 1) {
            return "";
        }
        return str.substring(str.length()-1) + str + str.substring(str.length()-1);
    }    
}
