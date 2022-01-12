/**
 * Given a string and an int n, return a string made of n repetitions of the
 * last n characters of the string. You may assume that n is between 0 and
 * the length of the string, inclusive.
 * <ul>
 *  <li>repeatEnd("Hello", 3) → "llollollo"
 *  <li>repeatEnd("Hello", 2) → "lolo"
 *  <li>repeatEnd("Hello", 1) → "o"
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p152339
 * @since 17.0.1
 * @version 0.0.1
 */
public class RepeatEnd {
    public static void main(String[] args) {
        System.out.println("repeatEnd(\"Hello\", 3) -> " + repeatEnd("Hello", 3));
        System.out.println("repeatEnd(\"Hello\", 2) -> " + repeatEnd("Hello", 2));
        System.out.println("repeatEnd(\"Hello\", 1) -> " + repeatEnd("Hello", 1));
    }

    /**
     * Given a string and an int n, return a string made of n repetitions of the
     * last n characters of the string. You may assume that n is between 0 and
     * the length of the string, inclusive.
     * 
     * @param str String inserted to be repeated n times at n characters from the end
     * @param n the amount of characters away from the end of str to be repeated n times
     * @return String consisting of n characters from the end of str repeated n times
     * @since 0.0.1
     */
    public static String repeatEnd(String str, int n) {
        String newString = "";
        for (int i = 0; i < n; i++) {
            newString += str.substring(str.length()-n);
        }
        return newString;
    }    
}
