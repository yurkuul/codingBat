/**
 * Given an int n, return true if it is within 10 of 100 or 200. 
 * Note: Math.abs(num) computes the absolute value of a number.
 * <ul>
 *  <li>
 *  <li>nearHundred(93) → true
 *  <li>nearHundred(90) → true
 * </ul>nearHundred(89) → false
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p184004
 * @since 17.0.1
 * @version 0.0.1
 */
public class NearHundred {
    public static void main(String[] args) {
        System.out.println("nearHundred(93) -> " + nearHundred(93));
        System.out.println("nearHundred(90) -> " + nearHundred(90));
        System.out.println("nearHundred(89) -> " + nearHundred(89));
    }

    /**
     * Given an int n, return true if it is within 10 of 100 or 200. 
     * Note: Math.abs(num) computes the absolute value of a number.
     * 
     * @param n int value being checked if it's 10 away from multiples of 100
     * @return True if n is 10 or less away from multiples of 100
     * @since 0.0.1
     */
    public static boolean nearHundred(int n) {
        return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;
    }
}
