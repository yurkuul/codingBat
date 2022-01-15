/**
 * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) 
 * ... 1. Compute the result recursively (without loops).
 * <ul>
 *  <li>factorial(1) → 1
 *  <li>factorial(2) → 2
 *  <li>factorial(3) → 6
 *  <li>factorial(-5) -> IllegalArgumentException 
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p154669
 * @since 17.0.1
 * @version 0.0.3
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println("factorial(1) -> " + factorial(1));
        System.out.println("factorial(2) -> " + factorial(2));
        System.out.println("factorial(3) -> " + factorial(3));
        try {
            System.out.println("factorial(-5) -> " + factorial(-5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) 
     * ... 1. Compute the result recursively (without loops).
     * 
     * @param n int value used for finding its factorial
     * @return int value that is the factorial of n
     * @throws IllegalArgumentException when int n is negative
     * @since 0.0.3
     */
    public static int factorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("factorial(" + n + ") -> IllegalArgumentException");
        }
        if (n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
