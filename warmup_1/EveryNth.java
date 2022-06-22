/**
 * Given a non-empty string and an int N, return the string made starting with
 * char 0, and then every Nth char of the string. So if N is 3, use char 0, 3,
 * 6, ... and so on. N is 1 or more.
 * 
 * <ul>
 *  <li>everyNth("Miracle", 2) → "Mrce"
 *  <li>everyNth("abcdefg", 2) → "aceg"
 *  <li>everyNth("abcdefg", 3) → "adg"
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p196441
 * @since 17.0.1
 * @version 0.0.1
 */
public class EveryNth {
    public static void main(String[] args) {
        System.out.println("everyNth(\"Miracle\", 2) -> "
                             + everyNth("Miracle", 2));
        System.out.println("everyNth(\"abcdefg\", 2) -> "
                             + everyNth("abcdefg", 2));
        System.out.println("everyNth(\"abcdefg\", 3) -> "
                             + everyNth("abcdefg", 3));
    }

    /**
     * Given a non-empty string and an int N, return the string made starting
     * with char 0, and then every Nth char of the string. So if N is 3, use
     * char 0, 3, 6, ... and so on. N is 1 or more.
     * 
     * @param str String used to get every n'th character.
     * @param n The value used as a multiple for what characters are returned.
     * @return String that contains every n'th character of str.
     * @since 0.0.1
     */
    public static String everyNth(String str, int n) {
        String newstr = "";
        for (int i = 0; i < str.length(); i += n) {
            newstr += str.substring(i, i+1);
        }
        return newstr;
    }
}
