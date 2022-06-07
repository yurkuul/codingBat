/**
 * Given a string, return a new string where the first and last chars have been
 * exchanged.
 * 
 * <ul>
 *  <li>frontBack("code") → "eodc"
 *  <li>frontBack("a") → "a"
 *  <li>frontBack("ab") → "ba"
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p123384
 * @since 17.0.1
 * @version 0.0.1
 */
public class FrontBack {
    public static void main(String[] args) {
        System.out.println("frontBack(\"code\") -> " + frontBack("code"));
        System.out.println("frontBack(\"a\") -> " + frontBack("a"));
        System.out.println("frontBack(\"ab\") -> " + frontBack("ab"));
    }

    /**
     * Given a string, return a new string where the first and last chars have
     * been exchanged.
     * 
     * @param str String used for swapping the first and last characters.
     * @return A new string where the first and last characters of str are
     * swapped.
     * @since 0.0.1
     */
    public static String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        }
        String first = str.substring(0,1);
        String last = str.substring(str.length()-1);
        String middle = "";
        if (str.length() > 2) {
            middle = str.substring(1, str.length()-1);
        }
        return last + middle + first;
    }    
}
