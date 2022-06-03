/**
 * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate
 * if each is smiling. We are in trouble if they are both smiling or if neither
 * of them is smiling. Return true if we are in trouble.
 * 
 * <ul>
 *  <li>monkeyTrouble(true, true) → true
 *  <li>monkeyTrouble(false, false) → true
 *  <li>monkeyTrouble(true, false) → false
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p181646
 * @since 17.0.1
 * @version 0.0.1
 */
public class MonkeyTrouble {
    public static void main(String[] args) {
        System.out.println("monkeyTrouble(true, true) -> "
                             + monkeyTrouble(true, true));
        System.out.println("monkeyTrouble(false, false) -> "
                             + monkeyTrouble(false, false));
        System.out.println("monkeyTrouble(true, false) -> "
                             + monkeyTrouble(true, false));
    }

    /**
     * We have two monkeys, a and b, and the parameters aSmile and bSmile
     * indicate if each is smiling. We are in trouble if they are both smiling
     * or if neither of them is smiling. Return true if we are in trouble.
     * 
     * @param aSmile holds on to if monkey a is smiling
     * @param bSmile holds on to if monkey b is smiling
     * @return true if both monkeys are smiling or not smiling
     * @since 0.0.1
     */
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile && bSmile || !aSmile && !bSmile;
    }
}
