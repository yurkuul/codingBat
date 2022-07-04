/**
 * A sandwich is two pieces of bread with something in between. Return the
 * string that is between the first and last appearance of "bread" in the given
 * string, or return the empty string "" if there are not two pieces of bread.
 * 
 * <ul>
 *  <li>getSandwich("breadjambread") → "jam"
 *  <li>getSandwich("xxbreadjambreadyy") → "jam"
 *  <li>getSandwich("xxbreadyy") → ""
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p129952
 * @since 17.0.1
 * @version 0.0.1
 */
public class GetSandwich {
    public static void main(String[] args) {
        System.out.println("getSandwich(\"breadjambread\") -> "
                             + getSandwich("breadjambread"));
        System.out.println("getSandwich(\"xxbreadjambreadyy\") -> "
                             + getSandwich("xxbreadjambreadyy"));
        System.out.println("getSandwich(\"xxbreadyy\") -> "
                             + getSandwich("xxbreadyy"));
    }

    /**
     * A sandwich is two pieces of bread with something in between. Return the
     * string that is between the first and last appearance of "bread" in the
     * given string, or return the empty string "" if there are not two pieces
     * of bread.
     * 
     * @param str A String.
     * @return The String between the first and last occurance of "bread".
     * @since 0.0.1
     */
    public static String getSandwich(String str) {
        if (str.length() <= 10) {
            return "";
        }
        int startingIndex = str.indexOf("bread")+5;
        int endingIndex = str.lastIndexOf("bread");
        return str.substring(startingIndex, endingIndex);
    }
}
