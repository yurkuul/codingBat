import java.util.Arrays;

/**
 * The "key" array is an array containing the correct answers to an exam,
 * like {"a", "a", "b", "b"}. the "answers" array contains a student's
 * answers, with "?" representing a question left blank. The two arrays are
 * not empty and are the same length. Return the score for this array of
 * answers, giving +4 for each correct answer, -1 for each incorrect answer,
 * and +0 for each blank answer.
 * 
 * <ul>
 *  <li>scoreUp(["a", "a", "b", "b"], ["a", "c", "b", "c"]) → 6
 *  <li>scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "c"]) → 11
 *  <li>scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "b"]) → 16
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p180365
 * @since 17.0.1
 * @version 0.0.1
 */
public class ScoreUp {
    public static void main(String[] args) {
        String[] key = {"a", "a", "b", "b"};
        String[] array1 = {"a", "c", "b", "c"};
        String[] array2 = {"a", "a", "b", "c"};
        String[] array3 = {"a", "a", "b", "b"};
        System.out.println("scoreUp(" + Arrays.toString(key) + ", " + Arrays.toString(array1) + ") - > " + scoreUp(key, array1));
        System.out.println("scoreUp(" + Arrays.toString(key) + ", " + Arrays.toString(array2) + ") - > " + scoreUp(key, array2));
        System.out.println("scoreUp(" + Arrays.toString(key) + ", " + Arrays.toString(array3) + ") - > " + scoreUp(key, array3));
    }

    /**
     * The "key" array is an array containing the correct answers to an exam,
     * like {"a", "a", "b", "b"}. the "answers" array contains a student's
     * answers, with "?" representing a question left blank. The two arrays are
     * not empty and are the same length. Return the score for this array of
     * answers, giving +4 for each correct answer, -1 for each incorrect answer,
     * and +0 for each blank answer.
     * 
     * @param key Holds all the correct answers to the exam.
     * @param answers The answers given by the student.
     * @return The number of points awarded from the student's answers.
     * @since 0.0.1
     */
    public static int scoreUp(String[] key, String[] answers) {
        int totalScore = 0;
        for (int i = 0; i < key.length; i++) {
            if (key[i] == answers[i]) {
                totalScore += 4;
            } else if (key[i] != answers[i] && !answers[i].equals("?")) {
                totalScore -= 1;
            }
        }
        return totalScore;
    }
}
