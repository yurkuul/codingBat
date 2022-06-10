/**
 * Return true if the given non-negative number is a multiple of 3 or a
 * multiple of 5. Use the % "mod" operator -- see Introduction to Mod
 * 
 * <ul>
 *  <li>or35(3) → true
 *  <li>or35(10) → true
 *  <li>or35(8) → false
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p112564
 * @since 17.0.1
 * @version 0.0.1
 */
public class Or35 {
    public static void main(String[] args) {
        System.out.println("or35(3) -> " + or35(3));
        System.out.println("or35(10) -> " + or35(10));
        System.out.println("or35(8) -> " + or35(8));
    }

    /**
     * Return true if the given non-negative number is a multiple of 3 or a
     * multiple of 5. Use the % "mod" operator -- see Introduction to Mod
     * 
     * @param n Non-negative integer.
     * @return true if n is divisible by 3 or 5.
     * @since 0.0.1
     */
    public static boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }
}
