/**
 * Given two temperatures, return true if one is less than 0 and the other is
 * greater than 100.
 * 
 * <ul>
 *  <li>icyHot(120, -1) → true
 *  <li>icyHot(-1, 120) → true
 *  <li>icyHot(2, 120) → false
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p192082
 * @since 17.0.1
 * @version 0.0.1
 */
public class IcyHot {
    public static void main(String[] args) {
        System.out.println("icyHot(120, -1) -> " + icyHot(120, -1));
        System.out.println("icyHot(-1, 120) -> " + icyHot(-1, 120));
        System.out.println("icyHot(2, 120) -> " + icyHot(2, 120));
    }

    /**
     * Given two temperatures, return true if one is less than 0 and the other
     * is greater than 100.
     * 
     * @param temp1 First temperature.
     * @param temp2 Second temperature.
     * @return true if one temperature is less than 0 and one temperature is 
     * greater than 100.
     * @since 0.0.1
     */
    public static boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }
}
