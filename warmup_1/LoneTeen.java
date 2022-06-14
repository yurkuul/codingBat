/**
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
 * Given 2 int values, return true if one or the other is teen, but not both.
 * 
 * <ul>
 *  <li>loneTeen(13, 99) → true
 *  <li>loneTeen(21, 19) → true
 *  <li>loneTeen(13, 13) → false
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p165701
 * @since 17.0.1
 * @version 0.0.1
 */
public class LoneTeen {
    public static void main(String[] args) {
        System.out.println("loneTeen(13, 99) -> " + loneTeen(13, 99));
        System.out.println("loneTeen(21, 19) -> " + loneTeen(21, 19));
        System.out.println("loneTeen(13, 13) -> " + loneTeen(13, 13));
    }

    /**
     * We'll say that a number is "teen" if it is in the range 13..19
     * inclusive. Given 2 int values, return true if one or the other is teen,
     * but not both.
     * 
     * @param a First integer.
     * @param b Second integer.
     * @return true if a or b is a teen, but the other is not.
     * @since 0.0.1
     */
    public static boolean loneTeen(int a, int b) {
        if (a >= 13 && a <= 19) {
            return b < 13 || b > 19;
        } else if (b >= 13 && b <= 19) {
            return a < 13 || a > 19;
        }
        return false;
    }
}
