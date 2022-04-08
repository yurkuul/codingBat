import java.util.Arrays;

/**
 * Given an array of strings, return a new array containing the first N
 * strings. N will be in the range 1..length.
 * <ul>
 *  <li>wordsFront(["a", "b", "c", "d"], 1) → ["a"]
 *  <li>wordsFront(["a", "b", "c", "d"], 2) → ["a", "b"]
 *  <li>wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p183837
 * @since 17.0.1
 * @version 0.0.1
 */
public class WordsFront {
    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d"};
        System.out.println("wordsFront(" + Arrays.toString(array) + ", 1) -> "
                            + Arrays.toString(wordsFront(array, 1)));
        System.out.println("wordsFront(" + Arrays.toString(array) + ", 2) -> "
                            + Arrays.toString(wordsFront(array, 2)));
        System.out.println("wordsFront(" + Arrays.toString(array) + ", 3) -> "
                            + Arrays.toString(wordsFront(array, 3)));
    }

    /**
     * Given an array of strings, return a new array containing the first N
     * strings. N will be in the range 1..length.
     * 
     * @param words Array of Strings.
     * @param n The length of the new array to be returned.
     * @return The first n Strings that appear in words.
     * @since 0.0.1
     */
    public static String[] wordsFront(String[] words, int n) {
        String[] newArray = new String[n];
        for (int i = 0; i < n; i++) {
            newArray[i] = words[i];
        }
        return newArray;
    }
}
