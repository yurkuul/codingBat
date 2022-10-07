/**
 * Given a string of even length, return the first half. So the string "WooHoo"
 * yields "Woo".
 * 
 * <ul>
 *  <li>firstHalf("WooHoo") → "Woo"
 *  <li>firstHalf("HelloThere") → "Hello"
 *  <li>firstHalf("abcdef") → "abc"
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p172267
 * @since 17.0.1
 * @version 0.0.2
 */
public class FirstHalf {
    public static void main(String[] args) {
        System.out.println("firstHalf(\"WooHoo\") -> " + firstHalf("WooHoo"));
        System.out.println("firstHalf(\"HelloThere\") -> " + firstHalf("HelloThere"));
        System.out.println("firstHalf(\"abcdef\") -> " + firstHalf("abcdef"));
        System.out.println("firstHalf(\"  \") -> " + firstHalf("  "));
        System.out.println("firstHalf(\"test\") -> " + firstHalf("test"));
    }
    
    /**
     * Given a string of even length, return the first half. So the string
     * "WooHoo" yields "Woo".
     * 
     * @param str String used to get the first half to return.
     * @return The first half of str.
     * @since 0.0.1
     */
    public static String firstHalf(String str) {
        return str.substring(0, str.length()/2);
    }    
}
