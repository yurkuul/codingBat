import java.util.Arrays;

/**
 * Given 2 int arrays, a and b, each length 3, return a new arraylength 2 containing
 * their middle elements.
 * <ul>
 *  <li>middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
 *  <li>middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
 *  <li>middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p146449
 * @since 17.0.1
 * @version 0.0.1
 */
public class MiddleWay {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] array3 = {7, 7, 7};
        int[] array4 = {3, 8, 0};
        int[] array5 = {5, 2, 9};
        int[] array6 = {1, 4, 5};
        System.out.println("middleWay(" + Arrays.toString(array1) + ", " + Arrays.toString(array2) + ") -> " + Arrays.toString(middleWay(array1, array2)));
        System.out.println("middleWay(" + Arrays.toString(array3) + ", " + Arrays.toString(array4) + ") -> " + Arrays.toString(middleWay(array3, array4)));
        System.out.println("middleWay(" + Arrays.toString(array5) + ", " + Arrays.toString(array6) + ") -> " + Arrays.toString(middleWay(array5, array6)));
    }

    /**
     * Given 2 int arrays, a and b, each length 3, return a new arraylength 2 containing
     * their middle elements.
     * 
     * @param a integer array where the middle element is used
     * @param b integer array where the middle element is used
     * @return new integer array consisting of the middle arrays of a and b
     * @since 0.0.1
     */
    public static int[] middleWay(int[] a, int[] b) {
        int[] newArray = {a[a.length-2], b[b.length-2]};
        return newArray;
    }
}
