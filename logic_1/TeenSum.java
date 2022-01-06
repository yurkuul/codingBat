/**
 * Given 2 ints, a and b, return their sum. However, "teen" values in the range 
 * 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.
 * <ul>
 *  <li>teenSum(3, 4) → 7
 *  <li>teenSum(10, 13) → 19
 *  <li>teenSum(13, 2) → 19
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p178728
 * @since 17.0.1
 * @version 0.0.1
 */
public class TeenSum {
    public static void main(String[] args) {
        System.out.println("teenSum(3, 4) -> " + teenSum(3, 4));
        System.out.println("teenSum(10, 13) -> " + teenSum(10, 13));
        System.out.println("teenSum(13, 2) -> " + teenSum(13, 2));
    }

    /**
     * Given 2 ints, a and b, return their sum. However, "teen" values in the range 
     * 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.
     * 
     * @param a int value to be added
     * @param b int value to be added
     * @return 19 if a or b is in between 13 and 19 else return the sum of a and b 
     * @since 0.0.1
     */
    public static int teenSum(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        }
        return a + b;
    }
}
