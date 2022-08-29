/**
 * Given a string, return a new string made of 3 copies of the first 2 chars of
 * the original string. The string may be any length. If there are fewer than 2
 * chars, use whatever is there. 
 * <ul>
 *  <li>extraFront("Hello") → "HeHeHe"
 *  <li>extraFront("ab") → "ababab"
 *  <li>extraFront("H") → "HHH"
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p172063
 * @since 17.0.1
 * @version 0.0.2
 */
public class ExtraFont {
    public static void main(String[] args) {
        System.out.println("extraFront(\"Hello\") -> " + extraFront("He"));
        System.out.println("extraFront(\"ab\") -> " + extraFront("ab"));
        System.out.println("extraFront(\"H\") -> " + extraFront("H"));
        System.out.println("extraFront(\"Test\") -> " + extraFront("Test"));
        System.out.println("extraFront(\"Meowwoof\") -> " + extraFront("Meowwoof"));
    }

    /**
     * Given a string, return a new string made of 3 copies of the first 2 chars of
     * the original string. The string may be any length. If there are fewer than 2
     * chars, use whatever is there. 
     * 
     * @param str the String being inputted for modifications
     * @return String that has been copied 3 times 
     */
    public static String extraFront(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        } else {
            return str + str + str;
        }
    }
}
