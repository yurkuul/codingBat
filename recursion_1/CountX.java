/**
 * Given a string, compute recursively (no loops) the number of lowercase 'x'
 * chars in the string.
 * 
 * <ul>
 *  <li>countX("xxhixx") → 4
 *  <li>countX("xhixhix") → 3
 *  <li>countX("hi") → 0
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p170371
 * @since 17.0.1
 * @version 0.0.1
 */
public class CountX {
    public static void main(String[] args) {
        System.out.println("countX(\"xxhixx\") - > " + countX("xxhixx"));
        System.out.println("countX(\"xhixhix\") - > " + countX("xhixhix"));
        System.out.println("countX(\"hi\") -> " + countX("hi"));
    }

    /**
     * Given a string, compute recursively (no loops) the number of lowercase 'x'
     * chars in the string.
     * 
     * @param str Used to count the number of 'x' chars in it recursively.
     * @return The number of 'x' chars that appear in str.
     * @since 0.0.1
     */
    public static int countX(String str) {
        if (str.length() == 0) {
            return 0;
        }
        if (str.substring(0, 1).equals("x")) {
            return countX(str.substring(1)) + 1;
        } else {
            return countX(str.substring(1));
        }
      }
      
}
