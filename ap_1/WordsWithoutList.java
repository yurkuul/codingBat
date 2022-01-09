import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of strings, return a new List (e.g. an ArrayList) where all
 * the strings of the given length are omitted. See wordsWithout() below which
 * is more difficult because it uses arrays.
 * <ul>
 *  <li>wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
 *  <li>wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
 *  <li>wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p183407
 * @since 17.0.1
 * @version 0.0.1
 */
public class WordsWithoutList {
    public static void main(String[] args) {
        String[] array1 = {"a", "bb", "b", "ccc"};
        String[] array2 = {"a", "bb", "b", "ccc"};
        String[] array3 = {"a", "bb", "b", "ccc"};
        System.out.println("wordsWithoutList(" + Arrays.toString(array1) + ") -> " + wordsWithoutList(array1, 1));
        System.out.println("wordsWithoutList(" + Arrays.toString(array2) + ") -> " + wordsWithoutList(array2, 3));
        System.out.println("wordsWithoutList(" + Arrays.toString(array3) + ") -> " + wordsWithoutList(array3, 4));
    }

    /**
     * Given an array of strings, return a new List (e.g. an ArrayList) where all
     * the strings of the given length are omitted. See wordsWithout() below which
     * is more difficult because it uses arrays.
     * 
     * @param words an Array of Strings whose length is compared with len to see if it gets added to the new List
     * @param len the length that you are looking for in String[] words to be excluded in the new List
     * @return List new List without the strings that were length len in words
     * @since 0.0.1
     */
    public static List wordsWithoutList(String[] words, int len) {
        List<String> newList = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != len) {
                newList.add(words[i]);
            }
        }
        return newList;
    }
}
