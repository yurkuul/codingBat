/**
 * Given 2 non-negative ints, a and b, return their sum, so long as the sum has
 * the same number of digits as a. If the sum has more digits than a, just
 * return a without b. (Note: one way to compute the number of digits of a
 * non-negative int n is to convert it to a string with String.valueOf(n) and
 * then check the length of the string.)
 * <ul>
 *  <li>sumLimit(2, 3) → 5
 *  <li>sumLimit(8, 3) → 8
 *  <li>sumLimit(8, 1) → 9
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p118077
 * @since 17.0.1
 * @version 0.0.1
 */
public class SumLimit {
    public static void main(String[] args) {
        System.out.println("sumLimit(2, 3) -> " + sumLimit(2, 3));
        System.out.println("sumLimit(8, 3) -> " + sumLimit(8, 3));
        System.out.println("sumLimit(8, 1) -> " + sumLimit(8, 1));
    }

    /**
     * Given 2 non-negative ints, a and b, return their sum, so long as the sum
     * has the same number of digits as a. If the sum has more digits than a,
     * just return a without b. (Note: one way to compute the number of digits
     * of a non-negative int n is to convert it to a string with
     * String.valueOf(n) and then check the length of the string.)
     * 
     * @param a A non-negative integer.
     * @param b Another non-negative integer.
     * @return The sume of a and b if the amount of digits in a is the same as
     * the sum or return just a if the amount of digits is not equal.
     * @since 0.0.1
     */
    public static int sumLimit(int a, int b) {
        if (String.valueOf(a+b).length() == String.valueOf(a).length()) {
            return a+b;
        }
        return a;
    }
}
