/**
 * We'll say that a positive int divides itself if every digit in the number
 * divides into the number evenly. So for example 128 divides itself since 1,
 * 2, and 8 all divide into 128 evenly. We'll say that 0 does not divide into
 * anything evenly, so no number with a 0 digit divides itself. Note: use % to
 * get the rightmost digit, and / to discard the rightmost digit.
 * <ul>
 *  <li>dividesSelf(128) → true
 *  <li>dividesSelf(12) → true
 *  <li>dividesSelf(120) → false
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p165941
 * @since 17.0.1
 * @version 0.0.1
 */
public class DividesSelf {
    public static void main(String[] args) {
        System.out.println("dividesSelf(128) -> " + dividesSelf(128));
        System.out.println("dividesSelf(12) -> " + dividesSelf(12));
        System.out.println("dividesSelf(120) -> " + dividesSelf(120));
    }

    /**
     * We'll say that a positive int divides itself if every digit in the
     * number divides into the number evenly. So for example 128 divides itself
     * since 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not
     * divide into anything evenly, so no number with a 0 digit divides itself.
     * Note: use % to get the rightmost digit, and / to discard the rightmost
     * digit.
     * 
     * @param n The number used to check if each digit can be divided evenly.
     * @return true if each digit of n and divide evenly into itself.
     * @since 0.0.1
     */
    public static boolean dividesSelf(int n) {
        int originalNum = n;
        while (n > 0) {
            if (n % 10 == 0) {
                return false;
            }
            if (originalNum%(n % 10) != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}
