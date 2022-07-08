/**
 * Given a string, compute recursively (no loops) a new string where all
 * appearances of "pi" have been replaced by "3.14".
 * 
 * <ul>
 *  <li>changePi("xpix") → "x3.14x"
 *  <li>changePi("pipi") → "3.143.14"
 *  <li>changePi("pip") → "3.14p"
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p170924
 * @since 17.0.1
 * @version 0.0.1
 */
public class ChangePi {
    public static void main(String[] args) {
        System.out.println("changePi(\"xpix\") -> " + changePi("xpix"));
        System.out.println("changePi(\"pipi\") -> " + changePi("pipi"));
        System.out.println("changePi(\"pip\") -> " + changePi("pip"));
    }

    /**
     * Given a string, compute recursively (no loops) a new string where all
     * appearances of "pi" have been replaced by "3.14".
     * 
     * @param str A String.
     * @return A String where the "pi"'s in str is replaced with "3.14".
     * @since 0.0.1
     */
    public static String changePi(String str) {
        //Base case
        if (str.length() <= 1) {
            return str;
        }
        //Checks to see if "pi" is part of str
        if (str.substring(0, 2).equals("pi")) {
            return "3.14" + changePi(str.substring(2));
        }
        //Continues via recursion with str starting at the next character
        return str.substring(0, 1) + changePi(str.substring(1));
    }
}
