import java.util.Arrays;

/**
 * Given 2 arrays that are the same length containing strings, compare the 1st
 * string in one array to the 1st string in the other array, the 2nd to the 2nd
 * and so on. Count the number of times that the 2 strings are non-empty and
 * start with the same char. The strings may be any length, including 0.
 * <ul>
 *  <li>matchUp(["aa", "bb", "cc"], ["aaa", "xx", "bb"]) → 1
 *  <li>matchUp(["aa", "bb", "cc"], ["aaa", "b", "bb"]) → 2
 *  <li>matchUp(["aa", "bb", "cc"], ["", "", "ccc"]) → 1
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p139677
 * @since 17.0.1
 * @version 0.0.1
 */
public class MatchUp {
    public static void main(String[] args) {
        String[] array1 = {"aa", "bb", "cc"};
        String[] array2 = {"aaa", "xx", "bb"};
        String[] array3 = {"aaa", "b", "bb"};
        String[] array4 = {"", "", "ccc"};
        System.out.println("matchUp(" + Arrays.toString(array1) + ", "
                            + Arrays.toString(array2) + ") -> "
                            + matchUp(array1, array2));
        System.out.println("matchUp(" + Arrays.toString(array1) + ", "
                            + Arrays.toString(array3) + ") -> "
                            + matchUp(array1, array3));
        System.out.println("matchUp(" + Arrays.toString(array1) + ", "
                            + Arrays.toString(array4) + ") -> "
                            + matchUp(array1, array4));
    }

    /**
     * Given 2 arrays that are the same length containing strings, compare the
     * 1st string in one array to the 1st string in the other array, the 2nd to
     * the 2nd and so on. Count the number of times that the 2 strings are
     * non-empty and start with the same char. The strings may be any length,
     * including 0.
     * 
     * @param a Array of Strings.
     * @param b Another array of Strings.
     * @return The amount of times the same index in a and b start with the
     * same character.
     * @since 0.0.1
     */
    public static int matchUp(String[] a, String[] b) {
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if ((!a[i].equals("") && !b[i].equals(""))
                && (a[i].substring(0, 1).equals(b[i].substring(0, 1)))) {
                counter++;
            }
        }
        return counter;
    }    
}
