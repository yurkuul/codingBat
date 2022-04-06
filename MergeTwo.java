import java.util.Arrays;

/**
 * Start with two arrays of strings, A and B, each with its elements in
 * alphabetical order and without duplicates. Return a new array containing
 * the first N elements from the two arrays. The result array should be in
 * alphabetical order and without duplicates. A and B will both have a length
 * which is N or more. The best "linear" solution makes a single pass over A
 * and B, taking advantage of the fact that they are in alphabetical order,
 * copying elements directly to the new array.
 * <ul>
 *  <li>mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]
 *  <li>mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]
 *  <li>mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p139150
 * @since 17.0.1
 * @version 0.0.1
 */
public class MergeTwo {
    public static void main(String[] args) {
        String[] array1 = {"a", "c", "z"};
        String[] array2 = {"b", "f", "z"};
        String[] array3 = {"c", "f", "z"};
        String[] array4 = {"f", "g", "z"};
        String[] array5 = {"c", "f", "g"};
        System.out.println("mergeTwo(" + Arrays.toString(array1) + ", "
                            + Arrays.toString(array2) + ", 3) -> "
                            + Arrays.toString(mergeTwo(array1, array2, 3)));
        System.out.println("mergeTwo(" + Arrays.toString(array1) + ", "
                            + Arrays.toString(array3) + ", 3) -> "
                            + Arrays.toString(mergeTwo(array1, array3, 3)));
        System.out.println("mergeTwo(" + Arrays.toString(array4) + ", "
                            + Arrays.toString(array5) + ", 3) -> "
                            + Arrays.toString(mergeTwo(array4, array5, 3)));
    }

    /**
     * Start with two arrays of strings, A and B, each with its elements in
     * alphabetical order and without duplicates. Return a new array containing
     * the first N elements from the two arrays. The result array should be in
     * alphabetical order and without duplicates. A and B will both have a
     * length which is N or more. The best "linear" solution makes a single
     * pass over A and B, taking advantage of the fact that they are in
     * alphabetical order, copying elements directly to the new array.
     * 
     * @param a
     * @param b
     * @param n
     * @return
     * @since 0.0.1
     */
    public static String[] mergeTwo(String[] a, String[] b, int n) {
        
    }
}
