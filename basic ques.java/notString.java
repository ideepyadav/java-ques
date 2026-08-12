/* given a string , return a new string whjere "not " has been added to the front .
however , if the strings already begins with "not" , return the string unchanged.
note: use .equals() to compare two strings.

notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"
*/
public class notString {
    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        return "not " + str;
    }
    
}
