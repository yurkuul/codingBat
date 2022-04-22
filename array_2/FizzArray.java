import java.util.Arrays;

/**
 * Given a number n, create and return a new int array of length n, containing
 * the numbers 0, 1, 2, ... n-1. The given n may be 0, in which case just
 * return a length 0 array. You do not need a separate if-statement for the
 * length-0 case; the for-loop should naturally execute 0 times in that case,
 * so it just works. The syntax to make a new int array is: new
 * int[desired_length]   (See also: FizzBuzz Code)
 * <ul>
 *  <li>fizzArray(4) → [0, 1, 2, 3]
 *  <li>fizzArray(1) → [0]
 *  <li>fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p180920
 * @since 17.0.1
 * @version 0.0.1
 */
public class FizzArray {
    public static void main(String[] args) {
        System.out.println("fizzArray(4) -> " + Arrays.toString(fizzArray(4)));
        System.out.println("fizzArray(4) -> " + Arrays.toString(fizzArray(1)));
        System.out.println("fizzArray(4) -> " + Arrays.toString(fizzArray(10)));
    }

    /**
     * Given a number n, create and return a new int array of length n,
     * containing the numbers 0, 1, 2, ... n-1. The given n may be 0, in which
     * case just return a length 0 array. You do not need a separate
     * if-statement for the length-0 case; the for-loop should naturally
     * execute 0 times in that case, so it just works. The syntax to make a new
     * int array is: new int[desired_length]   (See also: FizzBuzz Code)
     * 
     * @param n Length of the array.
     * @return Integer array of length n that starts from 0 and goes to n-1.
     * @since 0.0.1
     */
    public static int[] fizzArray(int n) {
        int[] array = new int[n];
        for (int i = 0 ; i < n; i++) {
            array[i] = i;
        }
        return array;
    }
}
