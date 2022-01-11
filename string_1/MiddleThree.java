/**
 * Given a string of odd length, return the string length 3 from its middle,
 * so "Candy" yields "and". The string length will be at least 3.
 * <ul>
 *  <li>middleThree("Candy") → "and"
 *  <li>middleThree("and") → "and"
 *  <li>middleThree("solving") → "lvi"
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p115863
 * @since 17.0.1
 * @version 0.0.1
 */
public class MiddleThree {
    public static void main(String[] args) {
        System.out.println("middleThree(\"Candy\") -> " + middleThree("Candy"));
        System.out.println("middleThree(\"and\") -> " + middleThree("and"));
        System.out.println("middleThree(\"solving\") -> " + middleThree("solving"));
    }

    /**
     * Given a string of odd length, return the string length 3 from its middle,
     * so "Candy" yields "and". The string length will be at least 3.
     * 
     * @param str String of odd length inserted for getting the middle 3 letters
     * @return String middle 3 letters of str
     * @since 0.0.1
     */
    public static String middleThree(String str) {
        return str.substring(str.length()/2-1, str.length()/2+2);
    }
}
