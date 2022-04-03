import java.util.Arrays;

/**
 * Given an array of strings, return a new array without the strings that are
 * equal to the target string. One approach is to count the occurrences of the
 * target string, make a new array of the correct length, and then copy over
 * the correct strings.
 * <ul>
 *  <li>wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
 *  <li>wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
 *  <li>wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p121236
 * @since 17.0.1
 * @version 0.0.1
 */
public class WordsWithout {
    public static void main(String[] args) {
        String[] array1 = {"a", "b", "c", "a"};
        System.out.println("wordsWithout(" + Arrays.toString(array1)
                             + ", \"a\") -> "
                             + Arrays.toString(wordsWithout(array1, "a")));
        System.out.println("wordsWithout(" + Arrays.toString(array1)
                             + ", \"b\") -> "
                             + Arrays.toString(wordsWithout(array1, "b")));
        System.out.println("wordsWithout(" + Arrays.toString(array1)
                             + ", \"c\") -> "
                             + Arrays.toString(wordsWithout(array1, "c")));
    }

    /**
     * Given an array of strings, return a new array without the strings that
     * are equal to the target string. One approach is to count the occurrences
     * of the target string, make a new array of the correct length, and then
     * copy over the correct strings.
     * 
     * @param words Array of words.
     * @param target The word that you want to get rid of in words.
     * @return A new array of words without the target.
     * @since 0.0.1
     */
    public static String[] wordsWithout(String[] words, String target) {
        int length = 0;
        for (String word : words) {
            if (!word.equals(target)) {
                length++;
            }
        }
        String[] newList = new String[length];
        int index = 0;
        for (String word : words) {
            if (!word.equals(target)) {
                newList[index] = word;
                index++;
            }
        }
        return newList;
    }
}
