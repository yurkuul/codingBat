/**
 * Your cell phone rings. Return true if you should answer it. Normally you
 * answer, except in the morning you only answer if it is your mom calling. In
 * all cases, if you are asleep, you do not answer.
 * <ul>
 *  <li>answerCell(false, false, false) → true
 *  <li>answerCell(false, false, true) → false
 *  <li>answerCell(true, false, false) → false
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p110973
 * @since 17.0.1
 * @version 0.0.1
 */
public class AnswerCell {
    public static void main(String[] args) {
        System.out.println("answerCell(false, false, false) -> "
                            + answerCell(false, false, false));
        System.out.println("answerCell(false, false, true) -> "
                            + answerCell(false, false, true));
        System.out.println("answerCell(true, false, false) -> "
                            + answerCell(true, false, false));
    }

    /**
     * Your cell phone rings. Return true if you should answer it. Normally you
     * answer, except in the morning you only answer if it is your mom calling.
     * In all cases, if you are asleep, you do not answer.
     * 
     * @param isMorning Holds onto if it is morning.
     * @param isMom Holds onto if it is mom calling.
     * @param isAsleep Holds onto if you are asleep.
     * @return true if you can answer the phone (can't answer if it is morning
     * unless it is mom and when you are asleep).
     */
    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (!isAsleep && !isMorning) { 
            return true;
        } else if (isMorning && isMom && !isAsleep) {
            return true;
        }
        return false;
    }
}
