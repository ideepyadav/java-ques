/* we'll say that a number is "teen" is it is in the range 13...19 inclusive.
given 3 int values , return true if or more of them are teen.

hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true
 */
public class hasTeen {
    public boolean hasTeen(int a, int b, int c) {
        // here it is written as one big expression,
        // vs. a series of if-statements.
        return (a>=13 && a<=19) ||
               (b>=13 && b<=19) ||
               (c>=13 && c<=19);
    }
    
}
