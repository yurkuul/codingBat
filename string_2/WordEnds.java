/**
 * Given a string and a non-empty word string, return a string made of each char 
 * just before and just after every appearance of the word in the string. Ignore 
 * cases where there is no char before or after the word, and a char may be 
 * included twice if it is between two words.
 * <ul>
 *  <li>wordEnds("abcXY123XYijk", "XY") → "c13i"
 *  <li>wordEnds("XY123XY", "XY") → "13"
 *  <li>wordEnds("XY1XY", "XY") → "11"
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p147538
 * @since 17.0.1
 * @version 0.0.1
 */
public class WordEnds {
    public static void main(String[] args) {
        System.out.println("wordEnds(\"abcXY123XYijk\", \"XY\") -> " + wordEnds("abcXY123XYijk", "XY"));
        System.out.println("wordEnds(\"XY123XY\", \"XY\") -> " + wordEnds("XY123XY", "XY"));
        System.out.println("wordEnds(\"XY1XY\", \"XY\") -> " + wordEnds("XY1XY", "XY"));
    }

    /**
     * Given a string and a non-empty word string, return a string made of each char 
     * just before and just after every appearance of the word in the string. Ignore 
     * cases where there is no char before or after the word, and a char may be 
     * included twice if it is between two words.
     * 
     * @param str the String inputted for modification
     * @param word the String that the method looks for in str for modifications
     * @return String that contains the characters before and after String word if present in String str
     * @since 0.0.1
     */
    public static String wordEnds(String str, String word) {
        int lengthOfWord = word.length();
        String newWord = "";
        for (int i = 0; i < str.length()-lengthOfWord+1; i++) {
            String temp = str.substring(i, i+lengthOfWord);
            //if str is already the same length as word, then there would be no characters before or after
            if (str.length() == word.length()) {
              return "";
            } else if (i == 0 && temp.equals(word)) { //check for if you are at the beginning of word
                newWord += str.substring(lengthOfWord, lengthOfWord+1);
            } else if (i > 0 && temp.equals(word) && i < str.length()-lengthOfWord) { // check for if
            //you are not at the end of word
                newWord += str.substring(i-1, i);
                newWord += str.substring(i+lengthOfWord, i+lengthOfWord+1);
            } else if (i > 0 && temp.equals(word)) { //check for if you are at the end of word
                newWord += str.substring(i-1, i);
            }
        }
        return newWord;
    }
}
