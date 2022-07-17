/**
 * Given two strings, word and a separator sep, return a big string made of
 * count occurrences of the word, separated by the separator string.
 * 
 * <ul>
 *  <li>repeatSeparator("Word", "X", 3) → "WordXWordXWord"
 *  <li>repeatSeparator("This", "And", 2) → "ThisAndThis"
 *  <li>repeatSeparator("This", "And", 1) → "This"
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p109637
 * @since 17.0.1
 * @version 0.0.1
 */
public class RepeatSeparator {
    public static void main(String[] args) {
        System.out.println("repeatSeparator(\"Word\", \"X\", 3) -> "
                             + repeatSeparator("Word", "X", 3));
        System.out.println("repeatSeparator(\"This\", \"And\", 2) -> "
                             + repeatSeparator("This", "And", 2));
        System.out.println("repeatSeparator(\"This\", \"And\", 1) -> "
                             + repeatSeparator("This", "And", 1));
    }

    /**
     * Given two strings, word and a separator sep, return a big string made of
     * count occurrences of the word, separated by the separator string.
     * 
     * @param word The String that gets repeated 'count' times.
     * @param sep The String that gets put in between 'word'.
     * @param count The amount of times 'word' is repeated.
     * @return A String that has 'word' 'count' amount of times, separated by
     * 'sep'.
     * @since 0.0.1
     */
    public static String repeatSeparator(String word, String sep, int count) {
        String fullWord = "";
        for (int i = 0; i < count; i++) {
            fullWord += word + sep;
        }
        return fullWord.substring(0, fullWord.length() - sep.length());
    }    
}
