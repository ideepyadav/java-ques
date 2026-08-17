/* given a string , return true if the string starts with "hi" and false otherwise.
 startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
 */
public class startHi {
    public boolean startHi(String str) {
        // string length should be atleast 2 , so the substring () below does not go past at the end.
        if (str.length() < 2) return false;
        //pull out string of first two chars
        String firstTwo = str.substring(0, 2);
        if (firstTwo.equals("hi")) {
            return true;

        } else {
            return false;
        }

    }
    
}
