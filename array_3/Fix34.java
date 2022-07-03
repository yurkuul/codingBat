import java.util.Arrays;

/**
 * Return an array that contains exactly the same numbers as the given array,
 * but rearranged so that every 3 is immediately followed by a 4. Do not move
 * the 3's, but every other number may move. The array contains the same number
 * of 3's and 4's, every 3 has a number after it that is not a 3, and a 3
 * appears in the array before any 4.              WIP
 * 
 * <ul>
 *  <li>fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
 *  <li>fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
 *  <li>fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p159339
 * @since 17.0.1
 * @version 0.0.1
 */
public class Fix34 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 1, 4};
        int[] array2 = {1, 3, 1, 4, 4, 3, 1};
        int[] array3 = {3, 2, 2, 4};
        System.out.println("fix34(" + Arrays.toString(array1) + ") -> " + Arrays.toString(fix34(array1)));
        System.out.println("fix34(" + Arrays.toString(array2) + ") -> " + Arrays.toString(fix34(array2)));
        System.out.println("fix34(" + Arrays.toString(array3) + ") -> " + Arrays.toString(fix34(array3)));
    }

    /**
     * Return an array that contains exactly the same numbers as the given
     * array, but rearranged so that every 3 is immediately followed by a 4. Do
     * not move the 3's, but every other number may move. The array contains
     * the same number of 3's and 4's, every 3 has a number after it that is
     * not a 3, and a 3 appears in the array before any 4.
     * 
     * @param nums
     * @return
     * @since 0.0.1
     */
    public static int[] fix34(int[] nums) {
        int[] array = new int[nums.length];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            //System.out.println("A " + array[i]);
            //System.out.println("B " + nums[index]);
            if (nums[index] == 3) {
                array[i] = nums[index];
                array[i+1] = 4;
            }
            index++;
        }

        int indexNums = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 3) {
                array[i] = nums[indexNums];
            } else {
                i++;
            }
            if (array[i] == 4 && array[i-1] != 3) {
                array[i] = 1;
            }
            indexNums++;
        }

        return array;
    }
}
