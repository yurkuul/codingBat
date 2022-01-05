import java.util.Arrays;

/**
 * Given an array of scores, compute the int average of the first half and the
 * second half, and return whichever is larger. We'll say that the second half
 * begins at index length/2. The array length will be at least 2. To practice
 * decomposition, write a separate helper method
 * int average(int[] scores, int start, int end) {
 * which computes the average of the elements between indexes start..end. Call
 * your helper method twice to implement scoresAverage(). Write your helper method
 * after your scoresAverage() method in the JavaBat text area. Normally you would
 * compute averages with doubles, but here we use ints so the expected results are
 * exact.
 * <ul>
 *  <li>scoresAverage([2, 2, 4, 4]) → 4
 *  <li>scoresAverage([4, 4, 4, 2, 2, 2]) → 4
 *  <li>scoresAverage([3, 4, 5, 1, 2, 3]) → 4
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p123837
 * @since 17.0.1
 * @version 0.0.1
 */
public class ScoresAverage {
    public static void main(String[] args) {
        int[] array1 = {2, 2, 4, 4};
        int[] array2 = {4, 4, 4, 2, 2, 2};
        int[] array3 = {3, 4, 5, 1, 2, 3};
        System.out.println("scoresAverage(" + Arrays.toString(array1) + ")" + " -> " + scoresAverage(array1));
        //System.out.println();
        System.out.println("scoresAverage(" + Arrays.toString(array2) + ")" + " -> " + scoresAverage(array2));
        //System.out.println();
        System.out.println("scoresAverage(" + Arrays.toString(array3) + ")" + " -> " + scoresAverage(array3));
        //System.out.println();
    }
    
    /**
     * Takes in an int array and compares the averages of the first half and second 
     * 
     * @param scores int array to be used for comparisons
     * @return int value that is the greater of the two halves of the int array
     * @since 0.0.1
     */
    public static int scoresAverage(int[] scores) {
        int mid = scores.length/2;
        //System.out.println("first half " + average(scores, 0, mid));
        //System.out.println("second half " + average(scores, mid, scores.length));
        if (average(scores, 0, mid) > average(scores, mid, scores.length)) {
          return average(scores, 0, mid);
        }
        return average(scores, mid, scores.length);
      }
      
      /**
       * Using the int array inserted, it calculates the average from the start index (inclusive) to the end index (non-inclusive)
       *
       * @param scores int array to be used for comparisons
       * @param start the starting index for the int array (inclusive)
       * @param end the ending index for the int array (non-inclusive)
       * @return int value that is the average of the indexes from start (inclusive) to end (non-inclusive)
       * @since 0.0.1
       */
      public static int average(int[] scores, int start, int end) {
        int total = 0;
        int numbers = end - start;
        for (int i = start; i < end; i++) {
          total += scores[i];
        }
        //System.out.println("total " + total);
        //System.out.println("numbers " + numbers);
        return (int)(total/numbers);
      }
}
