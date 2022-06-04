/**
 * Given two int values, return their sum. Unless the two values are the same,
 * then return double their sum.
 * 
 * <ul>
 *  <li>sumDouble(1, 2) → 3
 *  <li>sumDouble(3, 2) → 5
 *  <li>sumDouble(2, 2) → 8
 * <ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p154485
 * @since 17.0.1
 * @version 0.0.1
 */
public class SumDouble {
    public static void main(String[] args) {
        System.out.println("sumDouble(1, 2) -> " + sumDouble(1, 2));
        System.out.println("sumDouble(3, 2) -> " + sumDouble(3, 2));
        System.out.println("sumDouble(2, 2) -> " + sumDouble(2, 2));
    }

    /**
     * Given two int values, return their sum. Unless the two values are the
     * same, then return double their sum.
     * 
     * @param a First integer value.
     * @param b Second integer value.
     * @return The sum of a and b unless a and b are the same then return
     * double the sum.
     * @since 0.0.1
     */
    public static int sumDouble(int a, int b) {
        if (a == b) {
            return 2*(a+b);
        }
        return a+b;
    }    
}
