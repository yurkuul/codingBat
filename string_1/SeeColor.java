/**
 * Given a string, if the string begins with "red" or "blue" return that color
 * string, otherwise return the empty string.
 * 
 * <ul>
 *  <li>seeColor("redxx") → "red"
 *  <li>seeColor("xxred") → ""
 *  <li>seeColor("blueTimes") → "blue"
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p199216
 * @since 17.0.1
 * @version 0.0.2
 */
public class SeeColor {
    public static void main(String[] args) {
        System.out.println("seeColor(\"redxx\") -> " + seeColor("redxx"));
        System.out.println("seeColor(\"xxred\") -> " + seeColor("xxred"));
        System.out.println("seeColor(\"blueTimes\") -> "
                            + seeColor("blueTimes"));
        System.out.println("seeColor(\"bluered\") -> "
                            + seeColor("bluered"));
        System.out.println("seeColor(\"redblue\") -> " 
                            + seeColor("bluered"));
    }

    /**
     * Given a string, if the string begins with "red" or "blue" return that
     * color string, otherwise return the empty string.
     * 
     * @param str A String.
     * @return "red" or "blue" if one of the colours starts at the beginning
     * of str.
     * @since 0.0.1
     */
    public static String seeColor(String str) {
        if (str.length() < 3) {
            return "";
        }
        if (str.substring(0, 3).equals("red")) {
            return "red";
        } else if (str.length() >= 4 && str.substring(0,4).equals("blue")) {
            return "blue";
        }
        return "";
    }
}
