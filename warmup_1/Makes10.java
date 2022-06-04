/**
 * Given 2 ints, a and b, return true if one if them is 10 or if their sum is
 * 10.
 * 
 * <ul>
 *  <li>makes10(9, 10) → true
 *  <li>makes10(9, 9) → false
 *  <li>makes10(1, 9) → true
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p182873
 * @since 17.0.1
 * @version 0.0.1
 */
public class Makes10 {
    public static void main(String[] args) {
        System.out.println("makes10(9, 10) -> " + makes10(9, 10));
        System.out.println("makes10(9, 9) -> " + makes10(9, 9));
        System.out.println("makes10(1, 9) -> " + makes10(1, 9));
    }
    
    /**
     * Given 2 ints, a and b, return true if one if them is 10 or if their sum
     * is 10.
     * 
     * @param a First integer value.
     * @param b Second integer value.
     * @return True if either a or b is 10 or if their sum is 10.
     * @since 0.0.1
     */
    public static boolean makes10(int a, int b) {
        return (a == 10 || b == 10) || a+b == 10;
    }
}
