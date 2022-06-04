/**
 * We have a loud talking parrot. The "hour" parameter is the current hour time
 * in the range 0..23. We are in trouble if the parrot is talking and the hour
 * is before 7 or after 20. Return true if we are in trouble.
 * 
 * <ul>
 *  <li>parrotTrouble(true, 6) → true
 *  <li>parrotTrouble(true, 7) → false
 *  <li>parrotTrouble(false, 6) → false
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p140449
 * @since 17.0.1
 * @version 0.0.1
 */
public class ParrotTrouble {
    public static void main(String[] args) {
        System.out.println("parrotTrouble(true, 6) -> "
                             + parrotTrouble(true, 6));
        System.out.println("parrotTrouble(true, 7) -> "
                             + parrotTrouble(true, 7));
        System.out.println("parrotTrouble(false, 6) -> "
                             + parrotTrouble(false, 6));
    }

    /**
     * We have a loud talking parrot. The "hour" parameter is the current hour
     * time in the range 0..23. We are in trouble if the parrot is talking and
     * the hour is before 7 or after 20. Return true if we are in trouble.
     * 
     * @param talking Holds on to whether the parrot is talking or not.
     * @param hour Holds on to the hour of the day.
     * @return True if the parrot is talking and the time is before 7 or after
     * 20.
     * @since 0.0.1
     */
    public static boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }
}
