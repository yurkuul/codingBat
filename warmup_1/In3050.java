/**
 * Given 2 int values, return true if they are both in the range 30..40
 * inclusive, or they are both in the range 40..50 inclusive.
 * 
 * <ul>
 *  <li>in3050(30, 31) → true
 *  <li>in3050(30, 41) → false
 *  <li>in3050(40, 50) → true
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p132134
 * @since 17.0.1
 * @version 0.0.1
 */
public class In3050 {
    public static void main(String[] args) {
        System.out.println("in3050(30, 31) -> " + in3050(30, 31));
        System.out.println("in3050(30, 41) -> " + in3050(30, 41));
        System.out.println("in3050(40, 50) -> " + in3050(40, 50));
    }

    /**
     * Given 2 int values, return true if they are both in the range 30..40
     * inclusive, or they are both in the range 40..50 inclusive.
     * 
     * @param a First integer value.
     * @param b Second integer value.
     * @return true if both a and b are between 30 and 40 inclusive, or both
     * between 40 and 50 inclusive.
     * @since 0.0.1
     */
    public static boolean in3050(int a, int b) {
        return (a >= 30 && a <= 40 && b >= 30 && b <= 40) || 
                (a >= 40 && a <= 50 && b >= 40 && b <= 50);
    }
}
