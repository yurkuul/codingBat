/**
 * Given a string, return true if the string starts with "hi" and false otherwise.
 * 
 * <ul>
 *  <li>startHi("hi there") → true
 *  <li>startHi("hi") → true
 *  <li>startHi("hello hi") → false
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p191022
 * @since 17.0.1
 * @version 0.0.1
 */
public class StartHi {
    public static void main(String[] args) {
        System.out.println("startHi(\"hi there\") -> " + startHi("hi there"));
        System.out.println("startHi(\"hi\") -> " + startHi("hi"));
        System.out.println("startHi(\"hello hi\") -> " + startHi("hello hi"));
    }

    /**
     * Given a string, return true if the string starts with "hi" and false otherwise.
     * 
     * @param word Used to check if "hi" is at the beginning.
     * @return True if "hi" is at the beginning of word.
     * @since 0.0.1
     */
    public static boolean startHi(String word) {
        return word.substring(0, 2).equals("hi");
    }
}
