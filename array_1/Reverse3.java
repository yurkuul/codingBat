import java.util.Arrays;

/**
 * Given an array of ints length 3, return a new array with the elements in
 * reverse order, so {1, 2, 3} becomes {3, 2, 1}.
 * <ul>
 *  <li>reverse3([1, 2, 3]) → [3, 2, 1]
 *  <li>reverse3([5, 11, 9]) → [9, 11, 5]
 *  <li>reverse3([7, 0, 0]) → [0, 0, 7]
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p112409
 * @since 17.0.1
 * @version 0.0.1
 */
public class Reverse3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {5, 11, 9};
        int[] array3 = {7, 0, 0};
        System.out.println("reverse3(" + Arrays.toString(array1) + ") -> "
                            + Arrays.toString(reverse3(array1)));
        System.out.println("reverse3(" + Arrays.toString(array2) + ") -> "
                            + Arrays.toString(reverse3(array2)));
        System.out.println("reverse3(" + Arrays.toString(array3) + ") -> "
                            + Arrays.toString(reverse3(array3)));
    }
    
    /**
     * Given an array of ints length 3, return a new array with the elements in
     * reverse order, so {1, 2, 3} becomes {3, 2, 1}.
     * 
     * @param nums Array of integers.
     * @return Array that is nums in reverse order.
     * @since 0.0.1
     */
    public static int[] reverse3(int[] nums) {
        int[] array = new int[nums.length];
        int index = 0;
        for (int i = nums.length-1; i >= 0; i--) {
            array[index] = nums[i];
            index++;
        }
        return array;
    }    
}
