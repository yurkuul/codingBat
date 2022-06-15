/**
 * Given a string, if the string "del" appears starting at index 1, return a
 * string where that "del" has been deleted. Otherwise, return the string
 * unchanged.
 * 
 * <ul>
 *  <li>delDel("adelbc") → "abc"
 *  <li>delDel("adelHello") → "aHello"
 *  <li>delDel("adedbc") → "adedbc"
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p100905
 * @since 17.0.1
 * @version 0.0.1
 */
public class DelDel {
    public static void main(String[] args) {
        System.out.println("delDel(\"adelbc\") -> " + delDel("adelbc"));
        System.out.println("delDel(\"adelHello\") -> " + delDel("adelHello"));
        System.out.println("delDel(\"adedbc\") -> " + delDel("adedbc"));
    }

    /**
     * Given a string, if the string "del" appears starting at index 1, return
     * a string where that "del" has been deleted. Otherwise, return the string
     * unchanged.
     * 
     * @param str String used to delete "del" if it appears at index 1.
     * @return A String that doesn't have "del" at the beginning if it appears
     * at index 1.
     * @since 0.0.1
     */
    public static String delDel(String str) {
        if (str.length() < 4) {
            return str;
        }
        if (str.substring(1,4).equals("del")) {
            return str.substring(0,1) + str.substring(4);
        }
        return str;
    }
}
