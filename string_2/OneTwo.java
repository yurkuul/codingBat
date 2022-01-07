/**
 * Given a string, compute a new string by moving the first char to come after the
 * next two chars, so "abc" yields "bca". Repeat this process for each subsequent
 * group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3
 * chars at the end.
 * <ul>
 *  <li>oneTwo("abc") → "bca"
 *  <li>oneTwo("tca") → "cat"
 *  <li>oneTwo("tcagdo") → "catdog"
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p122943
 * @since 17.0.1
 * @version 0.0.1
 */
public class OneTwo {
    public static void main(String[] args) {
        System.out.println("oneTwo(\"abc\") -> " + oneTwo("abc"));
        System.out.println("oneTwo(\"tca\") -> " + oneTwo("tca"));
        System.out.println("oneTwo(\"tcagdo\") -> " + oneTwo("tcagdo"));
    }

    /**
     * Given a string, compute a new string by moving the first char to come after the
     * next two chars, so "abc" yields "bca". Repeat this process for each subsequent
     * group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3
     * chars at the end.
     * 
     * @param str String inserted to be modified
     * @return String that has the first char after the next two chars
     * @since 0.0.1
     */
    public static String oneTwo(String str) {
        String newWord = "";
        int numTimes = str.length()/3;
        int index = 0;
        for (int i = 0; i < numTimes; i++) {
            newWord += str.substring(index+1, index+3) + str.substring(index, index+1);
            index += 3;
        }
        return newWord;
    }
}
