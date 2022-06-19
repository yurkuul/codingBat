/**
 * Return true if the given string contains between 1 and 3 'e' chars.
 * 
 * <ul>
 *  <li>stringE("Hello") → true
 *  <li>stringE("Heelle") → true
 *  <li>stringE("Heelele") → false
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p173784
 * @since 17.0.1
 * @version 0.0.1
 */
public class StringE {
    public static void main(String[] args) {
        System.out.println("stringE(\"Hello\") -> " + stringE("Hello"));
        System.out.println("stringE(\"Heelle\") -> " + stringE("Heelle"));
        System.out.println("stringE(\"Heelele\") -> " + stringE("Heelele"));
    }

    /**
     * Return true if the given string contains between 1 and 3 'e' chars.
     * 
     * @param str String given to see if there are 1 to 3 'e' chars present.
     * @return true if the number of 'e' chars in str is between 1 to 3
     * inclusive.
     * @since 0.0.1
     */
    public static boolean stringE(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i+1).equals("e")) {
                counter++;
            }
        }
        return counter >= 1 && counter <= 3;
    }
}
