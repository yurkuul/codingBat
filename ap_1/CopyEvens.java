import java.util.Arrays;

/**
 * Given an array of positive ints, return a new array of length "count" containing
 * the first even numbers from the original array. The original array will contain
 * at least "count" even numbers.
 * <ul>
 *  <li>copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
 *  <li>copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
 *  <li>copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p134174
 * @since 17.0.1
 * @version 0.0.1
 */
public class CopyEvens {
    public static void main(String[] args) {
        int[] array1 = {3, 2, 4, 5, 8};
        int[] array2 = {3, 2, 4, 5, 8};
        int[] array3 = {6, 1, 2, 4, 5, 8};
        System.out.println("copyEvens(" + Arrays.toString(array1) + ", 2) -> " + Arrays.toString(copyEvens(array1, 2)));
        System.out.println("copyEvens(" + Arrays.toString(array2) + ", 3) -> " + Arrays.toString(copyEvens(array2, 3)));
        System.out.println("copyEvens(" + Arrays.toString(array3) + ", 3) -> " + Arrays.toString(copyEvens(array3, 3)));
    }

    /**
     * Given an array of positive ints, return a new array of length "count" containing
     * the first even numbers from the original array. The original array will contain
     * at least "count" even numbers.
     * 
     * @param nums an int array used for making a new array of length count.
     * @param count the length of the new array being returned.
     * @return int array of length count containing the first "count" amount of even
     * numbers from the int array inputted.
     * @since 0.0.1
     */
    public static int[] copyEvens(int[] nums, int count) {
        int[] newArray = new int[count];
        int index = 0;
        for (int i = 0; i< nums.length; i++) {
            if (index == count) {
                break;
            }
            if (nums[i] % 2 == 0) {
                newArray[index] = nums[i];
                index++;
            }
        }
        return newArray;
    }
}
