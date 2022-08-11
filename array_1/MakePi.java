import java.util.Arrays;

/**
 * Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
 * 
 * <ul>
 *  <li>makePi() → [3, 1, 4]
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p167011
 * @since 17.0.1
 * @version 0.0.1
 */
public class MakePi {
    public static void main(String[] args) {
        System.out.println("makePi() -> " + Arrays.toString(makePi()));
    }

    /**
     * Return an int array length 3 containing the first 3 digits of pi,
     * {3, 1, 4}.
     * 
     * @return Integer array of length 3 containing the first 3 digits of pi.
     * @since 0.0.1
     */
    public static int[] makePi() {
        int[] pi = {3, 1, 4};
        return pi;
    }
}
