/**
 * Given 2 positive int values, return the larger value that is in the range
 * 10..20 inclusive, or return 0 if neither is in that range.
 * 
 * <ul>
 *  <li>max1020(11, 19) → 19
 *  <li>max1020(19, 11) → 19
 *  <li>max1020(11, 9) → 11
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p177372
 * @since 17.0.1
 * @version 0.0.1
 */
public class Max1020 {
    public static void main(String[] args) {
        System.out.println("max1020(11, 19) -> " + max1020(11, 19));
        System.out.println("max1020(19, 11) -> " + max1020(19, 11));
        System.out.println("max1020(11, 9) -> " + max1020(11, 9));
    }

    /**
     * Given 2 positive int values, return the larger value that is in the
     * range 10..20 inclusive, or return 0 if neither is in that range.
     * 
     * @param a First integer value.
     * @param b Second integer value.
     * @return The larger value that is inside the range of 10 to 20 inclusive,
     * or 0 if neither of them is inside the range.
     * @since 0.0.1
     */
    public static int max1020(int a, int b) {
        int bigger = a;
        int smaller = b;
        if (a < b) {
            bigger = b;
            smaller = a;
        }
        if (bigger >= 10 && bigger <= 20) {
            return bigger;
        } else if (smaller >= 10 && smaller <= 20) {
            return smaller;
        }
        return 0;
    }
}
