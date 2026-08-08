public class ques {

    public static void main(String[] args) {
        System.out.println(frontBack("code")); // Output: eodc
        System.out.println(frontBack("a"));    // Output: a
        System.out.println(frontBack("ab"));   // Output: ba
    }

    /* 
     * Given a string, return a new string where the first 
     * and last chars have been exchanged
     */
    public static String frontBack(String str) {
        if (str.length() <= 1) return str;
        String mid = str.substring(1, str.length() - 1);
        return str.charAt(str.length() - 1) + mid + str.charAt(0);
    }
}