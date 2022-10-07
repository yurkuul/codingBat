/**
 * We'll say that a String is xy-balanced if for all the 'x' chars in the
 * string, there exists a 'y' char somewhere later in the string. So "xxy" is
 * balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true
 * if the given string is xy-balanced.
 * 
 * <ul>
 *  <li>xyBalance("aaxbby") → true
 *  <li>xyBalance("aaxbb") → false
 *  <li>xyBalance("yaaxbb") → false
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p134250
 * @since 17.0.1
 * @version 0.0.2
 */
public class XYBalance {
    public static void main(String[] args) {
        System.out.println("xyBalance(\"aaxbby\") -> " + xyBalance("aaxbby"));
        System.out.println("xyBalance(\"aaxbb\") -> " + xyBalance("aaxbb"));
        System.out.println("xyBalance(\"yaaxbb\") -> " + xyBalance("yaaxbb"));
        System.out.println("xyBalance(\"xyxyxyxyxyy\") -> " + xyBalance("xyxyxyxyxyy"));
        System.out.println("xyBalance(\"yyyyyz\") -> " + xyBalance("yyyyyz"));
        System.out.println("xyBalance(\"  \") -> " + xyBalance("  "));
    }

    /**
     * We'll say that a String is xy-balanced if for all the 'x' chars in the
     * string, there exists a 'y' char somewhere later in the string. So "xxy"
     * is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return
     * true if the given string is xy-balanced.
     * 
     * @param str A String.
     * @return true if an "x" is followed by a "y" later in 'str'.
     * @since 0.0.1
     */
    public static boolean xyBalance(String str) {
        boolean balanced = false;
        boolean hasX = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i,i+1).equals("x")) {
                hasX = true;
                balanced = false;
            }
            if (hasX && str.substring(i,i+1).equals("y")) {
                balanced = true;
            }
        }
        if (!hasX) {
            balanced = true;
        }
        return balanced;
    }    
}
