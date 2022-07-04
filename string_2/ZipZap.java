/**
 * Look for patterns like "zip" and "zap" in the string -- length-3, starting
 * with 'z' and ending with 'p'. Return a string where for all such words, the
 * middle letter is gone, so "zipXzap" yields "zpXzp".
 * 
 * <ul>
 *  <li>zipZap("zipXzap") → "zpXzp"
 *  <li>zipZap("zopzop") → "zpzp"
 *  <li>zipZap("zzzopzop") → "zzzpzp"
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p180759
 * @since 17.0.1
 * @version 0.0.1
 */
public class ZipZap {
    public static void main(String[] args) {
        System.out.println("zipZap(\"zipXzap\") -> " + zipZap("zipXzap"));
        System.out.println("zipZap(\"zopzop\") -> " + zipZap("zopzop"));
        System.out.println("zipZap(\"zzzopzop\") -> " + zipZap("zzzopzop"));
    }

    /**
     * Look for patterns like "zip" and "zap" in the string -- length-3,
     * starting with 'z' and ending with 'p'. Return a string where for all
     * such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
     * 
     * @param str A String.
     * @return str without the middle letter between z and p.
     * @since 0.0.1
     */
    public static String zipZap(String str) {
        if (str.length() < 3) {
            return str;
        }
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            newString += str.substring(i,i+1);
            if (str.substring(i, i+1).equals("z") && str.substring(i+2, i+3).equals("p")) {
                i++;
            }
        }
        return newString;
    }
}
