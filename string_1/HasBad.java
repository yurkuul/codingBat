/**
 * Given a string, return true if "bad" appears starting at index 0 or 1 in the
 * string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may
 * be any length, including 0. Note: use .equals() to compare 2 strings.
 * 
 * <ul>
 *  <li>hasBad("badxx") → true
 *  <li>hasBad("xbadxx") → true
 *  <li>hasBad("xxbadxx") → false
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p139075
 * @since 17.0.1
 * @version 0.0.1
 */
public class HasBad {
    public static void main(String[] args) {
        System.out.println("hasBad(\"badxx\") -> " + hasBad("badxx"));
        System.out.println("hasBad(\"xbadxx\") -> " + hasBad("xbadxx"));
        System.out.println("hasBad(\"xxbadxx\") -> " + hasBad("xxbadxx"));
    }

    /**
     * Given a string, return true if "bad" appears starting at index 0 or 1 in
     * the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The
     * string may be any length, including 0. Note: use .equals() to compare 2
     * strings.
     * 
     * @param str A String.
     * @return true if "bad" appears starting at index 0 or 1 in 'str'.
     * @since 0.0.1
     */
    public static boolean hasBad(String str) {
        if (str.length() < 3) {
            return false;
        }
        if (str.substring(0, 3).equals("bad")) {
            return true;
        } else if (str.length() > 3 && str.substring(1, 4).equals("bad")) {
            return true;
        }
        return false;
    }    
}
