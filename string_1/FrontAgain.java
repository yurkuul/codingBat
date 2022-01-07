/**
 * Given a string, return true if the first 2 chars in the string also appear
 * at the end of the string, such as with "edited".
 * <ul>
 *  <li>frontAgain("edited") → true
 *  <li>frontAgain("edit") → false
 *  <li>frontAgain("ed") → true
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p196652
 * @since 17.0.1
 * @version 0.0.1
 */
public class FrontAgain {
    public static void main(String[] args) {
        System.out.println("frontAgain(\"edited\") -> " + frontAgain("edited"));
        System.out.println("frontAgain(\"edit\") -> " + frontAgain("edit"));
        System.out.println("frontAgain(\"ed\") -> " + frontAgain("ed"));
    }

    /**
     * Given a string, return true if the first 2 chars in the string also appear
     * at the end of the string, such as with "edited".
     * 
     * @param str String to be checked if the first 2 characters are the same as the ending 2 characters
     * @return True if the first 2 characters are the same as the ending 2 characters, False otherwise
     * @since 0.0.1
     */
    public static boolean frontAgain(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2).equals(str.substring(str.length()-2, str.length()));
        }
        return false;
    }
}
