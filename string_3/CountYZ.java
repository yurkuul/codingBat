/**
 * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y'
 * in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not
 * case sensitive). We'll say that a y or z is at the end of a word if there is
 * not an alphabetic letter immediately following it. (Note:
 * Character.isLetter(char) tests if a char is an alphabetic letter.)
 * 
 * <ul>
 *  <li>countYZ("fez day") → 2
 *  <li>countYZ("day fez") → 2
 *  <li>countYZ("day fyyyz") → 2

 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p199171
 * @since 17.0.1
 * @version 0.0.2
 */
public class CountYZ {
    public static void main(String[] args) {
        System.out.println("countYZ(\"fez day\") -> " + countYZ("fez day"));
        System.out.println("countYZ(\"day fez\") -> " + countYZ("day fez"));
        System.out.println("countYZ(\"day fyyyz\") -> " + countYZ("day fyyyz"));
        System.out.println("countYZ(\"rawrzn yayz yzyzy\") -> "
                           + countYZ("rawrzn yayz yzyzy"));
    }

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the
     * 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow"
     * (not case sensitive). We'll say that a y or z is at the end of a word if
     * there is not an alphabetic letter immediately following it.
     * (Note: Character.isLetter(char) tests if a char is an alphabetic letter)
     * 
     * @param str A string.
     * @return The number of times 'y' or 'z' is at the end of a word.
     * @since 0.0.1
     */
    public static int countYZ(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i+1).toLowerCase().equals("y")
                || str.substring(i, i+1).toLowerCase().equals("z")) {
                if (i+1 < str.length() && !Character.isLetter(str.charAt(i+1))){
                    counter++;
                } else if (str.substring(i+1).equals("")) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
