/**
 * We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..)
 * have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because
 * they each have a raised foot. Recursively return the number of "ears" in the bunny
 * line 1, 2, ... n (without loops or multiplication).
 * <ul>
 *  <li>bunnyEars2(0) → 0
 *  <li>bunnyEars2(1) → 2
 *  <li>bunnyEars2(2) → 5
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://codingbat.com/prob/p107330
 * @since 17.0.1
 * @version 0.0.2
 */
public class BunnyEars2 {
    public static void main(String[] args) {
        System.out.println("bunnyEars2(0) -> " + bunnyEars2(0));
        System.out.println("bunnyEars2(1) -> " + bunnyEars2(1));
        System.out.println("bunnyEars2(2) -> " + bunnyEars2(2));
        System.out.println("bunnyEars2(3) -> " + bunnyEars2(3));
    }

    /**
     * We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..)
     * have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because
     * they each have a raised foot. Recursively return the number of "ears" in the bunny
     * line 1, 2, ... n (without loops or multiplication).
     * 
     * @param bunnies the amount of bunnies in the line for adding the number of ears
     * @return number of ears from the bunnies in line
     * @since 0.0.1
     */
    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0) { 
            return 0;
        }
        if (bunnies % 2 == 0) {
            return (bunnyEars2(bunnies-1) + 3);
        } else {
            return (bunnyEars2(bunnies-1) + 2);
        }
    }
}
