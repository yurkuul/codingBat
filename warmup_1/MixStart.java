/**
 * Return true if the given string begins with "mix", except the 'm' can be
 * anything, so "pix", "9ix" .. all count.
 * 
 * <ul>
 *  <li>mixStart("mix snacks") → true
 *  <li>mixStart("pix snacks") → true
 *  <li>mixStart("piz snacks") → false
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p151713
 * @since 17.0.1
 * @version 0.0.1
 */
public class MixStart {
    public static void main(String[] args) {
        System.out.println("mixStart(\"mix snacks\") -> " + mixStart("mix snacks"));
        System.out.println("mixStart(\"pix snacks\") -> " + mixStart("pix snacks"));
        System.out.println("mixStart(\"piz snacks\") -> " + mixStart("piz snacks"));
    }

    /**
     * Return true if the given string begins with "mix", except the 'm' can be
     * anything, so "pix", "9ix" .. all count.
     * 
     * @param str String to check if the beginning has "ix"
     * @return true if str starts with any character followed by "ix"
     * @since 0.0.1
     */
    public static boolean mixStart(String str) {
        if (str.length() <= 2) {
            return false;
        }
        return str.substring(1, 3).equals("ix");
    }
}
