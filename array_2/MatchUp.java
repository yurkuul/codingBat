import java.util.Arrays;

/**
 * Given arrays nums1 and nums2 of the same length, for every element in nums1,
 * consider the corresponding element in nums2 (at the same index). Return the
 * count of the number of times that the two elements differ by 2 or less, but
 * are not equal.
 * 
 * <ul>
 *  <li>matchUp([1, 2, 3], [2, 3, 10]) → 2
 *  <li>matchUp([1, 2, 3], [2, 3, 5]) → 3
 *  <li>matchUp([1, 2, 3], [2, 3, 3]) → 2
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p136254
 * @since 17.0.1
 * @version 0.0.1
 */
public class MatchUp {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {2, 3, 10};
        int[] array3 = {2, 3, 5};
        int[] array4 = {2, 3, 3};
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
     * Given arrays nums1 and nums2 of the same length, for every element in
     * nums1, consider the corresponding element in nums2 (at the same index).
     * Return the count of the number of times that the two elements differ by
     * 2 or less, but are not equal.
     * 
     * @param nums1 First array of integers.
     * @param nums2 Second array of integers.
     * @return The number of times the values in the same index of nums1 and 
     * nums2 differ by 2 or less, but are not equal.
     * @since 0.0.1
     */
    public static int matchUp(int[] nums1, int[] nums2) {
        int counter = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (Math.abs(nums1[i]-nums2[i]) <= 2 && (nums1[i]-nums2[i]) != 0) {
                counter++;
            }
        }
        return counter;
    }
}
