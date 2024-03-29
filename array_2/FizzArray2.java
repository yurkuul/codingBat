import java.util.Arrays;

/**
 * Given a number n, create and return a new string array of length n,
 * containing the strings "0", "1" "2" .. through n-1. N may be 0, in which
 * case just return a length 0 array. Note: String.valueOf(xxx) will make the
 * String form of most types. The syntax to make a new string array is: new
 * String[desired_length]  (See also: FizzBuzz Code)
 * <ul>
 *  <li>fizzArray2(4) → ["0", "1", "2", "3"]
 *  <li>fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
 *  <li>fizzArray2(2) → ["0", "1"]
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p178353
 * @since 17.0.1
 * @version 0.0.2
 */
public class FizzArray2 {
    public static void main(String[] args) {
        System.out.println("fizzArray2(4) -> " + Arrays.toString(fizzArray2(4)));
        System.out.println("fizzArray2(10) -> " + Arrays.toString(fizzArray2(10)));
        System.out.println("fizzArray2(2) -> " + Arrays.toString(fizzArray2(2)));
        System.out.println("fizzArray2(0) -> " + Arrays.toString(fizzArray2(0)));
        System.out.println("fizzArray2(100) -> " + Arrays.toString(fizzArray2(100)));
    }

    /**
     * Given a number n, create and return a new string array of length n,
     * containing the strings "0", "1" "2" .. through n-1. N may be 0, in which
     * case just return a length 0 array. Note: String.valueOf(xxx) will make
     * the String form of most types. The syntax to make a new string array is:
     * new String[desired_length]  (See also: FizzBuzz Code)
     * 
     * @param n Length of the array to be returned.
     * @return Array of length n with Strings from 0 to n-1.
     * @since 0.0.1
     */
    public static String[] fizzArray2(int n) {
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = String.valueOf(i);
        }
        return array;
    }    
}
