/**
 * Given a string, take the first 2 chars and return the string with the 2
 * chars added at both the front and back, so "kitten" yields"kikittenki". If
 * the string length is less than 2, use whatever chars are there.
 * 
 * <ul>
 *  <li>front22("kitten") → "kikittenki"
 *  <li>front22("Ha") → "HaHaHa"
 *  <li>front22("abc") → "ababcab"
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p183592
 * @since 17.0.1
 * @version 0.0.1
 */
public class Front22 {
    public static void main(String[] args) {
        System.out.println("front22(\"kitten\") -> " + front22("kitten"));
        System.out.println("front22(\"Ha\") -> " + front22("Ha"));
        System.out.println("front22(\"abc\") -> " + front22("abc"));
    }

    /**
     * Given a string, take the first 2 chars and return the string with the 2
     * chars added at both the front and back, so "kitten" yields"kikittenki".
     * If the string length is less than 2, use whatever chars are there.
     * 
     * @param str String used to return the first 2 chars of str at the front
     * and end.
     * @return String with the first 2 chars of str at the front and end.
     * @since 0.0.1
     */
    public static String front22(String str) {
        if (str.length() < 2) {
            return str + str + str;
        }
        return str.substring(0, 2) + str + str.substring(0, 2);
    }
}
