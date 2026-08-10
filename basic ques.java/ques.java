public class Solution {
    public static void main(String[] args) {
        System.out.println("CodingBat Solution");
    }
}
/*Given a string, return a new string where the first and last chars have been exchanged.


frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
*/
/* question says that you have to do the exchange of the letters means last to first and first to last and mid is mid */


public String frontback(String str) {
    if (str.length() <=1)return str;
    String mid = str.substring(1, str.length()-1);
    return str.charAt(str.length()-1) + mid +str.charAt(0);
}