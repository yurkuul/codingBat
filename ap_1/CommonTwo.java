import java.util.Arrays;

/**
 * Start with two arrays of strings, a and b, each in alphabetical order,
 * possibly with duplicates. Return the count of the number of strings which
 * appear in both arrays. The best "linear" solution makes a single pass over
 * both arrays, taking advantage of the fact that they are in alphabetical
 * order.
 * <ul>
 *  <li>commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
 *  <li>commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
 *  <li>commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p100369
 * @since 17.0.1
 * @version 0.0.1
 */
public class CommonTwo {
    public static void main(String[] args) {
        String[] array1 = {"a", "c", "x"};
        String[] array2 = {"b", "c", "d", "x"};
        String[] array3 = {"a", "b", "c", "x", "z"};
        String[] array4 = {"a", "b", "c"};
        String[] array5 = {"a", "a", "b", "b", "c"};
        String[] array6 = {"a", "b", "c"};
        System.out.println("commonTwo(" + Arrays.toString(array1) + ", "
                            + Arrays.toString(array2) + ") -> "
                            + commonTwo(array1, array2));
        System.out.println("commonTwo(" + Arrays.toString(array1) + ", "
                            + Arrays.toString(array3) + ") -> "
                            + commonTwo(array1, array3));
        System.out.println("commonTwo(" + Arrays.toString(array4) + ", "
                            + Arrays.toString(array4) + ") -> "
                            + commonTwo(array4, array4));
        System.out.println("commonTwo(" + Arrays.toString(array5) + ", "
                            + Arrays.toString(array6) + ") -> "
                            + commonTwo(array5, array6));
    }

    /**
     * Start with two arrays of strings, a and b, each in alphabetical order,
     * possibly with duplicates. Return the count of the number of strings
     * which appear in both arrays. The best "linear" solution makes a single
     * pass over both arrays, taking advantage of the fact that they are in
     * alphabetical order.
     * 
     * @param a Array of Strings.
     * @param b Array of Strings.
     * @return The number of times a String occurs in both a and b excluding
     * duplicates.
     * @since 0.0.1
     */
    public static int commonTwo(String[] a, String[] b) {
        int counter = 0;
        boolean startA = true;
        int smallLength = a.length;
        int bigLength = b.length;
        String usedLetters = "";
        if (b.length < a.length) {
            smallLength = b.length;
            bigLength = a.length;
            startA = false;
        }
        for (int i = 0; i < smallLength; i++) {
            for (int j = 0; j < bigLength; j++) {
                if (startA && !usedLetters.contains(a[i]) && a[i].equals(b[j])){
                    usedLetters += a[i];
                    counter++;
                } else if (!startA && !usedLetters.contains(a[j]) && a[j].equals(b[i])) {
                    usedLetters += a[j];
                    counter++;
                }
            }
        }
        return counter;
    }
}
