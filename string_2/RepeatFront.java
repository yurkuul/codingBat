/**
 * Given a string and an int n, return a string made of the first n characters of
 * the string, followed by the first n-1 characters of the string, and so on. You
 * may assume that n is between 0 and the length of the string, inclusive
 * (i.e. n >= 0 and n <= str.length()).
 * <ul>
 *  <li>repeatFront("Chocolate", 4) → "ChocChoChC"
 *  <li>repeatFront("Chocolate", 3) → "ChoChC"
 *  <li>repeatFront("Ice Cream", 2) → "IcI"
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p128796
 * @since 17.0.1
 * @version 0.0.2
 */
public class RepeatFront {
    public static void main(String[] args) {
        System.out.println("repeatFront(\"Chocolate\", 4) -> "
                           + repeatFront("Chocolate", 4));
        System.out.println("repeatFront(\"Chocolate\", 3) -> "
                           + repeatFront("Chocolate", 3));
        System.out.println("repeatFront(\"Ice Cream\", 2) -> "
                           + repeatFront("Ice Cream", 2));
        System.out.println("repeatFront(\"\", 0) -> "
                           + repeatFront("", 0));
    }

    /**
     * Given a string and an int n, return a string made of the first n characters of
     * the string, followed by the first n-1 characters of the string, and so on. You
     * may assume that n is between 0 and the length of the string, inclusive
     * (i.e. n >= 0 and n <= str.length()).
     * 
     * @param str the String used for repeating the front of it int n amount of times
     * with 1 less character each time.
     * @param n the starting length of String str for repeating the front n times.
     * @return String that has been repeated n times with 1 character less each time.
     * @since 0.0.1
     */
    public static String repeatFront(String str, int n) {
        String newString = "";
        for (int i = n; i > 0; i--) {
            newString += str.substring(0, i);
        }
        return newString;
    }
}
