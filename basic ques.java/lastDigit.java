/* given two non-negative int values , return true if they have the same last digit ,
such as 27 and 57 . note that % "mod" operator computes remainders , 
so 17 % 10 is 7.

lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true

 */

public class lastDigit {
    public boolean lastDigit(nt a , int b) {
        // true if the last digits are same
        return (a % 10 == b % 10);
    }
    
}
