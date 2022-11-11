/**
 * Given an "out" string length 4, such as "<<>>", and a word, return a new string
 * where the word is in the middle of the out string, e.g. "<<word>>". Note: use
 * str.substring(i, j) to extract the String starting at index i and going up to
 * but not including index j.
 * <ul>
 *  <li>makeOutWord("<<>>", "Yay") → "<<Yay>>"
 *  <li>makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
 *  <li>makeOutWord("[[]]", "word") → "[[word]]"
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p184030
 * @since 17.0.1
 * @version 0.0.2
 */
public class MakeOutWord {
    public static void main(String[] args) {
        System.out.println("makeOutWord(\"<<>>\", \"Yay\") -> " + makeOutWord("<<>>", "Yay"));
        System.out.println("makeOutWord(\"<<>>\", \"WooHoo\") -> " + makeOutWord("<<>>", "WooHoo"));
        System.out.println("makeOutWord(\"[[]]\", \"word\") -> " + makeOutWord("[[]]", "word"));
        System.out.println("makeOutWord(\"<3<3\", \"you\") -> " + makeOutWord("<3<3", "you"));
        System.out.println("makeOutWord(\"~~~~\", \"crossout\") -> " + makeOutWord("~~~~", "crossout"));
        System.out.println("makeOutWord(\"empty\", \"  \") -> " + makeOutWord("empty", "  "));
    }

    /**
     * Given an "out" string length 4, such as "<<>>", and a word, return a new string
     * where the word is in the middle of the out string, e.g. "<<word>>". Note: use
     * str.substring(i, j) to extract the String starting at index i and going up to
     * but not including index j.
     * 
     * @param out String of length 4 where half is at the beginning of the returned
     * String and the ending
     * @param word word inserted in between the 2 halves of out
     * @return String that has word inserted in between out
     * @since 0.0.1
     */
    public static String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }
}
