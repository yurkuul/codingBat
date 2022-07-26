/**
 * Returns true if for every '*' (star) in the string, if there are chars both
 * immediately before and after the star, they are the same.
 * 
 * <ul>
 *  <li>sameStarChar("xy*yzz") → true
 *  <li>sameStarChar("xy*zzz") → false
 *  <li>sameStarChar("*xa*az") → true
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p194491
 * @since 17.0.1
 * @version 0.0.1
 */
public class SameStarChar {
    public static void main(String[] args) {
        System.out.println("sameStarChar(\"xy*yzz\") ->" + sameStarChar("xy*yzz"));
        System.out.println("sameStarChar(\"xy*zzz\") -> " + sameStarChar("xy*zzz"));
        System.out.println("sameStarChar(\"*xa*az\") -> " + sameStarChar("*xa*az"));
    }

    /**
     * Returns true if for every '*' (star) in the string, if there are chars
     * both immediately before and after the star, they are the same.
     * 
     * @param str A String.
     * @return true if for every "*" in 'str', the char before and after is the
     * same.
     * @since 0.0.1
     */
    public static boolean sameStarChar(String str) {
        for (int i = 1; i < str.length()-1; i++) {
            if (str.substring(i, i+1).equals("*")) {
                if (!str.substring(i-1, i).equals(str.substring(i+1, i+2))) {
                    return false;
                }
            }
        }
        return true;
    }
}
