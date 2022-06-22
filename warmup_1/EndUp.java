/**
 * Given a string, return a new string where the last 3 chars are now in upper
 * case. If the string has less than 3 chars, uppercase whatever is there. Note
 * that str.toUpperCase() returns the uppercase version of a string.
 * 
 * <ul>
 *  <li>endUp("Hello") → "HeLLO"
 *  <li>endUp("hi there") → "hi thERE"
 *  <li>endUp("hi") → "HI"
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p125268
 * @since 17.0.1
 * @version 0.0.1
 */
public class EndUp {
    public static void main(String[] args) {
        System.out.println("endUp(\"Hello\") -> " + endUp("Hello"));
        System.out.println("endUp(\"hi there\") -> " + endUp("hi there"));
        System.out.println("endUp(\"hi\") -> " + endUp("hi"));
    }

    /**
     * Given a string, return a new string where the last 3 chars are now in
     * upper case. If the string has less than 3 chars, uppercase whatever is
     * there. Note that str.toUpperCase() returns the uppercase version of a
     * string.
     * 
     * @param str String used to make the last three chars uppercase.
     * @return str with the last three characters uppercase.
     * @since 0.0.1
     */
    public static String endUp(String str) {
        if (str.length() < 3) {
            return str.toUpperCase();
        }
        return str.substring(0,str.length()-3) +
            str.substring(str.length()-3).toUpperCase();
    }
}
