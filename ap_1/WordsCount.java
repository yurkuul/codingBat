import java.util.Arrays;

/**
 * Given an array of strings, return the count of the number of strings with
 * the given length.
 * <ul>
 *  <li>wordsCount(["a", "bb", "b", "ccc"], 1) → 2
 *  <li>wordsCount(["a", "bb", "b", "ccc"], 3) → 1
 *  <li>wordsCount(["a", "bb", "b", "ccc"], 4) → 0
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p124620
 * @since 17.0.1
 * @version 0.0.1
 */
public class WordsCount {
    public static void main(String[] args) {
        String[] array = {"a", "bb", "b", "ccc"};
        System.out.println("wordsCount(" + Arrays.toString(array) + ") -> " + wordsCount(array, 1));
        System.out.println("wordsCount(" + Arrays.toString(array) + ") -> " + wordsCount(array, 3));
        System.out.println("wordsCount(" + Arrays.toString(array) + ") -> " + wordsCount(array, 4));
    }

    /**
     * Given an array of strings, return the count of the number of strings
     * with the given length.
     * 
     * @param words The array of words.
     * @param len The length of the word you are looking for in words.
     * @return The number of words of length len.
     * @since 0.0.1
     */
    public static int wordsCount(String[] words, int len) {
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == len) {
                counter++;
            }
        }
        return counter;
    }
}
