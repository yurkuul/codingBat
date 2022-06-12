/**
 * Given 2 int values, return true if either of them is in the range 10..20
 * inclusive.
 * 
 * <ul>
 *  <li>in1020(12, 99) → true
 *  <li>in1020(21, 12) → true
 *  <li>in1020(8, 99) → false
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p144535
 * @since 17.0.1
 * @version 0.0.1
 */
public class In1020 {
    public static void main(String[] args) {
        System.out.println("in1020(12, 99) -> " + in1020(12, 99));
        System.out.println("in1020(21, 12) -> " + in1020(21, 12));
        System.out.println("in1020(8, 99) -> " + in1020(8, 99));
    }

    /**
     * Given 2 int values, return true if either of them is in the range 10..20
     * inclusive.
     * 
     * @param a First int value.
     * @param b Second int value.
     * @return true if a or b is inside the range of 10 to 20 inclusive.
     * @since 0.0.1
     */
    public static boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }
}
