/**
 * Given a string, return a new string where "not " has been added to the
 * front. However, if the string already begins with "not", return the string
 * unchanged. Note: use .equals() to compare 2 strings.
 * 
 * <ul>
 *  <li>notString("candy") → "not candy"
 *  <li>notString("x") → "not x"
 *  <li>notString("not bad") → "not bad"
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p191914
 * @since 17.0.1
 * @version 0.0.1
 */
public class NotString {
    public static void main(String[] args) {
        System.out.println("notString(\"candy\") -> " + notString("candy"));
        System.out.println("notString(\"x\") -> " + notString("x"));
        System.out.println("notString(\"not bad\") -> " + notString("not bad"));
    }

    /**
     * Given a string, return a new string where "not " has been added to the
     * front. However, if the string already begins with "not", return the
     * string unchanged. Note: use .equals() to compare 2 strings.
     * 
     * @param str A string.
     * @return str with "not" at the beginning.
     * @since 0.0.1
     */
    public static String notString(String str) {
        if (str.length() < 3 || !str.substring(0, 3).equals("not")) {
            str = "not " + str;
        }
        return str;
    }
}
