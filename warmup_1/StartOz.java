/**
 * Given a string, return a string made of the first 2 chars (if present),
 * however include first char only if it is 'o' and include the second only if
 * it is 'z', so "ozymandias" yields "oz".
 * 
 * <ul>
 *  <li>startOz("ozymandias") → "oz"
 *  <li>startOz("bzoo") → "z"
 *  <li>startOz("oxx") → "o"
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p199720
 * @since 17.0.1
 * @version 0.0.1
 */
public class StartOz {
    public static void main(String[] args) {
        System.out.println("startOz(\"ozymandias\") -> " + startOz("ozymandias"));
        System.out.println("startOz(\"bzoo\") -> " + startOz("bzoo"));
        System.out.println("startOz(\"oxx\") -> " + startOz("oxx"));
    }

    /**
     * Given a string, return a string made of the first 2 chars (if present),
     * however include first char only if it is 'o' and include the second only
     * if it is 'z', so "ozymandias" yields "oz".
     * 
     * @param str String to check if the first char is "o" and the second char
     * to be "z" if they exist
     * @return the first char if it is "o" and second char if it is "z"
     * @since 0.0.1
     */
    public static String startOz(String str) {
        if (str.length() >= 1 && str.substring(0,1).equals("o")) {
            if (str.length() >= 2 && str.substring(1, 2).equals("z")) {
                return str.substring(0, 2);
            }
            return str.substring(0, 1);
        } else if (str.length() >= 2 && str.substring(1,2).equals("z")) {
            return str.substring(1, 2);
        }
        return "";
    }
}
