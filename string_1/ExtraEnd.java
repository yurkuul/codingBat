/**
 * Given a string, return a new string made of 3 copies of the last 2 chars of
 * the original string. The string length will be at least 2.
 * 
 * <ul> 
 *  <li>extraEnd("Hello") → "lololo"
 *  <li>extraEnd("ab") → "ababab"
 *  <li>extraEnd("Hi") → "HiHiHi"
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p108853
 * @since 17.0.1
 * @version 0.0.1
 */
public class ExtraEnd {
    public static void main(String[] args) {
        System.out.println("extraEnd(\"Hello\") -> " + extraEnd("Hello"));
        System.out.println("extraEnd(\"ab\") -> " + extraEnd("ab"));
        System.out.println("extraEnd(\"Hi\") -> " + extraEnd("Hi"));
    }

    /**
     * Given a string, return a new string made of 3 copies of the last 2 chars
     * of the original string. The string length will be at least 2.
     * 
     * @param str A String.
     * @return A new String that is 3 copies of the last 2 characters of str.
     * @since 0.0.1
     */
    public static String extraEnd(String str) {
        return str.substring(str.length()-2) + str.substring(str.length()-2)
             + str.substring(str.length()-2);
    }
}
