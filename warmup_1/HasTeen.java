/**
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
 * Given 3 int values, return true if 1 or more of them are teen.
 * 
 * <ul>
 *  <li>hasTeen(13, 20, 10) → true
 *  <li>hasTeen(20, 19, 10) → true
 *  <li>hasTeen(20, 10, 13) → true
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p178986
 * @since 17.0.1
 * @version 0.0.1
 */
public class HasTeen {
    public static void main(String[] args) {
        System.out.println("hasTeen(13, 20, 10) -> " + hasTeen(13, 20, 10));
        System.out.println("hasTeen(20, 19, 10) -> " + hasTeen(20, 19, 10));
        System.out.println("hasTeen(20, 10, 13) -> " + hasTeen(20, 10, 13));
    }

    /**
     * We'll say that a number is "teen" if it is in the range 13..19
     * inclusive. Given 3 int values, return true if 1 or more of them are
     * teen.
     * 
     * @param a The first number.
     * @param b The second number.
     * @param c The third number.
     * @return True if one of the numbers are a teen.
     * @since 0.0.1
     */
    public static boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 &&c <= 19);
    }
}
