/**
 * You are driving a little too fast, and a police officer stops you. Write code to
 * compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big
 * ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80
 * inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it
 * is your birthday -- on that day, your speed can be 5 higher in all cases.
 * <ul>
 *  <li>caughtSpeeding(60, false) → 0
 *  <li>caughtSpeeding(65, false) → 1
 *  <li>caughtSpeeding(65, true) → 0
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p157733
 * @since 17.0.1
 * @version 0.0.1
 */
public class CaughtSpeeding {
    public static void main(String[] args) {
        System.out.println("caughtSpeeding(60, false) -> " + caughtSpeeding(60, false));
        System.out.println("caughtSpeeding(65, false) -> " + caughtSpeeding(65, false));
        System.out.println("caughtSpeeding(65, true) -> " + caughtSpeeding(65, true));
    }

    /**
     * You are driving a little too fast, and a police officer stops you. Write code to
     * compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big
     * ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80
     * inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it
     * is your birthday -- on that day, your speed can be 5 higher in all cases.
     * 
     * @param speed the speed at which you are driving at
     * @param isBirthday True/False depending on if it is your birthday
     * @return 0 if there is no ticket, 1 if it is a small ticket, and 2 if it's a big ticket
     * @since 0.0.1
     */
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        int leeway = 0;
        if (isBirthday) {
            leeway = 5;
        }
        if (speed <= 60 + leeway) {
            return 0;
        } else if (speed > 60 + leeway && speed <= 80 + leeway) {
            return 1;
        } else {
            return 2;
        }
    }
}
