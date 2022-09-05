/**
 * Given an int n, return the absolute difference between n and 21, except return 
 * double the absolute difference if n is over 21.
 * 
 * <ul>
 *  <li>diff21(19) → 2
 *  <li>diff21(10) → 11
 *  <li>diff21(21) → 0
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p116624
 * @since 17.0.1
 * @version 0.0.2
 */
public class Diff21 {
    public static void main(String[] args) {
        System.out.println("diff21(19) -> " + diff21(19));
        System.out.println("diff21(10) -> " + diff21(10));
        System.out.println("diff21(21) -> " + diff21(21));
        System.out.println("diff21(20) -> " + diff21(20));
        System.out.println("diff21(100) -> " + diff21(100));
    }

    /**
     * Given an int n, return the absolute difference between n and 21, except return 
     * double the absolute difference if n is over 21.
     * 
     * @param n integer value that is being subtracted from 21
     * @return integer value that has been subtracted from 21 if the difference is positive,
     * integer value that has been subtracted from 21 and doubled if the difference is negative
     * @since 0.0.1
     */
    public static int diff21(int n) {
        if (n <= 21) {
            n = 21-n;
          } else {
            n = Math.abs(21-n) * 2;
          }
          return n;
    }
}
