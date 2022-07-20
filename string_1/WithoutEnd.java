/**
 * Given a string, return a version without the first and last char, so "Hello"
 * yields "ell". The string length will be at least 2.
 * 
 * <ul>
 *  <li>withoutEnd("Hello") → "ell"
 *  <li>withoutEnd("java") → "av"
 *  <li>withoutEnd("coding") → "odin"
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p174254
 * @since 17.0.1
 * @version 0.0.1
 */
public class WithoutEnd {
    public static void main(String[] args) {
        System.out.println("withoutEnd(\"Hello\") -> " + withoutEnd("Hello"));
        System.out.println("withoutEnd(\"java\") -> " + withoutEnd("java"));
        System.out.println("withoutEnd(\"coding\") -> "+withoutEnd("coding"));
    }

    /**
     * Given a string, return a version without the first and last char, so
     * "Hello" yields "ell". The string length will be at least 2.
     * 
     * @param str A String.
     * @return 'str' without the first and last character.
     * @since 0.0.1
     */
    public static String withoutEnd(String str) {
        if (str.length() < 3) {
            return "";
        }
        return str.substring(1, str.length()-1);
    }    
}
