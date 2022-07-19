/**
 * Return true if the given non-negative number is a multiple of 3 or 5, but
 * not both. Use the % "mod" operator -- see Introduction to Mod
 * 
 * <ul>
 *  <li>old35(3) → true
 *  <li>old35(10) → true
 *  <li>old35(15) → false
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p159612
 * @since 17.0.1
 * @version 0.0.1
 */
public class Old35 {
    public static void main(String[] args) {
        System.out.println("old35(3) -> " + old35(3));
        System.out.println("old35(10) -> " + old35(10));
        System.out.println("old35(15) -> " + old35(15));
    }

    /**
     * Return true if the given non-negative number is a multiple of 3 or 5,
     * but not both. Use the % "mod" operator -- see Introduction to Mod
     * 
     * @param n A non-negative number.
     * @return true if 'n' is a multiple or 3 or 5, but not both.
     * @since 0.0.1
     */
    public static boolean old35(int n) {
        return (n % 5 == 0 && n % 3 != 0) || (n % 5 != 0 && n % 3 == 0);
    }
}
