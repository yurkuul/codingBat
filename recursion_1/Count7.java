/**
 * Given a non-negative int n, return the count of the occurrences of 7 as a digit,
 * so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the
 * rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost
 * digit (126 / 10 is 12).
 * <ul>
 *  <li>count7(717) → 2
 *  <li>count7(7) → 1
 *  <li>count7(123) → 0
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p101409
 * @since 17.0.1
 * @version 0.0.1
 */
public class Count7 {
    public static void main(String[] args) {
        System.out.println("count7(717) -> " + count7(717));
        System.out.println("count7(7) -> " + count7(7));
        System.out.println("count7(123) -> " + count7(123));
    }

    /**
     * Given a non-negative int n, return the count of the occurrences of 7 as a digit,
     * so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the
     * rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost
     * digit (126 / 10 is 12).
     * 
     * @param n the number used to determine how many 7's are present in it
     * @return the number of times 7 is present in n
     * @since 0.0.1
     */
    public static int count7(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 10 == 7) {
            return count7(n/10) + 1;
        } else {
            return count7(n/10);
        }
    }
}
