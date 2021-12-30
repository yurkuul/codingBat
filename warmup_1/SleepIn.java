/**
 * The parameter weekday is true if it is a weekday, and the parameter vacation
 * is true if we are on vacation. We sleep in if it is not a weekday or we're on
 * vacation. Return true if we sleep in.
 * <ul>
 *  <li>sleepIn(false, false) → true
 *  <li>sleepIn(true, false) → false
 *  <li>sleepIn(false, true) → true
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p187868
 * @since 17.0.1
 * @version 0.0.1
 */
public class SleepIn {
    public static void main(String[] args) {
        System.out.println(sleepIn(false, false) + " -> true");
        System.out.println(sleepIn(true, false) + " -> false");
        System.out.println(sleepIn(false, true) + " -> true");
    }
    
    /**
     * The parameter weekday is true if it is a weekday, and the parameter vacation
     * is true if we are on vacation. We sleep in if it is not a weekday or we're on
     * vacation. Return true if we sleep in.
     * 
     * @param weekday keeps track of if it is a weekday or not
     * @param vacation keeps track of whether or not we are on vacation
     * @return True if it is not a weekday or on vacation, else return false
     * @since 0.0.1
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation) {
            return true;
        }
        return false;
    }

}
