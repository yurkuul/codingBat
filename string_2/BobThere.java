/**
 * Return true if the given string contains a "bob" string, but where
 * the middle 'o' char can be any char.
 * <ul>
 *  <li>bobThere("abcbob") → true
 *  <li>bobThere("b9b") → true
 *  <li>bobThere("bac") → false
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p175762
 * @since 17.0.1
 * @version 0.0.1
 */
public class BobThere {
    public static void main(String[] args) {
        System.out.println("bobThere(\"abcbob\") -> " + bobThere("abcbob"));
        System.out.println("bobThere(\"b9b\") -> " + bobThere("b9b"));
        System.out.println("bobThere(\"bac\") -> " + bobThere("bac"));
    }

    /**
     * Return true if the given string contains a "bob" string, but where
     * the middle 'o' char can be any char.
     * 
     * @param str String being checked if there is "b_b" in it, with the empty space being any character
     * @return True if "b_b" is in str, where empty space is any character, False if it isn't
     * @since 0.0.1
     */
    public static boolean bobThere(String str) {
        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i, i+1).equals("b") && str.substring(i+2, i+3).equals("b")) {
              return true;
            }
        }
        return false;
    }
}
