/**
 * Given a string, does "xyz" appear in the middle of the string? To define
 * middle, we'll say that the number of chars to the left and right of the
 * "xyz" must differ by at most one. This problem is harder than it looks.
 * 
 * <ul>
 *  <li>xyzMiddle("AAxyzBB") → true
 *  <li>xyzMiddle("AxyzBB") → true
 *  <li>xyzMiddle("AxyzBBB") → false
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p159772
 * @since 17.0.1
 * @version 0.0.1
 */
public class XYZMiddle {
    public static void main(String[] args) {
        System.out.println("xyzMiddle(\"AAxyzBB\") -> " + xyzMiddle("AAxyzBB"));
        System.out.println("xyzMiddle(\"AxyzBB\") -> " + xyzMiddle("AxyzBB"));
        System.out.println("xyzMiddle(\"AxyzBBB\") -> " + xyzMiddle("AxyzBBB"));
    }

    /**
     * Given a string, does "xyz" appear in the middle of the string? To define
     * middle, we'll say that the number of chars to the left and right of the
     * "xyz" must differ by at most one. This problem is harder than it looks.
     * 
     * @param str A String.
     * @return If "xyz" appears in the middle of 'str', where it can differ by
     * 1 index.
     * @since 0.0.1
     */
    public static boolean xyzMiddle(String str) {
        if (str.length() < 3) {
            return false;
        }
        if (str.length() % 2 == 0) {
            return str.substring(str.length()/2-1, str.length()/2+2).equals("xyz") ||
                str.substring(str.length()/2-2, str.length()/2+1).equals("xyz");
        }
        return str.substring(str.length()/2-1, str.length()/2+2).equals("xyz");
    }    
}
