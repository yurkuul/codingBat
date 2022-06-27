/**
 * Given a string, return true if it ends in "ly".
 * 
 * <ul>
 *  <li>endsLy("oddly") → true
 *  <li>endsLy("y") → false
 *  <li>endsLy("oddy") → false
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p103895
 * @since 17.0.1
 * @version 0.0.1
 */
public class EndsLy {
    public static void main(String[] args) {
        System.out.println("endsLy(\"oddly\") -> " + endsLy("oddly"));
        System.out.println("endsLy(\"y\") -> " + endsLy("y"));
        System.out.println("endsLy(\"oddy\") -> " + endsLy("oddy"));
    }

    /**
     * Given a string, return true if it ends in "ly".
     * 
     * @param str A String.
     * @return true if str ends in "ly".
     * @since 0.0.1
     */
    public static boolean endsLy(String str) {
        if (str.length() < 2) {
            return false;
        }
        return str.substring(str.length()-2).equals("ly");
    }
}
