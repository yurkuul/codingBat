/**
 * Return true if the string "cat" and "dog" appear the same number of times in
 * the given string.
 * 
 * <ul>
 *  <li>catDog("catdog") → true
 *  <li>catDog("catcat") → false
 *  <li>catDog("1cat1cadodog") → true
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p111624
 * @since 17.0.1
 * @version 0.0.1
 */
public class CatDog {
    public static void main(String[] args) {
        System.out.println("catDog(\"catdog\") -> " + catDog("catdog"));
        System.out.println("catDog(\"catcat\") -> " + catDog("catcat"));
        System.out.println("catDog(\"1cat1cadodog\") -> " + catDog("1cat1cadodog"));
    }

    /**
     * Return true if the string "cat" and "dog" appear the same number of
     * times in the given string.
     * 
     * @param str A String.
     * @return true if the number of times "cat" and "dog" appear in 'str' the
     * same amount of times.
     * @since 0.0.1
     */
    public static boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i, i+3).equals("cat")) {
                cat++;
            } else if (str.substring(i, i+3).equals("dog")) {
                dog++;
            }
        }
        System.out.println(cat);
        System.out.println(dog);
        return dog == cat;
    }    
}
